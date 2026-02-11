package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {

    public static void main(String[] args) {

        List<Titulo> titulos = new ArrayList<>();

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoBruno = new Filme("Titanic", 2000);
        Serie lost = new Serie("Lost", 2000);
        meuFilme.avalia(5);
        outroFilme.avalia(8);
        filmeDoBruno.avalia(9);

        titulos.add(meuFilme);
        titulos.add(outroFilme);
        titulos.add(filmeDoBruno);
        titulos.add(lost);

        for (Titulo item : titulos) {

            System.out.println(item);

            if (item instanceof Filme titulo) {
                System.out.println("Classificação: " + titulo.getClassificacao());
            }
        }
        Comparator.comparing()
    }

}
