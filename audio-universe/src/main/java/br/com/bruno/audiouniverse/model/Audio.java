package br.com.bruno.audiouniverse.model;

public class Audio {

    private String title;
    private String duration;
    private int fullReproduction;
    private int likes;
    private double classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getFullReproduction() {
        return fullReproduction;
    }

    public int getLikes() {
        return likes;
    }

    public double getClassification() {
        return classification;
    }
}
