import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresso = new Scanner(System.in);
        System.out.print("Escolha o seu ingresso! \n 500 reais para VIP | 400 reais para PISTA: ");
        int valorIngresso = ingresso.nextInt();
        String acesso = valorIngresso >= 500 ? "VIP" : "PISTA";
        System.out.println(acesso);
    }
}

/*  FORMATANDO NÚMEROS EM JAVA
        NumberFormat real = NumberFormat.getCurrencyInstance(); //VAI BUSCAR A MOEDA DE ACORDO COM O VALOR LOCAL DA MAQUINA
        String productValue = real.format(120.80);
        System.out.println(productValue); // R$ 120,80
*/

/* OPERADORES DE COMPARAÇÃO
        int a = 4;
        int b = 5;
        int c = 4;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a == c);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a < b);
 */

/* if e else
    int valorCarro = 100_000;
    if (valorCarro > 100_000)
        System.out.println("Não comprar, preço está acima da tabela!");
    else if (valorCarro > 90_000 && valorCarro < 100_000)
        System.out.println("Pode comprar o carro!");
    else
        System.out.println("Preço abaixo da tabela, recomendo não comprar!");
    }
    //---------------------------------------------------------
    public class Main {
    public static void main(String[] args) {
        Scanner carroScanner = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        double valor = carroScanner.nextDouble();

        if (valor > 100_000)
            System.out.println("Não comprar, preço está acima da tabela!");
        else if (valor > 90_000 && valor < 100_000)
            System.out.println("Pode comprar o carro!");
        else
            System.out.println("Preço abaixo da tabela, recomendo não comprar!");
    }
}
 */

/* OPERADOR TERNÁRIO
        Scanner ingresso = new Scanner(System.in);
        System.out.print("Escolha o seu ingresso! \n 500 reais para VIP | 400 reais para PISTA: ");
        int valorIngresso = ingresso.nextInt();
        String acesso = valorIngresso >= 500 ? "VIP" : "PISTA";
        System.out.println(acesso);
    }
 */