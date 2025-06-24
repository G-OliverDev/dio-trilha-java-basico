import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.println("Por favor, digite o número da conta: ");
        Numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        scanner.nextLine();
        Agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        NomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo: ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

        scanner.close();
    }
}
