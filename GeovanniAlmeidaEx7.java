/* Algoritmo para mostrar se acertou determinados números
Nome : Geovanni Almeida
Data : 28/05/2023 */



import java.util.Scanner;

public class GeovanniAlmeidaEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Aqui esta o processamento e saída

        if (valor >= 94 && valor <= 456) {
            System.out.println("Acertou");
        } else {
            System.out.println("Tente de novo");
            
        }

        scanner.close();
    }
}
