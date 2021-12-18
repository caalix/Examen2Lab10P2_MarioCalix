/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab10p2_mariocalix;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author mario
 */
public class Main extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Main
     */
    Thread hilo = new Thread(this);
    int count = 0;
    boolean pausa = false;
    boolean vivo = true;

    @Override
    public void run() {
        while (vivo) {
            System.out.println("");
            while (!pausa) {
                try {
                    pb_vidaErrol.setValue(pb_vidaErrol.getValue() - ataqueJak);
                    if (pb_vidaErrol.getValue() <= 0) {
                        vivo = false;
                        JOptionPane.showMessageDialog(this, "Ganaste");
                        break;
                    }
                    if (count == 2) {
                        pb_vidaJak.setValue(pb_vidaJak.getValue() - ataqueErrol);
                        count = 0;
                        if (pb_vidaJak.getValue() <= 0) {
                            vivo = false;
                            JOptionPane.showMessageDialog(this, "Perdiste");
                            break;
                        }
                    }
                    Thread.sleep(500);
                    count++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int vidaJak = 5000;
    private int ataqueErrol = 500;
    private int vidaErrol = 30000;
    private int ataqueJak = 5000;

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultMutableTreeNode carros;

        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
        ac.cargarArchivo();
        if (!ac.getListaCarros().isEmpty()) {
            for (Carro c : ac.getListaCarros()) {
                carros = new DefaultMutableTreeNode(c);
                raiz.add(carros);
                modeloARBOL.reload();

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        pb_vidaJak = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        pb_vidaErrol = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_carroJAK = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_jakVs = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_vida = new javax.swing.JTextField();
        tf_velocidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_ataque = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cb_tipocarro = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        tf_derrape = new javax.swing.JTextField();
        jb_crear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cb_eliminarcarro = new javax.swing.JComboBox<>();
        jb_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jLabel1.setText("Jak 3");

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carros");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTree1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jLabel2.setText("Jak");

        jLabel3.setText("Ciber Errol");

        jButton1.setText("Iniciar Partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pausar Partida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ataque de Jak:");

        jLabel5.setText("Vida Jak:");

        jLabel6.setText("Ataque de Ciber Errol:");

        jLabel7.setText("Vida Ciber Errol:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("VS. ");

        jLabel9.setText("Batalla TITULO (INICIAL, FINAL)");

        tf_carroJAK.setText("____");

        jLabel17.setText("_____");

        tf_jakVs.setText("_____");

        jLabel19.setText("Ciber Errol Car");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_jakVs)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pb_vidaJak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pb_vidaErrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_carroJAK)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(59, 59, 59))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_carroJAK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pb_vidaJak, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pb_vidaErrol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_jakVs)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tab.addTab("Juego", jPanel2);

        jLabel10.setText("Nombre:");

        jLabel11.setText("Vida:");

        jLabel12.setText("Velocidad:");

        jLabel13.setText("Ataque:");

        jLabel14.setText("Tipo:");

        cb_tipocarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Belico", "Salto", "Ataque", "Malvado" }));

        jLabel15.setText("Derrape:");

        jb_crear.setText("Crear");
        jb_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMouseClicked(evt);
            }
        });
        jb_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearActionPerformed(evt);
            }
        });

        jLabel16.setText("Eliminar Carro:");

        cb_eliminarcarro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_eliminarcarroItemStateChanged(evt);
            }
        });

        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_crear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(tf_ataque, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_tipocarro, 0, 149, Short.MAX_VALUE)
                                    .addComponent(jLabel15)
                                    .addComponent(tf_derrape)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(tf_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(cb_eliminarcarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipocarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ataque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_derrape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_crear)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_eliminarcarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_eliminar)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        tab.addTab("Carros", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearActionPerformed
        DefaultMutableTreeNode carros;

        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();

        if (cb_tipocarro.getSelectedItem().toString().equals("Normal")) {
            Carro p = new Carro(tf_nombre.getText(), Integer.parseInt(tf_derrape.getText()),
                    Integer.parseInt(tf_velocidad.getText()),
                    Integer.parseInt(tf_ataque.getText()), Integer.parseInt(tf_vida.getText()));
            ac.cargarArchivo();
            ac.setCarro(p);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Carro creado exitosamente");
            tf_nombre.setText("");
            tf_derrape.setText("");
            tf_velocidad.setText("");
            tf_ataque.setText("");
            tf_vida.setText("");
        } else if (cb_tipocarro.getSelectedItem().toString().equals("Belico")) {
            Carro p = new Belicos(tf_nombre.getText(), Integer.parseInt(tf_derrape.getText()),
                    Integer.parseInt(tf_velocidad.getText()),
                    Integer.parseInt(tf_ataque.getText()), Integer.parseInt(tf_vida.getText()));
            ac.cargarArchivo();
            ac.setCarro(p);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Carro creado exitosamente");
            tf_nombre.setText("");
            tf_derrape.setText("");
            tf_velocidad.setText("");
            tf_ataque.setText("");
            tf_vida.setText("");
        } else if (cb_tipocarro.getSelectedItem().toString().equals("Ataque")) {
            Carro p = new Ataque(tf_nombre.getText(), Integer.parseInt(tf_derrape.getText()),
                    Integer.parseInt(tf_velocidad.getText()),
                    Integer.parseInt(tf_ataque.getText()), Integer.parseInt(tf_vida.getText()));
            ac.cargarArchivo();
            ac.setCarro(p);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Carro creado exitosamente");
            tf_nombre.setText("");
            tf_derrape.setText("");
            tf_velocidad.setText("");
            tf_ataque.setText("");
            tf_vida.setText("");
        } else if (cb_tipocarro.getSelectedItem().toString().equals("Malvado")) {
            Carro p = new Malvado(tf_nombre.getText(), Integer.parseInt(tf_derrape.getText()),
                    Integer.parseInt(tf_velocidad.getText()),
                    Integer.parseInt(tf_ataque.getText()), Integer.parseInt(tf_vida.getText()));
            ac.cargarArchivo();
            ac.setCarro(p);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Carro creado exitosamente");
            tf_nombre.setText("");
            tf_derrape.setText("");
            tf_velocidad.setText("");
            tf_ataque.setText("");
            tf_vida.setText("");
        } else if (cb_tipocarro.getSelectedItem().toString().equals("Salto")) {
            Carro p = new Salto(200, tf_nombre.getText(), Integer.parseInt(tf_derrape.getText()),
                    Integer.parseInt(tf_velocidad.getText()),
                    Integer.parseInt(tf_ataque.getText()), Integer.parseInt(tf_vida.getText()));
            ac.cargarArchivo();
            ac.setCarro(p);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Carro creado exitosamente");
            tf_nombre.setText("");
            tf_derrape.setText("");
            tf_velocidad.setText("");
            tf_ataque.setText("");
            tf_vida.setText("");
        }

        /* try {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tf_nombre.getText());
            selectedNode.add(newNode);

            // reload jtree model
            DefaultTreeModel model = (DefaultTreeModel) jTree1.getModel();
            model.reload();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        for (Carro c : ac.getListaCarros()) {
            carros = new DefaultMutableTreeNode(c);
            raiz.add(carros);
            modeloARBOL.reload();

        }

    }//GEN-LAST:event_jb_crearActionPerformed

    private void cb_eliminarcarroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_eliminarcarroItemStateChanged

    }//GEN-LAST:event_cb_eliminarcarroItemStateChanged

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        if (tab.getSelectedIndex() == 1) {
            //adminCarro ac = new adminCarro("./carros.cbm");
            ac.cargarArchivo();
            DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel(
                            ac.getListaCarros().toArray());
            cb_eliminarcarro.setModel(modelo);
        }
        
        
    }//GEN-LAST:event_tabStateChanged

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        // ELIMINAR
        //DefaultMutableTreeNode carros;

        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();

        ac.cargarArchivo();
        int pos = cb_eliminarcarro.getSelectedIndex();
        ac.getListaCarros().remove(pos);
        ac.escribirArchivo();
        JOptionPane.showMessageDialog(null, "Auto eliminado exitosamente");
        comboP();
        raiz.removeAllChildren();

    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hilo = new Thread(this);
        pb_vidaErrol.setMaximum(vidaErrol);
        pb_vidaJak.setMaximum(vidaJak);
        pb_vidaErrol.setValue(vidaErrol);
        pb_vidaJak.setValue(vidaJak);
        hilo.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pausa = !pausa;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMouseClicked
        /*DefaultMutableTreeNode carros = (DefaultMutableTreeNode) jTree1.getModel();
        
        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
        
        for (Carro c : ac.getListaCarros()) {
                carros = new DefaultMutableTreeNode(c);
                raiz.add(carros);
                modeloARBOL.reload();

            }*/
    }//GEN-LAST:event_jb_crearMouseClicked

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        TreeSelectionModel smd = jTree1.getSelectionModel();
        if(smd.getSelectionCount() > 0){
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
        tf_carroJAK.setText(selectedNode.getUserObject().toString());
        tf_jakVs.setText(selectedNode.getUserObject().toString());
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void jTree1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTree1MousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void comboP() {
        adminCarro ap
                = new adminCarro("./carros.cbm");
        ap.cargarArchivo();
        DefaultComboBoxModel modelo
                = new DefaultComboBoxModel(
                        ap.getListaCarros().toArray());
        cb_eliminarcarro.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_eliminarcarro;
    private javax.swing.JComboBox<String> cb_tipocarro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JProgressBar pb_vidaErrol;
    private javax.swing.JProgressBar pb_vidaJak;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField tf_ataque;
    private javax.swing.JLabel tf_carroJAK;
    private javax.swing.JTextField tf_derrape;
    private javax.swing.JLabel tf_jakVs;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_velocidad;
    private javax.swing.JTextField tf_vida;
    // End of variables declaration//GEN-END:variables

    int pos;
    adminCarro ac = new adminCarro("./carros.cbm");

}
