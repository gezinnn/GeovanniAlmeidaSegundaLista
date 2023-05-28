/* Algoritmo para usar if,inteiro,real,char e string
Nome : Geovanni Almeida
Data : 28/05/2023 */


import java.util.Scanner;

public class GeovanniAlmeidaEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        double valorreal;
        int valorinteiro;
        String texto;
        char caractere;

        // Entrada de dados
        System.out.print("Digite um valor real: ");
        valorreal = scanner.nextDouble();

        System.out.print("Digite um valor inteiro: ");
        valorinteiro = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Digite um texto: ");
        texto = scanner.nextLine();

        System.out.print("Digite um caractere: ");
        caractere = scanner.nextLine().charAt(0);

        // Decisão encadeada
        if (valorinteiro > 0) {
            System.out.println("O valor inteiro é positivo.");
        } else if (valorinteiro < 0) {
            System.out.println("O valor inteiro é negativo.");
        } else {
            System.out.println("O valor inteiro é zero.");
        }

        // Saída de dados
        System.out.println("Valor real: " + valorreal);
        System.out.println("Valor inteiro: " + valorinteiro);
        System.out.println("Texto: " + texto);
        System.out.println("Caractere: " + caractere);

        scanner.close();
    }
}
