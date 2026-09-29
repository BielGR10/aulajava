package matrizesArrays;
import java.util.Scanner;

public class ex002 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        float[] temperatura = new float[10];
        int dia = 1, acimaTrinta = 0;

        for(int i=0; i < temperatura.length; i++){
            System.out.println("Digite a temperatura no dia " + dia + " em °C:");
            dia++;

            temperatura[i] = input.nextFloat();

            if(temperatura[i] > 30){
                acimaTrinta++;
            }
        }
        System.out.println("Houveram "+acimaTrinta+" dias com a temperatura acima de 30°C");
    }
}
