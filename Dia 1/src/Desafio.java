import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner numero1 = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        double primeiro = numero1.nextDouble();

        Scanner numero2 = new Scanner(System.in);
        System.out.print("Digite o 2º número: ");
        double segundo = numero2.nextDouble();

        double soma = primeiro + segundo;
        System.out.print("A soma é " + soma);
    }
}
