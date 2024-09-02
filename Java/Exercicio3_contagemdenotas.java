package Java;
import java.util.Scanner;
public class Exercicio3_contagemdenotas {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // "n" = Notas
    int n1,n2,n3;
    System.out.println("informe a primeira nota: ");
    n1 = input.nextInt();
    System.out.println("informe a segunda nota: ");
    n2 = input.nextInt();
    System.out.println("informe a ultima nota: ");
    n3 = input.nextInt();
    int n4 = (n1+n2+n3)/3;
    System.out.println("a media do estudante é: " +n4);
    input.close();
  }  
}