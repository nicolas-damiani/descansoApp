package descansoApp.interfaz;

import com.toedter.calendar.JTextFieldDateEditor;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Evento;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import descansoApp.herramientas.EsNumero;
import java.util.ArrayList;

public class pnlEvento extends javax.swing.JPanel {

    private Viaje viaje;
    private Evento modEvento;
    private descansoApp.dominio.Ciudad ciudad;
    private JFrame miVentana;
    private Sistema modelo;

    public pnlEvento(Sistema unModelo, Viaje unViaje, descansoApp.dominio.Ciudad unaCiudad, Evento unEvento, JFrame unContenedor) {
        initComponents();
        modelo = unModelo;
        viaje = unViaje;
        modEvento = unEvento;
        ciudad = unaCiudad;
        miVentana = unContenedor;
        JTextFieldDateEditor editorF = (JTextFieldDateEditor) dChosserFechaF.getDateEditor();
        editorF.setEditable(false);
        JTextFieldDateEditor editorI = (JTextFieldDateEditor) dChosserFechaI.getDateEditor();
        editorI.setEditable(false);
        txtDescripcion.setLineWrap(true);

        if (modEvento == null) {
            lblEliminar1.setVisible(false);
            lblVolver.setVisible(false);
        } else {
            txtNombre.setText(modEvento.getNombre());
            txtDescripcion.setText(modEvento.getDescripcion());
            txtHoraIHoras.setText("" + modEvento.getFechaHoraI().get(Calendar.HOUR));
            txtHoraIMinutos.setText("" + modEvento.getFechaHoraI().get(Calendar.MINUTE));
            txtHoraFHoras.setText("" + modEvento.getFechaHoraF().get(Calendar.HOUR));
            txtHoraFMinutos.setText("" + modEvento.getFechaHoraF().get(Calendar.MINUTE));
            txtUbicacion.setText(modEvento.getUbicacion());
            dChosserFechaI.setCalendar(modEvento.getFechaHoraI());
            dChosserFechaF.setCalendar(modEvento.getFechaHoraF());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        dChosserFechaI = new com.toedter.calendar.JDateChooser();
        dChosserFechaF = new com.toedter.calendar.JDateChooser();
        txtHoraIMinutos = new javax.swing.JFormattedTextField();
        txtUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFHoras = new javax.swing.JFormattedTextField();
        txtHoraIHoras = new javax.swing.JFormattedTextField();
        txtHoraFMinutos = new javax.swing.JFormattedTextField();
        lblEliminar1 = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(490, 285));
        setMinimumSize(new java.awt.Dimension(490, 285));
        setPreferredSize(new java.awt.Dimension(490, 285));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 200, 150));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 18));

        dChosserFechaI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(dChosserFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));

        dChosserFechaF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(dChosserFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        txtHoraIMinutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHoraIMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraIMinutosActionPerformed(evt);
            }
        });
        add(txtHoraIMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 19, 18));

        txtUbicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 130, 18));

        jLabel1.setText(" :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 10, 20));

        jLabel5.setText(" :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 10, 20));

        txtHoraFHoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHoraFHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFHorasActionPerformed(evt);
            }
        });
        add(txtHoraFHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 19, 18));

        txtHoraIHoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHoraIHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraIHorasActionPerformed(evt);
            }
        });
        add(txtHoraIHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 19, 18));

        txtHoraFMinutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHoraFMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFMinutosActionPerformed(evt);
            }
        });
        add(txtHoraFMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 19, 18));

        lblEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png")));
        lblEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminar1MouseExited(evt);
            }
        });
        add(lblEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 30));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png")));
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ubicación:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Nuevo Evento");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha Inicio:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Hora Inicio:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha Fin:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Hora Fin:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Descripción:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nombre:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 245, 110, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoVentanas.jpg")));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtHoraIMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraIMinutosActionPerformed

    }//GEN-LAST:event_txtHoraIMinutosActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed

    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtHoraFHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFHorasActionPerformed

    }//GEN-LAST:event_txtHoraFHorasActionPerformed

    private void txtHoraIHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraIHorasActionPerformed

    }//GEN-LAST:event_txtHoraIHorasActionPerformed

    private void txtHoraFMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFMinutosActionPerformed

    }//GEN-LAST:event_txtHoraFMinutosActionPerformed

    public boolean esNumero(String texto) {
        boolean correcto;
        int num;

        try {
            num = Integer.parseInt(texto);
            correcto = true;
        } catch (NumberFormatException e) {
            correcto = false;
        }

        return correcto;
    }

    private void lblEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el evento?", "Eliminar Evento", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            viaje.eliminarEvento(modEvento);

            miVentana.remove(this);
            miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
            miVentana.pack();
        }
    }//GEN-LAST:event_lblEliminar1MouseClicked

    private void lblEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseEntered

    }//GEN-LAST:event_lblEliminar1MouseEntered

    private void lblEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminar1MouseExited

    }//GEN-LAST:event_lblEliminar1MouseExited

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().length() > 0 && txtUbicacion.getText().length() > 0 && txtDescripcion.getText().length() > 0
                && txtHoraIHoras.getText().length() > 0 && txtHoraIMinutos.getText().length() > 0 && txtHoraFHoras.getText().length() > 0
                && txtHoraFMinutos.getText().length() > 0 && dChosserFechaI.getDate() != null && dChosserFechaF.getDate() != null) {

            Evento evento;
            int pos=-1;
            ArrayList<Evento> losEventos = viaje.getItinerario();
            if (modEvento == null) {
                evento = new Evento();
            } else {
                evento = modEvento;
                pos = losEventos.indexOf(evento);
            }

            String nuevoNombre = txtNombre.getText();
            Evento eventoAux = new Evento(nuevoNombre, dChosserFechaI.getCalendar(), dChosserFechaF.getCalendar(), "", "", ciudad);
            boolean existeNombre = false;
            for (int i = 0; i < losEventos.size(); i++) {
                if (losEventos.get(i).equals(eventoAux) && i!=pos) {
                    existeNombre = true;
                }
            }
            if (!existeNombre) {
                evento.setNombre(nuevoNombre);
                evento.setUbicacion(txtUbicacion.getText());
                evento.setDescripcion(txtDescripcion.getText());
                evento.setCiudad(ciudad);

                if (!esNumero(txtHoraIHoras.getText()) || !esNumero(txtHoraIMinutos.getText())
                        || !esNumero(txtHoraFHoras.getText()) || !esNumero(txtHoraFMinutos.getText())) {
                    JOptionPane.showMessageDialog(this, "Formato incorrecto de la hora ingresada.", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    int hIHoras = Integer.parseInt(txtHoraIHoras.getText());
                    int hIMinutos = Integer.parseInt(txtHoraIMinutos.getText());
                    int hFHoras = Integer.parseInt(txtHoraFHoras.getText());
                    int hFMinutos = Integer.parseInt(txtHoraFMinutos.getText());

                    if ((hIHoras >= 0 && hIHoras <= 23) && (hIMinutos >= 0 && hIMinutos <= 59) && (hFHoras >= 0 && hFHoras <= 23) && (hFMinutos >= 0 && hFMinutos <= 59)) {

                        Calendar cFechaI = dChosserFechaI.getCalendar();
                        Calendar cFechaF = dChosserFechaF.getCalendar();
                        cFechaF.set(Calendar.MILLISECOND, 0);
                        cFechaF.set(Calendar.SECOND, 0);
                        cFechaI.set(Calendar.MILLISECOND, 0);
                        cFechaI.set(Calendar.SECOND, 0);

                        cFechaI.set(Calendar.HOUR_OF_DAY, hIHoras);
                        cFechaI.set(Calendar.MINUTE, hIMinutos);
                        cFechaF.set(Calendar.HOUR_OF_DAY, hFHoras);
                        cFechaF.set(Calendar.MINUTE, hFMinutos);

                        try {
                            evento.setFechaHoraI(cFechaI);
                            evento.setFechaHoraF(cFechaI, cFechaF);
                            if (evento.getFechaHoraI().compareTo(evento.getFechaHoraF()) != 0) {

                                boolean existeEvento = false;
                                for (int i = 0; i < losEventos.size(); i++) {
                                    if (Evento.overlappingEvents(evento, losEventos.get(i)) && i!=pos) {
                                        existeEvento = true;
                                    }
                                }
                                if (!existeEvento) {
                                    if (modEvento == null) {
                                        viaje.agregarEvento(evento);
                                        miVentana.dispose();
                                    } else {
                                        miVentana.remove(this);
                                        miVentana.add(new pnlItinerario(modelo, viaje, miVentana));
                                        miVentana.pack();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "El evento coincide con otros eventos del viaje", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "La fecha y hora de inicio no puede ser igual a la final.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Formato incorrecto de la hora ingresada", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(miVentana, "Ya existe un evento con ese nombre.", "Datos incorrectos", WIDTH);
            }
        } else {
            JOptionPane.showMessageDialog(miVentana, "Por favor ingrese todos los datos.", "Datos incorrectos", WIDTH);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dChosserFechaF;
    private com.toedter.calendar.JDateChooser dChosserFechaI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminar1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JFormattedTextField txtHoraFHoras;
    private javax.swing.JFormattedTextField txtHoraFMinutos;
    private javax.swing.JFormattedTextField txtHoraIHoras;
    private javax.swing.JFormattedTextField txtHoraIMinutos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
