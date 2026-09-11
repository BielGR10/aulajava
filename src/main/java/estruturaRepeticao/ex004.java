package estruturaRepeticao;
import java.util.Scanner;

public class ex004 {
    static void main(){
        Scanner input = new Scanner(System.in);

        int quantidadePesquisa = 1;
        int notasPesquisa = 0;
        int totalPesquisa = 0;

        while(quantidadePesquisa <= 10){

            System.out.print("Qual seu nível de satisfação com nossos produtos? avaliação "+quantidadePesquisa+" (0/10)\n");
            notasPesquisa = input.nextInt();
            quantidadePesquisa++;
            totalPesquisa = totalPesquisa + notasPesquisa;

        }
        float mediaPesquisa = (float) totalPesquisa/quantidadePesquisa;
        String mediaArredondada = String.format("%.2f", mediaPesquisa);
        System.out.println("\nMédia das pesquisas:"+mediaArredondada);


    }

}
