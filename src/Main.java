import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();


        Filme meuFilme = new Filme();
        meuFilme.setNome("The Godfather");
        meuFilme.setDiretor("Francis Ford Copolla");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.setIncluiPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        System.out.println("A quantidade de avaliações para esse filme foi: " + meuFilme.getTotalAvaliacoes());
        System.out.println("A média das avaliações para esse filme é: " + meuFilme.retornaMedia());
        filtro.filtra(meuFilme);


        Filme outroFilme = new Filme();
        outroFilme.setNome("Psycho");
        outroFilme.setDiretor("Alfred Hitchcock");
        outroFilme.setAnoLancamento(1961);
        outroFilme.setDuracaoEmMinutos(109);
        outroFilme.setIncluiPlano(true);

        outroFilme.exibeFichaTecnica();
        outroFilme.avalia(7);
        outroFilme.avalia(3);
        outroFilme.avalia(8);
        System.out.println("A quantidade de avaliações para esse filme foi: " + outroFilme.getTotalAvaliacoes());
        System.out.println("A média das avaliações para esse filme é: " + outroFilme.retornaMedia());
        filtro.filtra(outroFilme);


        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Brothers In Arms");
        minhaSerie.setAnoLancamento(2001);
        minhaSerie.setTemporadas(1);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setDuracaoEmMinutos(59);
        minhaSerie.setIncluiPlano(true);
        minhaSerie.exibeFichaTecnica();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println("\nPara maratonar " +meuFilme.getNome() + ", " + outroFilme.getNome() + " e " + minhaSerie. getNome() +
        " você vai precisar de " + calculadora.getTempoTotal() + " minutos");


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);

    }
}
