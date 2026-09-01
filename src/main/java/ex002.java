import java.util.Scanner;

public class ex002 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua nota final");
        int nota = input.nextInt();

        System.out.println((nota < 7 )? "Você reprovou" : "Você passou");

    }
}
