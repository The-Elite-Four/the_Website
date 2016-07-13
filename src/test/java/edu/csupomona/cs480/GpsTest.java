package edu.csupomona.cs480;
import static org.junit.Assert.*;
import junit.framework.Assert;
 
import org.junit.Test;
 
import edu.csupomona.cs480.data.GpsProduct;
 // David Emmanuel
 public class GpsTest {
 
 	@Test
 	public void testGpsTest() {
 		
 		GpsProduct product = new GpsProduct();
 		// Set up price with initial value
 		product.setPrice("5000");
 		
 		// Tests to see if get price method returns expected string value;
 		Assert.assertEquals("5000", product.getPrice());
 		
 		
	
 	}
 }
