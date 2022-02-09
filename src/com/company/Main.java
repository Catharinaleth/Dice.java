//Terning med seks sider - øvelse den 20/okt.
package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] minListe = {0, 0, 0, 0, 0, 0};

        for(int i = 0; i < 6000; i++) { //for-loop som tæller fra 0-6000
            int a = terningekast();

            if (a == 1) { //hvis terningen slår 1 skal minListe + med 1 og dermed tæller den op, hvor mange 1 der
                minListe[0]++;
            } else if (a == 2) {
                minListe[1]++;
            } else if (a == 3) {
                minListe[2]++;
            } else if (a == 4) {
                minListe[3]++;
            } else if (a == 5) {
                minListe[4]++;
            } else {
                minListe[5]++;
            }
        }

            System.out.println(minListe[0]);
            System.out.println(minListe[1]);
            System.out.println(minListe[2]);
            System.out.println(minListe[3]);
            System.out.println(minListe[4]);
            System.out.println(minListe[5]);



    }
    public static int terningekast(){
        Random r = new Random();
        int random = r.nextInt(6)+1;
        return random;
    }
}
