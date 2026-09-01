import java.util.Scanner;

public class ex005 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de um dia da semana (1 a 7): ");
        int diaSemana = input.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Hoje é domingo!");
                break;

            case 2:
                System.out.println("Hoje é segunda-feira!");
                break;

            case 3:
                System.out.println("Hoje é terça-feira!");
                break;

            case 4:
                System.out.println("Hoje é quarta-feira!");
                break;

            case 5:
                System.out.println("Hoje é quinta-feira!");
                break;

            case 6:
                System.out.println("Hoje é sexta-feira!");
                break;

            case 7:
                System.out.println("Hoje é sabado!");
                break;

            default:
                System.out.println("Erro, digite apenas de 1 a 7.");
        }

    }
}

