package presentacion;

import dominio.GestorPerros;
import dominio.PanelP;
import dominio.Perro;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class PanelPerrosLista extends PanelP {

    ArrayList<Perro> perros;
    public PanelPerrosLista() {
        initComponents();
        setTabla();
        btnNuevo.setText(FormInicio.propiedades.getProperty("Nuevo"));
        setFont(FormInicio.fuente);
    }

    private void setTabla() {

        Properties propiedad = FormInicio.propiedades;
        String[] columnas = new String[]{
            "Id",
            propiedad.getProperty("Nombre"),
            propiedad.getProperty("Edad"),
            propiedad.getProperty("Raza"),
            propiedad.getProperty("Editar"),
            propiedad.getProperty("Eliminar")
        };

        final Class[] tiposColumnas = new Class[]{
            java.lang.Integer.class,
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class,
            JButton.class,
            JButton.class
        };
        
        perros = GestorPerros.SeleccionarTodo();
        Object[][] datos = new Object[perros.size()][6];
        
        
        for (int i = 0; i < perros.size(); i++) {
            datos[i] = new Object[]{perros.get(i).getId(),
                perros.get(i).getNombre(),perros.get(i).getEdad(),
                perros.get(i).getRaza(), new JButton(propiedad.getProperty("Editar")),
                new JButton(propiedad.getProperty("Eliminar"))};
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                columnas) {
            Class[] tipos = tiposColumnas;

            @Override
            public Class getColumnClass(int columnIndex) {
                try {
                    return tipos[columnIndex];
                } catch(Exception e)
                {
                    return tipos[0];
                }
                
            }
        });

        jTable1.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });

        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jTable1.rowAtPoint(e.getPoint());
                int columna = jTable1.columnAtPoint(e.getPoint());

                if (jTable1.getModel().getColumnClass(columna).equals(JButton.class)) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
                        if (!jTable1.getModel().getColumnClass(i).equals(JButton.class)) {
                            sb.append("\n").append(jTable1.getModel().getColumnName(i)).append(": ").append(jTable1.getModel().getValueAt(fila, i));
                        }
                    }
                    
                    
                    if(columna == 4)
                    {
                        PanelPerroEditar pnleditar = new PanelPerroEditar(perros.get(fila).getId());
                        FormInicio.pnlPrincipal.add(pnleditar,"menu2");
                        CardLayout paletas = (CardLayout)(pnleditar.getLayout());
                        FormInicio.pnlPrincipal.remove(FormInicio.pnlActual);
                        FormInicio.pnlActual = pnleditar;
                    }
                    if(columna == 5)
                    {
                        int respuesta = JOptionPane.showConfirmDialog(null,"¿Esta seguro de que desea borralo?", "Borrar perro", JOptionPane.YES_NO_OPTION);
                        if (respuesta == JOptionPane.YES_OPTION) {
                            int id = perros.get(fila).getId();
                            GestorPerros.BorrarPerro(id);
                            setTabla();
                        }
                    }
                }
            }
        });
    }
    
    public void setFont(int numero)
    {
        String nombre = jTable1.getFont().getName();
        int estilo = jTable1.getFont().getStyle();
        jTable1.setFont(new Font(nombre, estilo, numero));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "Raza", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlPrincipal1Layout = new javax.swing.GroupLayout(pnlPrincipal1);
        pnlPrincipal1.setLayout(pnlPrincipal1Layout);
        pnlPrincipal1Layout.setHorizontalGroup(
            pnlPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlPrincipal1Layout.setVerticalGroup(
            pnlPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        add(pnlPrincipal1, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        GestorPerros.InsertarPerro();
        setTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlPrincipal1;
    // End of variables declaration//GEN-END:variables
}
