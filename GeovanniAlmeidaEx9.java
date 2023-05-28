/* Algoritmo para comparar números
Nome : Geovanni Almeida
Data : 28/05/2023 */


import java.util.Scanner;

public class GeovanniAlmeidaEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      // Aqui esta a entrada

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

      // Aqui esta o processamento e a saída

        if (n1 == n2) {
            System.out.println("Os números são iguais");
        } else if (n1 > n2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

        scanner.close();
    }
}
