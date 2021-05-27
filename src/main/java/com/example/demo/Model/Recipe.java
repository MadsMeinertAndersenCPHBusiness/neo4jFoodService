package com.example.demo.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.neo4j.ogm.annotation.Relationship.INCOMING;


@NodeEntity
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;

    String name;
    @JsonIgnoreProperties({"recipe"})
    @Relationship(type = "USED_IN", direction = INCOMING)
    private List<Amount> amount = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, List<Amount> amount) {
        this.name = name;
        this.amount = amount;
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

    public List<Amount> getAmount() {
        return amount;
    }

    public void setAmount(List<Amount> amount) {
        this.amount = amount;
    }

    public Recipe() {
    }
}
