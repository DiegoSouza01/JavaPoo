package EstruturaSequencialEX;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    /*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

    public static void main(String[] args) {

        System.out.println("Digite um valor:");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, Pi = 3.14159;

        R = sc.nextDouble();

        A = Pi * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
