package gui;

import java.util.ArrayList;
import java.util.Random;

public class Casino {

    private double casinoAccountStatus;
    private int numberOfDeckOfCards;
    private double betNumber;
    private ArrayList<Integer> deckOfCards;
    private ArrayList<String> symbolsList;

    Casino() {
        casinoAccountStatus = 1000000;
    }

    Casino(double casinoAccountStatus) {
        this.casinoAccountStatus = casinoAccountStatus;
    }

    public void setCasinoAccountStatus(int casinoAccountStatus) {
        this.casinoAccountStatus = casinoAccountStatus;
    }

    public double getCasinoAccountStatus() {
        return casinoAccountStatus;
    }

    public void addCasinoAccountStatus(double money) {
        this.casinoAccountStatus += money;
    }

    public void removeCasinoAccountStatus(double money) {
        this.casinoAccountStatus -= money;
    }

    public void setNumberOfDecks(int numberOfDeckOfCards) {
        this.numberOfDeckOfCards = numberOfDeckOfCards;
    }

    public void setBet(double betNumber) {
        this.betNumber = betNumber;
    }

    public int getNumberOfDecks() {
        return numberOfDeckOfCards;
    }

    public double getBet() {

        return betNumber;
    }

    public ArrayList<Integer> getDeckOfCards() {
        return deckOfCards;
    }

    public void makeCards() {
        deckOfCards = new ArrayList();
        int numbersOnCards = 2;
        int symbolsOnCards = 0;
        int multipler = 1;
        while (multipler <= 4 * numberOfDeckOfCards) {
            while (numbersOnCards % 11 != 0) {
                deckOfCards.add(numbersOnCards);
                numbersOnCards++;
            }
            numbersOnCards = 2;

            while (symbolsOnCards < 3) {
                deckOfCards.add(10);
                symbolsOnCards++;
            }
            symbolsOnCards = 0;
            deckOfCards.add(11);
            multipler++;
        }

    }

    public int drawingACard() {
        Random generator = new Random();
        int number = generator.nextInt(deckOfCards.size());
        int card = deckOfCards.get(number);
        deckOfCards.remove(number);
        return (card);
    }

    public void makeSymbols() {
        symbolsList = new ArrayList<String>();
        char sing = '!';
        for (int i = 0; i < 30; i++) {
            if (i % 10 == 0) {
                sing = '!';
            }
            symbolsList.add(Character.toString(sing));
            sing += 1;
        }

    }

    public String choosingSymbol() {
        Random generator = new Random();
        return symbolsList.get(generator.nextInt(symbolsList.size()));
    }

}
