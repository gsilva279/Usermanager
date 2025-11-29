package data;

import java.sql.*;

public class Connection {
    public Connection conection;

    public Connection conectBD() {
        try {
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException erro) {
            System.out.println("Class conection erro " + erro);
        }
    }

}
