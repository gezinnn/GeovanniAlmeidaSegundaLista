/* Algoritmo para mostrar o sucessor e antecessor de um número
Nome : Geovanni Almeida
Data : 28/05/2023 */



import java.util.Scanner;

public class GeovanniAlmeidaEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Aqui esta o processamento

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Aqui esta a saída

        System.out.println("Número: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        scanner.close();
    }
}
