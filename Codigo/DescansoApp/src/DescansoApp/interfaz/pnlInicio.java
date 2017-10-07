package descansoApp.interfaz;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import java.awt.Color;
import javax.swing.JLabel;

public class pnlInicio extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;

    public pnlInicio(Sistema unModelo, JFrame miPadre) {
        initComponents();
        modelo = unModelo;
        padre = miPadre;
        txtBuscador.setText("Fray Bentos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnNuevoViaje = new javax.swing.JButton();
        btnAgregarCiudad = new javax.swing.JButton();
        btnMisViajes = new javax.swing.JButton();
        btnAgregarComercioActividad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 500));
        setLayout(null);

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/Lupa.png")));
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        add(lblBuscar);
        lblBuscar.setBounds(610, 230, 30, 30);

        txtBuscador.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscador.setText("Busque por una ciudad por su nombre");
        txtBuscador.setToolTipText("Busque por una ciudad");
        txtBuscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscador.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });
        add(txtBuscador);
        txtBuscador.setBounds(230, 220, 370, 50);

        btnNuevoViaje.setText("Nuevo Viaje");
        btnNuevoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoViajeActionPerformed(evt);
            }
        });
        add(btnNuevoViaje);
        btnNuevoViaje.setBounds(190, 320, 200, 50);

        btnAgregarCiudad.setText("Agregar Ciudad");
        btnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiudadActionPerformed(evt);
            }
        });
        add(btnAgregarCiudad);
        btnAgregarCiudad.setBounds(190, 390, 200, 50);

        btnMisViajes.setText("Mis Viajes");
        btnMisViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisViajesActionPerformed(evt);
            }
        });
        add(btnMisViajes);
        btnMisViajes.setBounds(430, 320, 200, 50);

        btnAgregarComercioActividad.setText("Agregar Comercio/Actividad");
        btnAgregarComercioActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComercioActividadActionPerformed(evt);
            }
        });
        add(btnAgregarComercioActividad);
        btnAgregarComercioActividad.setBounds(430, 390, 200, 50);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("DescansoApp");
        add(jLabel1);
        jLabel1.setBounds(230, 50, 370, 120);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoInicio2.jpg")));
        lblImagen.setPreferredSize(new java.awt.Dimension(800, 450));
        lblImagen.setVerifyInputWhenFocusTarget(false);
        lblImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImagenMouseReleased(evt);
            }
        });
        add(lblImagen);
        lblImagen.setBounds(0, 0, 840, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        buscar();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscar();
        }

    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void lblImagenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenMouseReleased

    }//GEN-LAST:event_lblImagenMouseReleased

    private void btnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiudadActionPerformed
        PopUp p = new PopUp();
        p.add(new pnlAgregarCiudad(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnAgregarCiudadActionPerformed

    private void btnNuevoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoViajeActionPerformed
        PopUp p = new PopUp();
        p.add(new pnlNuevoViaje(modelo, p, null));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnNuevoViajeActionPerformed

    private void btnMisViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisViajesActionPerformed
        PopUp p = new PopUp();
        p.add(new pnlMisViajes(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnMisViajesActionPerformed

    private void txtBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyPressed
        if (txtBuscador.getText().equals("Busque por una ciudad por su nombre")) {
            txtBuscador.setText("");
            txtBuscador.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtBuscadorKeyPressed

    private void btnAgregarComercioActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComercioActividadActionPerformed
        PopUp p = new PopUp();
        p.add(new pnlAgregarComercioActividad(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnAgregarComercioActividadActionPerformed

    private void buscar() {
        if (txtBuscador.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una palabra clave (más de tres letras) en el cuadro de busqueda", "Busqueda Vacía", JOptionPane.INFORMATION_MESSAGE);
        } else {
            padre.remove(this);
            padre.add(new pnlResultadoBusqueda(modelo, padre, txtBuscador.getText()), BorderLayout.WEST);
            padre.pack();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCiudad;
    private javax.swing.JButton btnAgregarComercioActividad;
    private javax.swing.JButton btnMisViajes;
    private javax.swing.JButton btnNuevoViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
