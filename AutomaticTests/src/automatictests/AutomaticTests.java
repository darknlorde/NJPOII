package automatictests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import sun.nio.cs.Surrogate;

public class AutomaticTests {

    public static ArrayList excerciseOne(int a, int b, int c) {
        ArrayList list = new ArrayList();
        if (a != 0) {
            int delta = b * b - 4 * a * c;
            delta = (int) Math.sqrt(delta);
            if (delta > 0) {
                list.add((double) ((-b - delta) / (2 * a)));
                list.add((double) ((-b + delta) / (2 * a)));

            } else if (delta == 0) {
                list.add((double) (-b / (2 * a)));
            }
        }
        return list;
    }

    public static long excerciseTwo(int number) {
        long start = System.currentTimeMillis();
        ArrayList list = new ArrayList();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            list.add(rand.nextInt(10) + 1);
        }
        Collections.sort(list);
        long stop = System.currentTimeMillis();
        return (stop - start);
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list = excerciseOne(33, 222, 11);
        System.out.println(list);


        System.out.println(excerciseTwo(10000000)+ " ms");
    }

}
