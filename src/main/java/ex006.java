import java.util.Scanner;

public class ex006 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");

        float salarioFuncionario = input.nextFloat();

        if(salarioFuncionario <= 4000){
            System.out.println("Você tem direito ao vale-refeição!");
        }else {
            System.out.println("Você não tem direito ao vale-refeição.");
        }


    }
}
