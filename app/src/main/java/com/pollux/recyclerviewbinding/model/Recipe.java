package com.pollux.recyclerviewbinding.model;

/**
 * Created by sreekumar on 7/24/17.
 */

public class Recipe implements BaseModel{
    private int id;
    private String title;
    private String recipeGroupId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecipeGroupId() {
        return recipeGroupId;
    }

    public void setRecipeGroupId(String recipeGroupId) {
        this.recipeGroupId = recipeGroupId;
    }

    @Override
    public int getViewType() {
        return Constants.ViewType.RECIPE_TYPE;
    }
}
