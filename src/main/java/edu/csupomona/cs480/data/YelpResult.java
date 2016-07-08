package edu.csupomona.cs480.data;

public class YelpResult {
	
	//We will eventually need to add in one more for business hours
	//Not sure what else info you guys wanna display look at yelp api documentation
	//for all the options
	private String name;
	private String address;
	private String phone;
	private String rating;
	private String url;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
