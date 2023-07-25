import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        //Input
        Scanner lerNumeros = new Scanner(System.in);
        System.out.print("Insira o(s) dígito(s): ");
        int num = lerNumeros.nextInt();
        //condições
        if(num < 9 && num > 1)
            System.out.println("Seu número tem 1 dígito.");
        else if (num < 100 && num >= 10)
            System.out.println("Seu número tem 2 dígitos.");
        else if (num < 1000 && num >= 100)
            System.out.println("Seu número tem 3 dígitos.");
        else if (num < 10000 && num >= 1000)
            System.out.println("Seu número tem 4 dígitos.");
        else if (num < 100000 && num >= 10000)
            System.out.println("Seu número tem 5 dígitos.");
        else
            System.out.println("Seu número tem 5 dígitos ou mais.");

    }
}
