import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de S, A e B");
        int S = ler.nextInt();
        int A = ler.nextInt();
        int B = ler.nextInt();

        int result = 0;

        for (int n = A; n <= B; n++) {
            int x = n;
            int soma = 0;
        while (x > 0) {
                soma += x % 10;
                x = x / 10;
        }
            if (soma == S) {
                result++;
            }
        }

        System.out.println("Existem " + result + " números no intervalo de " +A+ " a " +B+" onde a soma é = " +S);
    }
}