package casino;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
/*
Symulator kasyna
*/
public class Casino {

    private static Casino inst;
    private double casinoAccountStatus;

    private Casino() {
        casinoAccountStatus = 1000000;
    }

    private Casino(double casinoAccountStatus) {
        this.casinoAccountStatus = casinoAccountStatus;
    }

    public static synchronized Casino getInstance() {
        if (inst == null) {
            inst = new Casino();
        }
        return inst;
    }

    public static synchronized Casino getInstance(double casinoAccountStatus) {
        if (inst == null) {
            inst = new Casino(casinoAccountStatus);
        }
        return inst;
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

    public ArrayList<Integer> makeCards(int numberOfDeckOfCards) {
        ArrayList<Integer> list = new ArrayList();
        int numbersOnCards = 2;
        int symbolsOnCards = 0;
        int multipler = 1;
        while (multipler <= 4 * numberOfDeckOfCards) {
            while (numbersOnCards % 11 != 0) {
                list.add(numbersOnCards);
                numbersOnCards++;
            }
            numbersOnCards = 2;

            while (symbolsOnCards < 3) {
                list.add(10);
                symbolsOnCards++;
            }
            symbolsOnCards = 0;
            list.add(11);
            multipler++;
        }

        return list;
    }

    public int drawingACard(int deckOfCards) {
        Random generator = new Random();
        return (generator.nextInt(deckOfCards));
    }

    public void blackjackGame(int bet, int numberOfDeckOfCards) {
        ArrayList<Integer> deckOfCards = makeCards(numberOfDeckOfCards);
        int playerScore, computerScore, card, cardNumber;
        int again = 0;
        while (again == 0) {
            playerScore = 0;
            computerScore = 0;
            cardNumber = deckOfCards.get(drawingACard(deckOfCards.size()));
            deckOfCards.remove(cardNumber);
            card = cardNumber;
            playerScore += card;
            //System.out.println();
            again = JOptionPane.showConfirmDialog(null, "Your score is : " + playerScore + " your card is : " + card + " do you take another one?", "Player", JOptionPane.YES_NO_OPTION);
            while (again == 0 && playerScore <= 21) {
                cardNumber = deckOfCards.get(drawingACard(deckOfCards.size()));
                deckOfCards.remove(cardNumber);
                card = cardNumber;
                playerScore += card;
                if (playerScore > 21) {
                    again = 1;
                    JOptionPane.showMessageDialog(null, "Your score is : " + playerScore + " you step over 21.", "Player", JOptionPane.WARNING_MESSAGE);
                } else {
                    again = JOptionPane.showConfirmDialog(null, "Your score is : " + playerScore + " your card is : " + card + " do you take another one?", "Player", JOptionPane.YES_NO_OPTION);
                }
            }

            while (computerScore <= playerScore && computerScore < 21 && computerScore != 20 && playerScore <= 21) {
                cardNumber = deckOfCards.get(drawingACard(deckOfCards.size()));
                deckOfCards.remove(cardNumber);
                computerScore += cardNumber;
                JOptionPane.showMessageDialog(null, "Computer's score is : " + computerScore, "Computer", JOptionPane.WARNING_MESSAGE);
            }

            if (computerScore > 21) {
                again = JOptionPane.showConfirmDialog(null, "You WIN, do you want play again ?", "Information", JOptionPane.YES_NO_OPTION);
                removeCasinoAccountStatus(bet * 1.5);

            } else if (playerScore == computerScore) {
                again = JOptionPane.showConfirmDialog(null, "You DRAW, do you want play again ?", "Information", JOptionPane.YES_NO_OPTION);

            } else if ((computerScore > playerScore && computerScore <= 21) || playerScore > 21) {
                again = JOptionPane.showConfirmDialog(null, "You LOOSE, do you want play again ?", "Information", JOptionPane.YES_NO_OPTION);
                addCasinoAccountStatus(bet * 1.5);
            }
        }

    }

    public ArrayList<String> makeSymbols() {
        ArrayList<String> list = new ArrayList();
        char sing = '!';
        for (int i = 0; i < 30; i++) {
            if (i % 10 == 0) {
                sing = '!';
            }
            list.add(Character.toString(sing));
            sing += 1;
        }
        return list;
    }

    public int choosingSymbol(int numberOfSymbols) {
        Random generator = new Random();
        return generator.nextInt(numberOfSymbols);
    }

    public void slotMachineGame(double bet) {
        ArrayList<String> symbols = makeSymbols();
        int again = 0;
        while (again == 0) {
            String symbolOne = symbols.get(choosingSymbol(symbols.size()));
            String symbolTwo = symbols.get(choosingSymbol(symbols.size()));
            String symbolThree = symbols.get(choosingSymbol(symbols.size()));

            JOptionPane.showMessageDialog(null, "Your symbols:     " + symbolOne + " | " + symbolTwo + " | " + symbolThree, "Slot machine game", JOptionPane.WARNING_MESSAGE);

            if (symbolOne.equals(symbolTwo) && symbolTwo.equals(symbolThree)) {
                again = JOptionPane.showConfirmDialog(null, "You WIN: " + (getCasinoAccountStatus() / 2) + "$, do you want play again ?", "Information", JOptionPane.YES_NO_OPTION);
                removeCasinoAccountStatus((getCasinoAccountStatus() / 2));
            } else {
                again = JOptionPane.showConfirmDialog(null, "You Loose: " + bet + "$, do you want play again ?", "Information", JOptionPane.YES_NO_OPTION);
                addCasinoAccountStatus(bet);
            }
        }
    }

    public static int menu(Casino casino) {
        String[] options = new String[]{"Blackjack", "Slot machine", "Casino account status", "Exit"};
        int response = 0;
        while (response != 3 && response != -1) {
            response = JOptionPane.showOptionDialog(null, "Hello in casino symulator, choose your option.", "Casino symulator v1 ", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (response == 0) {
                if (casino.getCasinoAccountStatus() >= 10000) {
                    Integer[] choices = {1, 2, 3, 4, 5, 6, 7, 8};
                    String numberOfDeckOfCards = String.valueOf(JOptionPane.showInputDialog(null, "Choose how many deck of cards you want", "Blackjack", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]));
                    if (!numberOfDeckOfCards.matches("[0-9]")) {
                        return 0;
                    }
                    String bet = JOptionPane.showInputDialog(null, "Enter your bet here, you can bet more then: " + casino.getCasinoAccountStatus(), "1000");
                    if (bet == null) {
                        return 0;
                    }
                    while (!bet.matches("[0-9]+") || Double.parseDouble(bet) >= casino.getCasinoAccountStatus()) {
                        if (!bet.matches("[0-9]+")) {
                            bet = JOptionPane.showInputDialog("You can't bet that then casino .\nEnter your bet here, you can bet more then: " + casino.getCasinoAccountStatus());
                            if (bet == null) {
                                return 0;
                            }
                        } else {
                            bet = JOptionPane.showInputDialog("You can't bet more then casino recourses.\nEnter your bet here, you can bet more then: " + casino.getCasinoAccountStatus());
                            if (bet == null) {
                                return 0;
                            }
                        }
                    }
                    casino.blackjackGame(Integer.parseInt(bet), Integer.parseInt(numberOfDeckOfCards));
                } else {
                    JOptionPane.showMessageDialog(null, "Casino don't have cash, please restart symulator.");

                }
            }

            if (response == 1) {
                if (casino.getCasinoAccountStatus() >= 10000) {
                    String bet = JOptionPane.showInputDialog(null, "Enter your bet here, you can't bet more than: " + casino.getCasinoAccountStatus(), "10");
                    if (bet == null) {
                        return 0;
                    }

                    while (!bet.matches("[0-9]+") || Double.parseDouble(bet) >= casino.getCasinoAccountStatus()) {
                        if (!bet.matches("[0-9]+")) {
                            bet = JOptionPane.showInputDialog("You can't bet that then casino .\nEnter your bet here, you can bet more then: " + casino.getCasinoAccountStatus());
                            if (bet == null) {
                                return 0;
                            }
                        } else {
                            bet = JOptionPane.showInputDialog("You can't bet more then casino recourses.\nEnter your bet here, you can bet more then: " + casino.getCasinoAccountStatus());
                            if (bet == null) {
                                return 0;
                            }
                        }
                    }

                    casino.slotMachineGame(Double.parseDouble(bet));
                } else {
                    JOptionPane.showMessageDialog(null, "Casino don't have cash, restart symulator please.");

                }
            }

            if (response == 2) {
                JOptionPane.showMessageDialog(null, "Casino account :"+casino.getCasinoAccountStatus() +"$");
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Casino casino = new Casino();
        int rreturn = menu(casino);
        while (rreturn == 0) {
            rreturn = menu(casino);
        }
        JOptionPane.showMessageDialog(null, "Casino symulator v1 by Mateusz Suchorab");

        // casino.blackjackGame(1000, 1);
        //casino.slotMachineGame(100);
        //System.out.println(casino.getCasinoAccountStatus());
        //
    }

}
