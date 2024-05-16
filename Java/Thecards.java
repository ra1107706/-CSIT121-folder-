package com.boostmytool;

import java.util.Random;
public class Thecards {

    private int nominalVaule;

    private String suits;

    public int needNominalVaule() {
        return nominalVaule;
    }

    public void placeNominalVaule(int nominalVaule) {
        if (nominalVaule > 0 && nominalVaule <= 13) {
            this.nominalVaule = nominalVaule;
        }

    }

    public String needSuits() {
        return suits;
    }

    public void placeSuits(String suits) {
        if ("clubs".equalsIgnoreCase(suits) || "diamonds".equalsIgnoreCase(suits) || "hearts".equalsIgnoreCase(suits)
                || "spades".equalsIgnoreCase(suits)) {
            this.suits = suits;
        }

    }

    public Thecards(int nominalVaule, String suits) {
        super();
        placeNominalVaule(nominalVaule);
        placeSuits(suits);
    }

    public Thecards() {
    }

    public void offer() {
        Random choice = new Random();
        this.nominalVaule = choice.nextInt(13) + 1;
        int arbitraryChoice = choice.nextInt(4);
        switch (arbitraryChoice) {
            case 0:
                this.suits = "Clubs";
                break;
            case 1:
                this.suits = "Diamonds";
                break;
            case 2:
                this.suits = "Hearts";
                break;
            case 3:
                this.suits = "Spades";
                break;
        }
    }

    public String toString() {
        String nominal = "";
        switch (nominalVaule) {
            case 1:
                nominal = "Ace";
                break;
            case 2:
                nominal = "Two";
                break;
            case 3:
                nominal = "Three";
                break;
            case 4:
                nominal = "Four";
                break;
            case 5:
                nominal = "Five";
                break;
            case 6:
                nominal = "Six";
                break;
            case 7:
                nominal = "Seven";
                break;
            case 8:
                nominal = "Eight";
                break;
            case 9:
                nominal = "Nine";
                break;
            case 10:
                nominal = "Ten";
                break;
            case 11:
                nominal = "Soldier";
                break;
            case 12:
                nominal = "Queen";
                break;
            case 13:
                nominal = "King";
                break;
        }
        return nominal + " of " + this.suits;
    }
}

