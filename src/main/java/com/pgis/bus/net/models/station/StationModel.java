package com.pgis.bus.net.models.station;

import javax.xml.bind.annotation.XmlRootElement;

import com.pgis.bus.net.models.geom.PointModel;

@XmlRootElement
public class StationModel {
	private Integer id;
	private String name;
	private PointModel location;

	public StationModel() {

	}

	public StationModel(Integer id, String name, PointModel location) {
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

	public PointModel getLocation() {
		return location;
	}

	public void setLocation(PointModel location) {
		this.location = location;
	}

}
