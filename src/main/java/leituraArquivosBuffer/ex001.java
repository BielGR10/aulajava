package leituraArquivosBuffer;

import java.util.Arrays;



import java.util.Scanner;
import java.io.*;


public class ex001 {
    static void main() {
        String arquivo = "C://Users//52362982882//Documents//ativos.csv/";


        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dado = linha.split(",");

                String host = dado[0];

                System.out.println("Host: "+host);
                System.out.println("============");

            }leitor.close();
        }catch (IOException e){

            System.out.println("Windows não permitiu a leitura");

        }

    }
}
