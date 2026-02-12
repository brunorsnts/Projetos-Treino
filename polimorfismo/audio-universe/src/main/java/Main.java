import br.com.bruno.audiouniverse.model.Music;
import br.com.bruno.audiouniverse.model.MyFavorits;
import br.com.bruno.audiouniverse.model.Podcast;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        music.setArtist("Beyonce");
        music.setTitle("Helo");

        Podcast podcast = new Podcast();
        podcast.setPresenter("Tata");
        podcast.setTitle("PodDelas");

        for (int i = 0; i < 400; i++) {
            music.like();
        }

        for (int i = 0; i < 501; i++) {
            music.reproduce();
        }

        for (int i = 0; i < 8000; i++) {
            podcast.reproduce();
        }

        for (int i = 0; i < 400; i++) {
            podcast.like();
        }

        System.out.println(music.getTitle() + " possui "
                + music.getLikes()
                + " curtidas e "
                + music.getFullReproduction()
                + " reproduções");

        System.out.println();

        System.out.println(podcast.getTitle() + " possui "
                + podcast.getLikes()
                + " curtidas e "
                + podcast.getFullReproduction()
                + " reproduções");

        System.out.println();

        MyFavorits myFavorits = new MyFavorits();

        myFavorits.includes(music);
        myFavorits.includes(podcast);
    }
}
