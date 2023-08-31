package com.laxmi.employees.entity;


import jakarta.persistence.*;

@Entity
@Table(name="bike")
public class Bike {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="make")
    private String make;

    @Column(name="model")
    private String model;

    public Bike() {
    }

    public Bike(int id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
