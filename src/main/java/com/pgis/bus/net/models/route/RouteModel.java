package com.pgis.bus.net.models.route;

public class RouteModel {
	private int id;
	private int cityID;
	private String routeTypeID;
	private double cost;
	private String number;
	private RouteWayModel directWay;
	private RouteWayModel reverseWay;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getRouteTypeID() {
		return routeTypeID;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public RouteWayModel getDirectWay() {
		return directWay;
	}

	public void setDirectWay(RouteWayModel directWay) {
		this.directWay = directWay;
	}

	public RouteWayModel getReverseWay() {
		return reverseWay;
	}

	public void setReverseWay(RouteWayModel reverseWay) {
		this.reverseWay = reverseWay;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setRouteTypeID(String routeTypeID) {
		if (this.routeTypeID.indexOf("c_route_") == 0) {
			this.routeTypeID = routeTypeID.substring(8, routeTypeID.length() - 1);
			return;
		}
		this.routeTypeID = routeTypeID;
	}
}
