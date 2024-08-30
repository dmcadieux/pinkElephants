package com.dmcadieux.pinkelephants.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "snowflakes")
public class Snowflake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "safespace")
    private String safeSpace;

    @Column(name = "genderself")
    private Float genderSelf;

    @Column(name = "date")
    private LocalDate date;

    public Snowflake() {

    }

    public Snowflake(String name, String safeSpace, Float genderSelf, LocalDate date) {
        this.name = name;
        this.safeSpace = safeSpace;
        this.genderSelf = genderSelf;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSafeSpace() {
        return safeSpace;
    }

    public void setSafeSpace(String safeSpace) {
        this.safeSpace = safeSpace;
    }

    public Float getGenderSelf() {
        return genderSelf;
    }

    public void setGenderSelf(Float genderSelf) {
        this.genderSelf = genderSelf;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
