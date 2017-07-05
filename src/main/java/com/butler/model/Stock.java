package com.butler.model;

import javax.persistence.*;


/**
 * Stock class instances store the quantity of every Item instances.
 * It's more convenient to store quantity in a class independent from
 * Item because we can have more storages for items in different quantities.
 */
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Item item;

    private int stock;

    @ManyToOne(cascade = CascadeType.ALL)
    private StockType stockType;

    public Stock(){}

    public Stock(Item item,int stock){
        this.item = item;
        this.stock = stock;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) { this.stock = stock; }

    public StockType getStockType() { return stockType; }

    public void setStockType(StockType stockType) {
        this.stockType = stockType;
    }
}
