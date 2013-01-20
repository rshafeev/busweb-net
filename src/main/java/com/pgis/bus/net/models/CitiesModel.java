package com.pgis.bus.net.models;

import java.util.Collection;

public class CitiesModel {

	private Collection<CityModel> cities;

	public Collection<CityModel> getCities() {
		return cities;
	}

	public void setCities(Collection<CityModel> cities) {
		this.cities = cities;
	}

	public CitiesModel() {
		super();
	}

	public CitiesModel(Collection<CityModel> cities) {
		super();
		this.cities = cities;
	}

}
