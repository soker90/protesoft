package presentacion;

import dominio.GestorVoluntarios;
import dominio.Imagen;
import dominio.PanelP;
import dominio.Voluntario;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Properties;
import javax.swing.JOptionPane;

public class PanelPerfil extends PanelP {

    private Imagen img;
    private int cont;
    public PanelPerfil() {
        initComponents();
        Voluntario v = GestorVoluntarios.SeleccionarVoluntario(FormInicio.id);
        txtDni.setText(v.getDni());
        txtNombre.setText(v.getNombre());
        txtApellido.setText(v.getApellidos());
        txtEdad.setText(v.getEdad());
        txtDireccion.setText(v.getDireccion());
        txtPoblacion.setText(v.getPoblacion());
        txtProvincia.setText(v.getProvincia());
        txtFecha.setText(v.getFecha_nacimiento());
        txtTelefono.setText(v.getTelefono());
        if(v.getConocimientos())
            rbConocimientosS.setSelected(true);
        else
            rbConocimientosN.setSelected(true);
        txtZona.setText(v.getDisponibilidad());
        txtHorario.setText(v.getHorario());
        cont = 0;
       this.cargarImagen();
        Properties propiedad = FormInicio.propiedades;
       lblNombre.setText(propiedad.getProperty("Nombre"));
       lblApellidos.setText(propiedad.getProperty("Apellidos"));
       lblEdad.setText(propiedad.getProperty("Edad"));
       lblDireccion.setText(propiedad.getProperty("Direccion"));
       lblPoblacion.setText(propiedad.getProperty("Poblacion"));
       lblProvincia.setText(propiedad.getProperty("Provincia"));
       lblFecha.setText(propiedad.getProperty("Fecha"));
       lblTelefono.setText(propiedad.getProperty("Telefono"));
       lblConocimientos.setText(propiedad.getProperty("Conocimientos"));
       lblVeterinarios.setText(propiedad.getProperty("veterinarios"));
       lblZona.setText(propiedad.getProperty("Zona"));
       lblHorario.setText(propiedad.getProperty("Horario"));
       btnImagen.setText(propiedad.getProperty("AnadirImagen"));
       btnAceptar.setText(propiedad.getProperty("Aceptar"));
       rbConocimientosS.setText(propiedad.getProperty("Si"));
       rbConocimientosN.setText(propiedad.getProperty("No"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblPoblacion = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        lblProvincia = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        rbConocimientosN = new javax.swing.JRadioButton();
        rbConocimientosS = new javax.swing.JRadioButton();
        lblConocimientos = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblVeterinarios = new javax.swing.JLabel();
        lblZona = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtZona = new javax.swing.JTextArea();
        lblHorario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHorario = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnImagen = new javax.swing.JButton();
        pnlImagen = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        lblDni.setText("DNI");

        lblApellidos.setText("Apellidos");

        lblEdad.setText("Edad");

        lblDireccion.setText("Dirección");

        lblPoblacion.setText("Población");

        lblProvincia.setText("Provincia");

        lblFecha.setText("Fecha de nacimiento");

        rbConocimientosN.setText("No");
        rbConocimientosN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConocimientosNActionPerformed(evt);
            }
        });

