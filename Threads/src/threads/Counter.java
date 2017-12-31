package threads;

public class Counter {

    private int cout;

    Counter() {
        cout = 0;
    }

    public void add() {
        cout++;
    }

    public void rem() {
        cout--;
    }

    public int how() {
        return cout;
    }
}
