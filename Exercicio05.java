import java.util.Scanner;

public class Exercicio05{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
         int[] vetor = new int[5];

         System.out.println("Informe 5 numeros:");
         for (int i = 0; i < 5; i++) {
             vetor[i] = leitor.nextInt();
         }

         System.out.print("Digite um numero n: ");
         int n = leitor.nextInt();
 
         int cont = 0;
         for (int i = 0; i < 5; i++) {
             if (vetor[i] == n) {
                 cont++;
             }
         }
         System.out.println("O número " + n + " aparece " + cont + " vezes no vetor.");

        leitor.close();
    }
}