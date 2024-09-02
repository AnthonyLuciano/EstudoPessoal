package Java;

import java.util.Scanner;

public class Exercicio2_divisãobasica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("digite um numero");
        n1 = input.nextInt();
        System.out.println("digite outro numero");
        n2 = input.nextInt();
        if (n2 <= 0) {
            System.out.println("é serio isso colega? (¬_¬ )");
        }else{
        int n3 = n1 / n2;
        System.out.println("o total é: "+n3);
        input.close(); } 
    }
}
