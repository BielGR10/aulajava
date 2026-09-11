package estruturaRepeticao;
import java.util.Scanner;

public class ex005 {
    static void main(){
        Scanner input = new Scanner(System.in);

        float valorVenda = 0;
        float valorTotal = 0;
        char resposta;

        do{
            System.out.print("\nQual o valor do produto comprado?\nR$");
            valorVenda = input.nextFloat();

            valorTotal = valorTotal + valorVenda;
            System.out.println("\nVocê deseja continuar comprando?");
            resposta = input.next().charAt(0);
        }while(resposta == 'S' || resposta == 's');

        System.out.println("Valor total da compra: R$"+valorTotal);


    }

}
