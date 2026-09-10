import java.util.Scanner;

public class ex014{
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu saldo médio mensal: R$");
        float saldo = input.nextFloat();

        if(saldo > 5000){
            System.out.println("Você tem direito a isenção de tarifa bancária!");
        }else{
            System.out.println("A sua tarifa bancária será mantida.");
        }


    }
}
