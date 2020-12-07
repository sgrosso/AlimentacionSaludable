package interfaz;

import dominio.Sistema;
import dominio.Usuario;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class InterfazBotonesUsuario extends javax.swing.JPanel {

  private Sistema sistema;
  private JPanel actual;
  private JFrame ventana;
  private Usuario usuarioActual;

  public InterfazBotonesUsuario(Sistema unSistema, JFrame unaVentana, Usuario unUsuario) {
    initComponents();
    sistema = unSistema;
    ventana = unaVentana;
    usuarioActual = unUsuario;
    actual = new PanelHomeUsuario(sistema, this, ventana);
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

  public Usuario getUsuarioActual() {
    return usuarioActual;
  }

  public void setUsuarioActual(Usuario usuarioActual) {
    this.usuarioActual = usuarioActual;
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesUsuario = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnPedirPlan = new javax.swing.JButton();
        btnConsultaDirecta = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnCambiarUsuario = new javax.swing.JButton();
        btnAgregarComida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        nombreDeUsuario = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(250, 784));
        setLayout(null);

        panelBotonesUsuario.setBackground(new java.awt.Color(102, 102, 102));
        panelBotonesUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBotonesUsuario.setMinimumSize(new java.awt.Dimension(250, 784));
        panelBotonesUsuario.setPreferredSize(new java.awt.Dimension(250, 784));
        panelBotonesUsuario.setLayout(null);

        btnHome.setBackground(new java.awt.Color(255, 0, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setContentAreaFilled(false);
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnHome);
        btnHome.setBounds(0, 340, 245, 46);

        btnPedirPlan.setBackground(new java.awt.Color(255, 0, 102));
        btnPedirPlan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPedirPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnPedirPlan.setText("Pedir Plan");
        btnPedirPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPedirPlan.setContentAreaFilled(false);
        btnPedirPlan.setOpaque(true);
        btnPedirPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirPlanActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnPedirPlan);
        btnPedirPlan.setBounds(0, 520, 245, 43);

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
        panelBotonesUsuario.add(btnConsultaDirecta);
        btnConsultaDirecta.setBounds(0, 460, 245, 43);

        btnPerfil.setBackground(new java.awt.Color(255, 0, 102));
        btnPerfil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setText("Perfil");
        btnPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setOpaque(true);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnPerfil);
        btnPerfil.setBounds(0, 400, 245, 43);

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
        panelBotonesUsuario.add(btnCambiarUsuario);
        btnCambiarUsuario.setBounds(0, 640, 245, 45);

        btnAgregarComida.setBackground(new java.awt.Color(255, 0, 102));
        btnAgregarComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAgregarComida.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarComida.setText("Agregar Ingesta");
        btnAgregarComida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarComida.setContentAreaFilled(false);
        btnAgregarComida.setOpaque(true);
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        panelBotonesUsuario.add(btnAgregarComida);
        btnAgregarComida.setBounds(0, 580, 245, 45);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labelNombre.setText("Nombre Usuario:");
        jPanel2.add(labelNombre);

        nombreDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreDeUsuario.setText("Nombre de Usuario");
        jPanel2.add(nombreDeUsuario);

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"))); // NOI18N
        jPanel2.add(imagenUsuario);

        panelBotonesUsuario.add(jPanel2);
        jPanel2.setBounds(20, 20, 220, 300);

        add(panelBotonesUsuario);
        panelBotonesUsuario.setBounds(-1, 0, 310, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnHome.setBorder(border);
      ventana.remove(actual);
      actual = new PanelHomeUsuario(sistema, this, ventana);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPedirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirPlanActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnPedirPlan.setBorder(border);
      ventana.remove(actual);
      actual = new PanelPlanAlimentacionUsuario(sistema, ventana, this);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnPedirPlanActionPerformed

    private void btnConsultaDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDirectaActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnConsultaDirecta.setBorder(border);
      ventana.remove(actual);
      actual = new PanelConsultaProfesional(sistema, this, ventana);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnConsultaDirectaActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnPerfil.setBorder(border);
      ventana.remove(actual);
      actual = new PanelPerfilUsuario(sistema, ventana, this);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
      ventana.remove(actual);
      ventana.remove(this);
      Login login = new Login(ventana, sistema);
      ventana.add(login);
      ventana.pack();
      ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
      deselectButtons();
      Border border = new LineBorder(Color.BLACK, 3);
      btnAgregarComida.setBorder(border);
      ventana.remove(actual);
      actual = new PanelDietaDiariaUsuario(sistema, ventana, this);
      ventana.add(actual);
      ventana.pack();
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

  private void deselectButtons() {
    Border border = new BevelBorder(0);
    btnCambiarUsuario.setBorder(border);
    btnConsultaDirecta.setBorder(border);
    btnHome.setBorder(border);
    btnPerfil.setBorder(border);
    btnPedirPlan.setBorder(border);
    btnAgregarComida.setBorder(border);
  }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnConsultaDirecta;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPedirPlan;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel nombreDeUsuario;
    private javax.swing.JPanel panelBotonesUsuario;
    // End of variables declaration//GEN-END:variables

  public void actualizarPerfil() {
    this.nombreDeUsuario.setText(usuarioActual.getNombre());
    this.imagenUsuario.setIcon(usuarioActual.getFotoPerfil());
  }
}
