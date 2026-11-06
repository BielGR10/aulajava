package escritaArquivos;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;




public class contextualizacao {

    static void main(String[] args)throws IOException{

        try{

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

                if (sistema.contains("Linux")){

                    criticidade = "Alta";

                }else{

                    criticidade = "Baixa";

                }

                escritor.write(
                        host + ","+
                            ip     + ','+
                            sistema + ','+
                            criticidade
                );

                escritor.newLine();

            }

            leitor.close();
            escritor.close();

            System.out.println("Relatório gerado com Sucesso!");


        } catch (IOException e) {

            System.out.println("Erro: "+e.getMessage());

        }


    }


}
