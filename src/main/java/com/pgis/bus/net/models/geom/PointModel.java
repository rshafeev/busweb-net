package com.pgis.bus.net.models.geom;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PointModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2536701375361264065L;
	private double lat;
	private double lon;

	public PointModel() {

	}

	public PointModel(double lat, double lon) {
		this.lat = lat;
		this.lon = lon;
	}

	public PointModel(PointModel location) {
		this.lat = location.lat;
		this.lon = location.lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

}
