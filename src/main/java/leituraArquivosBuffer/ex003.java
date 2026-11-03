package leituraArquivosBuffer;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class ex003 {
    static void main() {
        String arquivo = "C://Users//52362982882//Documents//ativos.csv/";

        int contador = 0;

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha;

            while ((linha = leitor.readLine()) != null) {

                contador++;

                String[] dado = linha.split(",");

                String host = dado[0];
                String ip = dado[1];
                String sistema = dado[2];

                if(sistema.contains("Linux")) {

                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
            }leitor.close();
        }catch (IOException e){

            System.out.println("Windows não permitiu a leitura");

        }
        System.out.println("\nFORAM ENCONTRADOS: "+contador+" REGISTROS!!");

    }
}
