package com.example.demo;

public class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    void print() {
        System.out.println("Image with name: " + imageName);
    }
}
