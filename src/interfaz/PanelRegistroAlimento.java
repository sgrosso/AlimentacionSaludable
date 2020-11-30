package interfaz;

import dominio.Sistema;
import dominio.Alimento;
import dominio.TipoAlimento;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

public class PanelRegistroAlimento extends javax.swing.JPanel {

    //Atributos
    private final Sistema sistema;
    private Alimento alimento;
    private final JFrame ventana;

    //Cosntructor
    public PanelRegistroAlimento(Sistema unSistema, JFrame unaVentana) {
        initComponents();
        sistema = unSistema;
        ventana = unaVentana;
        alimento = new Alimento();
        listaTiposAlimentos.setModel(new DefaultComboBoxModel(TipoAlimento.values()));
        listaTiposAlimentos.setSelectedIndex(TipoAlimento.FRUTA.ordinal());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegAlimento = new javax.swing.JPanel();
        etiquetaRegistroAlim = new javax.swing.JLabel();
        etiquetaNombAlim = new javax.swing.JLabel();
        cajaNombreAlim = new javax.swing.JTextField();
        etiquetaTipoAlim = new javax.swing.JLabel();
        listaTiposAlimentos = new javax.swing.JComboBox<>();
        btnAceptarRegAlim = new javax.swing.JButton();
        checkBoxProteinas = new javax.swing.JCheckBox();
        checkBoxLipidos = new javax.swing.JCheckBox();
        checkBoxHidratosDeCarbono = new javax.swing.JCheckBox();
        checkBoxVitaminas = new javax.swing.JCheckBox();
        checkBoxMinerales = new javax.swing.JCheckBox();
        checkBoxAgua = new javax.swing.JCheckBox();
        checkBoxNinguno = new javax.swing.JCheckBox();
        etiquetaErrorNombreAlimento = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        etiquetaTituloPpalesNutrientes = new javax.swing.JLabel();
        checkBoxFibra = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegAlimento.setBackground(new java.awt.Color(255, 255, 255));
        panelRegAlimento.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegAlimento.setLayout(null);

        etiquetaRegistroAlim.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaRegistroAlim.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaRegistroAlim.setText("Registro Alimento");
        panelRegAlimento.add(etiquetaRegistroAlim);
        etiquetaRegistroAlim.setBounds(360, 10, 310, 44);

        etiquetaNombAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombAlim.setText("Nombre:");
        panelRegAlimento.add(etiquetaNombAlim);
        etiquetaNombAlim.setBounds(300, 130, 100, 29);

        cajaNombreAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreAlim.setPreferredSize(new java.awt.Dimension(8, 32));
        cajaNombreAlim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreAlimFocusLost(evt);
            }
        });
        panelRegAlimento.add(cajaNombreAlim);
        cajaNombreAlim.setBounds(420, 130, 230, 32);

        etiquetaTipoAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaTipoAlim.setText("Tipo de alimento:");
        panelRegAlimento.add(etiquetaTipoAlim);
        etiquetaTipoAlim.setBounds(210, 180, 210, 29);

        listaTiposAlimentos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaTiposAlimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegAlimento.add(listaTiposAlimentos);
        listaTiposAlimentos.setBounds(420, 180, 230, 35);

        btnAceptarRegAlim.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarRegAlim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarRegAlim.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarRegAlim.setText("Aceptar");
        btnAceptarRegAlim.setContentAreaFilled(false);
        btnAceptarRegAlim.setOpaque(true);
        btnAceptarRegAlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegAlimActionPerformed(evt);
            }
        });
        panelRegAlimento.add(btnAceptarRegAlim);
        btnAceptarRegAlim.setBounds(835, 660, 130, 37);

        checkBoxProteinas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxProteinas.setText("Proteínas");
        checkBoxProteinas.setContentAreaFilled(false);
        checkBoxProteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxProteinasActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxProteinas);
        checkBoxProteinas.setBounds(150, 270, 140, 35);

        checkBoxLipidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxLipidos.setText("Lípidos");
        checkBoxLipidos.setContentAreaFilled(false);
        checkBoxLipidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLipidosActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxLipidos);
        checkBoxLipidos.setBounds(290, 270, 120, 35);

        checkBoxHidratosDeCarbono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxHidratosDeCarbono.setText("Hidratos de Carbono");
        checkBoxHidratosDeCarbono.setContentAreaFilled(false);
        checkBoxHidratosDeCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxHidratosDeCarbonoActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxHidratosDeCarbono);
        checkBoxHidratosDeCarbono.setBounds(410, 270, 243, 37);

        checkBoxVitaminas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxVitaminas.setText("Vitaminas");
        checkBoxVitaminas.setContentAreaFilled(false);
        checkBoxVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxVitaminasActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxVitaminas);
        checkBoxVitaminas.setBounds(670, 270, 150, 37);

        checkBoxMinerales.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxMinerales.setText("Minerales");
        checkBoxMinerales.setContentAreaFilled(false);
        checkBoxMinerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMineralesActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxMinerales);
        checkBoxMinerales.setBounds(150, 310, 140, 35);

        checkBoxAgua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxAgua.setText("Agua");
        checkBoxAgua.setContentAreaFilled(false);
        checkBoxAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAguaActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxAgua);
        checkBoxAgua.setBounds(290, 310, 100, 35);

        checkBoxNinguno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxNinguno.setText("Ninguno");
        checkBoxNinguno.setContentAreaFilled(false);
        checkBoxNinguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxNingunoActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxNinguno);
        checkBoxNinguno.setBounds(530, 310, 120, 37);

        etiquetaErrorNombreAlimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelRegAlimento.add(etiquetaErrorNombreAlimento);
        etiquetaErrorNombreAlimento.setBounds(680, 130, 440, 26);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegAlimento.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(700, 610, 400, 29);

        etiquetaTituloPpalesNutrientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTituloPpalesNutrientes.setText("Principales Nutrientes:");
        panelRegAlimento.add(etiquetaTituloPpalesNutrientes);
        etiquetaTituloPpalesNutrientes.setBounds(130, 230, 280, 29);

        checkBoxFibra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxFibra.setText("Fibra");
        checkBoxFibra.setContentAreaFilled(false);
        checkBoxFibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFibraActionPerformed(evt);
            }
        });
        panelRegAlimento.add(checkBoxFibra);
        checkBoxFibra.setBounds(410, 310, 120, 37);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxHidratosDeCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxHidratosDeCarbonoActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxHidratosDeCarbonoActionPerformed

    private void checkBoxNingunoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        boolean[] estadoActual = alimento.getListaNutrientesSeleccionados();
        Arrays.fill(estadoActual, false);
        checkBoxFibra.setSelected(false);
        checkBoxAgua.setSelected(false);
        checkBoxHidratosDeCarbono.setSelected(false);
        checkBoxLipidos.setSelected(false);
        checkBoxMinerales.setSelected(false);
        checkBoxProteinas.setSelected(false);
        checkBoxVitaminas.setSelected(false);
    }

    private void cajaNombreAlimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreAlimFocusLost
        String nombre = cajaNombreAlim.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombreAlimento.setText("El nombre no puede ser vacío");
        } else {
            alimento.setNombre(nombre);
            if (sistema.getListaAlimentos().contains(alimento)) {
                etiquetaErrorNombreAlimento.setText("Esa comida ya se encuentra en el sistema");
            } else {
                etiquetaErrorNombreAlimento.setText(" ");
            }
        }
    }//GEN-LAST:event_cajaNombreAlimFocusLost

    private void btnAceptarRegAlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegAlimActionPerformed
        Alimento comparo = new Alimento();
        comparo.setNombre(cajaNombreAlim.getText());
        boolean nombre = !cajaNombreAlim.getText().trim().isEmpty()
                && !sistema.getListaAlimentos().contains(comparo);
        if (nombre) {
            alimento.setNombre(cajaNombreAlim.getText());
            alimento.setTipo(TipoAlimento.values()[listaTiposAlimentos.getSelectedIndex()]);
            etiquetaMensajeAlAceptar.setText("Alimento registrado correctamente");
            sistema.getListaAlimentos().add(alimento);
        } else {
            etiquetaMensajeAlAceptar.setText("Error al ingresar el alimento");
        }
        alimento = new Alimento();
    }//GEN-LAST:event_btnAceptarRegAlimActionPerformed

    private void checkBoxProteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxProteinasActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxProteinasActionPerformed

    private void checkBoxLipidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLipidosActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxLipidosActionPerformed

    private void checkBoxVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxVitaminasActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxVitaminasActionPerformed

    private void checkBoxMineralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMineralesActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxMineralesActionPerformed

    private void checkBoxAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAguaActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxAguaActionPerformed

    private void checkBoxFibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFibraActionPerformed
        checkBoxNinguno.setSelected(false);
    }//GEN-LAST:event_checkBoxFibraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarRegAlim;
    private javax.swing.JTextField cajaNombreAlim;
    private javax.swing.JCheckBox checkBoxAgua;
    private javax.swing.JCheckBox checkBoxFibra;
    private javax.swing.JCheckBox checkBoxHidratosDeCarbono;
    private javax.swing.JCheckBox checkBoxLipidos;
    private javax.swing.JCheckBox checkBoxMinerales;
    private javax.swing.JCheckBox checkBoxNinguno;
    private javax.swing.JCheckBox checkBoxProteinas;
    private javax.swing.JCheckBox checkBoxVitaminas;
    private javax.swing.JLabel etiquetaErrorNombreAlimento;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombAlim;
    private javax.swing.JLabel etiquetaRegistroAlim;
    private javax.swing.JLabel etiquetaTipoAlim;
    private javax.swing.JLabel etiquetaTituloPpalesNutrientes;
    private javax.swing.JComboBox<String> listaTiposAlimentos;
    private javax.swing.JPanel panelRegAlimento;
    // End of variables declaration//GEN-END:variables

}
