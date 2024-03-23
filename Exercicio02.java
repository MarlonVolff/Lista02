import java.util.Scanner;

public class Exercicio02{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] sequencia = new int[5];

        for (int i = 0; i < sequencia.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            sequencia[i] = leitor.nextInt();
        }

        for (int i = 0; i < sequencia.length; i++) {
            if (sequencia[i] > 0) {
                System.out.println("Numero " + sequencia[i] + " na posição " + i + " é positivo.");
            } else if (sequencia[i] < 0) {
                System.out.println("Numero " + sequencia[i] + " na posição " + i + " é negativo.");
            } else {
                System.out.println("Numero " + sequencia[i] + " na posicão " + i + " é zero.");
            }
        }


        leitor.close();
    }
}