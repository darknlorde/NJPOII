package factory;

import java.io.IOException;

public class WebsiteFactory {

    public static Website createChart(WebsiteType type) throws IOException {

        if (null != type) {
            switch (type) {
                case PhotoGalleryWebsite:
                    return new PhotoGalleryWebsite();
                case InformationWebsite:
                    return new InformationWebsite();
                case ContactWebsite:
                    return new ContactWebsite();
                case NewsWebsite:
                    return new NewsWebsite();
                default:
                    return new Website();
            }
        } else {
            return new Website();
        }

    }
}
