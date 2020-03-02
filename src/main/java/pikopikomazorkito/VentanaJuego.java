/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikopikomazorkito;

import java.util.ArrayList;
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
    private boolean dado3Seleccionado = false;
    private boolean dado4Seleccionado = false;
    private boolean dado5Seleccionado = false;
    private boolean dado6Seleccionado = false;
    private boolean dado7Seleccionado = false;
    private boolean dado8Seleccionado = false;
    //private TurnoJugador turno;

    //Llamar en cada constructor a la ficha con la clase Enum de Racion.
    public VentanaJuego(int numJugadores, Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4, ArrayList<Jugador> jugadores) {
        initComponents();
        //Esto hace que no se redimensione la pantalla
        this.setResizable(false);
        //Establece del titulo de la ventana
        this.setTitle("Picko Picko Mazorkitos");
        //Coge el icono del jLabell principal
        this.jLabel11.setIcon(new ImageIcon("res/bgGame.jpg"));
        //Coge la imagen logo
        this.logo.setIcon(new ImageIcon("res/logo.png"));
        //Dimensiones de la pantalla
        this.jLabel11.setSize(1250, 700);
        //Localización de la pantalla
        this.jLabel11.setLocation(-110, 0);
        
        //Mostrar las imagenes de los dados gracias al Enum de CaraDado
        this.dado1.setIcon(CaraDado.CARA6.getImagen());
        this.dado2.setIcon(CaraDado.CARA1.getImagen());
        this.dado3.setIcon(CaraDado.CARA2.getImagen());
        this.dado4.setIcon(CaraDado.CARA3.getImagen());
        this.dado5.setIcon(CaraDado.CARA4.getImagen());
        this.dado6.setIcon(CaraDado.CARA5.getImagen());
        this.dado7.setIcon(CaraDado.CARA6.getImagen());
        this.dado8.setIcon(CaraDado.CARA6.getImagen());
        
        //Mostrar las imagenes de las raciones gracias al Enum de Racion
        this.ficha1.setIcon(Racion.RACION21.getImagen());
        this.ficha2.setIcon(Racion.RACION22.getImagen());
        this.ficha3.setIcon(Racion.RACION23.getImagen());
        this.ficha4.setIcon(Racion.RACION24.getImagen());
        this.ficha5.setIcon(Racion.RACION25.getImagen());
        this.ficha6.setIcon(Racion.RACION26.getImagen());
        this.ficha7.setIcon(Racion.RACION27.getImagen());
        this.ficha8.setIcon(Racion.RACION28.getImagen());
        this.ficha9.setIcon(Racion.RACION29.getImagen());
        this.ficha10.setIcon(Racion.RACION30.getImagen());
        this.ficha11.setIcon(Racion.RACION31.getImagen());
        this.ficha12.setIcon(Racion.RACION32.getImagen());
        this.ficha13.setIcon(Racion.RACION33.getImagen());
        this.ficha14.setIcon(Racion.RACION34.getImagen());
        this.ficha15.setIcon(Racion.RACION35.getImagen());
        //FALTA AÑADIR LA FICHA 36 A LA VENTANAJUEGO
        //this.ficha16.setIcon(Racion.RACION36.getImagen());
        
        this.gamePlayer1.setText(jugador1.getNombreJugador());
        this.gamePlayer2.setText(jugador2.getNombreJugador());
        this.gamePlayer3.setText(jugador3.getNombreJugador());
        this.gamePlayer4.setText(jugador4.getNombreJugador());

    }

    public VentanaJuego(int numJugadores, Jugador jugador1, Jugador jugador2, Jugador jugador3, ArrayList<Jugador> jugadores) {
        initComponents();
        //Esto hace que no se redimensione la pantalla
        this.setResizable(false);
        //Establece del titulo de la ventana
        this.setTitle("Picko Picko Mazorkitos");
        //Coge el icono del jLabell principal
        this.jLabel11.setIcon(new ImageIcon("res/bgGame.jpg"));
        //Coge la imagen logo
        this.logo.setIcon(new ImageIcon("res/logo.png"));
        //Dimensiones de la pantalla
        this.jLabel11.setSize(1250, 700);
        //Localización de la pantalla
        this.jLabel11.setLocation(-110, 0);
        
        //Mostrar las imagenes de los dados gracias al Enum de CaraDado
        this.dado1.setIcon(CaraDado.CARA6.getImagen());
        this.dado2.setIcon(CaraDado.CARA1.getImagen());
        this.dado3.setIcon(CaraDado.CARA2.getImagen());
        this.dado4.setIcon(CaraDado.CARA3.getImagen());
        this.dado5.setIcon(CaraDado.CARA4.getImagen());
        this.dado6.setIcon(CaraDado.CARA5.getImagen());
        this.dado7.setIcon(CaraDado.CARA6.getImagen());
        this.dado8.setIcon(CaraDado.CARA6.getImagen());
 
        //Mostrar las imagenes de las Raciones gracias al Enum de Racion
        this.ficha1.setIcon(Racion.RACION21.getImagen());
        this.ficha2.setIcon(Racion.RACION22.getImagen());
        this.ficha3.setIcon(Racion.RACION23.getImagen());
        this.ficha4.setIcon(Racion.RACION24.getImagen());
        this.ficha5.setIcon(Racion.RACION25.getImagen());
        this.ficha6.setIcon(Racion.RACION26.getImagen());
        this.ficha7.setIcon(Racion.RACION27.getImagen());
        this.ficha8.setIcon(Racion.RACION28.getImagen());
        this.ficha9.setIcon(Racion.RACION29.getImagen());
        this.ficha10.setIcon(Racion.RACION30.getImagen());
        this.ficha11.setIcon(Racion.RACION31.getImagen());
        this.ficha12.setIcon(Racion.RACION32.getImagen());
        this.ficha13.setIcon(Racion.RACION33.getImagen());
        this.ficha14.setIcon(Racion.RACION34.getImagen());
        this.ficha15.setIcon(Racion.RACION35.getImagen());
        //FALTA AÑADIR LA FICHA 36 A LA VENTANAJUEGO
        //this.ficha16.setIcon(Racion.RACION36.getImagen());

        this.gamePlayer1.setText(jugador1.getNombreJugador());
        this.gamePlayer2.setText(jugador2.getNombreJugador());
        this.gamePlayer3.setText(jugador3.getNombreJugador());
        this.gamePlayer4.setText("Vacío");

    }

    public VentanaJuego(int numJugadores, Jugador jugador1, Jugador jugador2, ArrayList<Jugador> jugadores) {
        initComponents();
        //Esto hace que no se redimensione la pantalla
        this.setResizable(false);
        //Establece del titulo de la ventana
        this.setTitle("Picko Picko Mazorkitos");
        //Coge el icono del jLabell principal
        this.jLabel11.setIcon(new ImageIcon("res/bgGame.jpg"));
        //Coge la imagen logo
        this.logo.setIcon(new ImageIcon("res/logo.png"));
        //Dimensiones de la pantalla
        this.jLabel11.setSize(1250, 700);
        //Localización de la pantalla
        this.jLabel11.setLocation(-110, 0);
        
        //Mostrar las imagenes de los dados gracias al Enum de CaraDado
        this.dado1.setIcon(CaraDado.CARA6.getImagen());
        this.dado2.setIcon(CaraDado.CARA1.getImagen());
        this.dado3.setIcon(CaraDado.CARA2.getImagen());
        this.dado4.setIcon(CaraDado.CARA3.getImagen());
        this.dado5.setIcon(CaraDado.CARA4.getImagen());
        this.dado6.setIcon(CaraDado.CARA5.getImagen());
        this.dado7.setIcon(CaraDado.CARA6.getImagen());
        this.dado8.setIcon(CaraDado.CARA6.getImagen());
        
        //Mostrar las imagenes de las raciones gracias al Enum de las Raciones.
        this.ficha1.setIcon(Racion.RACION21.getImagen());
        this.ficha2.setIcon(Racion.RACION22.getImagen());
        this.ficha3.setIcon(Racion.RACION23.getImagen());
        this.ficha4.setIcon(Racion.RACION24.getImagen());
        this.ficha5.setIcon(Racion.RACION25.getImagen());
        this.ficha6.setIcon(Racion.RACION26.getImagen());
        this.ficha7.setIcon(Racion.RACION27.getImagen());
        this.ficha8.setIcon(Racion.RACION28.getImagen());
        this.ficha9.setIcon(Racion.RACION29.getImagen());
        this.ficha10.setIcon(Racion.RACION30.getImagen());
        this.ficha11.setIcon(Racion.RACION31.getImagen());
        this.ficha12.setIcon(Racion.RACION32.getImagen());
        this.ficha13.setIcon(Racion.RACION33.getImagen());
        this.ficha14.setIcon(Racion.RACION34.getImagen());
        this.ficha15.setIcon(Racion.RACION35.getImagen());
        //FALTA AÑADIR LA FICHA 36 A LA VENTANAJUEGO
        //this.ficha16.setIcon(Racion.RACION36.getImagen());

        this.gamePlayer1.setText(jugador1.getNombreJugador());
        this.gamePlayer2.setText(jugador2.getNombreJugador());
        this.gamePlayer3.setText("Vacío");
        this.gamePlayer4.setText("Vacío");

    }

    //Creamos un método auxiliar que permite cambiar el icono del dado seleccionado:
    private void setValueOnDado(javax.swing.JLabel origen, javax.swing.JLabel destino) {
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
                .addGap(15, 15, 15)
                .addComponent(ficha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ficha15)
                .addContainerGap(557, Short.MAX_VALUE))
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
        jPanel1.setBounds(0, 130, 740, 86);

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
        dado3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado3MouseClicked(evt);
            }
        });

        dado4.setText("Dado 4");
        dado4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado4MouseClicked(evt);
            }
        });

        dado5.setText("Dado 5");
        dado5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado5MouseClicked(evt);
            }
        });

        dado6.setText("Dado 6");
        dado6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado6MouseClicked(evt);
            }
        });

        dado7.setText("Dado 7");
        dado7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado7MouseClicked(evt);
            }
        });

        dado8.setText("Dado 8");
        dado8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado8MouseClicked(evt);
            }
        });

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
                .addGap(36, 36, 36)
                .addComponent(gamePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer2)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(210, 490, 141, 160);

        jPanel4.setBackground(new java.awt.Color(130, 180, 180));
        jPanel4.setToolTipText("");

        gamePlayer1.setText("Jugador1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(gamePlayer1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer1)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(30, 490, 140, 160);

        jPanel6.setBackground(new java.awt.Color(95, 127, 122));

        gamePlayer3.setText("Jugador3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(gamePlayer3)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer3)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(390, 490, 141, 160);

        jPanel7.setBackground(new java.awt.Color(252, 247, 94));

        gamePlayer4.setText("Jugador4");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(gamePlayer4)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePlayer4)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(560, 490, 141, 160);

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
        jButton3.setBounds(400, 430, 64, 32);

        jButton4.setText("Seleccionar");
        getContentPane().add(jButton4);
        jButton4.setBounds(130, 430, 98, 32);

        jButton2.setText("Plantarse");
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 430, 85, 32);

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
        jButton1.setBounds(280, 430, 69, 32);

        jLabel11.setText("Juego del piko piko");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 109, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void dado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado1MouseClicked
        // TODO add your handling code here:
        if (!dado1Seleccionado) {
            this.dado1.setEnabled(false);
            dado1Seleccionado = !dado1Seleccionado;
        } else {
            this.dado1.setEnabled(true);
            dado1Seleccionado = !dado1Seleccionado;
        }

        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado1MouseClicked

    private void dado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado2MouseClicked

        // TODO add your handling code here:
        if (!dado2Seleccionado) {
            this.dado2.setEnabled(false);
            dado2Seleccionado = !dado2Seleccionado;
        } else {
            this.dado2.setEnabled(true);
            dado2Seleccionado = !dado2Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado2MouseClicked

    private void dado3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado3MouseClicked
        // TODO add your handling code here:
        if (!dado3Seleccionado) {
            this.dado3.setEnabled(false);
            dado3Seleccionado = !dado3Seleccionado;
        } else {
            this.dado3.setEnabled(true);
            dado3Seleccionado = !dado3Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado3MouseClicked

    private void dado4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado4MouseClicked
        // TODO add your handling code here:
        if (!dado4Seleccionado) {
            this.dado4.setEnabled(false);
            dado4Seleccionado = !dado4Seleccionado;
        } else {
            this.dado4.setEnabled(true);
            dado4Seleccionado = !dado4Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado4MouseClicked

    private void dado5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado5MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!dado5Seleccionado) {
            this.dado5.setEnabled(false);
            dado5Seleccionado = !dado5Seleccionado;
        } else {
            this.dado5.setEnabled(true);
            dado5Seleccionado = !dado5Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado5MouseClicked

    private void dado6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado6MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!dado6Seleccionado) {
            this.dado6.setEnabled(false);
            dado6Seleccionado = !dado6Seleccionado;
        } else {
            this.dado6.setEnabled(true);
            dado6Seleccionado = !dado6Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado6MouseClicked

    private void dado7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado7MouseClicked
        // TODO add your handling code here:
        if (!dado7Seleccionado) {
            this.dado7.setEnabled(false);
            dado7Seleccionado = !dado7Seleccionado;
        } else {
            this.dado7.setEnabled(true);
            dado7Seleccionado = !dado7Seleccionado;
        }
        System.out.println("Dado cambiado");

    }//GEN-LAST:event_dado7MouseClicked

    private void dado8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado8MouseClicked
        // TODO add your handling code here:
        if (!dado8Seleccionado) {
            this.dado8.setEnabled(false);
            dado8Seleccionado = !dado8Seleccionado;
        } else {
            this.dado8.setEnabled(true);
            dado8Seleccionado = !dado8Seleccionado;
        }
        System.out.println("Dado cambiado");
    }//GEN-LAST:event_dado8MouseClicked


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
