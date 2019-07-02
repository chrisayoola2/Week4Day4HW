package com.example.week4day4hw;

import java.util.ArrayList;
import java.util.List;

public class Celebrity {
    private String name;
    private String description;
    private int picturePath;


    public Celebrity(String name, String description, int picturePath) {
        this.name = name;
        this.description = description;
        this.picturePath = picturePath;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(int picturePath) {
        this.picturePath = picturePath;
    }
}
