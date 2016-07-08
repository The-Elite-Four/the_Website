package edu.csupomona.cs480.yelpV2;

import java.util.List;
import java.util.Map;

public class Business {
	private String is_closed;
	private String rating;
	private String snippet_text;
	private String rating_img_url;
	private String id;
	private String name;
	private String imageUrl;
	private String url;
	private String mobileUrl;
	private String phone;
	private String displayPhone;
	private int reviewCount;
	private List<List<String>> categories;
	private double distance;
	private String ratingImgUrlSmall;
	private String snippetImgUrl;
	private Location location;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMobileUrl() {
		return mobileUrl;
	}
	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDisplayPhone() {
		return displayPhone;
	}
	public void setDisplayPhone(String displayPhone) {
		this.displayPhone = displayPhone;
	}
	public int getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}
	public List<List<String>> getCategories() {
		return categories;
	}
	public void setCategories(List<List<String>> categories) {
		this.categories = categories;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getRatingImgUrlSmall() {
		return ratingImgUrlSmall;
	}
	public void setRatingImgUrlSmall(String ratingImgUrlSmall) {
		this.ratingImgUrlSmall = ratingImgUrlSmall;
	}
	public String getSnippetImgUrl() {
		return snippetImgUrl;
	}
	public void setSnippetImgUrl(String snippetImgUrl) {
		this.snippetImgUrl = snippetImgUrl;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	/////////
	public String getIsClosed() {
		return is_closed;
	}
	public void setIsClosed(String is_closed) {
		this.is_closed = is_closed;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSnippetText() {
		return snippet_text;
	}
	public void setSnippetText(String snippet_text) {
		this.snippet_text = snippet_text;
	}
	public String getRatingImgUrl() {
		return rating_img_url;
	}
	public void setRatingImgUrl(String rating_img_url) {
		this.rating_img_url = rating_img_url;
	}
	
}
