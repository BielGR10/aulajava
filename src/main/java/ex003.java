import java.util.Scanner;


public class ex003 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("O "+num1+" é o maior número.");
        }else if (num1 == num2){
            System.out.println("Ambos os números tem o mesmo valor.");
        }else{
            System.out.println("O "+num2+" é o maior número.");
        }

    }
}
