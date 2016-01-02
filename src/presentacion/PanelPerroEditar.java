package presentacion;

import dominio.GestorPerros;
import dominio.Imagen;
import dominio.PanelP;
import dominio.Perro;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Properties;

public class PanelPerroEditar extends PanelP {

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
       Properties propiedad = FormInicio.propiedades;
       lblNombre.setText(propiedad.getProperty("Nombre"));
       lblSexo.setText(propiedad.getProperty("Sexo"));
       lblRaza.setText(propiedad.getProperty("Raza"));
       lblTamano.setText(propiedad.getProperty("Tamano"));
       lblEdad.setText(propiedad.getProperty("Edad"));
       lblFecha.setText(propiedad.getProperty("FechaEntrada"));
       lblChip.setText(propiedad.getProperty("Chip"));
       lblCachorro.setText(propiedad.getProperty("Cachorro"));
       lblVacunado.setText(propiedad.getProperty("Vacunado"));
       lblEsterilizado.setText(propiedad.getProperty("Esterilizado"));
       lblEnfermedades.setText(propiedad.getProperty("Enfermedades"));
       lblDescripcion.setText(propiedad.getProperty("Descripcion"));
       lblVideo.setText(propiedad.getProperty("Video"));
       btnImagen.setText(propiedad.getProperty("AnadirImagen"));
       btnAceptar.setText(propiedad.getProperty("Aceptar"));
        setFont(FormInicio.fuente);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        rbSexoM = new javax.swing.JRadioButton();
        rbSexoH = new javax.swing.JRadioButton();
        lblRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        lblTamano = new javax.swing.JLabel();
        txtTamanyo = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblChip = new javax.swing.JLabel();
        txtChip = new javax.swing.JTextField();
        rbChipS = new javax.swing.JRadioButton();
        rbChipN = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        lblCachorro = new javax.swing.JLabel();
        rbCachorroS = new javax.swing.JRadioButton();
        rbCachorroN = new javax.swing.JRadioButton();
        rbPppN = new javax.swing.JRadioButton();
        rbPppS = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        lblVacunado = new javax.swing.JLabel();
        rbVacunadoS = new javax.swing.JRadioButton();
        rbVacunadoN = new javax.swing.JRadioButton();
        lblEsterilizado = new javax.swing.JLabel();
        rbEsterilizadoS = new javax.swing.JRadioButton();
        rbEsterilizadoN = new javax.swing.JRadioButton();
        lblEnfermedades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEnfermedades = new javax.swing.JTextArea();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblVideo = new javax.swing.JLabel();
        txtVideo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnImagen = new javax.swing.JButton();
        pnlImagenesP = new javax.swing.JScrollPane();
        pnlImagenes = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        lblNombre.setText("Nombre");

        lblSexo.setText("Sexo");

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

        lblRaza.setText("Raza");

        lblTamano.setText("Tamaño");

        lblEdad.setText("Edad");

        lblFecha.setText("Fecha entrada");

        lblChip.setText("Tiene chip");

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

        lblCachorro.setText("Cachorro");

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

        lblVacunado.setText("Vacunado");

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

        lblEsterilizado.setText("Esterilizado");

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

        lblEnfermedades.setText("Enfermedades y tratamientos");

        txtEnfermedades.setColumns(20);
        txtEnfermedades.setRows(5);
        jScrollPane1.setViewportView(txtEnfermedades);

