package com.nuclearfoxes.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;


import org.springframework.stereotype.Component;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Builder
@Entity
@Table(name = "users")
public class User {
    public User(){}
    public User(int id, String name, String surname, String nickname){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
    }

    @JsonProperty("id")
    @Id
    @Column
    private int id;
    @JsonProperty("name")
    @Column
    private String name;
    @JsonProperty("surname")
    @Column
    private String surname;
    @JsonProperty("nickname")
    @Column
    private String nickname;
}
