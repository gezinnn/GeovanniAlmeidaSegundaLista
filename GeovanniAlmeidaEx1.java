/* Algoritmo para calcular um valor com um desconto
Nome : Geovanni Almeida
Data : 28/05/2023
*/


import java.util.Scanner;

public class GeovanniAlmeidaEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada
        System.out.print("Insira um valor: ");
        double valor = scanner.nextDouble();

        // Aqui esta o processamento
        double desconto = valor * 0.15;
        double valorComDesconto = valor - desconto;

        // Aqui esta a saída
        System.out.println("Valor original: R$" + valor);
        System.out.println("Valor com desconto: R$" + valorComDesconto);

        scanner.close();
    }
}
