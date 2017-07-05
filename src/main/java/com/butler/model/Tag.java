package com.butler.model;

import javax.persistence.*;

/**
 * Tag class instances responsible for categorizing everything in
 * the application.
 */
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private TagType tagType;

    public Tag(){}

    public Tag(String name, TagType tagType) {
        this.name = name;
        this.tagType = tagType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagType getTagType() {
        return tagType;
    }

    public void setTagType(TagType tagType) {
        this.tagType = tagType;
    }
}