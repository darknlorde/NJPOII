package exercise2;

import java.util.Random;

public class Driver extends RoadUser {

    private Random rand = new Random();

    public Driver() {
        super('#', 3, "");

    }

    public Driver(String position) {
        super('#', 3,position);

    }

    public Driver(char sign, int speed, String position) {
        super(sign, speed, position);
    }

    @Override
    public char getSign() {
        return sign;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public int move() {
        return (rand.nextInt(3) + 1) * getSpeed();
    }

    @Override
    public void result() {

        for (int i = 0; i < move(); i++) {
            position += sign;
        }
    }
}