        rbConocimientosS.setText("Si");
        rbConocimientosS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConocimientosSActionPerformed(evt);
            }
        });

        lblConocimientos.setText("Conocimientos");

        lblTelefono.setText("Telefono");

        lblVeterinarios.setText("veterinarios");

        lblZona.setText("Zona de disponibilidad");

        txtZona.setColumns(20);
        txtZona.setRows(5);
        jScrollPane1.setViewportView(txtZona);

        lblHorario.setText("Horario disponible");

        txtHorario.setColumns(20);
        txtHorario.setRows(5);
        jScrollPane2.setViewportView(txtHorario);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnImagen.setText("Añadir Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlImagenLayout = new javax.swing.GroupLayout(pnlImagen);
        pnlImagen.setLayout(pnlImagenLayout);
        pnlImagenLayout.setHorizontalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );
        pnlImagenLayout.setVerticalGroup(
            pnlImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        lblNombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPoblacion)
                                    .addComponent(lblProvincia)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblConocimientos)
                                    .addComponent(lblVeterinarios))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbConocimientosS)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbConocimientosN))
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblZona)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidos)
                            .addComponent(lblDni)
                            .addComponent(lblNombre)
                            .addComponent(lblEdad)
                            .addComponent(lblDireccion))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtDni)
                            .addComponent(txtPoblacion)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEdad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblHorario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImagen)
                            .addComponent(pnlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPoblacion)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvincia)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConocimientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbConocimientosS)
                        .addComponent(rbConocimientosN))
                    .addComponent(lblVeterinarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblZona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagen)
                    .addComponent(btnAceptar))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        add(jScrollPane3, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void rbConocimientosSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConocimientosSActionPerformed
        rbConocimientosS.setSelected(true);
        rbConocimientosN.setSelected(false);
    }//GEN-LAST:event_rbConocimientosSActionPerformed

    private void rbConocimientosNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConocimientosNActionPerformed
        rbConocimientosS.setSelected(false);
        rbConocimientosN.setSelected(true);
    }//GEN-LAST:event_rbConocimientosNActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser fc = new JFileChooser();
        File destino = new File("Voluntarios"+File.separatorChar+FormInicio.id+".jpg");
        int respuesta = fc.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION)
        {
            File origen=fc.getSelectedFile();

            try{
                FileChannel in = (new FileInputStream(origen)).getChannel();
                FileChannel out = (new FileOutputStream(destino)).getChannel();
                in.transferTo(0, origen.length(), out);
                in.close();
                out.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        cargarImagen();
    }//GEN-LAST:event_btnImagenActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        GestorVoluntarios.ModificarVoluntario(FormInicio.id, txtDni.getText(), 
                txtNombre.getText(),txtApellido.getText(), txtEdad.getText(),
                txtDireccion.getText(), txtPoblacion.getText(), txtProvincia.getText(),
                txtFecha.getText(), txtTelefono.getText(), rbConocimientosS.isSelected(),
                txtZona.getText(), txtHorario.getText());
        
        JOptionPane.showMessageDialog(this, "Perfil actualizado", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cargarImagen()
    {
        String sDirectorio = "Voluntarios"+File.separatorChar+FormInicio.id+".jpg";
        File f = new File(sDirectorio);
        File mk = new File("Voluntarios");
        
        if(mk.exists())
        {
            if(f.exists()){
                if(cont > 0)
                    pnlImagen.remove(img);
                cont++;
                this.img = new Imagen(150,150,f.getAbsolutePath());
                pnlImagen.add(this.img);
                pnlImagen.repaint();
            }
        }
        else
            mk.mkdir();
    }
    
    public void setFont(int numero)
    {
        String nombre = lblApellidos.getFont().getName();
        int estilo = lblApellidos.getFont().getStyle();
        lblApellidos.setFont(new Font(nombre, estilo, numero));
        lblConocimientos.setFont(new Font(nombre, estilo, numero));
        lblDireccion.setFont(new Font(nombre, estilo, numero));
        lblDni.setFont(new Font(nombre, estilo, numero));
        lblEdad.setFont(new Font(nombre, estilo, numero));
        lblFecha.setFont(new Font(nombre, estilo, numero));
        lblHorario.setFont(new Font(nombre, estilo, numero));
        lblNombre.setFont(new Font(nombre, estilo, numero));
        lblPoblacion.setFont(new Font(nombre, estilo, numero));
        lblProvincia.setFont(new Font(nombre, estilo, numero));
        lblTelefono.setFont(new Font(nombre, estilo, numero));
        lblVeterinarios.setFont(new Font(nombre, estilo, numero));
        lblZona.setFont(new Font(nombre, estilo, numero));
        txtApellido.setFont(new Font(nombre, estilo, numero));
        txtDireccion.setFont(new Font(nombre, estilo, numero));
        txtDni.setFont(new Font(nombre, estilo, numero));
        txtEdad.setFont(new Font(nombre, estilo, numero));
        txtFecha.setFont(new Font(nombre, estilo, numero));
        txtHorario.setFont(new Font(nombre, estilo, numero));
        txtNombre.setFont(new Font(nombre, estilo, numero));
        txtPoblacion.setFont(new Font(nombre, estilo, numero));
        txtProvincia.setFont(new Font(nombre, estilo, numero));
        txtTelefono.setFont(new Font(nombre, estilo, numero));
        txtZona.setFont(new Font(nombre, estilo, numero));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblConocimientos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblVeterinarios;
    private javax.swing.JLabel lblZona;
    private javax.swing.JPanel pnlImagen;
    private javax.swing.JRadioButton rbConocimientosN;
    private javax.swing.JRadioButton rbConocimientosS;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextArea txtZona;
    // End of variables declaration//GEN-END:variables
}