        lblDescripcion.setText("Descripción");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblVideo.setText("Video");

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
                                .addComponent(lblEdad)
                                .addGap(74, 74, 74)
                                .addComponent(txtEdad))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTamano)
                                .addGap(53, 53, 53)
                                .addComponent(txtTamanyo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRaza)
                                .addGap(75, 75, 75)
                                .addComponent(txtRaza))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(52, 52, 52)
                                .addComponent(txtNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFecha)
                                            .addComponent(lblChip)
                                            .addComponent(lblCachorro)
                                            .addComponent(lblVacunado)
                                            .addComponent(jLabel10)
                                            .addComponent(lblEsterilizado))
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
                                                .addComponent(lblVideo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtVideo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEnfermedades)
                                                    .addComponent(lblDescripcion))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnImagen)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(pnlImagenesP))))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSexo)
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
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rbSexoM)
                    .addComponent(rbSexoH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTamano)
                    .addComponent(txtTamanyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChip)
                    .addComponent(rbChipS)
                    .addComponent(rbChipN)
                    .addComponent(jLabel8)
                    .addComponent(txtChip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCachorroS)
                    .addComponent(rbCachorroN)
                    .addComponent(lblCachorro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVacunadoS)
                    .addComponent(rbVacunadoN)
                    .addComponent(lblVacunado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbPppS)
                    .addComponent(rbPppN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEsterilizado)
                    .addComponent(rbEsterilizadoS)
                    .addComponent(rbEsterilizadoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnfermedades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVideo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImagen)
                .addGap(18, 18, 18)
                .addComponent(pnlImagenesP)
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
    
    public void setFont(int numero) {
        String nombre = lblCachorro.getFont().getName();
        int estilo = lblCachorro.getFont().getStyle();
        lblCachorro.setFont(new Font(nombre, estilo, numero));
        lblChip.setFont(new Font(nombre, estilo, numero));
        lblDescripcion.setFont(new Font(nombre, estilo, numero));
        lblEdad.setFont(new Font(nombre, estilo, numero));
        lblEnfermedades.setFont(new Font(nombre, estilo, numero));
        lblEsterilizado.setFont(new Font(nombre, estilo, numero));
        lblFecha.setFont(new Font(nombre, estilo, numero));
        lblNombre.setFont(new Font(nombre, estilo, numero));
        lblRaza.setFont(new Font(nombre, estilo, numero));
        lblSexo.setFont(new Font(nombre, estilo, numero));
        lblTamano.setFont(new Font(nombre, estilo, numero));
        lblVacunado.setFont(new Font(nombre, estilo, numero));
        lblVideo.setFont(new Font(nombre, estilo, numero));
        txtChip.setFont(new Font(nombre, estilo, numero));
        txtDescripcion.setFont(new Font(nombre, estilo, numero));
        txtEdad.setFont(new Font(nombre, estilo, numero));
        txtEnfermedades.setFont(new Font(nombre, estilo, numero));
        txtFecha.setFont(new Font(nombre, estilo, numero));
        txtNombre.setFont(new Font(nombre, estilo, numero));
        txtRaza.setFont(new Font(nombre, estilo, numero));
        txtTamanyo.setFont(new Font(nombre, estilo, numero));
        txtVideo.setFont(new Font(nombre, estilo, numero));
        rbCachorroN.setFont(new Font(nombre, estilo, numero));
        rbCachorroS.setFont(new Font(nombre, estilo, numero));
        rbChipN.setFont(new Font(nombre, estilo, numero));
        rbChipS.setFont(new Font(nombre, estilo, numero));
        rbEsterilizadoN.setFont(new Font(nombre, estilo, numero));
        rbEsterilizadoS.setFont(new Font(nombre, estilo, numero));
        rbPppN.setFont(new Font(nombre, estilo, numero));
        rbPppS.setFont(new Font(nombre, estilo, numero));
        rbSexoH.setFont(new Font(nombre, estilo, numero));
        rbSexoM.setFont(new Font(nombre, estilo, numero));
        rbVacunadoN.setFont(new Font(nombre, estilo, numero));
        rbVacunadoS.setFont(new Font(nombre, estilo, numero));
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCachorro;
    private javax.swing.JLabel lblChip;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEnfermedades;
    private javax.swing.JLabel lblEsterilizado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTamano;
    private javax.swing.JLabel lblVacunado;
    private javax.swing.JLabel lblVideo;
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
