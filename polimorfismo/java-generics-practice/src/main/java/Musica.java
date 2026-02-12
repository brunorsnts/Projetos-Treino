import java.util.Objects;

public class Musica implements Imprimivel{

    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public void imprimir() {
        System.out.println("Música: " + nome + " - " + artista);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return Objects.equals(nome, musica.nome) && Objects.equals(artista, musica.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, artista);
    }
}
