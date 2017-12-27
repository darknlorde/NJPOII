package collectionsjava;

import java.util.Comparator;

public class AdressBook implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Person) o1).getSex() != ((Person) o2).getSex() && ((Person) o2).getSex() == "Female") {
            return 1;
        } else if (((Person) o1).getSex() != ((Person) o2).getSex() && ((Person) o1).getSex() == "Female") {
            return -1;
        } else {
            return 0;
        }
    }

}
