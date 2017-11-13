package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Website {

    protected String websiteTitle;
    protected String websiteBody;

    public Website() {
        this.websiteTitle = "Website";
        this.websiteBody = "Website Body";
    }

    public Website(String websiteTitle, String websiteBody) {
        this.websiteTitle = websiteTitle;
        this.websiteBody = websiteBody;
    }

    public String writeHead() {
        return "<!DOCTYPE HTML>\n"
                + "<html lang=\"pl\">\n"
                + "<head>\n"
                + "<meta charset=\"utf-8\" />\n"
                + "<title>" + websiteTitle + "</title>\n"
                + "</head>\n"
                + "<body><p>" + websiteBody + "</p></body>\n"
                + "</html>";
    }

    public void saveFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(websiteTitle + ".html"));
        bw.write(writeHead());
        bw.close();

    }

    public int getRandomNumber(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }

}
