package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Godfather", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Psycho", 1961);
        outroFilme.avalia(7);
        Filme terceiroFilme = new Filme("Into The Wild", 2008);
        terceiroFilme.avalia(6);
        Serie minhaSerie = new Serie("Brothers In Arms", 2001);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(terceiroFilme);
        lista.add(minhaSerie);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
            System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
