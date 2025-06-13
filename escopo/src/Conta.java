public class Conta {
    // variavel da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        // variavel local de método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // disponível em toda classe
        System.out.println(saldo);

        // somente o método sacar conhece este valor
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        // variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for (int x = 1; x <= 5; x++) { // x variável de escopo de fluxo
            // esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        return valorMontante;
    }
}