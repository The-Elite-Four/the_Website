package edu.csupomona.cs480.yelpV2;
import java.util.Scanner;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class RunSearch {

	public static YelpSearchResult start() {
		 
		//These are my keys for when I signed up to use the Yelp API
		//Define keys, tokens and secrets
		String CONSUMER_KEY = "PK05LxbcDCW1AVe2QMJF8A";
		String CONSUMER_SECRET = "eOVtrp7-JR6pxqQSYA7fPWajDbw";
		String TOKEN = "ymiUIwQCkJIVDm5LTtEFtD7rFGK0lbF-";
		String TOKEN_SECRET = "OFfKvVuyeSaHDTSlvk1agsTIHcs";
		
		//Scanner kb = new Scanner(System.in);
		//System.out.print("Enter the category of food you would like to search for: ");
		//String term = kb.nextLine();
		//Give location by long and lat  
		String latitude = "34.0552778";
		String longitude = "-117.7513889";
		
		//Hardcoded the search to be asian restaurants
		String food = "asian+restaurants";
		//String category = "burgers";
		
		// Execute a signed call to the Yelp service.  
		OAuthService service = new ServiceBuilder().provider(YelpV2API.class).apiKey(CONSUMER_KEY).apiSecret(CONSUMER_SECRET).build();
		Token accessToken = new Token(TOKEN, TOKEN_SECRET);
		OAuthRequest request = new OAuthRequest(Verb.GET, "http://api.yelp.com/v2/search");
		request.addQuerystringParameter("ll", latitude + "," + longitude);
		request.addQuerystringParameter("term", food);
		//Radius is within 5 miles of CPP, not sure how much larger you guys wanna go
		request.addQuerystringParameter("radius_filter", "8000");
		//Limit is set to 20 max but we can iterate through all the results in chunks of 20
	//	request.addQuerystringParameter("limit", "21");
	//	request.addQuerystringParameter("term", "mexican+restaurants");
		service.signRequest(accessToken, request);
		Response response = request.send();
		String rawData = response.getBody();
		 
		//Turn text into Java objects.  
		//try {
			YelpSearchResult places = new Gson().fromJson(rawData, YelpSearchResult.class);
			
			//places.setTotal(40);
			//System.out.println(places.getTotal());
			//System.out.println("Your search found " + places.getTotal() + " results.");
			//System.out.println("Yelp returned " + places.getBusinesses().size() + " businesses in this request.");
			//System.out.println();
			
			return places;
			
//		} catch(Exception e) {
//			System.out.println("Error, could not parse returned data!");
//			System.out.println(rawData);			
//		}
		
		
			
	}
}
