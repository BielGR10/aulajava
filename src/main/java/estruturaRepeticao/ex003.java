package estruturaRepeticao;
import java.util.Scanner;

public class ex003 {
    static void main(){
        Scanner input = new Scanner(System.in);

        int quantidadeVenda = 1;
        float valorVenda = 0;
        float valorTotal = 0;

        while(quantidadeVenda <= 5){

            System.out.print("Qual valor do produto comprado?\nR$");
            valorVenda = input.nextFloat();
            quantidadeVenda++;
            valorTotal = valorTotal + valorVenda;

        }
        System.out.println("Valor total: R$"+valorTotal);


    }

}
