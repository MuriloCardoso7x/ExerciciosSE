import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota final (0 a 10): ");
        double nota = sc.nextDouble();

        System.out.print("Digite o percentual de frequencia: ");
        double frequencia = sc.nextDouble();

        if (nota >= 6 && frequencia >= 75) {
            if (nota >= 9 && frequencia >= 90) {
                System.out.println("Aluno destacado");
            } else {
                System.out.println("Aluno aprovado");
            }
        } else {
            if (frequencia >= 75) {
                System.out.println("Aluno em reavaliacao");
            } else {
                System.out.println("Aluno reprovado por frequencia");
            }
        }

        sc.close();
    }
}
