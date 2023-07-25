import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* classe math */
        double valor = Math.round(10.2); // arredondar pra baixo a partir do 4, do 5 ele vai cima
        double valor1 = Math.ceil(10.2); // arrendonda sempre pra cima
        double valor2 = Math.floor(10.2); // arrendonda sempre pra baixo
        double valor3 = Math.random(); // gera números randomicos
        double valor4 = Math.round (Math.random () * 100); //valor aleatório arredondado
        int valor5 = (int)Math.round (Math.random () * 100);//casting
        System.out.println(valor);
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);
        System.out.println(valor5);
/* CONVERSÃO DE STRING PRA INT

String valorProduto = "10";
        System.out.println(valorProduto);
        int valorTotal = Integer.parseInt(valorProduto) + 2;
        System.out.println(valorTotal);

*/

/* arrays multidimensionais

String[][] cars = {{"BMW", "Tesla"}, {"Jeep", "Fiat"}};
        System.out.println(Arrays.deepToString(cars));

*/

/* criando uma string array

String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        cars [2] = "Ferrari";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[1]);
*/

/* criando uma int array

int [] valores = {10, 20, 15, 30, 40}  ;
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length);
*/

    }
}