package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Klasa {


    public String insert(){
        Scanner scanner = new Scanner(System.in);
        String znaki = scanner.nextLine();
        return znaki;
    }

    public char[] switchToArray(String znaki){
        String[] parts = znaki.split(" ");
        char[] tab = new char[2];
        tab[0] = parts[0].charAt(0);
        tab[1] = parts[1].charAt(0);
        return tab;
    }


    public char[] switchToCorrect(char [] tab){
        char [] tab2 = new char[2];
        for (int i = 0; i < tab2.length; i++) {
            if (tab[i] == 'A' || tab[i] == 'X') tab2[i] = 'K';
            else if (tab[i] == 'B' || tab[i] == 'Y') tab2[i] = 'P';
            else if (tab[i] == 'C' || tab[i] == 'Z') tab2[i] = 'N';

        }
        return tab2;
    }

    public int myPoints(char [] tab){
        int pkt = 0;
        char my_choose = tab[1];
        char your_choose = tab[0];
        if (my_choose == 'K') pkt++;
        else if (my_choose == 'P') pkt+=2;
        else if (my_choose == 'N') pkt+=3;

        if (my_choose == your_choose) pkt+=3;
        else if (my_choose == 'K' && your_choose == 'N') {
            pkt+=6;
        }
        else if (my_choose == 'P' && your_choose == 'K') {
            pkt+=6;
        }
        else if (my_choose == 'N' && your_choose == 'P') {
            pkt+=6;
        }

        return pkt;
    }
}
