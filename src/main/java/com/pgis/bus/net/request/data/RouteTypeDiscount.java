package com.pgis.bus.net.request.data;

public class RouteTypeDiscount {
	private String route_type_id;
	private double discount;

	public RouteTypeDiscount() {
		super();

	}

	public RouteTypeDiscount(String route_type_id, double discount) {
		super();
		this.route_type_id = route_type_id;
		this.discount = discount;
	}

	public String getRoute_type_id() {
		return route_type_id;
	}

	public void setRoute_type_id(String route_type_id) {
		this.route_type_id = route_type_id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "RouteTypeDiscount [route_type_id=" + route_type_id
				+ ", discount=" + discount + "]";
	}

	
}
