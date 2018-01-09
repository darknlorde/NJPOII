
import automatictests.AutomaticTests;
import factory.Factory;
import factory.Website;
import factory.WebsiteFactory;
import factory.WebsiteType;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewJUnitTest {

    public NewJUnitTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void excerciseOneTest1() {
        AutomaticTests automaticTests = new AutomaticTests();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(-2.0);
        list2.add(0.0);
        list1 = automaticTests.excerciseOne(1, 2, 0);
        assertTrue("Listy nie są są identyczne", list1.containsAll(list2));
    }

    @Test
    public void excerciseOneTest2() {
        AutomaticTests automaticTests = new AutomaticTests();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1 = automaticTests.excerciseOne(0, 0, 0);
        assertTrue("Listy nie są są identyczne", list1.containsAll(list2));
    }

    @Test
    public void excerciseOneTest3() {
        AutomaticTests automaticTests = new AutomaticTests();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(0.0);
        list1 = automaticTests.excerciseOne(1, 1, 1);
        assertTrue("Listy nie są są identyczne", list1.containsAll(list2));
    }

    @Test
    public void excerciseOneTest4() {
        AutomaticTests automaticTests = new AutomaticTests();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(-1.0);
        list1 = automaticTests.excerciseOne(1, 2, 3);
        assertTrue("Listy nie są są identyczne", list1.containsAll(list2));
    }

    @Test
    public void excerciseOneTest5() {
        AutomaticTests automaticTests = new AutomaticTests();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(-6.0);
        list2.add(0.0);
        list1 = automaticTests.excerciseOne(33, 222, 11);
        assertTrue("Listy nie są są identyczne", list1.containsAll(list2));
    }

    @Test
    public void excerciseTwoTest1() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 1000 ms", automaticTests.excerciseTwo(10000000) < 1000);
    }

    @Test
    public void excerciseTwoTest2() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 2000 ms", automaticTests.excerciseTwo(10000000) < 2000);
    }

    @Test
    public void excerciseTwoTest3() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 3000 ms", automaticTests.excerciseTwo(10000000) < 3000);
    }

    @Test
    public void excerciseTwoTest4() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 4000 ms", automaticTests.excerciseTwo(10000000) < 4000);
    }

    @Test
    public void excerciseTwoTest5() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 5000 ms", automaticTests.excerciseTwo(10000000) < 5000);
    }
    @Test
    public void excerciseTwoTest6() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 6000 ms",automaticTests.excerciseTwo(10000000)<6000);
    }
     @Test
    public void excerciseTwoTest7() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 7000 ms",automaticTests.excerciseTwo(10000000)<7000);
    }
    @Test
    public void excerciseTwoTest8() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 8000 ms",automaticTests.excerciseTwo(10000000)<8000);
    }
     @Test
    public void excerciseTwoTest9() {
        AutomaticTests automaticTests = new AutomaticTests();
        assertTrue("Dodanie 1E7 liczb oraz posortowanie ich zajeło więcej niż 9000 ms",automaticTests.excerciseTwo(10000000)<9000);
    }
    @Test
    public void excerciseThreeTest1() throws IOException {
        Website photoGalleryWeb = WebsiteFactory.createChart(WebsiteType.PhotoGalleryWebsite);
        assertNotNull("PhotoGalleryWebsite NULL", photoGalleryWeb);
    }

    @Test
    public void excerciseThreeTest2() throws IOException {
        Website informationWeb = WebsiteFactory.createChart(WebsiteType.InformationWebsite);
        assertNotNull("InformationWebsite NULL", informationWeb);
    }

    @Test
    public void excerciseThreeTest3() throws IOException {
        Website contactWebsite = WebsiteFactory.createChart(WebsiteType.ContactWebsite);
        assertNotNull("ContactWebsite NULL", contactWebsite);
    }

    @Test
    public void excerciseThreeTest4() throws IOException {
        Website newsWeb = WebsiteFactory.createChart(WebsiteType.NewsWebsite);
        assertNotNull("NewsWebsite NULL", newsWeb);
    }

    @Test
    public void excerciseThreeTest5() throws IOException {
        Website photoGalleryWeb = WebsiteFactory.createChart(WebsiteType.PhotoGalleryWebsite);
        String head = photoGalleryWeb.writeHead();
        assertNotNull("PhotoGalleryWebsite HEAD NULL", head);
    }

    @Test
    public void excerciseThreeTest6() throws IOException {
        Website informationWeb = WebsiteFactory.createChart(WebsiteType.InformationWebsite);
        String head = informationWeb.writeHead();
        assertNotNull("InformationWebsite HEAD NULL", head);
    }

    @Test
    public void excerciseThreeTest7() throws IOException {
        Website contactWebsite = WebsiteFactory.createChart(WebsiteType.ContactWebsite);
        String head = contactWebsite.writeHead();
        assertNotNull("ContactWebsite HEAD NULL", head);
    }

    @Test
    public void excerciseThreeTest8() throws IOException {
        Website newsWeb = WebsiteFactory.createChart(WebsiteType.NewsWebsite);
        String head = newsWeb.writeHead();
        assertNotNull("NewsWebsite HEAD NULL", head);
    }

    @Test
    public void excerciseThreeTest9() throws IOException {
        Website photoGalleryWeb = WebsiteFactory.createChart(WebsiteType.PhotoGalleryWebsite);
        int length = 10 ;
        int random = photoGalleryWeb.getRandomNumber(length);
        assertTrue("PhotoGalleryWebsite RANDOM FAIL", (0<=random) && (length>=random));
    }

    @Test
    public void excerciseThreeTest10() throws IOException {
        Website informationWeb = WebsiteFactory.createChart(WebsiteType.InformationWebsite);
        int length = 10 ;
        int random = informationWeb.getRandomNumber(length);
        assertTrue("InformationWebsite RANDOM FAIL", (0<=random) && (length>=random));
    }

    @Test
    public void excerciseThreeTest11() throws IOException {
        Website contactWebsite = WebsiteFactory.createChart(WebsiteType.ContactWebsite);
        int length = 10 ;
        int random = contactWebsite.getRandomNumber(length);
        assertTrue("ContactWebsite RANDOM FAIL", (0<=random) && (length>=random));
    }

    @Test
    public void excerciseThreeTest12() throws IOException {
        Website newsWeb = WebsiteFactory.createChart(WebsiteType.NewsWebsite);
        int length = 10 ;
        int random = newsWeb.getRandomNumber(length);
        assertTrue("NewsWebsite RANDOM FAIL", (0<=random) && (length>=random));
    }

    
}
