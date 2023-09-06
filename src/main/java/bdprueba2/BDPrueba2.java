package bdprueba2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BDPrueba2 {

    // Datos de conexión a la base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/Prueba2";
    private static final String USUARIO = "Root";
    private static final String CONTRASEÑA = "";
    // revisar el codigo!!!!

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        

       /*
        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            statement = connection.createStatement();

            // Crear la tabla "alumnos" si no existe
            String sql = "CREATE TABLE IF NOT EXISTS alumnos ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "nombre VARCHAR(50),"
                    + "apellido VARCHAR(50),"
                    + "edad INT"
                    + ")";
            statement.executeUpdate(sql);
            System.out.println("Tabla creada con éxito.");

            // Insertar datos en la tabla "alumnos"
            sql = "INSERT INTO alumnos (nombre, apellido, edad) VALUES "
                    + "('Juan', 'Pérez', 20),"
                    + "('María', 'González', 22),"
                    + "('Carlos', 'López', 19)";
            statement.executeUpdate(sql);
            System.out.println("Datos insertados en la tabla.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar statement y connection al finalizar
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }
}
