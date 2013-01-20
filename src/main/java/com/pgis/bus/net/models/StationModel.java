package com.pgis.bus.net.models;

public class StationModel {
	private Integer id;
	private String name;
	private Location location;

	public StationModel() {

	}

	public StationModel(Integer id, String name, Location location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

}
