package br.com.bruno.audiouniverse.model;

import java.util.ArrayList;
import java.util.List;

public class Audio {

    private String title;
    private int fullReproduction;
    private int likes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFullReproduction() {
        return fullReproduction;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassification() {
        return classification;
    }

    public void like() {
        likes++;
    }

    public void reproduce() {
        fullReproduction++;
    }
}
