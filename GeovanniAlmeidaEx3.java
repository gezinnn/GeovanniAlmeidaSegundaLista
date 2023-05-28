/* Algoritmo para calcular á area de um triangulo
Nome : Geovanni Almeida
Data : 28/05/2023 */


import java.util.Scanner;

public class GeovanniAlmeidaEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aqui esta a entrada

        System.out.print("Digite o valor da base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        // Aqui esta o processamento

        double area = (base * altura) / 2;

        // Aqui esta a saída

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}

