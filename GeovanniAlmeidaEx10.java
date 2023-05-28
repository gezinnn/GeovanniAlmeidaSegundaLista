/* Algoritmo para ver se é ímpar ou par
Nome : Geovanni Almeida
Data : 28/05/2023 */


import java.util.Scanner;

public class GeovanniAlmeidaEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Aqui esta o processamento e saída

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        scanner.close();
    }
}
