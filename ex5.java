
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[][] charrete = new double[2][3];

        for(int i = 0; i < 2; i++){
            System.out.println("Insira respectivamente da " +(i+1)+ "° charrete");
            System.out.println("N - o número da charrete");
            System.out.println("D - distancia ate a linha de chegada (m)");
            System.out.println("V - velocidade em km/h");
            for (int j = 0; j < 3; j++){
                charrete[i][j] = ler.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            charrete[i][2] = charrete[i][2] / 3.6;
        }

        double[] tempoChegada = new double[2];
        for(int i = 0; i < 2; i++){
            tempoChegada[i] =  charrete[i][1] / charrete[i][2];
        }

        if(tempoChegada[0] > tempoChegada[1]){
            System.out.println("A ganhadora é a Charrete de N° " +charrete[1][0]);
        } else {
            System.out.println("A ganhadora é a Charrete de N° " +charrete[0][0]);     
        }


    }
}
