/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descansoApp.interfaz;

import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import descansoApp.herramientas.TipoCA;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class pnlAgregarCiudad extends javax.swing.JPanel {
    
    ArrayList<String> imagenes;
    private Sistema modelo;
    private JFrame miVentana;
    private JFileChooser chooser;
    private ArrayList<String> errores;
    private Ciudad ciudad;

    /**
     * Creates new form pnlAgregarCiudad
     */
    public pnlAgregarCiudad(Sistema unModelo, JFrame unContenedor) {
        initComponents();
        chooser = new JFileChooser();
        modelo = unModelo;
        miVentana = unContenedor;
        this.ciudad = new Ciudad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        btnAdjuntarImagenes = new javax.swing.JButton();
        btnAgregarMapa = new javax.swing.JButton();
        tFNombre = new javax.swing.JTextField();
        tFDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAInfoGeneral = new javax.swing.JTextArea();
        btnGuardarCiudad = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(200, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdjuntarImagenes.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        btnAdjuntarImagenes.setText("Adjuntar Imagenes");
        btnAdjuntarImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenesActionPerformed(evt);
            }
        });
        add(btnAdjuntarImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, -1));

        btnAgregarMapa.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        btnAgregarMapa.setText("Agregar Mapa");
        btnAgregarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMapaActionPerformed(evt);
            }
        });
        add(btnAgregarMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 141, -1));

        tFNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        tFNombre.setText("Nombre");
        tFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNombreActionPerformed(evt);
            }
        });
        add(tFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, -1));

        tFDescripcion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        tFDescripcion.setText("Descripcion");
        tFDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFDescripcionActionPerformed(evt);
            }
        });
        add(tFDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        tAInfoGeneral.setColumns(20);
        tAInfoGeneral.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        tAInfoGeneral.setRows(5);
        tAInfoGeneral.setText("Info General");
        jScrollPane1.setViewportView(tAInfoGeneral);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 170, 120));

        btnGuardarCiudad.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        btnGuardarCiudad.setText("Guardar");
        btnGuardarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCiudadActionPerformed(evt);
            }
        });
        add(btnGuardarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblTitulo.setText("Nueva Ciudad");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 270, 40));

        lblNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        lblNombre.setText("Nombre:");
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        lblDescripcion.setText("Descripción:");
        add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descansoApp/imagenes/fondoVentanas.jpg"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void tFDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFDescripcionActionPerformed

    private void btnGuardarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCiudadActionPerformed
        if (verificarCampos()){
            this.ciudad.setNombre(tFNombre.getText());
            this.ciudad.setDescripcion(tFDescripcion.getText());
            this.ciudad.setInfoGral(tAInfoGeneral.getText());
            modelo.agregarCiudad(this.ciudad);
            JOptionPane.showMessageDialog(this, "Ciudad correctamente agregada.");
            miVentana.dispose();
        }else{
            String mensaje = "Debe de completar los siguientes campos: ";
            for (int i =0;i<errores.size();i++){
                if (i+1==errores.size()){
                    mensaje+= errores.get(i) + ".";
                }else{
                     mensaje+= errores.get(i) + ", ";
                }
            }
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_btnGuardarCiudadActionPerformed

    private void btnAdjuntarImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenesActionPerformed
        /*  int returnVal = chooser.showDialog(pnlAgregarCiudad.this,"Attach" );
        chooser.setVisible(true);
        File[] files = chooser.getSelectedFiles();
        String a = "'a";
         */
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setMultiSelectionEnabled(true);
        chooser.setAcceptAllFileFilterUsed(false);
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
          //  route = chooser.getSelectedFile() + "";
            File [] files = chooser.getSelectedFiles();
            for (int i =0;i<files.length;i++){
                this.ciudad.agregarImagenDesdeRuta(files[i].getPath());
            }
        } else {
            System.out.println("No Selection ");
        }
        //  File[] filesInDirectory = chooser.getCurrentDirectory().listFiles();
    }//GEN-LAST:event_btnAdjuntarImagenesActionPerformed

    private void btnAgregarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMapaActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("agregarMapa");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            this.ciudad.agregarMapa(chooser.getSelectedFile().getPath());
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_btnAgregarMapaActionPerformed

    private void tFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFNombreActionPerformed
    
    
    
    private boolean verificarCampos (){
        errores = new ArrayList<>();
        boolean sinErrores = true;
        
        if(tFNombre.getText().isEmpty()){
            sinErrores = false;
           errores.add("Nombre");
        }if(tFDescripcion.getText().isEmpty()){
            sinErrores = false;
           errores.add("Descripción");
        }if(tAInfoGeneral.getText().isEmpty()){
            sinErrores = false;
           errores.add("Info General");
        }
        return sinErrores;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjuntarImagenes;
    private javax.swing.JButton btnAgregarMapa;
    private javax.swing.JButton btnGuardarCiudad;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea tAInfoGeneral;
    private javax.swing.JTextField tFDescripcion;
    private javax.swing.JTextField tFNombre;
    // End of variables declaration//GEN-END:variables
}
