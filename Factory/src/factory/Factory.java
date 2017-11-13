package factory;

import java.io.IOException;

public class Factory {

    public static void main(String[] args) throws IOException {

        WebsiteFactory.createChart(WebsiteType.PhotoGalleryWebsite);
        WebsiteFactory.createChart(WebsiteType.InformationWebsite);
        WebsiteFactory.createChart(WebsiteType.ContactWebsite);
        WebsiteFactory.createChart(WebsiteType.NewsWebsite);

    }

}
