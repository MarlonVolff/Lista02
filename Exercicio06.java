import java.util.Scanner;

public class Exercicio06{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        double[] n = new double[5];
        int[] p = new int[5];
        double somaP = 0, somaNeP = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            n[i] = leitor.nextDouble();
            
            System.out.print("Digite o peso da nota " + (i + 1) + ": ");
            p[i] = leitor.nextInt();
            somaNeP += n[i] * p[i];
            somaP += p[i];
        }

        double mediaP = somaNeP/ somaP;
        System.out.printf("Média ponderada: %.2f\n", mediaP);

        
        leitor.close();
    }
}
