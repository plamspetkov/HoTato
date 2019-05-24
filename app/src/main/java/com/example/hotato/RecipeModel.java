package com.example.hotato;

public class RecipeModel {

    private String name;
    private String image;
    private String ingredients;
    private String description;

    @Override
    public String toString() {
        return "RecipeModel{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //empty constructor for the Firebase to map the data
    public RecipeModel() {

    }

    //constructor
    public RecipeModel(String image, String name, String ingredients, String description){
        this.image = image;
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
