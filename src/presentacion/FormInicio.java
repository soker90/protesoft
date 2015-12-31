package presentacion;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class FormInicio extends javax.swing.JFrame {

    public static JPanel pnlActual;
    public static JPanel pnlPrincipal;
    public FormInicio() {
        initComponents();
        pnlBotones.setVisible(false);
        PanelLogin pnlLogin = new PanelLogin(pnlBotones);
        pnlInicio.add(pnlLogin,"menu1");
        CardLayout paletas = (CardLayout)(pnlInicio.getLayout()); 
        pnlPrincipal = pnlInicio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInicio = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnPerros = new javax.swing.JButton();
        btnVoluntarios = new javax.swing.JButton();
        btnEspacio = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2);

        pnlInicio.setLayout(new java.awt.CardLayout());

        btnPerros.setText("Perros");
        btnPerros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerrosActionPerformed(evt);
            }
        });

        btnVoluntarios.setText("Voluntarios");
        btnVoluntarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoluntariosActionPerformed(evt);
            }
        });

        btnEspacio.setText("Espacio");
        btnEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacioActionPerformed(evt);
            }
        });

        btnPerfil.setText("Perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoluntarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPerros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnPerros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoluntarios)
                .addGap(18, 18, 18)
                .addComponent(btnEspacio)
                .addGap(18, 18, 18)
                .addComponent(btnPerfil)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(393, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 545, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerrosActionPerformed
        PanelPerrosLista pnlPerros = new PanelPerrosLista();
        pnlInicio.add(pnlPerros,"menuP");
        CardLayout paletas = (CardLayout)(pnlPerros.getLayout());
        pnlInicio.remove(pnlActual);
        pnlActual = pnlPerros;
    }//GEN-LAST:event_btnPerrosActionPerformed

    private void btnVoluntariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoluntariosActionPerformed
        PanelVoluntarios pnlVoluntarios = new PanelVoluntarios();
        pnlInicio.add(pnlVoluntarios,"menuV");
        CardLayout paletas = (CardLayout)(pnlVoluntarios.getLayout());
        pnlInicio.remove(pnlActual);
        pnlActual = pnlVoluntarios;
    }//GEN-LAST:event_btnVoluntariosActionPerformed

    private void btnEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacioActionPerformed
        PanelEspacio pnlEspacio = new PanelEspacio();
        pnlInicio.add(pnlEspacio,"menuE");
        CardLayout paletas = (CardLayout)(pnlEspacio.getLayout());
        pnlInicio.remove(pnlActual);
        pnlActual = pnlEspacio;
    }//GEN-LAST:event_btnEspacioActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        PanelPerfil pnlPerfil = new PanelPerfil();
        pnlInicio.add(pnlPerfil,"menuPe");
        CardLayout paletas = (CardLayout)(pnlPerfil.getLayout());
        pnlInicio.remove(pnlActual);
        pnlActual = pnlPerfil;
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


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
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspacio;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPerros;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVoluntarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlInicio;
    // End of variables declaration//GEN-END:variables
}
