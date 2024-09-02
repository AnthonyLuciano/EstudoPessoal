package Java;

import java.util.Scanner;

public class Exercicio1_calculobasico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("digite um numero");
        n1 = input.nextInt();
        System.out.println("digite outro numero");
        n2 = input.nextInt();
        int n3 = n1 + n2;
        System.out.println("o total é: "+n3);
        input.close();
    }
}