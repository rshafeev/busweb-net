package com.pgis.bus.net.request;

import java.util.ArrayList;
import java.util.Collection;
import com.pgis.bus.net.models.Location;
import com.pgis.bus.net.orm.AlgStrategyEnum;
import com.pgis.bus.net.request.data.OutTime;
import com.pgis.bus.net.request.data.RouteTypeDiscount;


/**
 * Класс хранит параметры поиска мршрутов м/у точками назначения
 * @author romario
 */
public class FindPathsOptions {

	private int cityID;
	private Location p1;
	private Location p2;
	private Collection<RouteTypeDiscount> usageRouteTypes;
	private AlgStrategyEnum algStrategy;
	private String langID;
	private double maxDistance;
	private OutTime  outTime;
	
	public FindPathsOptions(){
		
	}
	public String[] getRouteTypeArr() {
		ArrayList<String> arr = new ArrayList<String>();
		for (RouteTypeDiscount r : usageRouteTypes) {
			arr.add(r.getRoute_type_id());
		}
		return arr.toArray(new String[arr.size()]);
	}

	public Double[] getDiscountArr() {
		ArrayList<Double> arr = new ArrayList<Double>();
		for (RouteTypeDiscount r : usageRouteTypes) {
			arr.add(r.getDiscount());
		}
		return arr.toArray(new Double[arr.size()]);
	}


	public double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
	}


	public Location getP1() {
		return p1;
	}

	public void setP1(Location p1) {
		this.p1 = p1;
	}

	public Location getP2() {
		return p2;
	}

	public void setP2(Location p2) {
		this.p2 = p2;
	}

	public Collection<RouteTypeDiscount> getUsageRouteTypes() {
		return usageRouteTypes;
	}

	public void setUsageRouteTypes(Collection<RouteTypeDiscount> usageRouteTypes) {
		this.usageRouteTypes = usageRouteTypes;
	}

	public OutTime getOutTime() {
		return outTime;
	}

	public void setOutTime(OutTime outTime) {
		this.outTime = outTime;
	}
	public int getCityID() {
		return cityID;
	}
	public void setCityID(int cityID) {
		this.cityID = cityID;
	}
	public AlgStrategyEnum getAlgStrategy() {
		return algStrategy;
	}
	public void setAlgStrategy(AlgStrategyEnum algStrategy) {
		this.algStrategy = algStrategy;
	}
	public String getLangID() {
		return langID;
	}
	public void setLangID(String langID) {
		this.langID = langID;
	}

	
	

}
