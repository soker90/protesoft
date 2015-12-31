package presentacion;

import dominio.GestorPerros;
import dominio.Imagen;
import dominio.Perro;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.io.File;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;

public class PanelPerroEditar extends javax.swing.JPanel {

    private int id;
    public PanelPerroEditar(int id) {
        initComponents();
        this.id = id;
        Perro p = GestorPerros.SeleccionarPerro(id);
        txtNombre.setText(p.getNombre());
        if(p.isSexo())
            rbSexoM.setSelected(true);
        else
            rbSexoH.setSelected(true);
        txtRaza.setText(p.getRaza());
        txtTamanyo.setText(p.getTamanyo());
        txtEdad.setText(p.getEdad());
        txtFecha.setText(p.getFecha());
        if(p.isChip())
            rbChipS.setSelected(true);
        else
            rbChipN.setSelected(true);
        if(p.isCachorro())
            rbCachorroS.setSelected(true);
        else
            rbCachorroN.setSelected(true);
        if(p.isVacunado())
            rbVacunadoS.setSelected(true);
        else
            rbVacunadoN.setSelected(true);
        if(p.isPpp())
            rbPppS.setSelected(true);
        else
            rbPppN.setSelected(true);
        if(p.isEsterilizado())
            rbEsterilizadoS.setSelected(true);
        else
            rbEsterilizadoN.setSelected(true);
        txtChip.setText(p.getNumero_chip());
        txtEnfermedades.setText(p.getEnfermedades());
        txtDescripcion.setText(p.getDescripcion());
        txtVideo.setText(p.getVideo());
       this.cargarImagenes();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbSexoM = new javax.swing.JRadioButton();
        rbSexoH = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTamanyo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtChip = new javax.swing.JTextField();
        rbChipS = new javax.swing.JRadioButton();
        rbChipN = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbCachorroS = new javax.swing.JRadioButton();
        rbCachorroN = new javax.swing.JRadioButton();
        rbPppN = new javax.swing.JRadioButton();
        rbPppS = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbVacunadoS = new javax.swing.JRadioButton();
        rbVacunadoN = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbEsterilizadoS = new javax.swing.JRadioButton();
        rbEsterilizadoN = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEnfermedades = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        txtVideo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnImagen = new javax.swing.JButton();
        pnlImagenesP = new javax.swing.JScrollPane();
        pnlImagenes = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setText("Nombre");

        jLabel2.setText("Sexo");

        rbSexoM.setText("Macho");
        rbSexoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSexoMActionPerformed(evt);
            }
        });

        rbSexoH.setText("Hembra");
        rbSexoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSexoHActionPerformed(evt);
            }
        });

        jLabel3.setText("Raza");

        jLabel4.setText("Tamaño");

        jLabel5.setText("Edad");

        jLabel6.setText("Fecha entrada");

        jLabel7.setText("Tiene chip");

        rbChipS.setText("Si");
        rbChipS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChipSActionPerformed(evt);
            }
        });

        rbChipN.setText("No");
        rbChipN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChipNActionPerformed(evt);
            }
        });

        jLabel8.setText("Nº");

        jLabel9.setText("Cachorro");

        rbCachorroS.setText("Si");
        rbCachorroS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCachorroSActionPerformed(evt);
            }
        });

        rbCachorroN.setText("No");
        rbCachorroN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCachorroNActionPerformed(evt);
            }
        });

        rbPppN.setText("No");
        rbPppN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPppNActionPerformed(evt);
            }
        });

        rbPppS.setText("Si");
        rbPppS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPppSActionPerformed(evt);
            }
        });

        jLabel10.setText("PPP");

        jLabel11.setText("Vacunado");

        rbVacunadoS.setText("Si");
        rbVacunadoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVacunadoSActionPerformed(evt);
            }
        });

        rbVacunadoN.setText("No");
        rbVacunadoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVacunadoNActionPerformed(evt);
            }
        });

        jLabel12.setText("Esterilizado");

        rbEsterilizadoS.setText("Si");
        rbEsterilizadoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEsterilizadoSActionPerformed(evt);
            }
        });

        rbEsterilizadoN.setText("No");
        rbEsterilizadoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEsterilizadoNActionPerformed(evt);
            }
        });

        jLabel13.setText("Enfermedades y tratamientos");

        txtEnfermedades.setColumns(20);
        txtEnfermedades.setRows(5);
        jScrollPane1.setViewportView(txtEnfermedades);

        jLabel14.setText("Descripción");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel15.setText("Video");

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

        pnlImagenesP.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pnlImagenesP.setOpaque(false);

        javax.swing.GroupLayout pnlImagenesLayout = new javax.swing.GroupLayout(pnlImagenes);
        pnlImagenes.setLayout(pnlImagenesLayout);
        pnlImagenesLayout.setHorizontalGroup(
            pnlImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        pnlImagenesLayout.setVerticalGroup(
            pnlImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        pnlImagenesP.setViewportView(pnlImagenes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(74, 74, 74)
                                .addComponent(txtEdad))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(txtTamanyo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(75, 75, 75)
                                .addComponent(txtRaza))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(txtNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFecha)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rbCachorroS)
                                                    .addComponent(rbChipS)
                                                    .addComponent(rbVacunadoS)
                                                    .addComponent(rbPppS)
                                                    .addComponent(rbEsterilizadoS))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(rbChipN)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtChip))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(rbCachorroN)
                                                            .addComponent(rbVacunadoN)
                                                            .addComponent(rbPppN)
                                                            .addComponent(rbEsterilizadoN))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1)
                                            .addComponent(jScrollPane2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtVideo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel14))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnImagen)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pnlImagenesP))))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)
                        .addComponent(rbSexoM)
                        .addGap(18, 18, 18)
                        .addComponent(rbSexoH)
                        .addGap(161, 161, 161))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbSexoM)
                    .addComponent(rbSexoH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTamanyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbChipS)
                    .addComponent(rbChipN)
                    .addComponent(jLabel8)
                    .addComponent(txtChip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCachorroS)
                    .addComponent(rbCachorroN)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVacunadoS)
                    .addComponent(rbVacunadoN)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbPppS)
                    .addComponent(rbPppN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rbEsterilizadoS)
                    .addComponent(rbEsterilizadoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImagen)
                .addGap(18, 18, 18)
                .addComponent(pnlImagenesP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        add(jScrollPane3, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void rbSexoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSexoMActionPerformed
        rbSexoM.setSelected(true);
        rbSexoH.setSelected(false);
    }//GEN-LAST:event_rbSexoMActionPerformed

    private void rbSexoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSexoHActionPerformed
        rbSexoM.setSelected(false);
        rbSexoH.setSelected(true);
    }//GEN-LAST:event_rbSexoHActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        boolean e = GestorPerros.ModificarPerro(this.id, txtNombre.getText(), 
                rbSexoM.isSelected(),txtRaza.getText(), txtTamanyo.getText(),
                txtEdad.getText(), txtFecha.getText(), rbChipS.isSelected(),
                txtChip.getText(), rbCachorroS.isSelected(), rbPppS.isSelected(),
                rbVacunadoS.isSelected(), rbEsterilizadoS.isSelected(),
                txtEnfermedades.getText(), txtDescripcion.getText(), 
                txtVideo.getText());
        
        PanelPerrosLista pnlperro = new PanelPerrosLista();
        FormInicio.pnlPrincipal.add(pnlperro,"menu2");
        CardLayout paletas = (CardLayout)(pnlperro.getLayout());
        FormInicio.pnlPrincipal.remove(FormInicio.pnlActual);
        FormInicio.pnlActual = pnlperro;
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rbChipSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChipSActionPerformed
        rbChipS.setSelected(true);
        rbChipN.setSelected(false);
    }//GEN-LAST:event_rbChipSActionPerformed

    private void rbChipNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChipNActionPerformed
        rbChipS.setSelected(false);
        rbChipN.setSelected(true);
    }//GEN-LAST:event_rbChipNActionPerformed

    private void rbCachorroSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCachorroSActionPerformed
        rbCachorroS.setSelected(true);
        rbCachorroN.setSelected(false);
    }//GEN-LAST:event_rbCachorroSActionPerformed

    private void rbCachorroNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCachorroNActionPerformed
        rbCachorroS.setSelected(false);
        rbCachorroN.setSelected(true);
    }//GEN-LAST:event_rbCachorroNActionPerformed

    private void rbVacunadoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVacunadoSActionPerformed
        rbVacunadoS.setSelected(true);
        rbVacunadoN.setSelected(false);
    }//GEN-LAST:event_rbVacunadoSActionPerformed

    private void rbVacunadoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVacunadoNActionPerformed
        rbVacunadoS.setSelected(false);
        rbVacunadoN.setSelected(true);
    }//GEN-LAST:event_rbVacunadoNActionPerformed

    private void rbPppSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPppSActionPerformed
        rbPppS.setSelected(true);
        rbPppN.setSelected(false);
    }//GEN-LAST:event_rbPppSActionPerformed

    private void rbPppNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPppNActionPerformed
        rbPppS.setSelected(false);
        rbPppN.setSelected(true);
    }//GEN-LAST:event_rbPppNActionPerformed

    private void rbEsterilizadoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEsterilizadoSActionPerformed
        rbEsterilizadoS.setSelected(false);
        rbEsterilizadoN.setSelected(true);
    }//GEN-LAST:event_rbEsterilizadoSActionPerformed

    private void rbEsterilizadoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEsterilizadoNActionPerformed
        rbEsterilizadoS.setSelected(true);
        rbEsterilizadoN.setSelected(false);
    }//GEN-LAST:event_rbEsterilizadoNActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed

        JFileChooser fc = new JFileChooser();
        File destino = new File("Perros"+File.separatorChar+this.id);
        int respuesta = fc.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION)
        {
            File nombre = new File("Perros"+File.separatorChar+this.id+
                    File.separatorChar+fc.getSelectedFile().getName());
            File origen=fc.getSelectedFile();
            
            try{
              FileChannel in = (new FileInputStream(origen)).getChannel();
              FileChannel out = (new FileOutputStream(nombre)).getChannel();
              in.transferTo(0, origen.length(), out);
              in.close();
              out.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        cargarImagenes();
    }//GEN-LAST:event_btnImagenActionPerformed

    private void cargarImagenes()
    {
        String sDirectorio = "Perros"+File.separatorChar+this.id;
        File f = new File(sDirectorio);
        int espacio = 150;
        if (f.exists()){
            File[] ficheros = f.listFiles();
            for (int x=0;x<ficheros.length;x++){
                pnlImagenes.add(new Imagen(espacio,150,ficheros[x].getAbsolutePath()));
                espacio += 150;
            }
            pnlImagenes.repaint();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlImagenes;
    private javax.swing.JScrollPane pnlImagenesP;
    private javax.swing.JRadioButton rbCachorroN;
    private javax.swing.JRadioButton rbCachorroS;
    private javax.swing.JRadioButton rbChipN;
    private javax.swing.JRadioButton rbChipS;
    private javax.swing.JRadioButton rbEsterilizadoN;
    private javax.swing.JRadioButton rbEsterilizadoS;
    private javax.swing.JRadioButton rbPppN;
    private javax.swing.JRadioButton rbPppS;
    private javax.swing.JRadioButton rbSexoH;
    private javax.swing.JRadioButton rbSexoM;
    private javax.swing.JRadioButton rbVacunadoN;
    private javax.swing.JRadioButton rbVacunadoS;
    private javax.swing.JTextField txtChip;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtEnfermedades;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTamanyo;
    private javax.swing.JTextField txtVideo;
    // End of variables declaration//GEN-END:variables
}
