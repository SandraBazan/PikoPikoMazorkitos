/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import javax.swing.ImageIcon;

/**
 *
 * @author carlos-pc
 */
public class VentanaJuego extends javax.swing.JFrame {

    /**
     * Creates new form VentanaJuego
     */
    private boolean dado1Seleccionado = false;
    private boolean dado2Seleccionado = false;
    public VentanaJuego(int numJugadores, Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4) {
        initComponents();
        this.setResizable(false);
        this.setTitle("Picko Picko Mazorkitos");
        this.jLabel11.setIcon(new ImageIcon("res/bgGame.jpg"));
        this.logo.setIcon(new ImageIcon("res/logo.png"));
        this.jLabel11.setSize(1250, 700);
        this.jLabel11.setLocation(-110, 0);
        this.dado1.setIcon(new ImageIcon("res/dado/uno.png"));
        this.dado2.setIcon(new ImageIcon("res/dado/dos.png"));
        this.dado3.setIcon(new ImageIcon("res/dado/tres.png"));
        this.dado4.setIcon(new ImageIcon("res/dado/cuatro.png"));
        this.dado5.setIcon(new ImageIcon("res/dado/cinco.png"));
        this.dado6.setIcon(new ImageIcon("res/dado/mazorca.png"));
        this.dado7.setIcon(new ImageIcon("res/dado/cinco.png"));
        this.dado8.setIcon(new ImageIcon("res/dado/cuatro.png"));
        this.ficha1.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha2.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha3.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha4.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha5.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha6.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha7.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha8.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha9.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha10.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha11.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha12.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha13.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha14.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha15.setIcon(new ImageIcon("res/ficha/prueba.png"));


        this.gamePlayer1.setText(jugador1.getNombreJugador());
        this.gamePlayer2.setText(jugador2.getNombreJugador());
        this.gamePlayer3.setText(jugador3.getNombreJugador());
        this.gamePlayer4.setText(jugador4.getNombreJugador());
        


    }
    public VentanaJuego(int numJugadores, Jugador jugador1, Jugador jugador2, Jugador jugador3) {
        initComponents();
        this.setResizable(false);
        this.setTitle("Picko Picko Mazorkitos");
        this.jLabel11.setIcon(new ImageIcon("res/bgGame.jpg"));
        this.logo.setIcon(new ImageIcon("res/logo.png"));
        this.jLabel11.setSize(1250, 700);
        this.jLabel11.setLocation(-110, 0);
        this.dado1.setIcon(new ImageIcon("res/dado/uno.png"));
        this.dado2.setIcon(new ImageIcon("res/dado/dos.png"));
        this.dado3.setIcon(new ImageIcon("res/dado/tres.png"));
        this.dado4.setIcon(new ImageIcon("res/dado/cuatro.png"));
        this.dado5.setIcon(new ImageIcon("res/dado/cinco.png"));
        this.dado6.setIcon(new ImageIcon("res/dado/mazorca.png"));
        this.dado7.setIcon(new ImageIcon("res/dado/cinco.png"));
        this.dado8.setIcon(new ImageIcon("res/dado/cuatro.png"));
        this.ficha1.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha2.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha3.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha4.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha5.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha6.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha7.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha8.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha9.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha10.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha11.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha12.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha13.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha14.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha15.setIcon(new ImageIcon("res/ficha/prueba.png"));



        this.gamePlayer1.setText(jugador1.getNombreJugador());
        this.gamePlayer2.setText(jugador2.getNombreJugador());
        this.gamePlayer3.setText(jugador3.getNombreJugador());
        this.gamePlayer4.setText("Vacío");
        


    }
     public VentanaJuego(int numJugadores, Jugador jugador1, Jugador jugador2) {
        initComponents();
        this.setResizable(false);
        this.setTitle("Picko Picko Mazorkitos");
        this.jLabel11.setIcon(new ImageIcon("res/bgGame.jpg"));
        this.logo.setIcon(new ImageIcon("res/logo.png"));
        this.jLabel11.setSize(1250, 700);
        this.jLabel11.setLocation(-110, 0);
        this.dado1.setIcon(new ImageIcon("res/dado/uno.png"));
        this.dado2.setIcon(new ImageIcon("res/dado/dos.png"));
        this.dado3.setIcon(new ImageIcon("res/dado/tres.png"));
        this.dado4.setIcon(new ImageIcon("res/dado/cuatro.png"));
        this.dado5.setIcon(new ImageIcon("res/dado/cinco.png"));
        this.dado6.setIcon(new ImageIcon("res/dado/mazorca.png"));
        this.dado7.setIcon(new ImageIcon("res/dado/cinco.png"));
        this.dado8.setIcon(new ImageIcon("res/dado/cuatro.png"));
        this.ficha1.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha2.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha3.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha4.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha5.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha6.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha7.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha8.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha9.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha10.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha11.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha12.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha13.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha14.setIcon(new ImageIcon("res/ficha/prueba.png"));
        this.ficha15.setIcon(new ImageIcon("res/ficha/prueba.png"));



        this.gamePlayer1.setText(jugador1.getNombreJugador());
        this.gamePlayer2.setText(jugador2.getNombreJugador());
        this.gamePlayer3.setText("Vacío");
        this.gamePlayer4.setText("Vacío");
        


    }
    //Creamos un método auxiliar que permite cambiar el icono del dado seleccionado:
    private void setValueOnDado(javax.swing.JLabel origen, javax.swing.JLabel destino){
        destino.setIcon(origen.getIcon());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ficha1 = new javax.swing.JLabel();
        ficha2 = new javax.swing.JLabel();
        ficha3 = new javax.swing.JLabel();
        ficha4 = new javax.swing.JLabel();
        ficha5 = new javax.swing.JLabel();
        ficha6 = new javax.swing.JLabel();
        ficha7 = new javax.swing.JLabel();
        ficha8 = new javax.swing.JLabel();
        ficha9 = new javax.swing.JLabel();
        ficha10 = new javax.swing.JLabel();
        ficha11 = new javax.swing.JLabel();
        ficha12 = new javax.swing.JLabel();
        ficha13 = new javax.swing.JLabel();
        ficha14 = new javax.swing.JLabel();
        ficha15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        dado5 = new javax.swing.JLabel();
        dado6 = new javax.swing.JLabel();
        dado7 = new javax.swing.JLabel();
        dado8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        gamePlayer2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        gamePlayer1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        gamePlayer3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        gamePlayer4 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(739, 700));
        getContentPane().setLayout(null);

        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        ficha1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ficha1)
                .addGap(18, 18, 18)
                .addComponent(ficha2)
                .addGap(18, 18, 18)
                .addComponent(ficha3)
                .addGap(18, 18, 18)
                .addComponent(ficha4)
                .addGap(18, 18, 18)
                .addComponent(ficha5)
                .addGap(18, 18, 18)
                .addComponent(ficha6)
                .addGap(18, 18, 18)
                .addComponent(ficha7)
                .addGap(18, 18, 18)
                .addComponent(ficha8)
                .addGap(18, 18, 18)
                .addComponent(ficha9)
                .addGap(18, 18, 18)
                .addComponent(ficha10)
                .addGap(18, 18, 18)
                .addComponent(ficha11)
                .addGap(18, 18, 18)
                .addComponent(ficha12)
                .addGap(18, 18, 18)
                .addComponent(ficha13)
                .addGap(18, 18, 18)
                .addComponent(ficha14)
                .addGap(18, 18, 18)
                .addComponent(ficha15)
                .addContainerGap(439, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ficha1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha10, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha11, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha12, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha13, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha14, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(ficha15, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 130, 710, 86);

        dado1.setText("Dado 1");
        dado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado1MouseClicked(evt);
            }
        });

        dado2.setText("Dado 2");
        dado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado2MouseClicked(evt);
            }
        });

        dado3.setText("Dado 3");

        dado4.setText("Dado 4");

        dado5.setText("Dado 5");

        dado6.setText("Dado 6");

        dado7.setText("Dado 7");

        dado8.setText("Dado 8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dado8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dado8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dado6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dado7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(dado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 240, 640, 80);

        jPanel5.setBackground(new java.awt.Color(156, 92, 95));

        gamePlayer2.setText("Jugador2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(gamePlayer2)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer2)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(210, 490, 143, 110);

        jPanel4.setBackground(new java.awt.Color(130, 180, 180));
        jPanel4.setToolTipText("");

        gamePlayer1.setText("Jugador1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(gamePlayer1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer1)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 490, 155, 110);

        jPanel6.setBackground(new java.awt.Color(95, 127, 122));

        gamePlayer3.setText("Jugador3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(gamePlayer3)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer3)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(390, 490, 143, 110);

        jPanel7.setBackground(new java.awt.Color(252, 247, 94));

        gamePlayer4.setText("Jugador4");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(gamePlayer4)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer4)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(560, 490, 143, 110);

        logo.setText("jLabel1");
        getContentPane().add(logo);
        logo.setBounds(0, 0, 740, 130);

        jButton3.setText("Robar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 430, 66, 32);

        jButton4.setText("Seleccionar");
        getContentPane().add(jButton4);
        jButton4.setBounds(130, 430, 101, 32);

        jButton2.setText("Plantarse");
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 430, 87, 32);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lato Medium", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Salida del programa");
        jTextArea1.setRequestFocusEnabled(false);
        jTextArea1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 350, 490, 60);

        jButton1.setText("Lanzar");
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 430, 71, 32);

        jLabel11.setText("Juego del piko piko");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 122, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado1MouseClicked
        // TODO add your handling code here:
        if(!dado1Seleccionado){
            this.dado1.setEnabled(false);
            dado1Seleccionado = !dado1Seleccionado;
        }
        else{
            this.dado1.setEnabled(true);
            dado1Seleccionado = !dado1Seleccionado;
        }
        
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado1MouseClicked

    private void dado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado2MouseClicked

        // TODO add your handling code here:
        if(!dado2Seleccionado){
            this.dado1.setEnabled(false);
            dado2Seleccionado = !dado2Seleccionado;
        }
        else{
            this.dado1.setEnabled(true);
            dado2Seleccionado = !dado2Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dado5;
    private javax.swing.JLabel dado6;
    private javax.swing.JLabel dado7;
    private javax.swing.JLabel dado8;
    private javax.swing.JLabel ficha1;
    private javax.swing.JLabel ficha10;
    private javax.swing.JLabel ficha11;
    private javax.swing.JLabel ficha12;
    private javax.swing.JLabel ficha13;
    private javax.swing.JLabel ficha14;
    private javax.swing.JLabel ficha15;
    private javax.swing.JLabel ficha2;
    private javax.swing.JLabel ficha3;
    private javax.swing.JLabel ficha4;
    private javax.swing.JLabel ficha5;
    private javax.swing.JLabel ficha6;
    private javax.swing.JLabel ficha7;
    private javax.swing.JLabel ficha8;
    private javax.swing.JLabel ficha9;
    private javax.swing.JLabel gamePlayer1;
    private javax.swing.JLabel gamePlayer2;
    private javax.swing.JLabel gamePlayer3;
    private javax.swing.JLabel gamePlayer4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
