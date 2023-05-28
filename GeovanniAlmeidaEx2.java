/* Algoritmo para descobrir qual número é maior
Nome : Geovanni Almeida
Data : 28/05/2023
*/


import java.util.Scanner;

public class GeovanniAlmeidaEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada
        System.out.print("Insira o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Insira o terceiro número: ");
        int n3 = scanner.nextInt();

        // Aqui esta o processamento
        int maiorNumero = n1;

        if (n2 > maiorNumero) {
            maiorNumero = n2;
        }

        if (n3 > maiorNumero) {
            maiorNumero = n3;
        }

        // Aqui esta a saída
        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
