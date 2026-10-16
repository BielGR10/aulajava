package funcoes;
import java.util.Scanner;

public class ex003 {

    public static void dobrar(){
        Scanner input = new Scanner(System.in);

        int num1 = 0;

        System.out.println("Digite o número: ");
        num1 = input.nextInt();

        int dobro = num1*2;

        System.out.println("O dobro do seu número é: "+dobro);

    }

    public static void main() {
        dobrar();
    }
}


