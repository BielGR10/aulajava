import java.util.Scanner;

public class ex010 {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");

        float salario = input.nextFloat();

        System.out.print("Digite o valor do empréstimo desejado: ");

        float emprestimo = input.nextFloat();

       float porcentagem = (emprestimo / salario) * 100f;

       if (porcentagem <= 30){
           System.out.println("Seu empréstimo de R$"+emprestimo+" foi aprovado!");
           System.out.println(porcentagem);
       }else{
           System.out.println("Seu empréstimo de R$"+emprestimo+" foi recusado.");
           System.out.println(porcentagem);
       }



    }
}
