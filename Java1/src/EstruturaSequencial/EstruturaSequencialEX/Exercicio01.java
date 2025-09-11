package EstruturaSequencial.EstruturaSequencialEX;

import java.util.Scanner;

public class Exercicio01 {

    /*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números para realizar a soma:");

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;

        System.out.println("Soma = " + soma);

        sc.close();

    }

}