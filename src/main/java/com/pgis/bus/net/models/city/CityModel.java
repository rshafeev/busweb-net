package com.pgis.bus.net.models.city;

import javax.xml.bind.annotation.XmlRootElement;

import com.pgis.bus.net.models.geom.PointModel;

@XmlRootElement
public class CityModel {
	private int id;
	private String name;
	private String key;
	private PointModel location;
	private int scale;

	public CityModel() {

	}

	public CityModel(int id, String name, PointModel location, String key, int scale) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.key = key;
		this.scale = scale;
	}

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

	public PointModel getLocation() {
		return location;
	}

	public void setLocation(PointModel location) {
		this.location = location;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

}
