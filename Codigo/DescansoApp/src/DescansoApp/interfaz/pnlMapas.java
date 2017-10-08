package descansoApp.interfaz;

import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import javax.swing.JLabel;

public class pnlMapas extends javax.swing.JPanel {

    private Sistema modelo;
    private descansoApp.dominio.Ciudad ciudad;
    private JFrame padre;

    public pnlMapas(Sistema unModelo, descansoApp.dominio.Ciudad unaCiudad, JFrame unPadre) {
        initComponents();
        modelo = unModelo;
        ciudad = unaCiudad;
        padre = unPadre;
        lblMapa.setSize(1000, 500);
        lblTitulo.setText("Mapa de " + ciudad.getNombre());
        if (unaCiudad.getMapa() != null) {
            lblMapa.setIcon(unaCiudad.getMapa());
        } else {
            lblMapa.setText("No hay mapa disponible para esta ciudad");
            lblMapa.setHorizontalAlignment(0);
            lblMapa.setVerticalAlignment(1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolver = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMapa = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnVolver.png")));
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        lblTitulo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblTitulo.setText("Mapa de Fray Bentos");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, 267, -1));

        lblMapa.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        lblMapa.setForeground(new java.awt.Color(51, 51, 51));
        add(lblMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 600, 320));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoInicio2.jpg")));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new pnlInformacionCiudad(modelo, ciudad, padre));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMapa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolver;
    // End of variables declaration//GEN-END:variables
}
