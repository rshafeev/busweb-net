package com.pgis.bus.net.models.city;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CitiesModel {

	private Collection<CityModel> cities;

	private CityModel selectedCity;

	public CitiesModel() {
		cities = new ArrayList<CityModel>();
	}

	public void setCities(Collection<CityModel> cities) {
		this.cities = cities;
	}

	public CitiesModel(Collection<CityModel> cities) {
		super();
		this.cities = cities;
	}

	public void addCity(CityModel city) {
		this.cities.add(city);
	}

	public Collection<CityModel> getCities() {
		return cities;
	}

	public void setCities(ArrayList<CityModel> cities) {
		this.cities = cities;
	}

	public CityModel getSelectedCity() {
		return selectedCity;
	}

	public void setSelectedCity(CityModel selectedCity) {
		this.selectedCity = selectedCity;
	}

	public CityModel getCity(int city_id) {
		for (CityModel city : cities) {
			if (city.getId() == city_id)
				return city;
		}
		return null;
	}
}
