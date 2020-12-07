package interfaz;

import dominio.Profesional;
import dominio.Sistema;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class InterfazBotonesProfesional extends javax.swing.JPanel {

  //Atrbutos
  private Sistema sistema;
  private JFrame ventana;
  private JPanel actual;
  public Profesional usuarioActivo;

  //Cosntructor
  public InterfazBotonesProfesional(Sistema unSistema, JFrame unaVentana,
      Profesional unProfesional) {
    initComponents();
    sistema = unSistema;
    ventana = unaVentana;
    usuarioActivo = unProfesional;
    actual = new PanelPerfilProfesional(unSistema, this, unaVentana);
    ventana.add(this);
    ventana.add(actual);
    deselectButtons();
    Border border = new LineBorder(Color.BLACK, 3);
    btnHome.setBorder(border);
    actualizarPerfil();

  }

  public JPanel getActual() {
    return actual;
  }

  public void setActual(JPanel actual) {
    this.actual = actual;
  }

  public Profesional getUsuarioActivo() {
    return usuarioActivo;
  }

  public void setUsuarioActivo(Profesional usuarioActivo) {
    this.usuarioActivo = usuarioActivo;
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnRealizarPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        nombreDeUsuario = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        btnHome.setBackground(new java.awt.Color(255, 0, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Perfil");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome);
        btnHome.setBounds(0, 330, 245, 41);

        btnRealizarPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnRealizarPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRealizarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPlan.setText("Realizar Plan");
        btnRealizarPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarPlan.setContentAreaFilled(false);
        btnRealizarPlan.setOpaque(true);
        btnRealizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPlanActionPerformed(evt);
            }
        });
        add(btnRealizarPlan);
        btnRealizarPlan.setBounds(0, 390, 245, 44);

        btnConsultaDirecta.setBackground(new java.awt.Color(255, 0, 102));
        btnConsultaDirecta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsultaDirecta.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaDirecta.setText("Consulta Directa");
        btnConsultaDirecta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaDirecta.setContentAreaFilled(false);
        btnConsultaDirecta.setOpaque(true);
        btnConsultaDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDirectaActionPerformed(evt);
            }
        });
        add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(0, 450, 245, 43);

        btnCambiarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        btnCambiarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setContentAreaFilled(false);
        btnCambiarUsuario.setOpaque(true);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });
        add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(0, 510, 245, 44);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNombre.setText("Nombre Profesional:");
        jPanel2.add(labelNombre);

        nombreDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreDeUsuario.setText("Nombre de Usuario");
        jPanel2.add(nombreDeUsuario);

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"))); // NOI18N
        jPanel2.add(imagenUsuario);

        add(jPanel2);
        jPanel2.setBounds(20, 20, 220, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnHome.setBorder(border);
      ventana.remove(actual);
      actual = new PanelPerfilProfesional(sistema, this, ventana);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnConsultaDirecta.setBorder(border);
      ventana.remove(actual);
      actual = new PanelConsultaProfesionalDesdeProfesional(sistema, this, ventana);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnRealizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPlanActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnRealizarPlan.setBorder(border);
      ventana.remove(actual);
      actual = new PanelSeleccionarPlanARealizar(sistema, this, ventana);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnRealizarPlanActionPerformed

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
    btnConsultaDirecta.setBorder(border);
    btnHome.setBorder(border);
    btnRealizarPlan.setBorder(border);
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRealizarPlan;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel nombreDeUsuario;
    // End of variables declaration//GEN-END:variables

  public void actualizarPerfil() {
    this.nombreDeUsuario.setText(usuarioActivo.getNombre());
    this.imagenUsuario.setIcon(usuarioActivo.getFotoPerfil());
  }
}
