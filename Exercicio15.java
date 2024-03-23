import java.util.Scanner;

public class Exercicio15{
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
          int[] vetor = new int[5];

          System.out.print("Digite o primeiro numero: ");
          vetor[0] = leitor.nextInt();
  
          for (int i = 1; i < 5; i++) {
              System.out.print("Digite o proximo numero maior que " + vetor[i - 1] + ": ");
              int num = scanner.nextInt();
              if (num > vetor[i - 1]) {
                  vetor[i] = num;
              }
          }
          
          System.out.println("Vetor preenchido é:");
          for (int i = 0; i < 5; i++) {
              System.out.print(vetor[i] + " ");
          }
  

        leitor.close();
    }
}