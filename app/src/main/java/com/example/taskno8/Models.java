package com.example.taskno8;

public class Models {
    String recipesName;
    int recipesImage;

    public Models(String recipesName, int recipesImage) {
        this.recipesName = recipesName;
        this.recipesImage = recipesImage;

    }


    public String getRecipesName() {
        return recipesName;
    }

    public void setRecipesName(String recipesName) {
        this.recipesName = recipesName;
    }

    public int getRecipesImage() {
        return recipesImage;
    }

    public void setRecipesImage(int recipesImage) {
        this.recipesImage = recipesImage;
    }

}
