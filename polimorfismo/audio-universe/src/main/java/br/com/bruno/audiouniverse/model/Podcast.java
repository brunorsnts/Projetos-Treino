package br.com.bruno.audiouniverse.model;

public class Podcast extends Audio{

    private String presenter;
    private String description;
    private int episode;
    private int season;

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    @Override
    public int getClassification() {
        if (getLikes() > 2000) {
            return 10;
        }

        else if (getLikes() > 1000) {
            return 7;
        }

        else {
            return 5;
        }
    }
}
