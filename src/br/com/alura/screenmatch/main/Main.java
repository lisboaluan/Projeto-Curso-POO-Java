package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();


        Filme meuFilme = new Filme("The Godfather", 1972);
        //meuFilme.setNome("The Godfather");
        meuFilme.setDiretor("Francis Ford Copolla");
        //meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.setIncluiPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        System.out.println("A quantidade de avaliações para esse filme foi: " + meuFilme.getTotalAvaliacoes());
        System.out.println("A média das avaliações para esse filme é: " + meuFilme.retornaMedia());
        filtro.filtra(meuFilme);


        Filme outroFilme = new Filme("Psycho", 1961);
        //outroFilme.setNome("Psycho");
        outroFilme.setDiretor("Alfred Hitchcock");
        //outroFilme.setAnoLancamento(1961);
        outroFilme.setDuracaoEmMinutos(109);
        outroFilme.setIncluiPlano(true);

        outroFilme.exibeFichaTecnica();
        outroFilme.avalia(7);
        outroFilme.avalia(3);
        outroFilme.avalia(8);
        System.out.println("A quantidade de avaliações para esse filme foi: " + outroFilme.getTotalAvaliacoes());
        System.out.println("A média das avaliações para esse filme é: " + outroFilme.retornaMedia());
        filtro.filtra(outroFilme);


        Filme terceiroFilme = new Filme("Into The Wild", 2008);
        //terceiroFilme.setNome("Into The Wild");
        terceiroFilme.setDiretor("Sean Penn");
        //terceiroFilme.setAnoLancamento(2008);
        terceiroFilme.setDuracaoEmMinutos(148);
        terceiroFilme.setIncluiPlano(true);
        terceiroFilme.exibeFichaTecnica();
        terceiroFilme.avalia(6);
        terceiroFilme.avalia(7);
        terceiroFilme.avalia(9);
        System.out.println("A quantidade de avaliações para esse filme foi: " + terceiroFilme.getTotalAvaliacoes());
        System.out.println("A média das avaliações para esse filme é: " + terceiroFilme.retornaMedia());
        filtro.filtra(terceiroFilme);


        Serie minhaSerie = new Serie("Brothers In Arms", 2001);
        //minhaSerie.setNome("Brothers In Arms");
        //minhaSerie.setAnoLancamento(2001);
        minhaSerie.setTemporadas(1);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setDuracaoEmMinutos(59);
        minhaSerie.setIncluiPlano(true);
        minhaSerie.exibeFichaTecnica();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(terceiroFilme);
        System.out.println("\nPara maratonar " + meuFilme.getNome() + ", " + outroFilme.getNome() + " e " + terceiroFilme.getNome() +
        " você vai precisar de " + calculadora.getTempoTotal() + " minutos\n");



        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);


        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        listaFilmes.add(terceiroFilme);
        System.out.println("O tamanho da lista é: " + listaFilmes.size());
        System.out.println("O primeiro filme da lista é: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
 }

}
