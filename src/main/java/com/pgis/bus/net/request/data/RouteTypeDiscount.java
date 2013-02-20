package com.pgis.bus.net.request.data;

public class RouteTypeDiscount {
	private String id;
	private double discount;

	public RouteTypeDiscount() {
		super();

	}

	public RouteTypeDiscount(String route_type_id, double discount) {
		super();
		this.id = route_type_id;
		this.discount = discount;
	}

	public String getRouteType() {
		return id;
	}

	public void setRouteType(String route_type_id) {
		this.id = route_type_id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "RouteTypeDiscount [route_type_id=" + id
				+ ", discount=" + discount + "]";
	}

	
}
