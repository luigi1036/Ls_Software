package Formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import servicios.SQLDB;

public class Tomar_Pedidos extends javax.swing.JFrame {

    PreparedStatement ls;
    SQLDB buscar;
    ResultSet lg;

    SQLDB sqlDb = new SQLDB();
    Menu menu = new Menu();

    SQLDB sqldb;
    Connection cnx;

    private int rowSelect = 0;

    private void limpiar() {
        txt_telefono.setText(null);
        txt_nombre.setText(null);
        txt_apellido.setText(null);
        txt_direccion.setText(null);
        txt_cedula.setText(null);
    }
    private DefaultTableModel modelo2;

    private void construirTabla() {
        try {
            sqldb = new SQLDB();
            cnx = sqldb.getCnx();
            modelo2 = (new DefaultTableModel(obtenerMatriz(), obtenerHeader()));
            jTable1.setModel(modelo2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error2");
        }
    }

    private String[] obtenerHeader() {
        String titulos[] = {"#REG", "Nombre", "Descripciòn", "Valor"};
        return titulos;
    }

    private String[][] obtenerMatriz() {
        String matrizInfo[][] = new String[1][4];

        try {

            String SQL = "SELECT * FROM dragon_fenix.comidas";
            ls = cnx.prepareStatement(SQL); //crear metodo statement
            lg = ls.executeQuery(); //ejecutar el sql

            int count = 0;

            while (lg.next()) {
                ++count;
            }
            matrizInfo = new String[count][4];

            int x = 0;
            lg.beforeFirst();

            while (lg.next()) {
                matrizInfo[x][0] = lg.getString(1);
                matrizInfo[x][1] = lg.getString(2);
                matrizInfo[x][2] = lg.getString(3);
                matrizInfo[x][3] = lg.getString(4);

                x++;

            }

            return matrizInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return matrizInfo;
        }
    }

    private void construirTablaBebidas() {
        try {
            sqldb = new SQLDB();
            cnx = sqldb.getCnx();
            modelo2 = (new DefaultTableModel(obtenerMatrizBebidas(), obtenerHeaderBebidas()));
            jTable1.setModel(modelo2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error2");
        }
    }

    private String[] obtenerHeaderBebidas() {
        String titulos[] = {"#REG", "Nombre", "Valor"};
        return titulos;
    }

    private String[][] obtenerMatrizBebidas() {
        String matrizInfo[][] = new String[1][3];

        try {

            String SQL = "SELECT * FROM dragon_fenix.bebidas";
            ls = cnx.prepareStatement(SQL); //crear metodo statement
            lg = ls.executeQuery(); //ejecutar el sql

            int count = 0;

            while (lg.next()) {
                ++count;
            }
            matrizInfo = new String[count][3];
            int x = 0;
            lg.beforeFirst();

            while (lg.next()) {

                matrizInfo[x][0] = lg.getString(1);
                matrizInfo[x][1] = lg.getString(2);
                matrizInfo[x][2] = lg.getString(3);

                x++;

            }

            return matrizInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return matrizInfo;
        }
    }

    private void construirTablaEntradas() {
        try {
            sqldb = new SQLDB();
            cnx = sqldb.getCnx();
            modelo2 = (new DefaultTableModel(obtenerMatrizEntradas(), obtenerHeaderEntradas()));
            jTable1.setModel(modelo2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error2");
        }
    }

    private String[] obtenerHeaderEntradas() {
        String titulos[] = {"#REG", "Nombre", "Descripcion", "Valor"};
        return titulos;
    }

    private String[][] obtenerMatrizEntradas() {
        String matrizInfo[][] = new String[1][4];

        try {

            String SQL = "SELECT * FROM dragon_fenix.entradas";
            ls = cnx.prepareStatement(SQL); //crear metodo statement
            lg = ls.executeQuery(); //ejecutar el sql

            int count = 0;

            while (lg.next()) {
                ++count;
            }
            matrizInfo = new String[count][4];
            int x = 0;
            lg.beforeFirst();

            while (lg.next()) {

                matrizInfo[x][0] = lg.getString(1);
                matrizInfo[x][1] = lg.getString(2);
                matrizInfo[x][2] = lg.getString(3);
                matrizInfo[x][3] = lg.getString(4);
                x++;

            }

            return matrizInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return matrizInfo;
        }
    }

    public Tomar_Pedidos() {
        initComponents();
        construirTabla();
        this.setLocationRelativeTo(null); //centrar formulario
        setResizable(false); // dahabilitar el boton de maximizar
        setTitle("Login"); //titilo al formulario

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label3 = new java.awt.Label();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_buscar = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon1 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon5 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon6 = new org.edisoncor.gui.button.ButtonIcon();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        label7 = new java.awt.Label();
        txt_apellido = new javax.swing.JTextField();
        btn_crear_cliente = new org.edisoncor.gui.button.ButtonAction();
        btn_act_cliente = new org.edisoncor.gui.button.ButtonAction();
        txt_cedula = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_direccion = new javax.swing.JTextArea();
        btn_limpiar = new org.edisoncor.gui.button.ButtonAction();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label9 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        buttonAction3 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        setMaximumSize(new java.awt.Dimension(214, 214));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Telefono Cliente");

        label5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Nombre");

        label6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setName(""); // NOI18N
        label6.setText("Direccion");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Tomar Pedidos");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("buttonIcon2");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        buttonIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comidas.png"))); // NOI18N
        buttonIcon1.setText("buttonIcon1");
        buttonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon1ActionPerformed(evt);
            }
        });

        buttonIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lumpias.jpg"))); // NOI18N
        buttonIcon5.setText("buttonIcon5");
        buttonIcon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon5ActionPerformed(evt);
            }
        });

        buttonIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas.png"))); // NOI18N
        buttonIcon6.setText("buttonIcon5");
        buttonIcon6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon6ActionPerformed(evt);
            }
        });

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dragon1.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        label7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Apellido");

        btn_crear_cliente.setText("Crear Cliente");
        btn_crear_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_clienteActionPerformed(evt);
            }
        });

        btn_act_cliente.setText("Actualizar");
        btn_act_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_act_clienteActionPerformed(evt);
            }
        });

        txt_direccion.setColumns(20);
        txt_direccion.setRows(5);
        jScrollPane3.setViewportView(txt_direccion);

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        label9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Cedula");

        jLabel1.setText("ENTRADAS");

        jLabel2.setText("BEBIDAS");

        jLabel3.setText("COMIDAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel1)
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel2)
                                                .addGap(87, 87, 87)
                                                .addComponent(jLabel3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(buttonIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(buttonIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(269, 269, 269)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_act_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(354, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1168, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btn_crear_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_act_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonIcon6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(343, Short.MAX_VALUE)))
        );

        buttonAction1.setText("Guardar");

        buttonAction2.setText("Cancelar");

        buttonAction3.setText("Atras");
        buttonAction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction3ActionPerformed
        Menu obj = new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonAction3ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_act_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_act_clienteActionPerformed
        Connection cnx = null;
        try {

            cnx = buscar.getCnx();

            ls = cnx.prepareStatement("UPDATE clientes SET ClieID=?, ClieNombre=?, ClieApellido=?, ClieDireccion=?, ClieTelefono=? WHERE ClieTelefono=?");
            ls.setInt(1, Integer.parseInt(txt_cedula.getText()));
            ls.setString(2, txt_nombre.getText());
            ls.setString(3, txt_apellido.getText());
            ls.setString(4, txt_direccion.getText());
            ls.setString(5, txt_telefono.getText());
            ls.setString(6, txt_telefono.getText());

            int res = ls.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error Cliente no Modificado");
                limpiar();
            }
            cnx.close();

        } catch (Exception e) {
            System.err.print(e);

        }
    }//GEN-LAST:event_btn_act_clienteActionPerformed

    private void btn_crear_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_clienteActionPerformed
        Crear_Cliente obj = new Crear_Cliente();
        obj.setVisible(true);
        //dispose();

    }//GEN-LAST:event_btn_crear_clienteActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        Connection cnx = null;

        try {
            buscar = new SQLDB();
            cnx = buscar.getCnx();
            //limpiar();
            ls = cnx.prepareStatement("SELECT * FROM clientes WHERE ClieTelefono = ?");
            ls.setString(1, txt_telefono.getText());

            lg = ls.executeQuery();

            if (lg.next()) {
                txt_telefono.setText(lg.getString("ClieTelefono"));
                txt_nombre.setText(lg.getString("ClieNombre"));
                txt_apellido.setText(lg.getString("ClieApellido"));
                txt_direccion.setText(lg.getString("ClieDireccion"));
                txt_cedula.setText(lg.getString("ClieID"));

            } else {
                JOptionPane.showMessageDialog(null, "Cliente no Existe, Debes Crearlo");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        JTable source = (JTable) evt.getSource();
        rowSelect = source.rowAtPoint(evt.getPoint());
        System.out.println("ROW SELECTED: " + rowSelect);
        JOptionPane.showMessageDialog(null, " Item Seleccionad >> " + (String) source.getModel().getValueAt(rowSelect, 1));
    }//GEN-LAST:event_jTable1MouseClicked

    private void buttonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon1ActionPerformed
        // TODO add your handling code here:
        construirTablaEntradas();
    }//GEN-LAST:event_buttonIcon1ActionPerformed

    private void buttonIcon6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon6ActionPerformed
        // TODO add your handling code here:
        construirTablaBebidas();
    }//GEN-LAST:event_buttonIcon6ActionPerformed

    private void buttonIcon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon5ActionPerformed
        // TODO add your handling code here:
        construirTabla();
    }//GEN-LAST:event_buttonIcon5ActionPerformed

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
            java.util.logging.Logger.getLogger(Tomar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tomar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tomar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tomar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tomar_Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btn_act_cliente;
    private org.edisoncor.gui.button.ButtonIcon btn_buscar;
    private org.edisoncor.gui.button.ButtonAction btn_crear_cliente;
    private org.edisoncor.gui.button.ButtonAction btn_limpiar;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonAction buttonAction3;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon5;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label9;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextArea txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
