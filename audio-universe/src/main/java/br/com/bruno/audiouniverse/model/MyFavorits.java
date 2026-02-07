package br.com.bruno.audiouniverse.model;

public class MyFavorits {

    public void includes(Audio audio) {
        if (audio.getClassification() == 10) {
            System.out.println(audio.getTitle() +
                    " é considerado sucesso absoluto");
        }

        else if (audio.getClassification() >= 7) {
            System.out.println("As pessoas estão curtindo bastante " + audio.getTitle());
        }

        else {
            System.out.println(audio.getTitle() + " é considerado bom!");
        }
    }
}
