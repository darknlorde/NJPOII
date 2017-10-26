package exercise2;

abstract public class RoadUser {

    protected char sign = '=';
    protected int speed = 0;
    protected String position = "";

    public RoadUser() {

    }

  

    public RoadUser(char sign, int speed, String position) {
        this.sign = sign;
        this.speed = speed;
        this.position = position;
    }

    abstract char getSign();

    abstract int getSpeed();

    abstract String getPosition();

    abstract void result();

}
