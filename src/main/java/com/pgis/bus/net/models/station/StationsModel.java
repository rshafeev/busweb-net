package com.pgis.bus.net.models.station;

import java.util.Collection;


public class StationsModel {

	Collection<StationModel> stations;

	public StationsModel() {

	}

	public StationsModel(Collection<StationModel> stations) {
		super();
		this.stations = stations;
	}

	public Collection<StationModel> getStations() {
		return stations;
	}

	public void setStations(Collection<StationModel> stations) {
		this.stations = stations;
	}

}
