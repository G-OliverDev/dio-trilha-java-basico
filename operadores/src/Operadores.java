public class Operadores {
    public static void main(String[] args) throws Exception {
        // Atribuição
        String nome = "Gabriel";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;

        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);
        String nomeCompleto = "Linguagem" + "Java"; // O operador de adição quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".

        // Unários
        int a = -5;
        int b = 10;
        b++;
        int c = 10;
        c--;
        boolean variavel = false;
        variavel = !variavel;

        // Operador ternário
        int x, y;
        String valor = "";

        x = 5;
        y = 6;

        /* Exemplo de condicional utilizando estrutura if/else 
        if (x == y)
            valor = "verdadeiro";
        else
            valor = "falso";
        */

        valor = x == y ? "verdadeiro" : "falso";

        // Relacionais
        int n1 = 1;
        int n2 = 2;
        boolean simNao;

        // Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("FIM");

        simNao = n1 == n2; 
        simNao = n1 != n2;
        simNao = n1 > n2;
        simNao = n1 >= n2;
        simNao = n1 < n2;
        simNao = n1 <= n2;

        System.out.println("----------------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(doadorOrgao);
        System.out.println("----------------------");
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);
        System.out.println(nomeCompleto);
        System.out.println("----------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(variavel);
        System.out.println("----------------------");
        System.out.println(valor);
        System.out.println("----------------------");
        System.out.println(simNao);
    }
}
