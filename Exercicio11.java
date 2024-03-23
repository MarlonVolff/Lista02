import java.util.Scanner;

public class Exercicio11{
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

        int produto = 0;
        for (int i = 0; i < 5; i++) {
            produto += vetorA[i] * vetorB[i];
        }

        System.out.println("Produto escalar: " + produto);


        leitor.close();
    }
}