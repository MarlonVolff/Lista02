import java.util.Scanner;

public class Exercicio09{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

         int[] vetorA = new int[5];
         int[] vetorB = new int[5];
 
         System.out.println("Informe os elementos do vetor A:");
         for (int i = 0; i < 5; i++) {
             vetorA[i] = leitor.nextInt();
         }
 
         System.out.println("Informe os elementos do vetor B:");
         for (int i = 0; i < 5; i++) {
             vetorB[i] = leitor.nextInt();
         }
 
         int[] vetorC = new int[5];
         for (int i = 0; i < 5; i++) {
             if (i % 2 == 0) { 
                 vetorC[i] = vetorA[i];
             } else {
                 vetorC[i] = vetorB[i];
             }
         }
 
         System.out.println("Vetor C:");
         for (int i = 0; i < 5; i++) {
             System.out.print(vetorC[i] + " ");
         }

        leitor.close();
    }
}