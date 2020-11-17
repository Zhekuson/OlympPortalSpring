package com.nuclearfoxes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "university")
public class University {
    public University(){}

    @JsonProperty("id")
    @Id
    @Column
    private int id;
    @JsonProperty("name")
    @Column
    private String name;
}
