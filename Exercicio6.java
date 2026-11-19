import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int turno, disciplina;

        System.out.println("Digite um valor inteiro para selecionar um turno");
        turno = sc.nextInt();

        System.out.println("Digite um valor inteiro para selecionar uma disciplina");
        disciplina = sc.nextInt();

        switch (turno) {
            case 1:
                switch (disciplina) {
                    case 1:
                        System.out.println("Matematica");
                        break;
                    case 2:
                        System.out.println("Portugues");
                        break;
                    default:
                        System.out.println("Disciplina nao disponivel no periodo da manha");
                }
                break;

            case 2:
                switch (disciplina) {
                    case 1:
                        System.out.println("Historia");
                        break;
                    default:
                        System.out.println("Disciplina nao disponivel no periodo da tarde");
                }
                break;

            default:
                System.out.println("Turno invalido");
        }

        sc.close();
    }
}
