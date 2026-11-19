import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Bone (R$ 50,00)");
        System.out.println("2 - Calca (R$ 80,00)");
        System.out.println("3 - Tenis (R$ 150,00)");

        System.out.print("Digite o codigo do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();

        double valorUnitario;

        switch (codigo) {
            case 1:
                valorUnitario = 50.00;
                break;
            case 2:
                valorUnitario = 80.00;
                break;
            case 3:
                valorUnitario = 150.00;
                break;
            default:
                System.out.println("Produto nao encontrado");
                sc.close();
                return;
        }

        double total = valorUnitario * quantidade;
        System.out.printf("Valor total da compra: R$ "+ total);

        sc.close();
    }
}
