import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade <= 12 || idade >= 65) {
            System.out.println("Entrada gratuita");
        }

        sc.close();
    }
}
