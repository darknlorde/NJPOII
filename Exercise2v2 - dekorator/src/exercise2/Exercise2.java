package exercise2;

import java.io.IOException;
import java.util.Scanner;

/*
Program symulujący wyścigi drogowe, w wyścigach może brać udział kierowca, rowerzysta oraz pieszy.
Każdy z nich jest użytkownikiem drogi.
Wyścig kończy się wypadkiem w monecie dotarcia do "Ściany"
W symulacji widać że pieszy może wskoczy podczas drogi do auta lub na rower.
Wyścig jest generowany losowo. 
Po włączeniu programu należy wcisnąć "enter" żeby symulacja rozpoczęła kolejną pętle.

 */
public class Exercise2 {

    public static void main(String[] args) throws IOException {

        Scanner wait = new Scanner(System.in);
        RoadUser table[] = new RoadUser[3];
        int roadSize = 10;
        char roadTable[][] = new char[roadSize][roadSize];
        boolean flag = true;
        table[0] = new Pedestrian();
        table[1] = new Cyclist();
        table[2] = new Driver();
        while (flag) {

            for (int i = 0; i < table.length; i++) {
                table[i].setPositionX((table[i].getPositionX() + table[i].moveX()) % roadSize);
                table[i].setPositionY((table[i].getPositionY() + table[i].moveY()) % roadSize);
                if (roadTable[table[i].getPositionX()][table[i].getPositionY()] == 0) {
                    roadTable[table[i].getPositionX()][table[i].getPositionY()] = table[i].getSign();
                } else {
                    flag = false;
                }
                //System.out.println(table[i].getPositionX() + " : " + table[i].getPositionY());
                //System.out.println(roadTable[table[i].getPositionX()][table[i].getPositionY()]);
            }
            System.out.println("----------");
            for (int i = 0; i < roadSize; i++) {
                System.out.print("|");
                for (int j = 0; j < roadSize; j++) {
                    System.out.print(roadTable[i][j] + "");
                }
                System.out.print("|\n");
            }
            System.out.println("----------");
            wait.nextLine();
            for (int i = 0; i < roadSize; i++) {
                for (int j = 0; j < roadSize; j++) {
                    roadTable[i][j] = 0;
                }
            }
            System.out.println("CRASH!!!");

        }
    }
}
