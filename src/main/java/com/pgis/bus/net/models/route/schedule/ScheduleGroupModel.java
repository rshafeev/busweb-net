package com.pgis.bus.net.models.route.schedule;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

import com.pgis.bus.net.models.DayEnumModel;

@XmlRootElement
public class ScheduleGroupModel {

	/**
	 * ID группы
	 */
	private int id;

	/**
	 * Дни, которые входят в группу
	 */
	private Collection<DayEnumModel> days;

	/**
	 * Расписание для данной группы
	 */
	private Collection<TimetableModel> timetable;

	public ScheduleGroupModel() {
		super();

	}

	public ScheduleGroupModel(int id, Collection<DayEnumModel> days, Collection<TimetableModel> timetable) {
		super();
		this.id = id;
		this.days = days;
		this.timetable = timetable;
	}

	public Collection<DayEnumModel> getDays() {
		return days;
	}

	public void setDays(Collection<DayEnumModel> days) {
		this.days = days;
	}

	public Collection<TimetableModel> getTimetable() {
		return timetable;
	}

	public void setTimetable(Collection<TimetableModel> timetable) {
		this.timetable = timetable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
