package com.pollux.recyclerviewbinding.model;

/**
 * Created by sreekumar on 7/24/17.
 */

public class Product implements BaseModel{
    private int id;
    private String title;
    private String productGroupId;

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

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    @Override
    public int getViewType() {
        return Constants.ViewType.PRODUCT;
    }
}
