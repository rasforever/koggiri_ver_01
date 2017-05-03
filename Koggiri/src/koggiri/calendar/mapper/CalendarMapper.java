package koggiri.calendar.mapper;

import java.util.List;

import koggiri.calendar.model.Event;

public interface CalendarMapper {
	int calendarinsert(Event event);
	List<Event> calendarList();
	int updateEvent(Event event);
	int deleteEvent(Event event);
}
