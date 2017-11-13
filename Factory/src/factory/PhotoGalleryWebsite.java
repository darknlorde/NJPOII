package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class PhotoGalleryWebsite extends Website {

    public PhotoGalleryWebsite() throws IOException {
        String websiteBodyTable[] = {"<p>ROLLS ROYCE PHANTOM 2018</p><br>"
            + "<img src=\"http://www.hdcarwallpapers.com/download/2018_rolls_royce_phantom_4k-1280x720.jpg\" >",
            "<p>MASERATI GRANTURISMO MC 2017</p><br>"
            + "<img src=\"http://www.hdcarwallpapers.com/download/2017_maserati_granturismo_mc_4k-1280x720.jpg\" >",
            "<p>TESLA MODEL S 2013</p><br>"
            + "<img src=\"http://www.hdcarwallpapers.com/download/2013_tesla_model_s-1280x800.jpg\" >",
            "<p> INFINITI Q60 PROJECT BLACK S 3 2017</p><br>"
            + "<img src=\"http://www.hdcarwallpapers.com/download/2017_infiniti_q60_project_black_s_3-1280x720.jpg\" >"};

        this.websiteTitle = "PhotoGalleryWebsite";
        this.websiteBody = websiteBodyTable[getRandomNumber(websiteBodyTable.length)];
        saveFile();
    }

}
