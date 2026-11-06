package escritaArquivos;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;




public class ex002 {

    static void main(String[] args)throws IOException{

        try{

            int contadorlinux = 0, contadorwindows = 0, contadormac = 0;

            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/52362982882/Documents/ativos.csv"));

            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/52362982882/Documents/relatorio.csv"));

            String linha = leitor.readLine();

            escritor.write(linha+",criticidade");
            escritor.newLine();

            while ((linha = leitor.readLine()) != null){

                String[] dados = linha.split(",");

                String host = dados[0];
                String ip = dados[1];
                String sistema = dados[2];



                String criticidade = "";
                String status = "";



                if (sistema.contains("Linux")){

                    contadorlinux++;
                    criticidade = "Alta";
                    status = "Em monitoramento";

                }else if (sistema.contains("Windows")){
                    contadorwindows++;
                    criticidade = "Baixa";
                    status = "Online";

                }else{

                    criticidade = "Baixa";

                }



                escritor.write(
                        host + ","+
                                ip     + ','+
                                sistema + ','+
                                criticidade + ','+
                                status
                );

                escritor.newLine();

            }

            leitor.close();
            escritor.close();

            System.out.println("Relatório gerado com Sucesso!");
            System.out.println("Foram registrados:\nHosts Windows:"+contadorwindows+"\nHosts Linux:"+contadorlinux);

        } catch (IOException e) {

            System.out.println("Erro: "+e.getMessage());

        }


    }


}
