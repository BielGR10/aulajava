import java.util.Scanner;

public class ex009 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu cargo na empresa: ");

        String cargo = input.next();

        if (cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("liderança")){
            System.out.println("Você pode participar do programa de idiomas!");
        }else{
            System.out.println("Você não pode participar do programa.");
        }



    }
}
