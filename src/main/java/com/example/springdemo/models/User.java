package com.example.springdemo.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // Hibernati hamara petq
@Table(name = "users") // mer tablicayi anunn enq talis
public class User {

    @Id
//    @Generated(GeneratedValue)
    private int id;

    @Column(name = "name")
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

    @Column
    private String email;

    @Column
    private String password;

}
