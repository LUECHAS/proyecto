// Se importan las clases necesarias para establecer la conexión con la base de datos.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion2 {
    // Se declara una variable de instancia para la conexión.
    Connection conn;
    
    // Se declara un constructor vacío.
    public Conexion2(){}
    
    // Este método se utiliza para establecer la conexión con la base de datos.
    public Connection conecta() { 
        try {
            // Se carga el driver de MySQL.
            Class.forName ("com.mysql.jdbc.Driver");
            // Se establece la conexión con la base de datos.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_virtual","root","");
            // Si la conexión se estableció correctamente, se muestra un mensaje de éxito.
            if(conn!=null){
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            // Si algo sale mal al establecer la conexión, se muestra un mensaje de error.
            JOptionPane.showMessageDialog(null, "Error de conexión" + ex.getMessage());
        }
        // Se devuelve la conexión.
        return conn;
    }
    
    // Este es el método main, que es el punto de entrada cuando se ejecuta el programa.
    public static void main(String[] args) {
        // Se crea una nueva instancia de 'Conexion2' y se establece la conexión con la base de datos.
        Conexion2 con= new Conexion2();
        con.conecta();
    }
}
