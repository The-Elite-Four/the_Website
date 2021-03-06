package edu.csupomona.cs480.data.provider;

import java.util.ArrayList;
import java.util.List;

import edu.csupomona.cs480.data.YelpResult;
import edu.csupomona.cs480.yelpV2.Business;
import edu.csupomona.cs480.yelpV2.RunSearch;
import edu.csupomona.cs480.yelpV2.YelpSearchResult;

public class ListYelpApiManager implements YelpApiManager {

	@Override
	public List<YelpResult> listYelpResults() {
		//List of results
		List<YelpResult> yelpResults = new ArrayList<YelpResult>();
		
		YelpSearchResult results = new YelpSearchResult();
		
		for(int i = 0; i < 29; i++){
		//Call yelp api and get the search results
		results = RunSearch.start(i);
		
		//Loop through results and get each buisness' information
		for(Business biz : results.getBusinesses()) {
			YelpResult yr = new YelpResult();
			yr.setName(biz.getName());
			for(String address : biz.getLocation().getAddress()) {					
				yr.setAddress(address);
			}
			yr.setPhone(biz.getPhone());
			yr.setRating(biz.getRating());
			yr.setUrl(biz.getUrl());
			yr.setCategory(biz.getCategories().get(0).get(0));
			
			//Add info to arraylist
			yelpResults.add(yr);
		}
		}
		
		return yelpResults;
	}

}
