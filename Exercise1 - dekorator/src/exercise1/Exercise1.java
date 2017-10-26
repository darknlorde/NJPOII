package exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
Program który pozwala obliczyć ilość wyrazów oraz ilość linii w "plik.txt". 

*/
public class Exercise1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("plik.txt"));
        int line = 0;
        int whitespace = 0;
        String textLine = bufferedReader.readLine();
        while (textLine != null) {
            if (textLine.matches(".+") && !textLine.matches("\\A\\s*\\z")) {
                while (Character.isWhitespace(textLine.charAt(0))) {
                    textLine = textLine.substring(1);
                }
                while (Character.isWhitespace(textLine.charAt(textLine.length() - 1))) {
                    textLine = textLine.substring(0, textLine.length() - 1);
                }
                for (int i = 0; i < textLine.length() - 1; i++) {
                    if (Character.isWhitespace(textLine.charAt(i)) && Character.isWhitespace(textLine.charAt(i + 1))) {
                        textLine = textLine.substring(0, i) + textLine.substring(i + 1, textLine.length());
                        i = 0;
                    }
                }

                for (int i = 0; i < textLine.length(); i++) {
                    if (Character.isWhitespace(textLine.charAt(i))) {
                        whitespace++;
                    }
                }
                whitespace++;
            }

            line++;
            textLine = bufferedReader.readLine();
        }
        System.out.println("Number of lines: " + line);
        System.out.println("Number of words: " + whitespace);
        bufferedReader.close();

    }
}
