package br.com.bruno.audiouniverse.model;

public class Music extends Audio {

    private String artist;
    private String gender;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if (getFullReproduction() > 2000) {
            return 10;
        }

        else if (getFullReproduction() > 500) {
            return 7;
        }

        else {
            return 5;
        }
    }
}
