package Java;
import java.util.Scanner;
public class Exercicio4_produtos {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int produtopreco;
    System.out.println("qual o valor desse produto em Reais(R$)?");
    produtopreco = input.nextInt();
    int removerpedaco = produtopreco * 10/100 ;
    int precofinal = produtopreco - removerpedaco;
    System.out.println("opa! você é nosso 1.000.000 comprador :D e ganhara um disconto de 10%!!!");
    System.out.println("o seu novo valor é...");
    System.out.println(precofinal+"R$");
    input.close();
}
    
}