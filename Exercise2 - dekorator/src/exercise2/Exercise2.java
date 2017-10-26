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
        RoadUser table[] = new RoadUser[5];
        table[0] = new Pedestrian();
        table[1] = new Cyclist();
        table[2] = new Driver();
        table[3] = new Pedestrian();
        table[4] = new Pedestrian();
        int maxLength = Integer.MIN_VALUE;
        int roadSize =30;
        int flag =0;
        while (maxLength < roadSize) {
            System.out.println();
            System.out.println();
            //System.out.println();
            for (int i = 0; i < table.length; i++) {
                
                table[i].result();
                maxLength=Math.max(maxLength, table[i].getPosition().length());
                System.out.print(table[i].getPosition());
                for (int j = table[i].getPosition().length();j<roadSize;j++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            if (flag ==2){
            table[3] =new Driver(table[3].getPosition());
            }
            if (flag ==3){
            table[4] =new Cyclist(table[4].getPosition());
            }
            wait.nextLine();
            flag++;

        }
        System.out.println("CRUSH!!!");
        
        
    }
}
