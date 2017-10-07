package descansoApp.interfaz;

import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import descansoApp.dominio.Viaje;

public class pnlMisViajes extends javax.swing.JPanel {

    private Sistema modelo;
    private JFrame miVentana;

    public pnlMisViajes(Sistema unModelo, JFrame unContenedor) {
        initComponents();
        pnlResultados.setOpaque(false);
        pnlResultados.setLayout(new BoxLayout(pnlResultados, BoxLayout.PAGE_AXIS));
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

        modelo = unModelo;
        miVentana = unContenedor;

        cargarViajes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        pnlResultados = new javax.swing.JPanel();
        lblNoHay = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setAutoscrolls(true);
        scroll.setHorizontalScrollBar(null);
        scroll.setMaximumSize(new java.awt.Dimension(440, 195));
        scroll.setMinimumSize(new java.awt.Dimension(440, 195));
        scroll.setPreferredSize(new java.awt.Dimension(440, 195));

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        scroll.setViewportView(pnlResultados);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 340, 190));

        lblNoHay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNoHay.setForeground(new java.awt.Color(255, 255, 255));
        lblNoHay.setText("No hay viajes guardados!");
        add(lblNoHay, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 90, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblTitulo.setText("Mis Viajes");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoVentanas.jpg")));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void cargarViajes() {
        pnlResultados.removeAll();
        pnlResultados.repaint();

        ArrayList<Viaje> resultados = modelo.getListaViajes();

        int cantResultados = resultados.size();
        if (cantResultados > 0) {
            lblNoHay.setVisible(false);

            for (int i = 0; i < cantResultados; i++) {
                pResultadoMisViajes p = new pResultadoMisViajes(modelo, resultados.get(i), miVentana, this);

                pnlResultados.add(p);
            }

            pnlResultados.setVisible(true);
            pnlResultados.revalidate();
            pnlResultados.repaint();
        } else {
            lblNoHay.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNoHay;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
