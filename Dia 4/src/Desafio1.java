public class Desafio1 {
    public static void main(String[] args) {
        //Desafio 1 (formas que o Kaio fez)
        System.out.println("Kaio while Par(x2):");
        int i = 0;
        while (i <= 50){
            System.out.print(i * 2 + " ");
            i++;
        }
        System.out.println("\n\nKaio for Par(x2):" );
        for(int x = 0; x <= 50; x++) {
            System.out.print(x * 2 + " ");
        }

        System.out.println("\n\nAndré Par:");
        //formas que o andré fez
        for(int y = 0; y <=100; y++){
            if(y % 2 == 0)
                System.out.print(y + " ");
        }


        //Desafio 1 (formas que o Kaio fez)
        System.out.println("\n\nKaio while Impar(x2+1):");
        int ii = 0;
        while (ii <= 50){
            System.out.print(ii * 2+1 + " ");
            ii++;
        }
        System.out.println("\n\nKaio for Impar (x2+1):" );
        for(int xx = 0; xx <= 50; xx++) {
            System.out.print(xx * 2 + 1 + " ");
        }

        System.out.println("\n\nAndré Impar:");
        //formas que o andré fez
        for(int yy = 0; yy <=100; yy++){
            if(yy % 2 != 0)
                System.out.print(yy + " ");
        }
    }
}
