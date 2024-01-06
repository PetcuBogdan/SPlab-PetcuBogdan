package com.example.demo.services;

import com.example.demo.models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: " + "     " + paragraph.getText());
    }
}
