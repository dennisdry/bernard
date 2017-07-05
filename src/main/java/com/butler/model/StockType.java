package com.butler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * StockType instances are type(or category) attachments for Stock instances.
 */
@Entity
public class StockType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public StockType(){}

    public StockType(String name){this.name = name;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
