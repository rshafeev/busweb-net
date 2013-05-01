package com.pgis.bus.net.models.geom;

public class PointModel {
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
