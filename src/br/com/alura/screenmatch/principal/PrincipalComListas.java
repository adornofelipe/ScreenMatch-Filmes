package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        var filmeDoPaulo = new Filme("DogVille",2003);
        filmeDoPaulo.avalia(10);
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(5);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme){
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());
        }
        }


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Fezzin");
        buscaPorArtista.add("ED");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }



}
