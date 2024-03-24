import java.util.Scanner;

public class Exercicio04{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
         int[] vetor = new int[5];

         System.out.println("Digite os 5 números do vetor:");
         for (int i = 0; i < 5; i++) {
             vetor[i] = leitor.nextInt();
         }
 
         System.out.print("Digite um número n: ");
         int n = leitor.nextInt();
 
         System.out.println("Indices dos elementos inferiores a " + n + ":");
         for (int i = 0; i < 5; i++) {
             if (vetor[i] < n) {
                 System.out.println("Indice: " + i);
             }
         }
        leitor.close();
    }
}
