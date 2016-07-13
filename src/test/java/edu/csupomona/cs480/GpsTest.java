package edu.csupomona.cs480;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import edu.csupomona.cs480.data.GpsProduct;
// David Emmanuel
public class GpsTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testGpsTest() {
		GpsTest gp = new GpsTest();
		GpsProduct product = new GpsProduct();
		
		// Tests to see if it is returning a String;
		Assert.assertEquals(true, (product.getPrice()).getClass().equals(String.class) ); 
	}
}
