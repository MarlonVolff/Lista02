import java.util.Scanner;

public class Exercicio10{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Inform os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        System.out.println("Vetor B:");
        for (int i = 0; i > 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        leitor.close();
    }
}