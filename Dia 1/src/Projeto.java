import java.util.Scanner;

// PROJETO DIA 1 = CALCULADORA DE SOMA DE 2 NÚMEROS

public class Projeto {

    public static void main(String[] args){

        //PRIMEIRO NÚMERO
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro(1º) número: ");
        int primeiro = numero1Scanner.nextInt();

        //SEGUNDO NÚMERO
        Scanner numero2Scanner = new Scanner(System.in);
        System.out.print("Digite o segundo(2º) número: ");
        int segundo = numero2Scanner.nextInt();

        int resultado = primeiro + segundo;
        System.out.print("A soma é " + resultado);
        //System.out.println("A soma é " + (primeiro + segundo));

    }
}

