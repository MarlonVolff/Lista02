import java.util.Scanner;

public class Exercicio06{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[5];
        int[] pesos = new int[5];
        double somaP = 0, somaNeP = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            System.out.print("Digite o peso da nota " + (i + 1) + ": ");
            pesos[i] = leitor.nextInt();
            somaNeP += notas[i] * pesos[i];
            somaP += pesos[i];
        }

        double mediaPonderada = somaNeP/ somaP;
        System.out.printf("Média ponderada: %.2f\n", mediaPonderada);

        
        leitor.close();
    }
}