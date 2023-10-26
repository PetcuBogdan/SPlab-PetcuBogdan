package com.example.demo;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
   @Getter
   private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    void print() {
        System.out.println(name);
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);

        return subChapters.size()-1;
    }

    public SubChapter getSubChapter(int subChapterIndex) {
        if (subChapterIndex >= 0 && subChapterIndex < subChapters.size()) {
            return subChapters.get(subChapterIndex);
        } else {
            return null;
        }
    }
}
