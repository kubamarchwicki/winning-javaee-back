package com.example.javaee.reports;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

public interface EventsPerMinuteDao {

    @SqlQuery("select event_type, " +
            "  date_format(`date`, '%Y-%m-%d %H:%i') AS formatted_date, " +
            "  avg(timing) as avg_duration, " +
            "  group_concat(DISTINCT el.uuid) as uuids, " +
            "  group_concat(DISTINCT wl.todo_id ORDER BY todo_id ASC) as todo_ids, " +
            "  count(1) as count " +
            "from event_log el" +
            "  LEFT JOIN write_log wl ON el.uuid = wl.uuid " +
            "  GROUP BY event_type, minute(date) " +
            "  ORDER BY formatted_date asc ")
    @Mapper(EventsPerMinuteMapper.class)
    List<EventsPerMinute> listEventsPerMinute();

    void close();
}
