import java.util.Scanner;

public class Exercicio01 {
    public static void executar(){
        Scanner  leitor = new Scanner(System.in);

        double[] num = new double[5];
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            num[i] = leitor.nextDouble();
        }
        
        double soma = 0;
        for (double numero : num) {
            soma += numero;
        }
        double media = soma / 5;
        System.out.println("Valores menores que a media:");
        for (int numero : num) {
            if (numero < media) {
                System.out.println(numero);
            }
        }
        System.out.println("Valores iguais a media:");
        for (int numero : num) {
            if (numero == media) {
                System.out.println(numero);
            }
        }
        System.out.println("Valores superiores a media:");
        for (int numero : num) {
            if (numero > media) {
                System.out.println(numero);
            }
        }
        leitor.close();
    }
}
