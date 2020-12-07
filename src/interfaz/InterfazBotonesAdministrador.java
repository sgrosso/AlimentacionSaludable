package interfaz;

import dominio.Sistema;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class InterfazBotonesAdministrador extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private JPanel actual;
    private JFrame ventana;

    //Cosntructor
    public InterfazBotonesAdministrador(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        actual = new PanelRegistroUsuario(sistema, ventana);
        ventana.add(this);
        ventana.add(actual);
        deselectButtons();
        Border border = new LineBorder(Color.BLACK, 3);
        btnRegistrarUsuario.setBorder(border);

    }

    public JPanel getActual() {
        return actual;
    }

    public void setActual(JPanel actual) {
        this.actual = actual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesAdministrador = new javax.swing.JPanel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnRegistrarProfesional = new javax.swing.JButton();
        btnRegistrarAlimento = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        panelBotonesAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        panelBotonesAdministrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBotonesAdministrador.setPreferredSize(new java.awt.Dimension(246, 784));
        panelBotonesAdministrador.setLayout(null);

        btnRegistrarUsuario.setBackground(new java.awt.Color(255, 0, 102));
        btnRegistrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuario.setText("Registrar Usuario");
        btnRegistrarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarUsuario.setContentAreaFilled(false);
        btnRegistrarUsuario.setMaximumSize(new java.awt.Dimension(191, 35));
        btnRegistrarUsuario.setMinimumSize(new java.awt.Dimension(191, 35));
        btnRegistrarUsuario.setOpaque(true);
        btnRegistrarUsuario.setPreferredSize(new java.awt.Dimension(193, 136));
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnRegistrarUsuario);
        btnRegistrarUsuario.setBounds(0, 160, 245, 50);

        btnRegistrarProfesional.setBackground(new java.awt.Color(255, 0, 102));
        btnRegistrarProfesional.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarProfesional.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProfesional.setText("Registrar Profesional");
        btnRegistrarProfesional.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarProfesional.setContentAreaFilled(false);
        btnRegistrarProfesional.setMaximumSize(new java.awt.Dimension(191, 35));
        btnRegistrarProfesional.setMinimumSize(new java.awt.Dimension(191, 35));
        btnRegistrarProfesional.setOpaque(true);
        btnRegistrarProfesional.setPreferredSize(new java.awt.Dimension(193, 136));
        btnRegistrarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProfesionalActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnRegistrarProfesional);
        btnRegistrarProfesional.setBounds(0, 240, 245, 50);

        btnRegistrarAlimento.setBackground(new java.awt.Color(255, 0, 102));
        btnRegistrarAlimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegistrarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAlimento.setText("Registrar Alimento");
        btnRegistrarAlimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarAlimento.setContentAreaFilled(false);
        btnRegistrarAlimento.setMaximumSize(new java.awt.Dimension(191, 35));
        btnRegistrarAlimento.setMinimumSize(new java.awt.Dimension(191, 35));
        btnRegistrarAlimento.setOpaque(true);
        btnRegistrarAlimento.setPreferredSize(new java.awt.Dimension(193, 136));
        btnRegistrarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlimentoActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnRegistrarAlimento);
        btnRegistrarAlimento.setBounds(0, 320, 245, 50);

        btnCambiarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambiarUsuario.setMaximumSize(new java.awt.Dimension(191, 35));
        btnCambiarUsuario.setMinimumSize(new java.awt.Dimension(191, 35));
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.setPreferredSize(new java.awt.Dimension(193, 136));
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        panelBotonesAdministrador.add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(0, 400, 245, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ADMINISTRADOR");
        panelBotonesAdministrador.add(jLabel1);
        jLabel1.setBounds(30, 60, 200, 60);

        add(panelBotonesAdministrador);
        panelBotonesAdministrador.setBounds(0, 0, 250, 784);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        deselectButtons();
        Border border = new LineBorder(Color.BLACK, 3);
        btnRegistrarUsuario.setBorder(border);
        ventana.remove(actual);
        actual = new PanelRegistroUsuario(sistema, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnRegistrarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProfesionalActionPerformed
        deselectButtons();
        Border border = new LineBorder(Color.BLACK, 3);
        btnRegistrarProfesional.setBorder(border);
        ventana.remove(actual);
        actual = new PanelRegistroProfesional(sistema, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnRegistrarProfesionalActionPerformed

    private void btnRegistrarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlimentoActionPerformed
        deselectButtons();
        Border border = new LineBorder(Color.BLACK, 3);
        btnRegistrarAlimento.setBorder(border);
        ventana.remove(actual);
        actual = new PanelRegistroAlimento(sistema, ventana);
        ventana.add(actual);
        ventana.pack();
    }//GEN-LAST:event_btnRegistrarAlimentoActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
      ventana.remove(actual);
      ventana.remove(this);
      Login login = new Login(ventana, sistema);
      ventana.add(login);
      ventana.pack();
      ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void deselectButtons() {
        Border border = new BevelBorder(0);
        btnCambiarUsuario.setBorder(border);
        btnRegistrarProfesional.setBorder(border);
        btnRegistrarAlimento.setBorder(border);
        btnRegistrarUsuario.setBorder(border);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnRegistrarAlimento;
    private javax.swing.JButton btnRegistrarProfesional;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBotonesAdministrador;
    // End of variables declaration//GEN-END:variables
}
