package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private boolean incluiPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluiPlano() {
        return incluiPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluiPlano(boolean incluiPlano) {
        this.incluiPlano = incluiPlano;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("\nNome do Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double retornaMedia(){
        return Math.ceil(somaAvaliacoes / totalAvaliacoes);
    }

}
