package Vista;

import Controlador.LibroDAO;
import Modelo.Libro;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Catalina
 */
public class Formulario_Libros extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Libros
     */
    public Formulario_Libros() {
        initComponents();
        dtc_fecha_publicacion.setMaxSelectableDate(new Date());
        cargar_tabla();
    }
    public void limpiar(){
        txtxf_isbn.setText("");
        txtxf_titulo.setText("");
        txtxf_editorial.setText("");
        spn_ejemplares_disponibles.setValue(0);
        dtc_fecha_publicacion.setDate(new Date());
        txtxf_genero.setText("");
    }
    public void cargar_tabla(){
        try {
            DefaultTableModel modelo_tabla = new DefaultTableModel();
            modelo_tabla.addColumn("ISBN");
            modelo_tabla.addColumn("Titulo");
            modelo_tabla.addColumn("Editorial");
            modelo_tabla.addColumn("Ejemplares disponibles");
            modelo_tabla.addColumn("Fecha de publicación");
            modelo_tabla.addColumn("Genéro");
            
            LibroDAO dao = new LibroDAO();
            for (Libro l : dao.listar_libros()) {
                Object[] fila = new Object[6];
                fila[0] = l.getIsbn();
                fila[1] = l.getTitulo();
                fila[2] = l.getEditorial();
                fila[3] = l.getEjemplares_disponibles();
                fila[4] = l.getFecha_publicacion();
                fila[5] = l.getGenero();
                modelo_tabla.addRow(fila);
            }
            tbl_libros.setModel(modelo_tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_isbn = new javax.swing.JLabel();
        lb_titulo_libro = new javax.swing.JLabel();
        lb_editorial = new javax.swing.JLabel();
        lb_ejemplares_disponibles = new javax.swing.JLabel();
        lb_fecha_publicacion = new javax.swing.JLabel();
        lb_genero = new javax.swing.JLabel();
        txtxf_isbn = new javax.swing.JTextField();
        txtxf_titulo = new javax.swing.JTextField();
        txtxf_editorial = new javax.swing.JTextField();
        spn_ejemplares_disponibles = new javax.swing.JSpinner();
        dtc_fecha_publicacion = new com.toedter.calendar.JDateChooser();
        txtxf_genero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_libros = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lb_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulo.setText("Formulario para libros");

        lb_isbn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_isbn.setForeground(new java.awt.Color(0, 0, 0));
        lb_isbn.setText("ISNB:");

        lb_titulo_libro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_titulo_libro.setForeground(new java.awt.Color(0, 0, 0));
        lb_titulo_libro.setText("Titulo:");

        lb_editorial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_editorial.setForeground(new java.awt.Color(0, 0, 0));
        lb_editorial.setText("Editorial:");

        lb_ejemplares_disponibles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_ejemplares_disponibles.setForeground(new java.awt.Color(0, 0, 0));
        lb_ejemplares_disponibles.setText("Ejemplares disponibles:");

        lb_fecha_publicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_fecha_publicacion.setForeground(new java.awt.Color(0, 0, 0));
        lb_fecha_publicacion.setText("Fecha de publicación:");

        lb_genero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_genero.setForeground(new java.awt.Color(0, 0, 0));
        lb_genero.setText("Genéro:");

        spn_ejemplares_disponibles.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        dtc_fecha_publicacion.setDateFormatString("dd/MM/y");

        tbl_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Titulo", "Editorial", "Ejemplares disponibles", "fecha de publicación", "Genéro"
            }
        ));
        jScrollPane1.setViewportView(tbl_libros);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_genero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtxf_genero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_ejemplares_disponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spn_ejemplares_disponibles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_titulo_libro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtxf_titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_isbn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtxf_isbn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_fecha_publicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtc_fecha_publicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_editorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtxf_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_titulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_titulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_isbn))
                                    .addComponent(txtxf_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_titulo_libro)
                                    .addComponent(txtxf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_editorial)
                                    .addComponent(txtxf_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_ejemplares_disponibles)
                                    .addComponent(spn_ejemplares_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_fecha_publicacion))
                            .addComponent(dtc_fecha_publicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_genero)
                            .addComponent(txtxf_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar)
                            .addComponent(btn_eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(btn_modificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        try {
            String isbn = txtxf_isbn.getText();
            String titulo = txtxf_titulo.getText();
            String editorial = txtxf_editorial.getText();
            int Ejemplares_disponibles = (int) spn_ejemplares_disponibles.getValue();
            Date fecha_publicacion = dtc_fecha_publicacion.getDate();
            String genero = txtxf_genero.getText();
            
            Libro l = new Libro(isbn, titulo, editorial, Ejemplares_disponibles, fecha_publicacion, genero);
            LibroDAO dao = new LibroDAO();
            JOptionPane.showMessageDialog(null, dao.agregar_libro(l) ? "Libro agregado exitosamente!" : "ERROR: el libro ya existe!");
            cargar_tabla();
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        try {
            String isbn = txtxf_isbn.getText();
            LibroDAO dao = new LibroDAO();
            Libro l = dao.buscar_libro(isbn);
            txtxf_titulo.setText(l.getTitulo());
            txtxf_editorial.setText(l.getEditorial());
            spn_ejemplares_disponibles.setValue(l.getEjemplares_disponibles());
            dtc_fecha_publicacion.setDate(l.getFecha_publicacion());
            txtxf_genero.setText(l.getGenero());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        try {
            String isbn = txtxf_isbn.getText();
            
            LibroDAO dao = new LibroDAO();
            JOptionPane.showMessageDialog(null, dao.eliminar_libro(isbn) ? "Libro eliminado exitosamente!" : "ERROR: el libro no existe!");
            cargar_tabla();
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        try {
            String isbn = txtxf_isbn.getText();
            String titulo = txtxf_titulo.getText();
            String editorial = txtxf_editorial.getText();
            int Ejemplares_disponibles = (int) spn_ejemplares_disponibles.getValue();
            Date fecha_publicacion = dtc_fecha_publicacion.getDate();
            String genero = txtxf_genero.getText();
            
            Libro l = new Libro(isbn, titulo, editorial, Ejemplares_disponibles, fecha_publicacion, genero);
            LibroDAO dao = new LibroDAO();
            JOptionPane.showMessageDialog(null, dao.modificar_libro(l) ? "Libro modificado exitosamente!" : "ERROR: el libro no existe!");
            cargar_tabla();
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private com.toedter.calendar.JDateChooser dtc_fecha_publicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_editorial;
    private javax.swing.JLabel lb_ejemplares_disponibles;
    private javax.swing.JLabel lb_fecha_publicacion;
    private javax.swing.JLabel lb_genero;
    private javax.swing.JLabel lb_isbn;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo_libro;
    private javax.swing.JSpinner spn_ejemplares_disponibles;
    private javax.swing.JTable tbl_libros;
    private javax.swing.JTextField txtxf_editorial;
    private javax.swing.JTextField txtxf_genero;
    private javax.swing.JTextField txtxf_isbn;
    private javax.swing.JTextField txtxf_titulo;
    // End of variables declaration//GEN-END:variables
}
