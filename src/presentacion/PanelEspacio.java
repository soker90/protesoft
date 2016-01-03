package presentacion;

import dominio.ImagenGrafico;
import dominio.MiAreaDibujo;
import dominio.PanelP;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class PanelEspacio extends PanelP {
    private ImageIcon imagen;
    private MiAreaDibujo miAreaDibujo;
    private int x,y;
    int modo = -1;
    private final int ALMACEN = 1;
    private final int APARCAMIENTO= 2;
    private final int CASILLEROS= 3;
    private final int CURAS= 4;
    private final int PATIO= 5;
    private final int VESTUARIO= 6;
    private final int MACHO= 7;
    private final int HEMBRA= 8;
    private final int CACHORRO= 9;
    private final int ANCIANO= 10;
    
    private Toolkit toolkit;
    private Image imagAlmacen;
    private Image imagAparcamiento;
    private Image imagCasilleros;
    private Image imagCuras;
    private Image imagPatio; 
    private Image imagVestuario; 
    private Image imagMacho; 
    private Image imagHembra; 
    private Image imagCachorro; 
    private Image imagAnciano; 
    private Cursor cursorAlmacen;
    private Cursor cursorAparcamiento;
    private Cursor cursorCasilleros;
    private Cursor cursorCuras;
    private Cursor cursorPatio;
    private Cursor cursorVestuario;
    private Cursor cursorMacho;
    private Cursor cursorHembra;
    private Cursor cursorCachorro;
    private Cursor cursorAnciano;

    public PanelEspacio() {
        initComponents();
        setFont(FormInicio.fuente);
        miAreaDibujo = new MiAreaDibujo();
        miAreaDibujo.setIcon(null);
        miAreaDibujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miAreaDibujoMousePressed(evt);
            }
        });
        scrollPane.setViewportView(miAreaDibujo);
        toolkit = Toolkit.getDefaultToolkit();
        imagAlmacen = toolkit.getImage(getClass().getClassLoader().getResource("recursos/almacen.png"));
        imagAparcamiento  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/aparcamiento.png"));
        imagCasilleros  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/casilleros.png"));
        imagCuras  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/curas.png"));
        imagPatio  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/patio.png"));
        imagVestuario  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/vestuario.png"));
        imagMacho  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/macho.png"));
        imagHembra  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/hembra.png"));
        imagCachorro  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/cachorro.png"));
        imagAnciano  = toolkit.getImage(getClass().getClassLoader().getResource("recursos/anciano.png"));
        
        cursorAlmacen  = toolkit.createCustomCursor(imagAlmacen,new Point(0,0),"CURSOR_ALMACEN");
        cursorAparcamiento  = toolkit.createCustomCursor(imagAparcamiento,new Point(0,0),"CURSOR_APARCAMIENTO");
        cursorCasilleros  = toolkit.createCustomCursor(imagCasilleros,new Point(0,0),"CURSOR_CASILLEROS");
        cursorCuras  = toolkit.createCustomCursor(imagCuras,new Point(0,0),"CURSOR_CURAS");
        cursorPatio  = toolkit.createCustomCursor(imagPatio,new Point(0,0),"CURSOR_PATIO");
        cursorVestuario  = toolkit.createCustomCursor(imagVestuario,new Point(0,0),"CURSOR_VESTUARIO");
        cursorMacho  = toolkit.createCustomCursor(imagMacho,new Point(0,0),"CURSOR_MACHO");
        cursorHembra  = toolkit.createCustomCursor(imagHembra,new Point(0,0),"CURSOR_HEMBRA");
        cursorCachorro  = toolkit.createCustomCursor(imagCachorro,new Point(0,0),"CURSOR_CACHORRO");
        cursorAnciano  = toolkit.createCustomCursor(imagAnciano,new Point(0,0),"CURSOR_ANCIANO");
    }
    
    private void miAreaDibujoMousePressed(MouseEvent e) {                                          
        x= e.getX();
        y= e.getY();
        if(imagen != null)
            {
                switch(modo)
                {
                    case ALMACEN:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagAlmacen));
                        miAreaDibujo.repaint();
                        break;
                    case APARCAMIENTO:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagAparcamiento));
                        miAreaDibujo.repaint();
                        break;
                    case CASILLEROS:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagCasilleros));
                        miAreaDibujo.repaint();
                        break;
                    case CURAS:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagCuras));
                        miAreaDibujo.repaint();
                        break;
                    case PATIO:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagPatio));
                        miAreaDibujo.repaint();
                        break;
                    case VESTUARIO:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagVestuario));
                        miAreaDibujo.repaint();
                        break;
                    case MACHO:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagMacho));
                        miAreaDibujo.repaint();
                        break;
                    case HEMBRA:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagHembra));
                        miAreaDibujo.repaint();
                        break;
                    case CACHORRO:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagCachorro));
                        miAreaDibujo.repaint();
                        break;
                    case ANCIANO:
                        miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagAnciano));
                        miAreaDibujo.repaint();
                        break;
                        
                }
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSitio = new javax.swing.JButton();
        cmbSitio = new javax.swing.JComboBox<>();
        cmbPerros = new javax.swing.JComboBox<>();
        btnPerro = new javax.swing.JButton();
        btnImagen = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();

        setLayout(new java.awt.CardLayout());

        btnSitio.setText("Añadir");
        btnSitio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSitioActionPerformed(evt);
            }
        });

        cmbSitio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacen", "Sala de casilleros", "Vesturario", "Sala de curas", "Patio", "Aparcamiento" }));

        cmbPerros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra", "Cachorro", "Anciano" }));

        btnPerro.setText("Añadir");
        btnPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerroActionPerformed(evt);
            }
        });

        btnImagen.setText("Añadir Imagen");
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbSitio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSitio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbPerros, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnImagen)
                .addGap(21, 21, 21))
            .addComponent(scrollPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSitio)
                    .addComponent(cmbSitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPerros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerro)
                    .addComponent(btnImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
        );

        add(jPanel1, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser fcAbrir = new JFileChooser();
        int valorDevuelto = fcAbrir.showOpenDialog(this);
        if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
            File file = fcAbrir.getSelectedFile();
            imagen= new ImageIcon(file.getAbsolutePath());
            miAreaDibujo.setIcon(imagen);
        }
    }//GEN-LAST:event_btnImagenActionPerformed

    private void btnSitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSitioActionPerformed
        switch(cmbSitio.getSelectedItem().toString())
        {
            case "Almacen":
                modo= ALMACEN;
                this.setCursor(cursorAlmacen);
                break;
            case "Sala de casilleros":
                modo= CASILLEROS;
                this.setCursor(cursorCasilleros);
                break;
            case "Vesturario":
                modo= VESTUARIO;
                this.setCursor(cursorVestuario);
                break;
            case "Sala de curas":
                modo= CURAS;
                this.setCursor(cursorCuras);
                break;
            case "Patio":
                modo= PATIO;
                this.setCursor(cursorPatio);
                break;
            case "Aparcamiento":
                modo= APARCAMIENTO;
                this.setCursor(cursorAparcamiento);
                break;
        }
        
    }//GEN-LAST:event_btnSitioActionPerformed

    private void btnPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerroActionPerformed
        switch(cmbPerros.getSelectedItem().toString())
        {
            case "Macho":
                modo= MACHO;
                this.setCursor(cursorMacho);
                break;
            case "Hembra":
                modo= HEMBRA;
                this.setCursor(cursorHembra);
                break;
            case "Cachorro":
                modo= CACHORRO;
                this.setCursor(cursorCachorro);
                break;
            case "Anciano":
                modo= ANCIANO;
                this.setCursor(cursorAnciano);
                break;
        }
    }//GEN-LAST:event_btnPerroActionPerformed

    
    @Override
    public void setFont(int numero) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnPerro;
    private javax.swing.JButton btnSitio;
    private javax.swing.JComboBox<String> cmbPerros;
    private javax.swing.JComboBox<String> cmbSitio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

    
}
