package edu.csupomona.cs480;

import org.junit.Assert;
import org.junit.Test;

import edu.csupomona.cs480.yelpV2.RunSearch;
import edu.csupomona.cs480.yelpV2.YelpSearchResult;

//Dennis Coldivar
public class RunSearchTest {
	
//	public void setup(){
//		
//	}
		
	//Simple test to make sure Yelp search results does not come back as null
	@Test
	public void testRunSearch(){
		RunSearch rs = new RunSearch();
		YelpSearchResult results = new YelpSearchResult();
		results = rs.start(0);
		Assert.assertNotNull(results);
		
		
	}
	
	
}
