package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private String text;


    public Paragraph(String text) {
        this.text = text;
    }

    void print() {
        System.out.println("Paragraph: " + text);
    }
}
