package descansoApp.interfaz;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import descansoApp.dominio.Sistema;
import static descansoApp.herramientas.TipoCA.*;

public class pnlInformacionCiudad extends javax.swing.JPanel {

    private Sistema modelo;
    private descansoApp.dominio.Ciudad ciudad;
    private JFrame padre;
    int contador = 0;
    private ArrayList<ImageIcon> listaImagenes;

    public pnlInformacionCiudad(Sistema unModelo, descansoApp.dominio.Ciudad unaCiudad, JFrame unPadre) {
        initComponents();
        modelo = unModelo;
        ciudad = unaCiudad;
        padre = unPadre;
        listaImagenes = unaCiudad.getImagenes();
        if (listaImagenes.size() != 0) {
            lblGaleria.setIcon(listaImagenes.get(0));
        } else {
            lblGaleria.setText("No hay imágenes");
            lblGaleria.setHorizontalAlignment(0);
            lblGaleria.setVerticalAlignment(0);
            contador = -1;
        }
        txtIntroduccion.setOpaque(false);
        scroll1.setOpaque(false);
        scroll1.getViewport().setOpaque(false);
        scroll1.setBorder(null);

        txtInfoGral.setOpaque(false);
        scroll2.setOpaque(false);
        scroll2.getViewport().setOpaque(false);
        scroll2.setBorder(null);

        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnl = new javax.swing.JPanel();
        lblVolver = new javax.swing.JLabel();
        lblNombreCiudad = new javax.swing.JLabel();
        lblDondeDorimir = new javax.swing.JLabel();
        lblDondeComer = new javax.swing.JLabel();
        lblQueHacer = new javax.swing.JLabel();
        lblQueEstaCerca = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        lblAnterior = new javax.swing.JLabel();
        lblGaleria = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        txtIntroduccion = new javax.swing.JTextArea();
        scroll2 = new javax.swing.JScrollPane();
        txtInfoGral = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnHome.png")));
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        pnl.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 38, 30, 30));

        lblNombreCiudad.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 26)); // NOI18N
        lblNombreCiudad.setForeground(new java.awt.Color(102, 102, 255));
        lblNombreCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreCiudad.setText("Nombre de la Ciudad");
        pnl.add(lblNombreCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, -1));

        lblDondeDorimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeDormir.png")));
        lblDondeDorimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDondeDorimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDondeDorimirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDondeDorimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDondeDorimirMouseExited(evt);
            }
        });
        pnl.add(lblDondeDorimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 30));

        lblDondeComer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeComer.png")));
        lblDondeComer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDondeComer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDondeComerMouseExited(evt);
            }
        });
        pnl.add(lblDondeComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 150, 30));

        lblQueHacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueHacer.png")));
        lblQueHacer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQueHacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQueHacerMouseExited(evt);
            }
        });
        pnl.add(lblQueHacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 150, 30));

        lblQueEstaCerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueEstaCerca.png")));
        lblQueEstaCerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQueEstaCerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQueEstaCercaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQueEstaCercaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQueEstaCercaMouseExited(evt);
            }
        });
        pnl.add(lblQueEstaCerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 150, 30));

        pnlContenedor.setOpaque(false);
        pnlContenedor.setLayout(null);

        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGaleriader.png"))); // NOI18N
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        pnlContenedor.add(lblSiguiente);
        lblSiguiente.setBounds(720, 250, 26, 20);

        lblAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnGaleriaIzq.png"))); // NOI18N
        lblAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnteriorMouseClicked(evt);
            }
        });
        pnlContenedor.add(lblAnterior);
        lblAnterior.setBounds(380, 250, 26, 21);

        lblGaleria.setText(" ");
        lblGaleria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblGaleria.setMinimumSize(new java.awt.Dimension(450, 280));
        lblGaleria.setPreferredSize(new java.awt.Dimension(450, 280));
        pnlContenedor.add(lblGaleria);
        lblGaleria.setBounds(370, 120, 390, 280);

        scroll1.setMaximumSize(new java.awt.Dimension(162, 80));
        scroll1.setMinimumSize(new java.awt.Dimension(162, 80));
        scroll1.setPreferredSize(new java.awt.Dimension(162, 80));

        txtIntroduccion.setEditable(false);
        txtIntroduccion.setColumns(20);
        txtIntroduccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtIntroduccion.setForeground(new java.awt.Color(51, 51, 51));
        txtIntroduccion.setLineWrap(true);
        txtIntroduccion.setRows(5);
        txtIntroduccion.setToolTipText("");
        txtIntroduccion.setWrapStyleWord(true);
        txtIntroduccion.setAutoscrolls(false);
        txtIntroduccion.setBorder(null);
        txtIntroduccion.setHighlighter(null);
        scroll1.setViewportView(txtIntroduccion);

        pnlContenedor.add(scroll1);
        scroll1.setBounds(10, 20, 750, 80);

        txtInfoGral.setEditable(false);
        txtInfoGral.setColumns(20);
        txtInfoGral.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtInfoGral.setForeground(new java.awt.Color(51, 51, 51));
        txtInfoGral.setLineWrap(true);
        txtInfoGral.setRows(5);
        txtInfoGral.setWrapStyleWord(true);
        txtInfoGral.setHighlighter(null);
        txtInfoGral.setInheritsPopupMenu(true);
        scroll2.setViewportView(txtInfoGral);

        pnlContenedor.add(scroll2);
        scroll2.setBounds(10, 120, 340, 280);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Información General:");
        pnlContenedor.add(jLabel1);
        jLabel1.setBounds(10, 100, 140, 18);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Decripción:");
        pnlContenedor.add(jLabel2);
        jLabel2.setBounds(10, 0, 62, 18);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Galería de imágenes:");
        pnlContenedor.add(jLabel3);
        jLabel3.setBounds(370, 100, 140, 18);

        pnl.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 130, 780, 420));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoInicio2.jpg")));
        pnl.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(pnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMouseClicked
        if (contador != -1) {
            if (contador == 0) {
                contador = listaImagenes.size() - 1;
            } else {
                contador--;
            }
            lblGaleria.setIcon(listaImagenes.get(contador));
        }
    }//GEN-LAST:event_lblAnteriorMouseClicked

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        if (contador != -1) {
            if (contador == listaImagenes.size() - 1) {
                contador = 0;
            } else {
                contador++;
            }

            lblGaleria.setIcon(listaImagenes.get(contador));
        }
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblDondeDorimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeDorimirMouseEntered

    }//GEN-LAST:event_lblDondeDorimirMouseEntered

    private void lblDondeDorimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeDorimirMouseExited
        lblDondeDorimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeDormir.png")));
    }//GEN-LAST:event_lblDondeDorimirMouseExited

    private void lblDondeComerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeComerMouseEntered

    }//GEN-LAST:event_lblDondeComerMouseEntered

    private void lblDondeComerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeComerMouseExited
        lblDondeComer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnDondeComer.png")));
    }//GEN-LAST:event_lblDondeComerMouseExited

    private void lblQueHacerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueHacerMouseEntered

    }//GEN-LAST:event_lblQueHacerMouseEntered

    private void lblQueHacerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueHacerMouseExited
        lblQueHacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueHacer.png")));
    }//GEN-LAST:event_lblQueHacerMouseExited

    private void lblQueEstaCercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueEstaCercaMouseEntered

    }//GEN-LAST:event_lblQueEstaCercaMouseEntered

    private void lblQueEstaCercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueEstaCercaMouseExited
        lblQueEstaCerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/btnQueEstaCerca.png")));
    }//GEN-LAST:event_lblQueEstaCercaMouseExited

    private void lblDondeDorimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeDorimirMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo, ciudad, padre, alojamiento));
        padre.pack();
    }//GEN-LAST:event_lblDondeDorimirMouseClicked

    private void lblDondeComerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDondeComerMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo, ciudad, padre, estGastronomico));
        padre.pack();
    }//GEN-LAST:event_lblDondeComerMouseClicked

    private void lblQueHacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueHacerMouseClicked
        padre.remove(this);
        padre.add(new pnlDondeQue(modelo, ciudad, padre, actividad));
        padre.pack();
    }//GEN-LAST:event_lblQueHacerMouseClicked

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        padre.remove(this);
        padre.add(new pnlInicio(modelo, padre));
        padre.pack();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblQueEstaCercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQueEstaCercaMouseClicked
        padre.remove(this);
        padre.add(new pnlMapas(modelo, this.ciudad, padre));
        padre.pack();
    }//GEN-LAST:event_lblQueEstaCercaMouseClicked

    private void cargar() {
        lblNombreCiudad.setText(ciudad.getNombre());
        txtIntroduccion.setText(ciudad.getDescripcion());
        txtInfoGral.setText(ciudad.getInfoGral());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblDondeComer;
    private javax.swing.JLabel lblDondeDorimir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGaleria;
    private javax.swing.JLabel lblNombreCiudad;
    private javax.swing.JLabel lblQueEstaCerca;
    private javax.swing.JLabel lblQueHacer;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTextArea txtInfoGral;
    private javax.swing.JTextArea txtIntroduccion;
    // End of variables declaration//GEN-END:variables
}
