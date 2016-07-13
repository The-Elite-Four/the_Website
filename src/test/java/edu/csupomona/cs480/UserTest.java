package edu.csupomona.cs480;
import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;
import edu.csupomona.cs480.data.User;
 //Jose Gutierrez
 public class UserTest {
 	@Test
 	public void userTester() {	
 		User temp = new User(); //Creates a temp user
 		temp.setName("Kevsbud"); //Assigns a name
 		Assert.assertEquals("Kevsbud", temp.getName()); //Tests for correct name assignment.
 	}
 }