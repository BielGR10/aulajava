package funcoes;
import java.util.Scanner;

public class ex004 {

    public static void converterCelsiusParaFahrenheit(){
        Scanner input = new Scanner(System.in);

        double celsius = 0, fahrenheit = 0;

        System.out.println("Digite a temperatura em graus celsius (°C):");
        celsius = input.nextInt();



        fahrenheit = (celsius*1.8+32);

        System.out.println("TEMPERATURA:");
        System.out.println(celsius+"ºC (Celsius)");
        System.out.println(fahrenheit+"ºF (Fahrenheit)");


    }

    public static void main() {

        converterCelsiusParaFahrenheit();

    }
}


