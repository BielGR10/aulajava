package matrizesArrays;
import java.util.Scanner;

public class ex001 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        int[] milho = new int[7];
        int semana = 1, total = 0, maior = 0;


        for (int i = 0; i < milho.length; i++){
            System.out.println("Qual foi a produção de milho na semana "+ semana +" em toneladas?");
            semana++;

            milho[i] = input.nextInt();

            if(milho[i] > maior){
                maior = milho[i];
            }

        }

        for (int i = 0; i < milho.length; i++){
            total += milho[i];

        }

        int media = total/7;

        System.out.println("\nProdução total: "+total);
        System.out.println("Média semanal de produção: "+media);
        System.out.println("Maior produção semanal: "+maior);
    }
}
