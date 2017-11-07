package exercise2;

abstract public class RoadUser {

    protected char sign = '=';
    protected int speed = 0;
    protected int positionX = 0;
    protected int positionY = 0;

    public RoadUser() {

    }

    public RoadUser(char sign, int speed, int positionX, int positionY) {
        this.sign = sign;
        this.speed = speed;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    abstract char getSign();

    abstract int getSpeed();

    abstract int getPositionX();

    abstract int getPositionY();

    abstract void setPositionX(int positionX);

    abstract void setPositionY(int positionY);

    abstract int moveX();

    abstract int moveY();

}
