package ClassesAtributosMetodos;

public class Student {
    /*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.

Dados:

Entrada: Saída:
Alex Green
27.00
31.00
32.00

FINAL GRADE = 90.00
PASS

Entrada: Saída:
Alex Green
17.00
20.00
15.00

FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS
     */
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String status() {
        if (finalGrade() >= 60.0) {
            return "PASS";
        } else {
            return "FAILED";
        }
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
