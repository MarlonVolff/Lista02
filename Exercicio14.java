import java.util.Scanner;

public class Exercicio14{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Informe os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = leitor.nextInt();
        }

        int indMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indMaior]) {
                indMaior = i;
            }
        }

        int temp = vetor[indMaior];
        vetor[indMaior] = vetor[4];
        vetor[4] = temp;

        System.out.println("Vetor atualizado é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    
        leitor.close();
    }
}