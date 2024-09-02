package Java;

import java.util.Scanner;

public class Exercicio5_ImpostodeRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, gratificacao, imposto, total;
        System.out.println("qual seu salario?");
        salario = input.nextDouble();
        gratificacao = salario * 0.05;
        imposto = salario * 0.07;
        total = salario + gratificacao - imposto;
        System.out.println("seu salario ajustado é: " + total + "R$");
        input.close();
    }
}