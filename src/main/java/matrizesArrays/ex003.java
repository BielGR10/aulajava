package matrizesArrays;
import java.util.Scanner;

public class ex003 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        int [] setores = new int[12];
        int numeracao = 1, maior = 0;

        for(int i = 0; i <= setores.length; i++){
            System.out.println("Qual foi o consumo de agua do setor " + numeracao +" de irrigação?(EM LITROS)");

            numeracao++;

            setores[i] = input.nextInt();

            if(setores[i] > maior){
                maior = setores[i];
            }

        }
        System.out.println("");

    }
}
