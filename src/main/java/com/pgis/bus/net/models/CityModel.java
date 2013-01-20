package com.pgis.bus.net.models;


public class CityModel {
	private int id;
	private String name;
	private String key;
	private Location location;
	private int scale;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public CityModel(){
		
	}
	public CityModel(int id, String name, Location location,String key,int scale) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.key = key;
		this.scale = scale;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}
	
	
}
