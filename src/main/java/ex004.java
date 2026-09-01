import java.util.Scanner;

public class ex004 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua nota final ");
        int nota = input.nextInt();

        if (nota == 10){
            System.out.println("Parabéns! Você foi excelente, nota perfeita!");
        }else if (nota <= 9 && nota >= 7){
            System.out.println("Parabéns! você foi bem! Continue assim!");
        }else if (nota >= 5 && nota <= 6){
            System.out.println("Seu desempenho foi regular. R passa.");
            }else {
            System.out.println("Nota insuficiente, nota vermelha. I pra você.");
        }

    }
}

