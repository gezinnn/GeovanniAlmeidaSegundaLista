/* Algoritmo para realizar um troca de valores
Nome : Geovanni Almeida
Data : 28/05/2023 */



import java.util.Scanner;

public class GeovanniAlmeidaEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aqui esta a entrada

        System.out.print("Digite o valor de A: ");
        int varA = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int varB = scanner.nextInt();

        System.out.println("Valores antes da troca:");
        System.out.println("A = " + varA);
        System.out.println("B = " + varB);

        // Aqui esta o processamento 

        int temp = varA;
        varA = varB;
        varB = temp;

        // Aqui esta a saída

        System.out.println("Valores após a troca:");
        System.out.println("A = " + varA);
        System.out.println("B = " + varB);

        scanner.close();
    }
}
