package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class ContactWebsite extends Website {

    public ContactWebsite() throws IOException {

        String websiteBodyTable[] = {"INFINITI Warszawa<br>"
            + "ul. Krasnobrodzka 5<br>"
            + "03-214 Warszawa<br>"
            + " <br>"
            + "INFINITI Sosnowiec<br>"
            + "ul. Stawowa 2<br>"
            + "41-214 Sosnowiec<br>"
            + " <br>"
            + "INFINITI Kraków<br>"
            + "Al. Powstańców Śląskich 22<br>"
            + "30-570 Kraków<br>"
            + " <br>"
            + "INFINITI Poznań<br>"
            + "ul. Głogowska 446<br>"
            + "60-004 Poznań<br>"
            + " <br>"
            + "INFINITI Wrocław<br>"
            + "ul. Wrocławska 58<br>"
            + "55-095 Długołęka<br>"
            + " <br>"
            + "INFINITI Gdańsk<br>"
            + "ul. Szczęśliwa 9A<br>"
            + "80-176 Gdańsk",
            "Rolls-Royce Poland Sp. z o.o.<br>"
            + "Kopernika 1<br>"
            + "83-140 Gniew",
            "Oficjalny Importer Maserati w Polsce<br>"
            + "<br>"
            + "ul. Puławska 52A, 05-500 Piaseczno<br>"
            + "<br>"
            + "e: info@maserati.pl<br>"
            + "t: +48 (22) 716 92 92<br>"
            + "f: +48 (22) 756 70 88",
            "Tilburg Factory & Delivery Center<br>"
            + "<br>"
            + "Asteriastraat 1-7<br>"
            + "5047 RM, Tilburg<br>"
            + "Netherlands<br>"
            + "Tesla Grohmann Automation GmbH<br>"
            + "<br>"
            + "Rudolf-Diesel-Strasse 14<br>"
            + "54595 Prüm,<br>"
            + "Germany<br>"
            + "Tesla Australia & New Zealand<br>"
            + "<br>"
            + "33 Herbert St<br>"
            + "St Leonards, NSW 2065<br>"
            + "Australia<br>"
            + "Tesla China<br>"
            + "<br>"
            + "8F, Tower 3 China Central Place<br>"
            + "No.77 Jianguo Road<br>"
            + "Chaoyang District,Beijing<br>"
            + "China<br>"
            + "Tesla Hong Kong<br>"
            + "<br>"
            + "Units A&C, 27/F<br>"
            + "East Wing, TML Tower<br>"
            + "3 Hoi Shing Road, Tsuen Wan<br>"
            + "Hong Kong"};

        this.websiteTitle = "ContactWebsite";
        this.websiteBody = websiteBodyTable[getRandomNumber(websiteBodyTable.length)];
        saveFile();
    }

}
