package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = input.nextInt();

        System.out.println((idade >= 18 )? "Você é de maior" : "Você é de menor");

    }
}
