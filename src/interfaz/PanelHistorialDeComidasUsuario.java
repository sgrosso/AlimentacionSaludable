package interfaz;

import dominio.ComidaPorDia;
import dominio.Sistema;
import javax.swing.JFrame;

public class PanelHistorialDeComidasUsuario extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JFrame ventana;
    private InterfazBotonesUsuario interfaz;

    //Constructor
    public PanelHistorialDeComidasUsuario(Sistema unSistema,
            JFrame unaVentana,
            InterfazBotonesUsuario unaInterfaz) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = unaInterfaz;
        listaHistorialDeComidas.setListData(interfaz.getUsuarioActual().getHistorialComidas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaHistorialDeComidas = new javax.swing.JList();
        btnVerHistorial = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1147, 784));
        setLayout(null);

        listaHistorialDeComidas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(listaHistorialDeComidas);

        add(jScrollPane1);
        jScrollPane1.setBounds(220, 100, 650, 400);

        btnVerHistorial.setBackground(new java.awt.Color(255, 0, 102));
        btnVerHistorial.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistorial.setText("Ver Historial");
        btnVerHistorial.setContentAreaFilled(false);
        btnVerHistorial.setOpaque(true);
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });
        add(btnVerHistorial);
        btnVerHistorial.setBounds(700, 520, 170, 37);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTitulo.setText("Historial de Comidas");
        add(etiquetaTitulo);
        etiquetaTitulo.setBounds(380, 10, 330, 40);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver);
        btnVolver.setBounds(20, 0, 100, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
        ComidaPorDia comidaSeleccionada = (ComidaPorDia) listaHistorialDeComidas.getSelectedValue();
        if (comidaSeleccionada != null) {
            ventana.remove(this);
            PanelVerHistorialUsuario nuevo = new PanelVerHistorialUsuario(sistema, ventana, interfaz, comidaSeleccionada);
            interfaz.setActual(nuevo);
            ventana.add(nuevo);
            ventana.pack();
        }
    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelHomeUsuario nuevo = new PanelHomeUsuario(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaHistorialDeComidas;
    // End of variables declaration//GEN-END:variables
}
