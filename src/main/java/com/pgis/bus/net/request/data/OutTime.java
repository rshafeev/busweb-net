package com.pgis.bus.net.request.data;

import com.pgis.bus.net.orm.DayEnum;

public class OutTime {

	/**
	 * День выезда
	 */
	private DayEnum dayID;
	
	/**
	 * Время выезда, мсек
	 */
	private long timeStartSecs;

	public OutTime() {

	}

	public OutTime(DayEnum dayID, int hour, int mins) {
		timeStartSecs = (hour * 60 * 60 + mins * 60);
		this.dayID = dayID;
	}

	public DayEnum getDayID() {
		return dayID;
	}

	public void setDayID(DayEnum dayID) {
		this.dayID = dayID;
	}

	public long getTimeStartSecs() {
		return timeStartSecs;
	}

	public void setTimeStartSecs(long timeStart) {
		this.timeStartSecs = timeStart;
	}

}
