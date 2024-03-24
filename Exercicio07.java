import java.util.Scanner;

public class Exercicio07{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        boolean iguais = true;

        System.out.println("Informe um vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = leitor.nextInt();
        }

        System.out.println("Informe o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }
        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
        leitor.close();
    }
}
