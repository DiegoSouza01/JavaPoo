package EstruturaRepetitiva;

public class ExemplosWhile {

    public static void main(String[] args) {

        System.out.println("Primeiro Teste:");

        int x;
        int y;
        int i;

        x = 5;
        y = 0;
        while (x > 2) {
            System.out.print(x);
            y = y + x;
            x = x - 1;
        }
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Segundo Teste:");

        x = 2;
        y = 0;
        while (x <60) {
            System.out.println(x);
            x = x * 2;
            y = y + 10;
        }

        System.out.println("Terceiro Teste:");

        double a = 100;
        double b = 100;
        while (a != b) {
            System.out.print("olha");
            a = Math.sqrt(b);
        }

        System.out.print("\n");
        System.out.print("\n");

        System.out.println("Quarto Teste:");

        x = 0;
        while (x < 5) {
            y = x * 3;
            System.out.print(y);
            x = x + 1;
        }
        System.out.println("Fim");

        System.out.println("Quinto Teste:");

        x = 2;
        y = 10;
        System.out.println("Olá");
        while (x < y) {
            System.out.println(x + "-" + y);
            x = x * 2;
            y = y + 1;
        }

        System.out.println("Sexto Teste:");

        x = 4;
        y = 0;
        i = 0;
        while (i < x) {
            i = i + 1;
            y = y + i;
            System.out.print(i);
            System.out.println(y);
        }
    }
}
