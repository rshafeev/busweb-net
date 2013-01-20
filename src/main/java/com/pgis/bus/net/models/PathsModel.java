package com.pgis.bus.net.models;

import java.util.Collection;

import com.pgis.bus.net.models.path.PathModel;

public class PathsModel {

	Collection<PathModel> paths;

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

}
