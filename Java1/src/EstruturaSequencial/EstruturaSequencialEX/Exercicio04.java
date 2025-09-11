package EstruturaSequencial.EstruturaSequencialEX;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    /*
    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, hora;
        double valorHora, salario;

        numero = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * hora;

        System.out.println("Number = " + numero);
        System.out.printf("Salary = U$ %.2f%n", salario);

        sc.close();
    }
}
