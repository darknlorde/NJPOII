package collectionsjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Timer;

public class CollectionsJava {

    public static void speedTestADD(long howMeanyTimes) {

        //ADD TO BEGINNING
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        long startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add(0, "QWERTY");
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Add elements at the beginning of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.add(0, "QWERTY");
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Add elements at the beginning of LinkedList (total time: " + duration + " ms)");

        //ADD TO MIDDLE
        arrayList = new ArrayList();
        linkedList = new LinkedList();

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add((arrayList.size() / 2), "QWERTY");
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Add elements to the middle of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.add((linkedList.size() / 2), "QWERTY");
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Add elements to the middle of LinkedList (total time: " + duration + " ms)");

        //ADD TO END
        arrayList = new ArrayList();
        linkedList = new LinkedList();

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add("QWERTY");
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Add elements at the end of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.add("QWERTY");
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Add elements at the end of LinkedList (total time: " + duration + " ms)");

    }

    public static void speedTestREMOVE(long howMeanyTimes) {
        //REMOVE FROM BEGINNING
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add("QWERTY");
            linkedList.add("QWERTY");
        }

        long startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.remove(0);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Remove elements at the beginning of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Remove elements at the beginning of LinkedList (total time: " + duration + " ms)");

        //REMOVE FROM MIDDLE
        arrayList = new ArrayList();
        linkedList = new LinkedList();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add("QWERTY");
            linkedList.add("QWERTY");
        }

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.remove((arrayList.size() / 2));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Remove elements from the middle of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.remove((linkedList.size() / 2));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Remove elements from the middle of LinkedList (total time: " + duration + " ms)");

        //REMOVE FROM END
        arrayList = new ArrayList();
        linkedList = new LinkedList();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add("QWERTY");
            linkedList.add("QWERTY");
        }

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Remove elements from the end of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Remove elements from the end of LinkedList (total time: " + duration + " ms)");
    }

    public static void speedTestGET(long howMeanyTimes) {
        //GET FROM BEGINNING
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.add("QWERTY");
            linkedList.add("QWERTY");
        }

        long startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.get(0);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Get elements at the beginning of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.get(0);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Get elements at the beginning of LinkedList (total time: " + duration + " ms)");

        //GET FROM MIDDLE
        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.get((arrayList.size() / 2));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Get elements from the middle of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.get((linkedList.size() / 2));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Get elements from the middle of LinkedList (total time: " + duration + " ms)");

        //GET FROM END
        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            arrayList.get(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Get elements from the end of ArrayList (total time: " + duration + " ms)");

        startTime = System.nanoTime();
        for (long i = 0; i < howMeanyTimes; i++) {
            linkedList.get(linkedList.size() - 1);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Get elements from the end of LinkedList (total time: " + duration + " ms)");
    }

    public static void main(String[] args) {
        /*FileAnalysis fileAnalysis = new FileAnalysis();      
        fileAnalysis.setVisible(true);*/
        
        /*Person person1 = new Person("Tomek", "QWERTY", "Male");
        Person person2 = new Person("Ania", "QWERTY", "Female");
        Person person3 = new Person("Jola", "QWERTY", "Female");
        Person person4 = new Person("Jarek", "QWERTY", "Male");
        Person person5 = new Person("Miecia", "QWERTY", "Female");

        AdressBook adressBook = new AdressBook();
        System.out.println(adressBook.compare(person1, person2));
        System.out.println(adressBook.compare(person2, person3));
        System.out.println(adressBook.compare(person4, person5));
        System.out.println(adressBook.compare(person5, person5));
        System.out.println(adressBook.compare(person1, person3));*/

        /*long howMeanyTimes = 100000;
        speedTestADD(howMeanyTimes);
        speedTestREMOVE(howMeanyTimes);
        speedTestGET(howMeanyTimes);*/
    }

}
