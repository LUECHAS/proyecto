// Se importan las clases necesarias para la conexión a la 
//base de datos y la interfaz gráfica de usuario.
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;



 
// Se define la clase 'formulario' que hereda de 
//'javax.swing.JFrame', lo que significa que esta clase representa 
//una ventana en la interfaz gráfica de usuario.
public class formulario extends javax.swing.JFrame {

   // Se crean dos objetos: 'con' de la clase 'Conexion2' y 'cn' 
    //de la clase 'Connection'. 'cn' se inicializa con el método 'conecta()' de 'con'.
   Conexion2 con= new Conexion2();
   Connection cn= con.conecta();
   
   
    // Se define el constructor de la clase 'formulario'. Este método se llama cuando se crea un nuevo objeto de la clase 'formulario'.
   public formulario() {
        // Se llama al método 'initComponents()' que inicializa los componentes de la interfaz gráfica de usuario.
        initComponents();
        // Se llama al método 'mostrardatos()' que no se proporciona en el código proporcionado, pero probablemente se utiliza para mostrar los datos en la interfaz gráfica de usuario.
        mostrardatos();  
    }

     
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado_Usuarios"));

        jTable_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Usuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa La Siguiente Informacion"));

        txt_Nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Usuario"));

        txt_Correo.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo Eletronico"));

        txt_Direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DireccionActionPerformed(evt);
            }
        });

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        txt_id.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txt_Direccion)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar))
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DireccionActionPerformed

    }//GEN-LAST:event_txt_DireccionActionPerformed
// Este método se ejecuta cuando se hace clic en el botón 'Registrar'.
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
             try {
            // Se prepara una consulta SQL para eliminar un usuario de la base de datos.
            PreparedStatement ps = cn.prepareStatement("DELETE FROM usuarios WHERE ID_Usuario = ?");
            // Se establece el valor del parámetro en la consulta SQL.
            int id = Integer.parseInt(txt_id.getText());
            ps.setInt(1, id);
            // Se ejecuta la consulta SQL y se obtiene el número de filas afectadas.
            int indice = ps.executeUpdate();
            if (indice > 0) {
                // Si se eliminó al menos una fila, se muestra un mensaje de éxito.
                JOptionPane.showMessageDialog(rootPane, "DATOS ELIMINADOS CORRECTAMENTE");
                // Se actualizan los datos mostrados y se limpian las entradas.
                mostrardatos();
                limpiarentradas();
            } else {
                // Si no se eliminó ninguna fila, se muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "No se encontró el registro con ID_usuario " + id);
            }
        } catch (SQLException e) {
            // Se imprime un mensaje de error si algo sale mal.
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR DATOS: " + e);
        }


    }//GEN-LAST:event_btn_registrarActionPerformed
