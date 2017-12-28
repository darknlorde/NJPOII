package javaappwithdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;

public class JavaAppWithDatabase {

    public static Connection dateBaseConnection() {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String myDB = "jdbc:oracle:thin:@155.158.112.45:1521:oltpstud";
            String user = "ziibd4";
            String password = "haslo2017";

            Connection connection = DriverManager.getConnection(myDB, user, password);

            return connection;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaAppWithDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {

        /*Singleton singleton = new Singleton();

        ResultSet rs = singleton.executeQuery("SELECT * FROM EMPLOYEES");
        while (rs.next()) {
            int employeeId = rs.getInt("EMPLOYEE_ID");
            String employeFirstName = rs.getString("FIRST_NAME");
            System.out.println(employeeId +" "+ employeFirstName);
        }
        int eu = singleton.executeUpdate("UPDATE EMPLOYEES SET FIRST_NAME='Tomek' WHERE EMPLOYEE_ID<102");
        System.out.println();
        System.out.println(eu);
        System.out.println();
        rs = singleton.executeQuery("SELECT * FROM EMPLOYEES");
        while (rs.next()) {
            int employeeId = rs.getInt("EMPLOYEE_ID");
            String employeFirstName = rs.getString("FIRST_NAME");
            System.out.println(employeeId +" "+ employeFirstName);
        }*/
        
        /*Singleton singleton = new Singleton();
        ResultSet rs = singleton.executeQuery("SELECT * FROM EMPLOYEES");
        ArrayList persons = new ArrayList();
        while (rs.next()) {
            Person person = new Person();
            person.setName(rs.getString("FIRST_NAME"));
            person.setSurname(rs.getString("LAST_NAME"));
            persons.add(person);
        }
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(((Person) persons.get(i)).getName() + " " + ((Person) persons.get(i)).getSurname());
        }*/
        
        /*Singleton singleton = new Singleton();
        long startTime = System.nanoTime();
        ResultSet rs = singleton.executeQuery("SELECT FIRST_NAME FROM EMPLOYEES ORDER BY FIRST_NAME ASC");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) ;
        System.out.println("SQL sort (total time: " + duration + " nanoseconds)");
        rs=null;
        rs = singleton.executeQuery("SELECT * FROM EMPLOYEES");
        ArrayList<String> persons = new ArrayList<String>();
        while (rs.next()) {
           
            persons.add(rs.getString("FIRST_NAME"));
            
        }
        startTime = System.nanoTime();
        Collections.sort(persons);
        endTime = System.nanoTime();
        duration = (endTime - startTime) ;
        System.out.println("Arraylist sort (total time: " + duration + " nanoseconds)");
        */
    }

}
