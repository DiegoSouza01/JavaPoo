package EstruturaRepetitiva;

public class ExemplosFor {

    public static void main(String[] args) {

        int x, y, i, a, b;

        System.out.println("Primeiro Teste:");

        x = 4;
        y = x + 2;
        for (i=0; i<x; i++) {
            System.out.print(x+" "+y);
            y = y + i;
        }

        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Segundo Teste:");

        for (i=1; i<5; i++){
            y = i;
            x = i * 10;
            System.out.print(i);
        }

        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Terceiro Teste:");

        y = 10;
        for (i=0; i<4; i++){
            System.out.print(i);
            y = y + i;
            System.out.println(y);
        }

        System.out.println("Quarto Teste:");

        x = 4;
        y = 0;
        for (i=0; i<x; i++) {
            System.out.print(i);
            System.out.println(x);
            y = y + 10;
        }

        System.out.println("Quinto Teste:");

        a = 4;
        y = 0;
        for (i=0; i<a; i++) {
            y = y + i;
        }
        System.out.println(y);

        System.out.println("Sexto Teste:");

        b = 8;
        y = 3;
        for (i=0; y<b; i++) {
            b = b - 2;
            y = y + 1;
            System.out.println(i);
        }
    }
}
