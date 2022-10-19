package com.example.reciepebackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipies")
public class RecipeModel {

    @Id
    @GeneratedValue
    private int Id;
    private String reciepe_name;
    private String ingredients;
    private String category;
    private String duration;

    public RecipeModel(int id, String reciepe_name, String ingredients, String category, String duration) {
        Id = id;
        this.reciepe_name = reciepe_name;
        this.ingredients = ingredients;
        this.category = category;
        this.duration = duration;
    }

    public RecipeModel() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getReciepe_name() {
        return reciepe_name;
    }

    public void setReciepe_name(String reciepe_name) {
        this.reciepe_name = reciepe_name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
