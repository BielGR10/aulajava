package estruturaDecisao;

import java.util.Scanner;

public class ex012 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("BEM VINDO AO SISTEMA DE VERIFICAMENTO PARA ELEGIBILIDADE DO CARTÃO PREMIUM!");

        System.out.print("\nQual sua renda mensal? \nR$");
        float rendaMensal = input.nextFloat();

        System.out.println("Qual seu score no banco?");
        int score = input.nextInt();

        if(rendaMensal > 8000 && score > 700){
            System.out.println("Você é elegível a fazer o cartão Premium!");
        }else{
            System.out.println("Você não é elegível ao cartão Premium.");
        }



    }
}
