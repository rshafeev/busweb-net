package com.pgis.bus.net.request.data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class RouteTypeDiscount implements Serializable{
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
