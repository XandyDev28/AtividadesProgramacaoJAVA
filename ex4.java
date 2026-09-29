import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número N do jogo duplo-N: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Entrada inválida: N precisa ser 0 ou um número positivo.");
        } else {
            int qtdPecas = ((numero + 1) * (numero + 2)) / 2;
            System.out.println("O duplo-" + numero + " tem um total de " + qtdPecas + " peças.");
        }
    }
}