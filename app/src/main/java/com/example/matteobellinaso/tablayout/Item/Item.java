package com.example.matteobellinaso.tablayout.Item;

/**
 * Created by matteobellinaso on 15/03/18.
 */

public class Item {
    private String name;
    private int imgUrl;
    private String description;

    public Item(String name, int imgUrl, String description){
        this.name = name;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public int getImgUrl(){
        return this.imgUrl;
    }
    public String getDescription(){
        return this.description;
    }
}
