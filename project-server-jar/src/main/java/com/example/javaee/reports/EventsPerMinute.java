package com.example.javaee.reports;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EventsPerMinute {

    private String eventType;
    private Date date;
    private Double duration;
    private List<String> uuids;
    private List<Integer> todo_ids;
    private Integer count;

    public EventsPerMinute(Builder builder) {
        this.eventType = builder.eventType;
        this.date = builder.date;
        this.duration = builder.duration;
        this.uuids = builder.uuids;
        this.todo_ids = builder.todo_ids;
        this.count = builder.count;
    }

    public String getEventType() {
        return eventType;
    }

    public Date getDate() {
        return date;
    }

    public Double getDuration() {
        return duration;
    }

    public List<String> getUuids() {
        return uuids;
    }

    public List<Integer> getTodo_ids() {
        return todo_ids;
    }

    public Integer getCount() {
        return count;
    }

    public static Builder anEventRecord() {
        return new Builder();
    }

    public static class Builder {
        private String eventType;
        private Date date;
        private Double duration;
        private List<String> uuids;
        private List<Integer> todo_ids;
        private Integer count;

        public Builder withEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder withDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder withDuration(Double duration) {
            this.duration = duration;
            return this;
        }

        public Builder withUuids(String uuids) {
            if (uuids != null && uuids.length() > 0) {
                this.uuids = Arrays.asList(uuids.split(","));
            }

            return this;
        }

        public Builder withTodoIds(String ids) {
            if (ids != null && ids.length() > 0) {
                this.todo_ids = Arrays.asList(ids.split(","))
                        .stream()
                        .mapToInt(Integer::valueOf)
                        .boxed()
                        .collect(Collectors.toList());
            }

            return this;
        }

        public Builder withCount(Integer cnt) {
            this.count = cnt;
            return this;
        }

        public EventsPerMinute build() {
            return new EventsPerMinute(this);
        }
    }
}
