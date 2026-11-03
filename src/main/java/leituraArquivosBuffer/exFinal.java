package leituraArquivosBuffer;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class exFinal {
    static void main() {
        String arquivo = "C://Users//52362982882//Documents//ativos.csv/";

        int contador = 0, linux = 0, windows = 0, firewall = 0, switchc = 0, router = 0, impressora = 0, camera = 0, iot = 0, storage = 0;



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

                    linux++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Windows")) {

                    windows++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Firewall")) {

                    firewall++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Switch")) {

                    switchc++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Router")) {

                    router++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Impressora")) {

                    impressora++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Camera")) {

                    camera++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("IoT")) {

                    iot++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
                if(sistema.contains("Storage")) {

                    storage++;
                    System.out.println("Host: " + host);
                    System.out.println("Ip: " + ip);
                    System.out.println("Sistema: " + sistema);
                    System.out.println("============");

                }
            }leitor.close();
        }catch (IOException e){

            System.out.println("Windows não permitiu a leitura");

        }
        System.out.println("\nFORAM ENCONTRADOS: "+(contador-1)+" REGISTROS!! SENDO ELES: \n");
        System.out.println(linux+" registros de LINUX");
        System.out.println(windows+" registros de WINDOWS");
        System.out.println(firewall+" registros de FIREWALL");
        System.out.println(switchc+" registros de SWITCH");
        System.out.println(router+" registros de ROUTER");
        System.out.println(impressora+" registros de IMPRESSORA");
        System.out.println(camera+" registros de CAMERA");
        System.out.println(iot+" registros de IoT");
        System.out.println(storage+" registros de STORAGE");
    }
}
