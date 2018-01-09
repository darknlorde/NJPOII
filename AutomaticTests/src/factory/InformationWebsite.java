package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class InformationWebsite extends Website {

    public InformationWebsite() throws IOException {

        String websiteBodyTable[] = {"<p><b>Rolls-Royce Phantom</b></p><br>"
            + "<b>Rolls-Royce Phantom</b> – luksusowy samochód, należący do segmentu F,"
            + " produkowany przez firmę Rolls-Royce od 1925 roku.<br>"
            + "Daty produkcji poszczególnych generacji Phantoma:<br>"
            + "Rolls-Royce Phantom I, 1925–1931<br>"
            + "Rolls-Royce Phantom II, 1929–1936<br>"
            + "Rolls-Royce Phantom III, 1936–1939<br>"
            + "Rolls-Royce Phantom IV, 1950–1959<br>"
            + "Rolls-Royce Phantom V, 1959–1968<br>"
            + "Rolls-Royce Phantom VI, 1968–1991<br>"
            + "Rolls-Royce Phantom (2003), 2003–obecnie<br>"
            + "Rolls-Royce Phantom Drophead Coupé, 2007–obecnie<br>"
            + "Rolls-Royce Phantom Coupé, 2008–obecnie"
            + "<p><b>BMW – Rolls-Royce Phantom</b></p>"
            + "Jest to pierwszy model, który ukazał się od czasu,"
            + " gdy właścicielem firmy Rolls-Royce stało się BMW."
            + " Uzupełnił lukę po poprzednim modelu, Silver Seraph,"
            + " jednak nie jest to jego formalny następca.<br>"
            + " Pod maską ma widlasty, dwunastocylindrowy silnik o pojemności 6,75 l."
            + " Wnętrze w całości wykończone skórą, drewnem i wysokiej jakości aluminium."
            + "<p><b>Proces produkcji</b></p>"
            + "Model ten określany jest jako udane połączenie tradycji i najnowocześniejszej technologii."
            + " Proces produkcji opiera się na współpracy trzech fabryk."
            + " Pracownicy południowoniemieckich fabryk Unterholerau i Dingolfing <br>"
            + "ręcznie spawają karoserię z pięciuset elementów stalowych i aluminiowych,"
            + " a brytyjska Goodwood zabezpiecza karoserię pięcioma warstwami lakieru, podkładem,"
            + " kolorem i \"lakierem fortepianowym\". <br>"
            + "Jest to jedyny etap produkcji, w którym udział biorą maszyny,"
            + " by nakładane powłoki były jak najbardziej gładkie."
            + " Następnie przystępuje się do etapu polegającego na montażu części,"
            + " które są każdorazowo precyzyjnie dopasowywane. <br>"
            + "Klient ma możliwość dobierać wszystkie materiały wykończeniowe na życzenie."
            + " Drewno inkrustowane we wnętrzu jest obrabiane w ten sposób,"
            + " by uzyskać najciekawsze wzory, a cielęca skóra tapicerska posiada <br>"
            + "najwyższą jakość. Ukoronowaniem każdego pojazdu jest srebrna statuetka"
            + " \"Flying Lady\" i ręcznie malowany wzdłuż karoserii złoty pasek."
            + " Człowiek dekorujący samochód, uważany przez opinię publiczną za dzieło <br>"
            + "sztuki i osiągnięcie techniki, nazywa się Mark Court.",
            "<p><b>Maserati GranTurismo</b></p><br>"
            + "<b>Maserati GranTurismo </b> – samochód sportowy typu grand tourer produkowany przez włoską firmę Maserati od 2007 roku."
            + " Pojazd po raz pierwszy zaprezentowano podczas targów motoryzacyjnych w Genewie w 2007 roku."
            + "Nadwozie pojazdu zostało zaprojektowane przez Pininfarine pod przewodnictwem Jasona Castrioty."
            + " Do napędu użyto silników V8 a napęd przekazywany jest na koła tylne.<br>"
            + " GranTurismo dzieli wiele podzespołów z Ferrari 599 GTB Fiorano."
            + " Od 2010 roku produkowana jest także wersja kabriolet pod nazwą GranCabrio.",
            "<p><b>Tesla Model S</b></p><br>"
            + "<b>Tesla Model S </b> – elektryczny samochód osobowy klasy średniej-wyższej produkowany przez amerykańską markę"
            + " Tesla Motors od 2012 roku. Jest to pierwszy masowo produkowany elektryczny sedan klasy premium<br>."
            + " Model S jest stylizowanym na coupé połączeniem luksusowej limuzyny z liftbackiem."
            + " Nadwozie auta w całości wykonano z aluminium. Samochód poprzedził prototyp<br>"
            + " o nazwie Alpha zaprezentowany w 2009 roku."
            + " Europejska premiera wersji produkcyjnej pojazdu miała miejsce podczas Geneva Motor Show w 2012 roku.<br>"
            + "Auto dostępne jest w kilku opcjach z bateriami pozwalającymi na jazdę na jednym "
            + "ładowaniu: 160 mil (257 km, wycofany), 230 mil (370 km) lub 300 mil (483 km)<br>"
            + "Silnik pojazdu wielkości arbuza umieszczono pomiędzy tylnymi kołami,"
            + " aby wyeliminować wał napędowy oraz wybrzuszenie podłogi.<br>"
            + " W miejscu standardowego bagażnika można umieścić dodatkowo dwa dziecięce fotele,"
            + " dzięki czemu auto jest siedmioosobowe, natomiast z przodu umieszczono duży bagażnik.<br>"
            + " W aucie zastosowano system odzyskiwania energii podczas hamowania.<br>"
            + "Rekord zasięgu na jednym ładowaniu akumulatorów należy do Amerykanina Caseya Spencera,"
            + " który przejechał bez ładowania 885,62 kilometra.<br>"
            + " Wynik ten może zostać szybko pobity,"
            + " gdyż obecnie dostępna jest wersja z akumulatorem o 6% pojemniejszym od użytego w rekordowym przejeździe.",
            "<p><b> Infiniti G </b></p><br>"
            + "Infiniti G- samochód osobowy klasy średniej produkowany przez koncern Nissan pod marką Infiniti od 1991 roku."
            + " Auto w wersji sedan zostało zastąpione modelem Q50. Nazwę odmiany coupe w 2013 roku zmieniono na Q60.<br>"
            + "Infiniti G20 V35 produkowany był w latach 2002 - 2007 jako coupe oraz sedan."
            + " Do napędu używano silników V6 o pojemności 3,5 litra."
            + " Moc przenoszona była na oś tylną lub cztery koła poprzez 6-biegową ręczną skrzynię biegów.<br>"
            + " Samochód został zastąpiony przez model G V36."
        };

        this.websiteTitle = "InformationWebsite";
        this.websiteBody = websiteBodyTable[getRandomNumber(websiteBodyTable.length)];
        saveFile();
    }

}
