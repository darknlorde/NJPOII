package threads;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread {

    String name;
    int number = 0;

    Thread1(int number) {
        this.number = number;
        System.out.println("Utworzono watek " + number);
    }

    public int generator() {
        String neww = "";
        int nope = 0;
        Random generator = new Random();
        for (int j = 0; j < 1000; j++) {
            nope = generator.nextInt();
            neww += nope;
        }
        return nope;
    }

    @Override
    public void run() {

        String filePath = "C:\\Users\\Mati\\Desktop\\Threads\\Proj" + number;
        int number = generator();
        DataOutputStream outputStream = null;

        try {
            System.out.println(number + " wątek rozpoczyna prace");
            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            for (int z = 0; z < 300000; z++) {
                outputStream.writeInt(number);
            }
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Przerwano prace watku " + name);
        } catch (IOException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
