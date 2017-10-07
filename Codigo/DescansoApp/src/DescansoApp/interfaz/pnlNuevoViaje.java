package descansoApp.interfaz;

import com.toedter.calendar.JTextFieldDateEditor;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;
import java.util.ArrayList;

public class pnlNuevoViaje extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame miVentana;
    private Viaje modViaje;

    public pnlNuevoViaje(Sistema unModelo, JFrame unContenedor, Viaje modificarViaje) {
        initComponents();
        modelo = unModelo;
        miVentana = unContenedor;
        modViaje = modificarViaje;
        lblBoton.setVisible(true);

        JTextFieldDateEditor editorF = (JTextFieldDateEditor) dChooserFechaF.getDateEditor();
        editorF.setEditable(false);
        JTextFieldDateEditor editorI = (JTextFieldDateEditor) dChooserFechaI.getDateEditor();
        editorI.setEditable(false);

        if (modViaje == null) {
            lblVolver.setVisible(false);
            lblEliminar.setVisible(false);
        } else {
            txtNombre.setText(modViaje.getNombre());
            dChooserFechaI.setCalendar(modViaje.getFechaI());
            dChooserFechaF.setCalendar(modViaje.getFechaF());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        dChooserFechaI = new com.toedter.calendar.JDateChooser();
        dChooserFechaF = new com.toedter.calendar.JDateChooser();
        lblBoton = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, 20));

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Eliminar.png")));
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });
        add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 30));

        lblTitulo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblTitulo.setText("Nuevo Viaje");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 260, 40));
        add(dChooserFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, -1));
        add(dChooserFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, -1));

        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
        lblBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBotonMouseExited(evt);
            }
        });
        add(lblBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 30));

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png")));
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 20));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel2.setText("Fecha Inicio:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel3.setText("Fecha Fin:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoVentanas.jpg")));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered

    }//GEN-LAST:event_lblEliminarMouseEntered

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited

    }//GEN-LAST:event_lblEliminarMouseExited

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el viaje?", "Eliminar Viaje", JOptionPane.OK_CANCEL_OPTION);
        if (respuesta == JOptionPane.OK_OPTION) {
            modelo.eliminarViaje(modViaje);
            miVentana.dispose();
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void lblBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseClicked
        if (txtNombre.getText().length() > 0 && dChooserFechaI != null && dChooserFechaF != null) {
            Viaje viaje;

            ArrayList<Viaje> losViajes = modelo.getListaViajes();
            int pos = -1;
            if (modViaje == null) {
                viaje = new Viaje();
            } else {
                viaje = modViaje;
                pos = losViajes.indexOf(viaje);
            }
            String nuevoNombre = txtNombre.getText();
            Viaje viajeAux = new Viaje(nuevoNombre, dChooserFechaF.getCalendar(), dChooserFechaI.getCalendar());
            boolean existeNombre = false;
            for (int i = 0; i < losViajes.size(); i++) {
                if (losViajes.get(i).equals(viajeAux) && i!=pos) {
                    existeNombre = true;
                }
            }
            if (!existeNombre) {
                viaje.setNombre(nuevoNombre);
                Calendar c = dChooserFechaI.getCalendar();

                try {
                    viaje.setFechaI(c);
                    viaje.setFechaF(dChooserFechaI.getCalendar(), dChooserFechaF.getCalendar());

                    if (modViaje == null) {
                        modelo.agregarViaje(viaje);
                    }

                    miVentana.dispose();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Ingrese un formato de fecha válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ese nombre de viaje ya existe. Por favor elija otro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Datos incorrectos", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_lblBotonMouseClicked

    private void lblBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseEntered
        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardarONN.png")));
    }//GEN-LAST:event_lblBotonMouseEntered

    private void lblBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseExited
        lblBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGuardar.png")));
    }//GEN-LAST:event_lblBotonMouseExited

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        miVentana.remove(this);
        miVentana.add(new pnlMisViajes(modelo, miVentana));
        miVentana.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dChooserFechaF;
    private com.toedter.calendar.JDateChooser dChooserFechaI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
