package com.example.demo.graphql.spqr.model;


import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private String gender;
    private int salary;
    private String city;


    public User(String name, int age, String gender, int salary, String city,String id) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.city = city;
        this.id = id;
    }
}

