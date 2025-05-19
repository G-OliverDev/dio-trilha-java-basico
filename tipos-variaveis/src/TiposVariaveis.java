public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        int idade;
        int anoDeFabricacao = 2021;
        double salarioMinimo = 2500.33;
        idade = 10;

        // Casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Constantes
        final double VALOR_DE_PI = 3.14;

        System.out.println(idade);
        System.out.println(anoDeFabricacao);
        System.out.println(salarioMinimo);
        System.out.println(numeroCurto2);
        System.out.println(VALOR_DE_PI);
    }
}
