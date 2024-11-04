package com.picsart.models;

import lombok.Data;

@Data
public class User{
	private String website;
	private Address address;
	private String phone;
	private String name;
	private Company company;
	private Integer id;
	private String email;
	private String username;

	@Data
	public static class Address{
		private String zipcode;
		private Geo geo;
		private String suite;
		private String city;
		private String street;
	}

	@Data
	public static class Company{
		private String bs;
		private String catchPhrase;
		private String name;
	}

	@Data
	public static class Geo{
		private String lng;
		private String lat;
	}
}