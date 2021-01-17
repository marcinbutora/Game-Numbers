package doctype;

import java.util.Random;
import java.util.Scanner;


public class GameNumbers {

    public static void main(String[] args) {

        int drawnNumber;
        int myAnswer;
        int answerCount = 0;

        Random draw = new Random();
        drawnNumber = draw.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź swoje imię:");
        String myName = scanner.nextLine();

        System.out.println("Twoja płeć?");
        String sex = scanner.nextLine();

        System.out.println("A teraz zgadnij liczbę z przedziału od 1 do 10");
        do {
            answerCount++;
            System.out.println("Podaj liczbę:");
            myAnswer = scanner.nextInt();
            if (myAnswer > drawnNumber) {
                System.out.println("Niestety, moja liczba jest mniejsza!");
            } else if (myAnswer < drawnNumber) {
                System.out.println("Niestety, moja liczba jest większa!");
            }
        } while (myAnswer != drawnNumber);
        System.out.print("Brawo " + myName + "! Liczba " + myAnswer + " jest poprawna!");
        if (sex.equals("k")) {
            System.out.print(" Zgadłaś");
        } else if (sex.equals("m")) {
            System.out.print(" Zgadłeś");
        }
        System.out.print(" za " + answerCount + " razem!");
    }
}
