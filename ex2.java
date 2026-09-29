
import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String jogos;
        int wins = 0;
        int grupo;

        for(int i = 0; i < 6; i++){
            System.out.println("Infome o resultado do " +(i+1)+ "° jogo: ");
            System.out.println("V para Vitórias");
            System.out.println("D para Derrotas");
            System.out.println("");
            jogos = ler.nextLine();

            if(jogos.equals("V")){
                wins++;
            }
        }

        if (wins == 5 || wins == 6) {
            grupo = 1;
        } else if (wins == 3 || wins == 4) {
            grupo = 2;
        } else if (wins == 1 || wins == 2) {
            grupo = 3;
        } else {
            grupo = -1; 
        }
        
        System.out.println("");
        System.out.println("Você faz parte do grupo " +grupo);

    }
}
