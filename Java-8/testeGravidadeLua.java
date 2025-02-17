import java.util.Scanner;

public class testeGravidadeLua {
    public static void main(String[] args) {
    double terra;
    double lua; 
    Scanner input = new Scanner(System.in);
    System.out.println("|| Calculo de peso na lua ||");
    System.out.println("qual seu peso aqui na terra em kilogramas meu nobre?");
    System.out.print("Peso: ");
    terra = input.nextDouble();
    input.close();
    lua = terra * 0.17;
    System.out.println("seu peso na lua seria: " +lua+ " kg");
    }

}
