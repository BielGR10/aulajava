import java.util.Scanner;

public class ex011 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor que você investiu: ");

        float valorInvestido = input.nextFloat();

        if (valorInvestido <= 10000){
            System.out.println("Você está na categoria BRONZE!");
        }else if(valorInvestido > 10000 && valorInvestido <= 50000){
            System.out.println("Você está na categoria PRATA!");
        }else if(valorInvestido > 50000 && valorInvestido <= 100000){
            System.out.println("Você está na categoria OURO!");
        }else{
            System.out.println("Você está na categoria PLATINUM!");
        }
    }
}
