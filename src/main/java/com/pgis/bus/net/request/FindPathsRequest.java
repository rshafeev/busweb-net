package com.pgis.bus.net.request;

import java.io.Serializable;
import java.util.Collection;

import com.pgis.bus.net.models.AlgStrategyEnumModel;
import com.pgis.bus.net.models.LangEnumModel;
import com.pgis.bus.net.models.geom.PointModel;
import com.pgis.bus.net.request.data.OutTimeModel;
import com.pgis.bus.net.request.data.RouteTypeDiscount;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Класс хранит параметры поиска мршрутов м/у точками назначения
 * 
 * @author romario
 */
@XmlRootElement
public class FindPathsRequest implements Serializable{

	private int cityID;
	private PointModel p1;
	private PointModel p2;
	private Collection<RouteTypeDiscount> routeTypes;
	private boolean transitions;
	private AlgStrategyEnumModel algStrategy;
	private LangEnumModel langID;
	private double maxDistance;
	private OutTimeModel outTime;

	public FindPathsRequest() {

	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public PointModel getP1() {
		return p1;
	}

	public void setP1(PointModel p1) {
		this.p1 = p1;
	}

	public PointModel getP2() {
		return p2;
	}

	public void setP2(PointModel p2) {
		this.p2 = p2;
	}

	public Collection<RouteTypeDiscount> getRouteTypes() {
		return routeTypes;
	}

	public void setRouteTypes(Collection<RouteTypeDiscount> routeTypes) {
		this.routeTypes = routeTypes;
	}

	public AlgStrategyEnumModel getAlgStrategy() {
		return algStrategy;
	}

	public void setAlgStrategy(AlgStrategyEnumModel algStrategy) {
		this.algStrategy = algStrategy;
	}

	/**
	 * Возвращает язык
	 * 
	 * @return идентификатор языка. Возможные значения: ru, en, uk
	 */
	public LangEnumModel getLangID() {
		return langID;
	}

	public void setLangID(LangEnumModel langID) {
		this.langID = langID;
	}

	public double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
	}

	public OutTimeModel getOutTime() {
		return outTime;
	}

	public void setOutTime(OutTimeModel outTime) {
		this.outTime = outTime;
	}

	public boolean isTransitions() {
		return transitions;
	}

	public void setTransitions(boolean isTransitions) {
		this.transitions = isTransitions;
	}

	@Override
	public String toString() {
		return "FindPathsOptions [cityID=" + cityID + ", p1=" + p1 + ", p2=" + p2 + ", routeTypes=" + routeTypes
				+ ", transitions=" + transitions + ", algStrategy=" + algStrategy + ", langID=" + langID
				+ ", maxDistance=" + maxDistance + ", outTime=" + outTime + "]";
	}

}
