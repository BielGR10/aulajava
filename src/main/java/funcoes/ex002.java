package funcoes;
import java.util.Scanner;

public class ex002 {

    public static void somar(){
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, soma = 0;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("O resultado da soma é de: "+soma);

    }

    public static void main() {
        somar();
    }
}


