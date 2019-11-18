package mx.hackathonmorelos.Iximati.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion  {
    public Connection obtenerConexion() {
        String url ="jdbc:mysql://proyecto-iximati2019.mysql.database.azure.com:3306/inai?useSSL=true&requireSSL=false&serverTimezone=America/Mexico_City";
        Connection conexion2 = null;
        try {
            conexion2 = DriverManager.getConnection(url, "iximati2019@proyecto-iximati2019", "Hackathon2019.");
        } catch (SQLException ex) {
            System.out.println(this.getClass().getCanonicalName() + ex.getMessage());
        }
        return conexion2;
    }

    public static void main(String[] args) {
        Connection conexion = new Conexion().obtenerConexion();
    }
}
