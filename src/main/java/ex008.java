import java.util.Scanner;

public class ex008 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("Você utiliza do seu veículo próprio para trabalhar? [S/N]");

        char resposta = input.next().charAt(0);

        if (resposta == 'S' || resposta == 's'){
            System.out.println("Você pode solicitar o auxílio combustível!");
        }else if (resposta == 'N' || resposta == 'n'){
            System.out.println("Você não pode solicitar o auxílio combustível.");
        }else{
            System.out.println("Resposta invalida. Tente Novamente. (Só é possível responder com S/N");
        }



    }
}
