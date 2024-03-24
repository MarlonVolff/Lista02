import java.util.Scanner;

public class Exercicio02{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] sq = new int[5];
        for (int i = 0; i < sq.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            sq[i] = leitor.nextInt();
        }
        for (int i = 0; i < sq.length; i++) {
            if (seq[i] > 0) {
                System.out.println("Número " + sq[i] + " na posição " + i + " é positivo.");
            } else if (sequencia[i] < 0) {
                System.out.println("Número " + sq[i] + " na posição " + i + " é negativo.");
            } else {
                System.out.println("Número " + sq[i] + " na posicão " + i + " é zero.");
            }
        }
        leitor.close();
    }
}