// Este método se ejecuta cuando se hace clic en el botón 'Eliminar'.
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
            try {
            // Se prepara una consulta SQL para eliminar un usuario de la base de datos.
            PreparedStatement ps = cn.prepareStatement("DELETE FROM usuarios WHERE ID_Usuario = ?");
            // Se establece el valor del parámetro en la consulta SQL.
            int id = Integer.parseInt(txt_id.getText());
            ps.setInt(1, id);
            // Se ejecuta la consulta SQL y se obtiene el número de filas afectadas.
            int indice = ps.executeUpdate();
            if (indice > 0) {
                // Si se eliminó al menos una fila, se muestra un mensaje de éxito.
                JOptionPane.showMessageDialog(rootPane, "DATOS ELIMINADOS CORRECTAMENTE");
                // Se actualizan los datos mostrados y se limpian las entradas.
                mostrardatos();
                limpiarentradas();
            } else {
                // Si no se eliminó ninguna fila, se muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "No se encontró el registro con ID_usuario " + id);
            }
        } catch (SQLException e) {
            // Se imprime un mensaje de error si algo sale mal.
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR DATOS: " + e);
        }
    }      

   // Este método se utiliza para mostrar los datos de los usuarios en la tabla.
    private void mostrardatos() {
        // Se crea un nuevo modelo para la tabla y se le añaden las columnas.
        DefaultTableModel modelo=new DefaultTableModel () ;
        modelo.addColumn ("id");
        modelo.addColumn ("Nombre Usuario");
        modelo.addColumn ("Correo Eletronico");
        modelo.addColumn ("Direccion");
        jTable_Usuarios.setModel(modelo);
        // Se prepara una consulta SQL para obtener todos los usuarios de la base de datos.
        String consultasql="select*from usuarios";
        String data[]=new String [4];


 Statement st;
        try {
            // Se ejecuta la consulta SQL y se obtienen los resultados.
            st=cn.createStatement();
            ResultSet rs=st.executeQuery (consultasql);
            while(rs.next ()) {
                // Se obtienen los datos de cada usuario y se añaden al modelo de la tabla.
                data [0]=rs.getString (1);
                data [1]=rs.getString (2); 
                data [2]=rs.getString (3) ;
                data [3]=rs.getString (4); 
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            // Se imprime un mensaje de error si algo sale mal.
            System.out.println ("Error al mostrar Datos "+ e);
        }
    }

    // Este método se utiliza para limpiar las entradas.
    private void limpiarentradas() {
        txt_id.setText("");
        txt_Nombre.setText("");
        txt_Correo.setText("");
        txt_Direccion.setText("");
      
       
    
    }//GEN-LAST:event_btn_eliminarActionPerformed
 // Este método se ejecuta cuando se hace clic en el botón 'Modificar'.
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
 try {
            // Se prepara una consulta SQL para actualizar un usuario en la base de datos.
            PreparedStatement ps = cn.prepareStatement("UPDATE usuarios SET nombre_Usuario = ?, Correo = ?, Direccion = ? WHERE ID_Usuario = ?");
            // Se establecen los valores de los parámetros en la consulta SQL.
            ps.setString(1, txt_Nombre.getText());
            ps.setString(2, txt_Correo.getText());
            ps.setString(3, txt_Direccion.getText());
            ps.setInt(4, Integer.parseInt(txt_id.getText()));
            // Se ejecuta la consulta SQL y se obtiene el número de filas afectadas.
            int indice = ps.executeUpdate();
            if (indice > 0) {
                // Si se actualizó al menos una fila, se muestra un mensaje de éxito.
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                // Se actualizan los datos mostrados y se limpian las entradas.
                mostrardatos();
                limpiarentradas();
            } else {
                // Si no se actualizó ninguna fila, se muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "No selecciono Fila");
            }
        } catch (SQLException e) {
            // Se imprime un mensaje de error si algo sale mal.
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }


    }//GEN-LAST:event_btn_modificarActionPerformed

    private void jTable_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UsuariosMouseClicked
      int fila = this.jTable_Usuarios.getSelectedRow();
this.txt_id.setText(this.jTable_Usuarios.getValueAt(fila, 0).toString());
this.txt_Nombre.setText(this.jTable_Usuarios.getValueAt(fila, 1).toString());
this.txt_Direccion.setText(this.jTable_Usuarios.getValueAt(fila, 2).toString());
this.txt_Correo.setText(this.jTable_Usuarios.getValueAt(fila, 3).toString());



    }//GEN-LAST:event_jTable_UsuariosMouseClicked

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Usuarios;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
public static void main(String[] args) {
    // Se crea una nueva instancia de 'Runnable' y se pasa al método 'invokeLater' de 'EventQueue'.
    // 'invokeLater' programa el 'Runnable' para ser ejecutado tan pronto como sea posible en el hilo de despacho de eventos.
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Se crea una nueva instancia de 'formulario' y se hace visible.
            // Esto debe hacerse en el hilo de despacho de eventos para asegurar la seguridad de los hilos en Swing.
            new formulario().setVisible(true);
        }
        });
    }
} 


                
 
