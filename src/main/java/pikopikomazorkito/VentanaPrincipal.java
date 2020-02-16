/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos-pc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private ImageIcon img;

    public VentanaPrincipal() {
        initComponents();
        this.setResizable(false);//Que la ventana no se redimensione
        this.setBounds(500, 250, 1000, 700);
        this.setTitle("Picko Picko Mazorkitos");
        this.setBackground(Color.WHITE);
        this.img = new ImageIcon("res/bg.jpg");
        this.etiquetaImagen.setIcon(this.img);
        this.etiquetaImagen.setText("");
        this.etiquetaImagen.setSize(1250, 700);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 23, 700, 1000));
        setUndecorated(true);
        getContentPane().setLayout(null);

        startButton.setText("Iniciar");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton);
        startButton.setBounds(100, 550, 69, 32);

        exitButton.setText("Salir");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(840, 550, 57, 32);

        etiquetaImagen.setText("Bienvenido a Piko Piko Mazorquito");
        getContentPane().add(etiquetaImagen);
        etiquetaImagen.setBounds(0, 0, 520, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO Añadir el método que permita seleccionar el número de jugadores

        //Aquí esta el JOption con los jugadores que se crean
        Integer[] jugadores = {2, 3, 4};

        Object opcion = JOptionPane.showInputDialog(null, "¿Cuantos jugadores van a jugar?", "Elegir", JOptionPane.QUESTION_MESSAGE, null, jugadores, jugadores[0]);

        int gamers = (int) opcion;

        Jugador[] jugones = new Jugador[gamers];

        for (int i = 0; i < jugones.length; i++) {
            String texto = JOptionPane.showInputDialog("Digame el nombre del jugador " + (i + 1));
            jugones[i] = new Jugador(texto);
        }

        //Imprimo los jugadores por si sale algún fallo pero los crea perfectamente
        for (Jugador aux : jugones) {
            System.out.println(aux);
        }

        new VentanaJuego().setVisible(true);


    }//GEN-LAST:event_startButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);//Cierra la aplicación
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

}
