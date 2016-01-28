package com.example.javaee.reports;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EventsPerMinuteMapper implements ResultSetMapper<EventsPerMinute> {

    @Override
    public EventsPerMinute map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return EventsPerMinute.anEventRecord()
                .withEventType(resultSet.getString("event_type"))
                .withDate(resultSet.getDate("formatted_date"))
                .withDuration(resultSet.getDouble("avg_duration"))
                .withUuids(resultSet.getString("uuids"))
                .withTodoIds(resultSet.getString("todo_ids"))
                .withCount(resultSet.getInt("count"))
                .build();
    }
}
