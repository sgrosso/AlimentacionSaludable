package interfaz;

import dominio.Sistema;
import dominio.Profesional;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PanelEditarPerfilProfesional extends javax.swing.JPanel {

    //Atributos
    private Sistema sistema;
    private Profesional profesional;
    private JFrame ventana;
    private InterfazBotonesProfesional interfaz;

    //Constructor
    public PanelEditarPerfilProfesional(Sistema unSistema, JFrame unaVentana,
            InterfazBotonesProfesional interfazActual) {
        initComponents();
        
        sistema = unSistema;
        ventana = unaVentana;
        interfaz = interfazActual;
        profesional = interfaz.getUsuarioActivo();
        Profesional.Pais[] listaPaises = profesional.getListaEnumPais();
        listaPaisDeGraduacion.setModel(new DefaultComboBoxModel(listaPaises));
        listaPaisDeGraduacion.setSelectedIndex(Profesional.Pais.Uruguay.ordinal());
        
        addJDateChooserEvents();
        cargarValoresActuales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegProf = new javax.swing.JPanel();
        etiquetaTituloProf = new javax.swing.JLabel();
        etiquetaNombreProf = new javax.swing.JLabel();
        etiquetaApellidosProf = new javax.swing.JLabel();
        etiquetaFechaNacProf = new javax.swing.JLabel();
        etiquetaNombTituloProf = new javax.swing.JLabel();
        etiquetaFechaGradProf = new javax.swing.JLabel();
        etiquetaFotoPerfilProf = new javax.swing.JLabel();
        cajaNombreProf = new javax.swing.JTextField();
        cajaApellidosProf = new javax.swing.JTextField();
        cajaNombreTituloProf = new javax.swing.JTextField();
        btnAceptarProf = new javax.swing.JButton();
        etiquetaPaisDeGraduacion = new javax.swing.JLabel();
        listaPaisDeGraduacion = new javax.swing.JComboBox<>();
        etiquetaErrorNombreProf = new javax.swing.JLabel();
        etiquetaErrorApellidoProf = new javax.swing.JLabel();
        etiquetaErrorFechaNacimiento = new javax.swing.JLabel();
        etiquetaErrorNombreTituloProf = new javax.swing.JLabel();
        etiquetaErrorFechaGraduacion = new javax.swing.JLabel();
        etiquetaErrorPaisGraduacion = new javax.swing.JLabel();
        etiquetaMensajeAlAceptar = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        fechaGraduacion = new com.toedter.calendar.JDateChooser();
        btnCambiarFoto = new javax.swing.JButton();
        fotoPerfil = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1147, 784));

        panelRegProf.setBackground(new java.awt.Color(255, 255, 255));
        panelRegProf.setPreferredSize(new java.awt.Dimension(1147, 784));
        panelRegProf.setLayout(null);

        etiquetaTituloProf.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaTituloProf.setForeground(new java.awt.Color(255, 0, 102));
        etiquetaTituloProf.setText("Editar perfil del profesional");
        panelRegProf.add(etiquetaTituloProf);
        etiquetaTituloProf.setBounds(350, 10, 450, 50);

        etiquetaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombreProf.setText("Nombre:");
        panelRegProf.add(etiquetaNombreProf);
        etiquetaNombreProf.setBounds(450, 120, 92, 29);

        etiquetaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaApellidosProf.setText("Apellidos:");
        panelRegProf.add(etiquetaApellidosProf);
        etiquetaApellidosProf.setBounds(440, 170, 110, 30);

        etiquetaFechaNacProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFechaNacProf.setText("Fecha de nacimiento:");
        panelRegProf.add(etiquetaFechaNacProf);
        etiquetaFechaNacProf.setBounds(320, 220, 230, 26);

        etiquetaNombTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaNombTituloProf.setText("Nombre de titulo profesional:");
        panelRegProf.add(etiquetaNombTituloProf);
        etiquetaNombTituloProf.setBounds(240, 270, 310, 29);

        etiquetaFechaGradProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFechaGradProf.setText("Fecha de graduación:");
        panelRegProf.add(etiquetaFechaGradProf);
        etiquetaFechaGradProf.setBounds(320, 320, 230, 26);

        etiquetaFotoPerfilProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaFotoPerfilProf.setText("Foto de perfil:");
        panelRegProf.add(etiquetaFotoPerfilProf);
        etiquetaFotoPerfilProf.setBounds(38, 82, 160, 40);

        cajaNombreProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreProf);
        cajaNombreProf.setBounds(560, 120, 160, 35);

        cajaApellidosProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaApellidosProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaApellidosProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaApellidosProf);
        cajaApellidosProf.setBounds(560, 170, 160, 35);

        cajaNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombreTituloProf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaNombreTituloProfFocusLost(evt);
            }
        });
        panelRegProf.add(cajaNombreTituloProf);
        cajaNombreTituloProf.setBounds(560, 270, 160, 35);

        btnAceptarProf.setBackground(new java.awt.Color(255, 0, 102));
        btnAceptarProf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptarProf.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarProf.setText("Aceptar");
        btnAceptarProf.setContentAreaFilled(false);
        btnAceptarProf.setOpaque(true);
        btnAceptarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarProfActionPerformed(evt);
            }
        });
        panelRegProf.add(btnAceptarProf);
        btnAceptarProf.setBounds(880, 610, 160, 40);

        etiquetaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etiquetaPaisDeGraduacion.setText("País de graduación:");
        panelRegProf.add(etiquetaPaisDeGraduacion);
        etiquetaPaisDeGraduacion.setBounds(340, 370, 210, 26);

        listaPaisDeGraduacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaPaisDeGraduacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelRegProf.add(listaPaisDeGraduacion);
        listaPaisDeGraduacion.setBounds(560, 370, 160, 35);

        etiquetaErrorNombreProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreProf);
        etiquetaErrorNombreProf.setBounds(740, 120, 310, 26);

        etiquetaErrorApellidoProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegProf.add(etiquetaErrorApellidoProf);
        etiquetaErrorApellidoProf.setBounds(740, 170, 330, 26);

        etiquetaErrorFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaNacimiento);
        etiquetaErrorFechaNacimiento.setBounds(740, 220, 390, 26);

        etiquetaErrorNombreTituloProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegProf.add(etiquetaErrorNombreTituloProf);
        etiquetaErrorNombreTituloProf.setBounds(740, 270, 340, 26);

        etiquetaErrorFechaGraduacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegProf.add(etiquetaErrorFechaGraduacion);
        etiquetaErrorFechaGraduacion.setBounds(740, 320, 310, 26);

        etiquetaErrorPaisGraduacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelRegProf.add(etiquetaErrorPaisGraduacion);
        etiquetaErrorPaisGraduacion.setBounds(740, 370, 310, 26);

        etiquetaMensajeAlAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelRegProf.add(etiquetaMensajeAlAceptar);
        etiquetaMensajeAlAceptar.setBounds(750, 540, 380, 40);
        panelRegProf.add(fechaNacimiento);
        fechaNacimiento.setBounds(560, 220, 160, 28);
        panelRegProf.add(fechaGraduacion);
        fechaGraduacion.setBounds(560, 320, 160, 28);

        btnCambiarFoto.setBackground(new java.awt.Color(255, 0, 102));
        btnCambiarFoto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setText("Cambiar Foto");
        btnCambiarFoto.setContentAreaFilled(false);
        btnCambiarFoto.setOpaque(true);
        btnCambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFotoActionPerformed(evt);
            }
        });
        panelRegProf.add(btnCambiarFoto);
        btnCambiarFoto.setBounds(40, 390, 190, 40);

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"))); // NOI18N
        fotoPerfil.setPreferredSize(new java.awt.Dimension(210, 270));
        panelRegProf.add(fotoPerfil);
        fotoPerfil.setBounds(30, 140, 210, 220);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelRegProf.add(btnVolver);
        btnVolver.setBounds(20, 10, 110, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRegProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreProfFocusLost
        String nombre = cajaNombreProf.getText();
        if (nombre.trim().isEmpty()) {
            etiquetaErrorNombreProf.setText("El nombre no puede ser vacío");
        } else {
            etiquetaErrorNombreProf.setText("");
        }
    }//GEN-LAST:event_cajaNombreProfFocusLost

    private void cajaNombreTituloProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaNombreTituloProfFocusLost
        String nombreTitulo = cajaNombreTituloProf.getText();
        if (nombreTitulo.trim().isEmpty()) {
            etiquetaErrorNombreTituloProf.setText("El titulo no puede ser vacío");
        } else {
            etiquetaErrorNombreTituloProf.setText("");
        }
    }//GEN-LAST:event_cajaNombreTituloProfFocusLost

    private void btnAceptarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarProfActionPerformed
        boolean nombreValido = !cajaNombreProf.getText().trim().isEmpty();
        boolean apellidoValido = !cajaApellidosProf.getText().trim().isEmpty();
        boolean fNacimientoValido = fechaNacimiento.getCalendar() != null;
        boolean nombreTituloValido = !cajaNombreTituloProf.getText().trim().isEmpty();
        boolean fGraduacionValido = fechaGraduacion.getCalendar() != null;
        if (nombreValido && apellidoValido
                && fNacimientoValido && nombreTituloValido && fGraduacionValido) {
            profesional.setNombre(cajaNombreProf.getText());
            profesional.setApellidos(cajaApellidosProf.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fNacimiento = formatter.format(fechaNacimiento.getCalendar().getTime());
            profesional.setFechaNacimiento(fNacimiento);
            profesional.setNombreTituloProf(cajaNombreTituloProf.getText());
            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            String fGraduacion = formatter2.format(fechaGraduacion.getCalendar().getTime());
            profesional.setFechaGraduacion(fGraduacion);
            profesional.setPaisObtuvoTitulo(profesional.getListaEnumPais()[listaPaisDeGraduacion.getSelectedIndex()]);
            etiquetaMensajeAlAceptar.setText("Profesional editado correctamente");
        } else {
            etiquetaMensajeAlAceptar.setText("Error al editar el profesional");
        }
    }//GEN-LAST:event_btnAceptarProfActionPerformed

    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("Archivo imagen", "jpg");
        fileChooser.setFileFilter(file);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon fotoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            ImageIcon fotoArreglada = resizeImageIcon(fotoPerfil, 210, 240);
            profesional.setFotoPerfil(fotoArreglada);
        }
        actualizar();
    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ventana.remove(this);
        PanelPerfilProfesional nuevo = new PanelPerfilProfesional(sistema, interfaz, ventana);
        interfaz.setActual(nuevo);
        ventana.add(nuevo);
        ventana.pack();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cajaApellidosProfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaApellidosProfFocusLost
        String apellido = cajaApellidosProf.getText();
        if (apellido.trim().isEmpty()) {
            etiquetaErrorApellidoProf.setText("El apellido no puede ser vacío");
        } else {
            etiquetaErrorApellidoProf.setText("");
        }
    }//GEN-LAST:event_cajaApellidosProfFocusLost

    void actualizar() {
        fotoPerfil.setIcon(profesional.getFotoPerfil());
    }

    ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
        graphics2D.dispose();
        return new ImageIcon(bufferedImage, imageIcon.getDescription());
    }

    private void cargarValoresActuales() {
        this.cajaNombreProf.setText(profesional.getNombre());
        this.cajaApellidosProf.setText(profesional.getApellidos());
        try {
            Date fechaNacimientoDate;
            fechaNacimientoDate = new SimpleDateFormat("dd/MM/yyyy").parse(profesional.getFechaNacimiento());
            this.fechaNacimiento.setDate(fechaNacimientoDate);
        } catch (ParseException ex) {
        }
        this.cajaNombreTituloProf.setText(profesional.getNombreTituloProf());
        try {
            Date fechaGraduacionDate;
            fechaGraduacionDate = new SimpleDateFormat("dd/MM/yyyy").parse(profesional.getFechaGraduacion());
            this.fechaGraduacion.setDate(fechaGraduacionDate);
        } catch (ParseException ex) {
        }
        this.listaPaisDeGraduacion.setSelectedItem(profesional.getPaisObtuvoTitulo());
        actualizar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarProf;
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cajaApellidosProf;
    private javax.swing.JTextField cajaNombreProf;
    private javax.swing.JTextField cajaNombreTituloProf;
    private javax.swing.JLabel etiquetaApellidosProf;
    private javax.swing.JLabel etiquetaErrorApellidoProf;
    private javax.swing.JLabel etiquetaErrorFechaGraduacion;
    private javax.swing.JLabel etiquetaErrorFechaNacimiento;
    private javax.swing.JLabel etiquetaErrorNombreProf;
    private javax.swing.JLabel etiquetaErrorNombreTituloProf;
    private javax.swing.JLabel etiquetaErrorPaisGraduacion;
    private javax.swing.JLabel etiquetaFechaGradProf;
    private javax.swing.JLabel etiquetaFechaNacProf;
    private javax.swing.JLabel etiquetaFotoPerfilProf;
    private javax.swing.JLabel etiquetaMensajeAlAceptar;
    private javax.swing.JLabel etiquetaNombTituloProf;
    private javax.swing.JLabel etiquetaNombreProf;
    private javax.swing.JLabel etiquetaPaisDeGraduacion;
    private javax.swing.JLabel etiquetaTituloProf;
    private com.toedter.calendar.JDateChooser fechaGraduacion;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JComboBox<String> listaPaisDeGraduacion;
    private javax.swing.JPanel panelRegProf;
    // End of variables declaration//GEN-END:variables

    private void addJDateChooserEvents() {
        fechaNacimiento.getDateEditor().getUiComponent().addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (fechaNacimiento.getCalendar() == null) {
                    etiquetaErrorFechaNacimiento.setText("Debe ingresar una fecha");
                } else {
                    etiquetaErrorFechaNacimiento.setText("");
                }
            }
        });

        fechaGraduacion.getDateEditor().getUiComponent().addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (fechaGraduacion.getCalendar() == null) {
                    etiquetaErrorFechaGraduacion.setText("Debe ingresar una fecha");
                } else {
                    etiquetaErrorFechaGraduacion.setText("");
                }
            }
        });
    }
}
