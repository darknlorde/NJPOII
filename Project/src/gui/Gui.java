package gui;

import javax.swing.JOptionPane;

public class Gui {

    public static MainMenu mainMenu = new MainMenu();
    public static CalculatorWindow calculatorWindow = new CalculatorWindow();
    public static CheckYourPESEL pesel = new CheckYourPESEL();
    public static CasinoMenu casinoMenu = new CasinoMenu();
    public static RunningButton runningButton = new RunningButton();
    public static CasinoAccountStatus casinoAccountStatus = new CasinoAccountStatus();
    public static SlotMachine slotMachine = new SlotMachine();

    public static void main(String[] args) {

        mainMenu.setVisible(true);

    }

}
