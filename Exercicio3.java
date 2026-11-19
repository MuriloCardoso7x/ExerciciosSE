import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Atendimento infantil");
        } else if (idade >= 13 && idade <= 59) {
            System.out.println("Atendimento adulto");
        } else {
            System.out.println("Atendimento preferencial");
        }

        sc.close();
    }
}
