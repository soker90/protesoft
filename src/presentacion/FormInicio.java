package presentacion;

import dominio.GestorUsuarios;
import dominio.PanelP;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import propiedades.Propiedades;

public class FormInicio extends javax.swing.JFrame {

    public static JPanel pnlActual;
    public static JPanel pnlPrincipal;
    public static Properties propiedades;
    public static int fuente;
    public static int id;
    public FormInicio() {
        initComponents();
        fuente = 12;
        cargarIdioma("Espanol");
        pnlBotones.setVisible(false);
        PanelLogin pnlLogin = new PanelLogin(pnlBotones,this);
        pnlInicio.add(pnlLogin,"menu1");
        CardLayout paletas = (CardLayout)(pnlInicio.getLayout()); 
        pnlPrincipal = pnlInicio;
        id=0;
        pnlActual = pnlLogin;
        
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
        lblUsuario = new javax.swing.JLabel();
        lblConexion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();
        mAccesibilidad = new javax.swing.JMenu();
        miPequeno = new javax.swing.JMenuItem();
        miMediana = new javax.swing.JMenuItem();
        miGrande = new javax.swing.JMenuItem();
        mAyuda = new javax.swing.JMenu();
        miAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(2);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
                .addContainerGap(327, Short.MAX_VALUE))
        );

        mArchivo.setText("Archivo");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        jMenuBar1.add(mArchivo);

        mAccesibilidad.setText("Fuente");

        miPequeno.setText("Pequeña");
        miPequeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPequenoActionPerformed(evt);
            }
        });
        mAccesibilidad.add(miPequeno);

        miMediana.setText("Mediana");
        miMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMedianaActionPerformed(evt);
            }
        });
        mAccesibilidad.add(miMediana);

        miGrande.setText("Grande");
        miGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrandeActionPerformed(evt);
            }
        });
        mAccesibilidad.add(miGrande);

        jMenuBar1.add(mAccesibilidad);

        mAyuda.setText("Ayuda");

        miAcerca.setText("Acerca de");
        miAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaActionPerformed(evt);
            }
        });
        mAyuda.add(miAcerca);

        jMenuBar1.add(mAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 545, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConexion)
                .addGap(203, 203, 203))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblConexion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
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
        PanelVoluntariosLista pnlVoluntarios = new PanelVoluntariosLista();
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(id!=0)
            GestorUsuarios.ActualizarConexion();
    }//GEN-LAST:event_formWindowClosing

    private void miPequenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPequenoActionPerformed
        ((PanelP)pnlActual).setFont(8);
        setFont(8);
        fuente=8;
    }//GEN-LAST:event_miPequenoActionPerformed

    private void miMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMedianaActionPerformed
        ((PanelP)pnlActual).setFont(12);
        setFont(12);
        fuente=12;
    }//GEN-LAST:event_miMedianaActionPerformed

    private void miGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrandeActionPerformed
        ((PanelP)pnlActual).setFont(16);
        setFont(16);
        fuente=16;
    }//GEN-LAST:event_miGrandeActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_miSalirActionPerformed

    private void miAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaActionPerformed
        JOptionPane.showMessageDialog(this, "ProteSoft v1.0"
                + "\nAutor: Eduardo Parra Mazuecos"
                + "\nLicencia GPLv3", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miAcercaActionPerformed

    public void cargarUsuario()
    {
        String[] datos = GestorUsuarios.Logear(id);
        lblUsuario.setText(propiedades.getProperty("Usuario")+": "+datos[1]);
        lblConexion.setText(propiedades.getProperty("UltimaConexion")+": "+datos[0]);
    }

    public void cargarIdioma(String idioma)
    {
        propiedades = new Propiedades(idioma);
        btnEspacio.setText(propiedades.getProperty("Espacio"));
        btnPerfil.setText(propiedades.getProperty("Perfil"));
        btnPerros.setText(propiedades.getProperty("Perros"));
        btnSalir.setText(propiedades.getProperty("Salir"));
        btnVoluntarios.setText(propiedades.getProperty("Voluntarios"));
        mAccesibilidad.setText(propiedades.getProperty("Accesibilidad"));
        mArchivo.setText(propiedades.getProperty("Archivo"));
        mAyuda.setText(propiedades.getProperty("Ayuda"));
        miPequeno.setText(propiedades.getProperty("Pequena"));
        miMediana.setText(propiedades.getProperty("Mediana"));
        miGrande.setText(propiedades.getProperty("Grande"));
        miSalir.setText(propiedades.getProperty("Salir"));
    }
    
    public void setFont(int numero)
    {
        String nombre = lblConexion.getFont().getName();
        int estilo = lblConexion.getFont().getStyle();
        lblConexion.setFont(new Font(nombre, estilo, numero));
        lblUsuario.setFont(new Font(nombre, estilo, numero));
        mAccesibilidad.setFont(new Font(nombre, estilo, numero));
        mArchivo.setFont(new Font(nombre, estilo, numero));
        mAyuda.setFont(new Font(nombre, estilo, numero));
        miGrande.setFont(new Font(nombre, estilo, numero));
        miMediana.setFont(new Font(nombre, estilo, numero));
        miPequeno.setFont(new Font(nombre, estilo, numero));
    }
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblConexion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu mAccesibilidad;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mAyuda;
    private javax.swing.JMenuItem miAcerca;
    private javax.swing.JMenuItem miGrande;
    private javax.swing.JMenuItem miMediana;
    private javax.swing.JMenuItem miPequeno;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlInicio;
    // End of variables declaration//GEN-END:variables

}
