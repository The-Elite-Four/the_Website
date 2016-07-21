package edu.csupomona.cs480.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Joiner;

import edu.csupomona.cs480.App;

import edu.csupomona.cs480.data.YelpResult;
import edu.csupomona.cs480.data.provider.ListYelpApiManager;
import edu.csupomona.cs480.data.provider.YelpApiManager;


/**
 * This is the controller used by Spring framework.
 * <p>
 * The basic function of this controller is to map
 * each HTTP API Path to the correspondent method.
 *
 */

@RestController
public class WebController {

	@Autowired
	private YelpApiManager yelpApiManager;

	/**
	 * This is a simple example of how the HTTP API works.
	 * It returns a String "OK" in the HTTP response.
	 * To try it, run the web application locally,
	 * in your web browser, type the link:
	 * 	http://localhost:8080/cs480/ping
	 */
	@RequestMapping(value = "/cs480/ping", method = RequestMethod.GET)
	String healthCheck() {
		
		return "OK-In-CS480 and Testing Jenkins";
	}

	//Test method for Yelp API displays first 20 search results
	@RequestMapping(value = "/cs480/testapi", method = RequestMethod.GET)
	List<YelpResult> listYelpResults() {		
		return yelpApiManager.listYelpResults();
	}
	
	@RequestMapping(value = "/cs480/formattedresults", method = RequestMethod.GET)
	String[] listFormattedYelpResults() {	
		ListYelpApiManager results = new ListYelpApiManager();
		List<YelpResult> listYelpResults = results.listYelpResults();
		List<String> info = new ArrayList<String>();
		for(int i = 0; i < listYelpResults.size(); i++){
			 info.add(listYelpResults.get(i).getName() + " " + listYelpResults.get(i).getAddress() + " " + listYelpResults.get(i).getPhone() +
					 " " + listYelpResults.get(i).getCategory() + " " + listYelpResults.get(i).getRating() + " " + listYelpResults.get(i).getUrl() + " .");
			 
		}
		String []  searchResults =  new String[listYelpResults.size()];
		
		for(int i = 0; i < listYelpResults.size(); i++){
			searchResults[i] = info.get(i);  
		}
		
		StringUtils.splitArrayElementsIntoProperties(searchResults, " .");
		
		return searchResults;
	}

	//{@Author Kevsbud}: I wrote this to return asian food specifically if it was written
	//into the search bar. Also uses my containsCat(String str) method in YelpResult.java
	@RequestMapping(value = "/cs480/AsianFood", method = RequestMethod.GET)
	File listFormattedYelpResultsAsian() {
		//NEARLY identical to formatted results method
		ListYelpApiManager results = new ListYelpApiManager();
		List<YelpResult> listYelpResults = results.listYelpResults();
		List<String> info = new ArrayList<String>();
		File file = null;
		try {
			file = new File("AsianFood.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));

			//Will only parse information if it contains the correct category.
			for(int i = 0; i < listYelpResults.size(); i++){
				if(listYelpResults.get(i).containsCat("Asian")) {
					bw.write(listYelpResults.get(i).getName() + "\n");
					bw.write(listYelpResults.get(i).getAddress() + "\n");
					bw.write(listYelpResults.get(i).getPhone() + "\n");
					bw.write("\n");
				}
			}
			bw.close();
			return file;
		} catch(IOException e) {
			//Well shoot...
		}
		return file;
	}

	//Gonna copy paste the above method a handful of times:

	@RequestMapping(value = "/cs480/Breakfast", method = RequestMethod.GET)
	File listFormattedYelpResultsBreakfast() {
		//NEARLY identical to formatted results method
		ListYelpApiManager results = new ListYelpApiManager();
		List<YelpResult> listYelpResults = results.listYelpResults();
		List<String> info = new ArrayList<String>();
		File file = null;
		try {
			file = new File("Breakfast.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));

			//Will only parse information if it contains the correct category.
			for(int i = 0; i < listYelpResults.size(); i++){
				if(listYelpResults.get(i).containsCat("Breakfast")) {
					bw.write(listYelpResults.get(i).getName() + "\n");
					bw.write(listYelpResults.get(i).getAddress() + "\n");
					bw.write(listYelpResults.get(i).getPhone() + "\n");
					bw.write("\n");
				}
			}
			bw.close();
			return file;
		} catch(IOException e) {
			//Well shoot...
		}
		return file;
	}

	//{@Author Kevsbud}: I wrote this to return asian food specifically if it was written
	//into the search bar. Also uses my containsCat(String str) method in YelpResult.java
	@RequestMapping(value = "/cs480/Mexican", method = RequestMethod.GET)
	File listFormattedYelpResultsMexican() {
		//NEARLY identical to formatted results method
		ListYelpApiManager results = new ListYelpApiManager();
		List<YelpResult> listYelpResults = results.listYelpResults();
		List<String> info = new ArrayList<String>();
		File file = null;
		try {
			file = new File("Mexican.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));

			//Will only parse information if it contains the correct category.
			for(int i = 0; i < listYelpResults.size(); i++){
				if(listYelpResults.get(i).containsCat("Mexican")) {
					bw.write(listYelpResults.get(i).getName() + "\n");
					bw.write(listYelpResults.get(i).getAddress() + "\n");
					bw.write(listYelpResults.get(i).getPhone() + "\n");
					bw.write("\n");
				}
			}
			bw.close();
			return file;
		} catch(IOException e) {
			//Well shoot...
		}
		return file;
	}

	/* My attempt at making it take any value instead of just a hard coded one.
	@RequestMapping(value = "/cs480/Dynamic", method = RequestMethod.GET)
	String[] listFormattedYelpResultsDynamic(String str) {
		//NEARLY identical to formatted results method
		ListYelpApiManager results = new ListYelpApiManager();
		List<YelpResult> listYelpResults = results.listYelpResults();
		List<String> info = new ArrayList<String>();

		//Will only parse information if it contains the correct category.
		for(int i = 0; i < listYelpResults.size(); i++){
			if(listYelpResults.get(i).containsCat(str)) {
			 	info.add(listYelpResults.get(i).getName() + " " + listYelpResults.get(i).getAddress() + " " + listYelpResults.get(i).getPhone() +
					 " " + listYelpResults.get(i).getCategory() + " " + listYelpResults.get(i).getRating() + " " + listYelpResults.get(i).getUrl() + " ."); 
			}
		}
		String []  searchResults =  new String[info.size()];
		for(int i = 0; i < info.size(); i++){
			searchResults[i] = info.get(i);  
		}
		StringUtils.splitArrayElementsIntoProperties(searchResults, " .");
		return searchResults;
	}*/
	

	@RequestMapping(value = "/cs480/guava", method = RequestMethod.GET)
	String guava() {
		// You can replace this with other string,
		// and run the application locally to check your changes
		// with the URL: http://localhost:8080/
		Joiner join = Joiner.on(", ").skipNulls();
		
		
		return join.join("Does","this", "work?");
	}
	
	


}