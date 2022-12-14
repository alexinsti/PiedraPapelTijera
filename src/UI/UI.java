/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author damm
 */
public class UI extends javax.swing.JFrame {

    
    ImageIcon iconoPiedra;
    private BufferedImage streamPiedra;
    
    ImageIcon iconoPapel;
    private BufferedImage streamPapel;
    
    ImageIcon iconoTijera;
    private BufferedImage streamTijera;
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        jPanelPrincipal.setBackground(Color.white);
        jPanelOpciones.setBackground(Color.white);
        jPanelProgreso.setBackground(Color.white);
        jPanelResultado.setBackground(Color.white);
        //cargar el fichero de la imagen en el buffererImage
        try {
            
            streamPiedra = ImageIO.read(new File("src//Images//Piedra.jpg"));
            streamPapel = ImageIO.read(new File("src//Images//Papel.jpg"));
            streamTijera = ImageIO.read(new File("src//Images//Tijeras.jpg"));
            
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Si no está vacio se asigna la imagen a la etiqueta
        iconoPiedra=new ImageIcon(streamPiedra);
        jButtonPiedra.setIcon(iconoPiedra);
        jButtonPiedra.setBackground(Color.lightGray);
        
        iconoPapel=new ImageIcon(streamPapel);
        jButtonPapel.setIcon(iconoPapel);
        jButtonPapel.setBackground(Color.lightGray);
        
        iconoTijera=new ImageIcon(streamTijera);
        jButtonTijera.setIcon(iconoTijera);
        jButtonTijera.setBackground(Color.lightGray);
        
        jPanel1.setBackground(Color.white);
        jPanel2.setBackground(Color.white);
        jPanel3.setBackground(Color.white);
        muestraResultadoFinal(1);
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelOpciones = new javax.swing.JPanel();
        jButtonPiedra = new javax.swing.JButton();
        jButtonPapel = new javax.swing.JButton();
        jButtonTijera = new javax.swing.JButton();
        jPanelResultado = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelProgreso = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setLayout(new java.awt.GridLayout(3, 0));

        jPanelOpciones.setLayout(new java.awt.GridLayout());

        jButtonPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiedraActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jButtonPiedra);
        jPanelOpciones.add(jButtonPapel);
        jPanelOpciones.add(jButtonTijera);

        jPanelPrincipal.add(jPanelOpciones);

        jPanelResultado.setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jLabel4);

        jPanelResultado.add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabelResultado, java.awt.BorderLayout.CENTER);

        jPanelResultado.add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(jLabel3);

        jPanelResultado.add(jPanel3);

        jPanelPrincipal.add(jPanelResultado);

        jPanelProgreso.setLayout(new javax.swing.BoxLayout(jPanelProgreso, javax.swing.BoxLayout.LINE_AXIS));
        jPanelPrincipal.add(jPanelProgreso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiedraActionPerformed
        // TODO add your handling code here:
        muestraResultado(1);
        System.out.println("boton priedra");
    }//GEN-LAST:event_jButtonPiedraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    
    public void muestraResultado(int opcion){
        String ruta="";
        ImageIcon imagen;
        
        switch(opcion){
            case 1:
                ruta="src//Images//Acierto.jpg";
                break;
            case 2:
                ruta="src//Images//Fallo.jpg";
                break;
            case 3:
                ruta="src//Images//Igual.jpg";
                break;
        }
        BufferedImage streamImg;
        try {
            streamImg = ImageIO.read(new File(ruta));
            imagen=new ImageIcon(streamImg);
            JLabel label= new JLabel();
            label.setIcon(imagen);
            label.setOpaque(true);
            jPanelProgreso.add((Component)label);
            
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void muestraResultadoFinal(int opcion){
        String ruta="";
        ImageIcon imagen;
        
        switch(opcion){
            case 1:
                ruta="src//Images//victoria.jpg";
                break;
            case 2:
                ruta="src//Images//derrota.jpg";
                break;
            case 3:
                ruta="src//Images//empate.jpg";
                break;
        }
        BufferedImage streamImg;
        try {
            streamImg = ImageIO.read(new File(ruta));
            imagen=new ImageIcon(streamImg);
            jLabelResultado.setIcon(imagen);

        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPapel;
    private javax.swing.JButton jButtonPiedra;
    private javax.swing.JButton jButtonTijera;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProgreso;
    private javax.swing.JPanel jPanelResultado;
    // End of variables declaration//GEN-END:variables
}
