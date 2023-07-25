import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Insira a idade: ");
        byte idadeCliente = idadeScanner.nextByte();
        System.out.println("A idade do Cliente é: " + idadeCliente);
    }
}
