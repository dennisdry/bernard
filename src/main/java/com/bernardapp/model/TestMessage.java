package com.bernardapp.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class TestMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_DATE")
    private Date date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private LocalDate localDate;


    public TestMessage() {

    }

    public TestMessage(String message, Date date, LocalDate localDate) {
        this.message = message;
        this.date = date;
        this.localDate = localDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
