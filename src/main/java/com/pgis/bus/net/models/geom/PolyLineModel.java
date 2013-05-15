package com.pgis.bus.net.models.geom;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pgis.bus.net.helpers.GeoHelper;

@XmlRootElement
public class PolyLineModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 906104327570778966L;

	private double[][] points;

	public PolyLineModel() {

	}

	public PolyLineModel(double[][] points) {
		this.points = points;
	}

	public double[][] getPoints() {
		return points;
	}

	public void setPoints(double[][] points) {
		this.points = points;
	}

	private boolean isCanDeletePoint(double[] p, double[] p1, double[] p2, double minDecardDistance) {
		double d1 = GeoHelper.getDistance(p1[0], p1[1], p2[0], p2[1]);
		double d2 = GeoHelper.getDistance(p1[0], p1[1], p[0], p[1], p2[0], p2[1]);
		if (Math.abs(d1 - d2) < minDecardDistance) {
			return true;
		}
		return false;
	}

	/**
	 * Удаляет точки, которые находятся на расстоянии, меньше заданного. Миминально допустимое расстояние между точками
	 * равно 0.01
	 */
	public void optimizePoints() {
		optimizePoints(0.01);
	}

	/**
	 * Удаляет точки, которые находятся на расстоянии, меньше заданного.
	 * 
	 * @param minDecardDistance Миминально допустимое расстояние между точками, км
	 */
	public void optimizePoints(double minDecardDistance) {
		if (this.points == null || this.points.length < 3) {
			return;
		}
		ArrayList<double[]> optPoints = new ArrayList<double[]>(this.points.length);
		optPoints.add(this.points[0]);
		double[] prevPoint = this.points[0];
		for (int i = 1; i < this.points.length - 1; i++) {
			if (isCanDeletePoint(points[i], prevPoint, points[i + 1], minDecardDistance) == false) {
				optPoints.add(this.points[i]);
				prevPoint = this.points[i];
			}
		}
		this.points = new double[optPoints.size()][2];
		for (int i = 0; i < optPoints.size(); i++) {
			this.points[i] = optPoints.get(i);
		}
	}

	@JsonIgnore
	public int getPointsCount() {
		if (this.points == null)
			return 0;
		return this.points.length;
	}

	@JsonIgnore
	public double[] getPoint(int ind) {
		if (ind < 0 || ind >= getPointsCount())
			return null;
		return this.points[ind];
	}
}
