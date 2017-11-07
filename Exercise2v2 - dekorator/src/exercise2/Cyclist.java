package exercise2;

import java.util.Random;

public class Cyclist extends RoadUser {

    private Random rand = new Random();

    public Cyclist() {
        super('&', 2, 0, 0);

    }

    public Cyclist(int positionX, int positionY) {
        super('&', 2, positionX, positionY);

    }

    public Cyclist(char sign, int speed, int positionX, int positionY) {
        super(sign, speed, positionX, positionY);
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
    public int getPositionX() {
        return positionX;
    }

    @Override
    public int getPositionY() {
        return positionY;
    }

    @Override
    public int moveX() {
        return (rand.nextInt(3) + 1) * getSpeed();

    }

    @Override
    public int moveY() {
        return (rand.nextInt(3) + 1) * getSpeed();

    }

    @Override
    void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    @Override
    void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
