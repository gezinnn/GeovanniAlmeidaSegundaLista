/* Algoritmo para mostrar a quantidade picolés comprados
Nome : Geovanni Almeida
Data : 28/05/2023 */



import java.util.Scanner;

public class GeovanniAlmeidaEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        double precoKiwi = 3.20;
        double precoLaranja = 2.39;
        double precoRoma = 7.99;

        System.out.print("Digite a quantidade de picolés de Kiwi a ser comprada: ");
        int quantidadeKiwi = scanner.nextInt();

        System.out.print("Digite a quantidade de picolés de Laranja a ser comprada: ");
        int quantidadeLaranja = scanner.nextInt();

        System.out.print("Digite a quantidade de picolés de Romã a ser comprada: ");
        int quantidadeRoma = scanner.nextInt();

        // Aqui esta o processamento
        
        double totalCompra = (precoKiwi * quantidadeKiwi) + (precoLaranja * quantidadeLaranja) + (precoRoma * quantidadeRoma);

        // Aqui esta a saída

        System.out.println("O valor total da compra é: R$ " + totalCompra);
        
        scanner.close();
    }
}
