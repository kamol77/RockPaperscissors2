package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Klasa klasa = new Klasa();
        File file = new File("C:\\Users\\kamol\\IdeaProjects\\RockPaperscissors-main\\RPS\\src\\main/input.txt");
        int pkt = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();

//                String znaki = klasa.insert();
                char [] tabZnaki = klasa.switchToArray(data);
                char [] tabZnaki2 = klasa.switchToCorrect(tabZnaki);
                pkt += klasa.myPoints(tabZnaki2);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(pkt);



    }
}