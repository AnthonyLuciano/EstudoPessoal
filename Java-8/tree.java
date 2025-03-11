import java.util.Scanner;
public class tree {
    public static void main(String[] args) {
        int altura;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura da arvore: ");
        altura = input.nextInt();
        input.close();
        for (int i = 1; i <= altura; i++) {
            for (int a = 0; a < altura - i; a++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
