package com.butler.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "username")
    private String userName;


    @ManyToOne(cascade = CascadeType.ALL)
    private Position position;

    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;

    @ElementCollection
    @CollectionTable
    private List<String> phone;

    @ElementCollection
    @CollectionTable
    private List<String> email;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Stock> inventory = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Message> messages = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Tag> tags = new ArrayList<>();

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public User(String firstName, String lastName, String userName, List<String> phone, List<String> email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.phone = phone;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phones) {
        this.phone = phones;
    }

    public void addPhone(String phone) {
        this.phone.add(phone);
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> emails) {
        this.email = emails;
    }

    public void addEmail(String email) {
        this.email.add(email);
    }

    public List<Stock> getInventory() {
        return inventory;
    }

    public void setInventory(List<Stock> items) {
        this.inventory = items;
    }

    public void addItemWithStockToInventory(Stock stock) {
        this.inventory.add(stock);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}