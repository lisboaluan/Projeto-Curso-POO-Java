public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1971;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        System.out.println("A quantidade de avaliações para esse filme foi: " + meuFilme.totalDeAvaliacoes);
        System.out.println("A média das avaliações para esse filme é: " + meuFilme.retornaMedia());
    }
}
