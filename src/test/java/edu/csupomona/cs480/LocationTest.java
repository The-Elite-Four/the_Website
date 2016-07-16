package edu.csupomona.cs480;

import org.junit.Test;

import edu.csupomona.cs480.yelpV2.Location;
import junit.framework.Assert;

public class LocationTest 
{


	
	///////////
	@Test
 	public void testLocationTest() {
 		
 		Location location = new Location();
 		// Set up price with initial value
 		location.setCity("irvine");
 		
 		// Tests to see if get price method returns expected string value;
 		Assert.assertEquals("irvine",location.getCity());
 		
 		
	
 	}
	

	
	
}
