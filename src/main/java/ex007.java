import java.util.Scanner;

public class ex007 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos meses o funcionário está na empresa: ");

        int mesesFuncionario = input.nextInt();

        if (mesesFuncionario > 3){
            System.out.println("Parabéns! Você pode adquirir o plano de saúde!" );
        }else{
            System.out.println("Você não pode adquirir o plano de saúde.");
        }
    }
}
