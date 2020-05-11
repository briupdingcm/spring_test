package com.briup.ws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Calendar;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty(value = "user_id", required = true)
    private long id;
    @JsonProperty(value = "user_name", required = true)
    private String name;
    @JsonProperty(value = "user_date", required = true)
    private Date date;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
        this.date = Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
