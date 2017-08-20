package com.butler.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class User implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @ManyToOne(cascade = CascadeType.ALL)
    private Position position;

    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;

    protected User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}
