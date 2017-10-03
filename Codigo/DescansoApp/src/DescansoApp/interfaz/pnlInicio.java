package descansoApp.interfaz;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import descansoApp.dominio.Sistema;
import java.awt.Color;

public class pnlInicio extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame padre;

    public pnlInicio(Sistema unModelo, JFrame miPadre) {
        initComponents();
        modelo = unModelo;
        padre = miPadre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscar = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnNuevoViaje = new javax.swing.JButton();
        btnAgregarCiudad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        lblBuscar.setBounds(640, 220, 20, 20);

        txtBuscador.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscador.setText("Busque por una ciudad por su nombre");
        txtBuscador.setToolTipText("Busque por una ciudad");
        txtBuscador.setBorder(null);
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
        txtBuscador.setBounds(230, 200, 370, 50);

        btnNuevoViaje.setText("Nuevo Viaje");
        btnNuevoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoViajeActionPerformed(evt);
            }
        });
        add(btnNuevoViaje);
        btnNuevoViaje.setBounds(90, 420, 160, 50);

        btnAgregarCiudad.setText("Agregar Ciudad");
        btnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiudadActionPerformed(evt);
            }
        });
        add(btnAgregarCiudad);
        btnAgregarCiudad.setBounds(570, 420, 150, 50);

        jButton1.setText("Mis Viajes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(340, 420, 150, 50);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondo_inicio_azulado.jpg")));
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
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscar();
        }
        
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void lblImagenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenMouseReleased
        
    }//GEN-LAST:event_lblImagenMouseReleased

    private void btnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiudadActionPerformed
        PopUp p= new PopUp();
        p.add(new pnlAgregarCiudad(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnAgregarCiudadActionPerformed

    private void btnNuevoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoViajeActionPerformed
        PopUp p= new PopUp();
        p.add(new pnlNuevoViaje(modelo, p,null));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_btnNuevoViajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PopUp p= new PopUp();
        p.add(new pnlMisViajes(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyPressed
        if (txtBuscador.getText().equals("Busque por una ciudad por su nombre")) {
            txtBuscador.setText("");
            txtBuscador.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtBuscadorKeyPressed

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
    private javax.swing.JButton btnNuevoViaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
