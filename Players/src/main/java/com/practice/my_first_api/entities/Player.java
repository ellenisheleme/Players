package com.practice.my_first_api.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Player {

    @Id
    @GeneratedValue

    private Integer id;

    private String name;

    private Integer age;
    @Column(name = "years_of_experience")

    private Double yearsOfExperience;

    private Double rating;

    public Player() {
    }

    public Player(String name, Integer age, Double yearOfExperience, Double rating) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience =yearOfExperience;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getyearOfExperience() {
        return yearsOfExperience;
    }

    public void setyearOfExperience(Double yearOfExperience) {
        this.yearsOfExperience = yearOfExperience;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}

