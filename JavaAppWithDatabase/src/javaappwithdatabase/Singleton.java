package javaappwithdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javaappwithdatabase.JavaAppWithDatabase.dateBaseConnection;

public class Singleton {

    private static Singleton instance = null;

    Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     *
     * @param query
     * @return
     */
    public ResultSet executeQuery(String query) throws SQLException {
        Connection cnx = dateBaseConnection();
        Statement st = cnx.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }

    public int executeUpdate(String query) throws SQLException {
        Connection cnx = dateBaseConnection();
        Statement st = cnx.createStatement();
        int rs = st.executeUpdate(query);
        return rs;

    }
}
