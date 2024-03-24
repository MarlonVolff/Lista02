import java.util.Scanner;

public class Exercicio08{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Informe o primeiro vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Informe o segundo vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = leitor.nextInt();
        }

        int[] vetorC = new int[10];
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < 5; i++) {
            vetorC[i + 5] = vetorB[i];
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
        leitor.close();
    }
}
