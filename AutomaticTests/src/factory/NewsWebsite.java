package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class NewsWebsite extends Website {

    public NewsWebsite() throws IOException {
        String websiteBodyTable[] = {"<p>SPORTOWY WEEKEND</p><br>"
            + "Lionel Messi sprawdza gospodarzy mundialu<br>"
            + "Kadra Nawałki zagra bez największych gwiazd<br>"
            + "Justyna Kowalczyk znowu na podium. Kolejny dobry start<br><br>",
            "<p>WIEM WIĘCEJ</p><br>"
            + "Diesle wysokiego ryzyka! Samochodów z tymi silnikami unikaj jak ognia<br>"
            + "Zużyta opona może doprowadzić do wypadku. Jak sprawdzić jej stan?<br>"
            + "Piją wino, zajadają się bagietkami z pleśniowym serem i nie tyją. O co chodzi?<br>"
            + "16 godzin niezwykłej imprezy. W Spodku bawiono się do 9 rano! <br>"
            + "Mąż ujawnia prywatne listy Ireny Jarockiej<br>"
            + "Najbardziej portugalska wioska Portugalii<br>"
            + "Miłoszewski: Polska dusza przetrwała właśnie dlatego, że Polacy pokazywali takim ludziom środkowy palec<br>"
            + "Był uzależniony od twardych narkotyków, siedział w więzieniu. Pokonał nałóg i odniósł wielki sukces<br>"
            + "Co w sobotę w tv? Oto nasze propozycje na dzisiejszy wieczór. Jest kilka dobrych filmów<br>",
            "<p>ŻYCIE GWIAZD</p><br>"
            + "Tak wyrosła dziecięca aktorka. Ostatnio mogliśmy ją zobaczyć w filmie 'Gwiazdy'<br>"
            + "Stylizacje gwiazd. Sukcesy i porażki modowe minionego tygodnia<br>"
            + "Szapołowska, Herbuś, Warnke, czyli kobiety w czerni. Która wyglądała najlepiej?<br>"
            + "Gwiazdor rzucił ją w 27 sekund. Umiała się zemścić<br>"
            + "Victoria Beckham ćwiczy na bieżni. Zwróćcie uwagę na jej buty<br>",
            "<p>STYL ŻYCIA</p><br>"
            + "Jest w 5. miesiącu ciąży i nie ma brzuszka. Przyszła mama mówi, dlaczego<br>"
            + "Kasia Tusk: beż i czerń to jedno z moich ulubionych połączeń kolorystycznych. Świetna stylizacja na jesień!<br>"
            + "Siedem zaskakujących przyczyn, dla których masz cienie pod oczami<br>"};

        this.websiteTitle = "NewsWebsite";
        this.websiteBody = websiteBodyTable[getRandomNumber(websiteBodyTable.length)];
        saveFile();
    }

}
