package com.pgis.bus.net.models;

import java.util.Collection;

import com.pgis.bus.net.models.path.PathModel;

public class PathsModel {

	private Collection<PathModel> paths;
	
	/**
	 * Время поиска маршрутов, мсек.
	 */
	private long findTime;

	public PathsModel() {

	}

	public PathsModel(Collection<PathModel> paths) {
		super();
		this.paths = paths;
	}

	public Collection<PathModel> getPaths() {
		return paths;
	}

	public void setPaths(Collection<PathModel> paths) {
		this.paths = paths;
	}

	public void setFindTime(long findTime) {
		this.findTime = findTime;

	}

	public long getFindTime() {
		return findTime;
	}

	public double getFindTimeSecs() {
		return findTime/1000.0;
	}

}
