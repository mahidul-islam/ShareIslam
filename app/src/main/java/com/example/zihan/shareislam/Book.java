package com.example.zihan.shareislam;

public class Book {

    private int id;
    private String name;
    private String catagory;
    private int image_id;

    public Book(int id, String name, String catagory, int image_id) {
        this.id = id;
        this.name = name;
        this.catagory = catagory;
        this.image_id = image_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCatagory() {
        return catagory;
    }

    public int getImage_id() {
        return image_id;
    }

}
