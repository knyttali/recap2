package com.example;

public class footballCalculator {
    public int calculatePoints(int wins, int draws, int losses) {
        return 3*wins + draws;
    }
    public void run(){
        System.out.println("antal wins: ");
        int wins = Integer.parseInt(System.console().readLine());
        System.out.println("antal draws: ");
        int draws = Integer.parseInt(System.console().readLine());
        System.out.println("antal losses: ");
        int losses = Integer.parseInt(System.console().readLine());

        System.out.println("calculatePoints(" + wins + ", " + draws + ", " + losses + ")  ➞  " + calculatePoints(wins, draws, losses) );
    }
}
/**
 * Skapa en klass som heter FootballCalculator. I den, skriv en metod som heter
 * calculatePoints(). Den ska ta tre heltalsparametrar - wins, draws, losses Den
 * ska returnera hur många poäng laget har totalt, givet att
 * 
 * varje win = 3 poäng varje draw = 1 poäng varje loss = 0 poäng
 * 
 * Skriv in metod run() i klassen FootballCalculator som matar in wins, draws,
 * losses och kör calculatePoints och skriver ut resultatet
 * 
 * 
 * 
 * Klistra in klassen FootballCalculator.i svaret!
 * 
 * 
 * calculatePoints(3, 4, 2) ➞ 13
 * 
 * calculatePoints(5, 0, 2) ➞ 15
 * 
 * calculatePoints(0, 0, 1) ➞ 0
 * 
 */