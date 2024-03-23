import java.util.Scanner;

public class Exercicio03{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tam = leitor.nextInt();

        double[] vetor = new double[tam];

        System.out.println("Informe os números do vetor:");
            for (int i = 0; i < tam; i++) {
                System.out.print("Posiçao " + i + ": ");
            vetor[i] = leitor.nextDouble();
        }

        for (int i = 0; i < tam; i++) {
        if (vetor[i] > 0) {
            System.out.println("Numero na posiçao " + i + " é positivo.");
        } else if (vetor[i] < 0) {
            System.out.println("Numero na posição " + i + " é negativo.");
        } else {
            System.out.println("Numero na posição " + i + " é zero.");
        }
    }

        leitor.close();
    }
}