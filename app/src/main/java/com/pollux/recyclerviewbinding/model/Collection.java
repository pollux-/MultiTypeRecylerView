package com.pollux.recyclerviewbinding.model;

/**
 * Created by sreekumar on 7/24/17.
 */

public class Collection implements BaseModel{
    private int id;
    private String title;
    private String groupId;

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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public int getViewType() {
        return Constants.ViewType.COLLECTION_TYPE;
    }
}
