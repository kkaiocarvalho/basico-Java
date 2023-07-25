public class Desafio2 {
    public static void main(String[] args) {
        String spaces = "Hello World"; // com lenght, sabemos que temos 11 caracteres aqui

        for(int i = 0; i <= spaces.length() - 1; i++) // o index é de 0 a 10 // então subtraio 1 pra caber no index
            System.out.print(spaces.charAt(i) + " ");

    }
}
