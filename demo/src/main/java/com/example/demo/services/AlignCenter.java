package com.example.demo.services;

import com.example.demo.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: " + "#     " + paragraph.getText() + "     #");
    }
}
