package mx.hackathonmorelos.Iximati.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection obtenerConexion(){
        String cadena = "jdbc:mysql://localhost:3306/tutorial?"+
                "user=root&serverTimezone=America/Mexico_City&useSSL=false&" +
                "allowPublicKeyRetrieval=true";
        Connection conexion2 = null;
        String url ="jdbc:mysql://kim-azure.mysql.database.azure.com:3306/prueba?useSSL=true&requireSSL=false&serverTimezone=America/Mexico_City";

        try{
            conexion2 = DriverManager.getConnection(url, "marlon", "#eabc25264");
        } catch (SQLException e) {
            System.out.println(this.getClass().getCanonicalName()+"->"+e.getMessage());
        }

        return conexion2;
    }

    public static void main(String[] args) {
        Connection conexion = new Conexion().obtenerConexion();
        if(conexion != null)
            System.out.println("Se conectó");
        else
            System.out.println("Algo pasó!");
    }
}
