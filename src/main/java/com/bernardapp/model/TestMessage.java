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

<<<<<<< HEAD
=======


>>>>>>> 031f344... dates
    public TestMessage() {

    }

    public TestMessage(String message) {
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

<<<<<<< HEAD

=======
>>>>>>> 031f344... dates
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
