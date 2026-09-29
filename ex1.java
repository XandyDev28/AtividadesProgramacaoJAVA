import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

/*         Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila. */


        System.out.println("Informe a 1° idade: ");
        int nA = ler.nextInt();

        System.out.println("Informe a 2° idade: ");
        int nB = ler.nextInt();

        System.out.println("Informe a 3° idade: ");
        int nC = ler.nextInt();

        int maior = Math.max(nA, Math.max(nB, nC)); 
        int menor = Math.min(nA, Math.min(nB, nC));

        int idadeCamila = (nA + nB + nC) - (maior + menor);

        System.out.println("Idade de Camila é: " +idadeCamila+ " anos");

    }
}
