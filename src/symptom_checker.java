
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer care
 */
public class symptom_checker extends javax.swing.JFrame {
DefaultListModel d=new DefaultListModel();
    /**
     * Creates new form symptom_checker
     */
    public symptom_checker() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb2 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        cb11 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cb12 = new javax.swing.JCheckBox();
        cb15 = new javax.swing.JCheckBox();
        cb14 = new javax.swing.JCheckBox();
        cb13 = new javax.swing.JCheckBox();
        cb18 = new javax.swing.JCheckBox();
        cb17 = new javax.swing.JCheckBox();
        cb16 = new javax.swing.JCheckBox();
        cb19 = new javax.swing.JCheckBox();
        cb20 = new javax.swing.JCheckBox();
        cb21 = new javax.swing.JCheckBox();
        cb22 = new javax.swing.JCheckBox();
        cb23 = new javax.swing.JCheckBox();
        cb24 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        l = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jLabel1.setText("SYMPTOM CHECKER");

        jPanel2.setAutoscrolls(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 593));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel2.setText("SELECT SYMPTOMS");

        cb2.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb2.setText("Runny Nose");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb1.setText("Fever");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb3.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb3.setText("Sneezing");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb4.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb4.setText("Cough");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        cb5.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb5.setText("Headache");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        cb6.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb6.setText("Vomiting");
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });

        cb8.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb8.setText("Weight loss");
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });

        cb7.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb7.setText("Stomach Pain");
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });

        cb9.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb9.setText("Fatigue");
        cb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb9ActionPerformed(evt);
            }
        });

        cb11.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb11.setText("Itching");
        cb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb11ActionPerformed(evt);
            }
        });

        cb10.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb10.setText("Muscle Pain");
        cb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb10ActionPerformed(evt);
            }
        });

        cb12.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb12.setText("Loss Appetite");
        cb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb12ActionPerformed(evt);
            }
        });

        cb15.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb15.setText("Shaking Chills");
        cb15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb15ActionPerformed(evt);
            }
        });

        cb14.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb14.setText("Sweating");
        cb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb14ActionPerformed(evt);
            }
        });

        cb13.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb13.setText("Indigestion");
        cb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb13ActionPerformed(evt);
            }
        });

        cb18.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb18.setText("More Urination");
        cb18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb18ActionPerformed(evt);
            }
        });

        cb17.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb17.setText("Increase Thirst");
        cb17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb17ActionPerformed(evt);
            }
        });

        cb16.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb16.setText("Extreme Hunger");
        cb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb16ActionPerformed(evt);
            }
        });

        cb19.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb19.setText("More Urination");
        cb19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb19ActionPerformed(evt);
            }
        });

        cb20.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb20.setText("Increase Thirst");
        cb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb20ActionPerformed(evt);
            }
        });

        cb21.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb21.setText("Extreme Hunger");
        cb21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb21ActionPerformed(evt);
            }
        });

        cb22.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb22.setText("More Urination");
        cb22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb22ActionPerformed(evt);
            }
        });

        cb23.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb23.setText("Extreme Hunger");
        cb23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb23ActionPerformed(evt);
            }
        });

        cb24.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        cb24.setText("Increase Thirst");
        cb24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb7)
                            .addComponent(cb1)
                            .addComponent(cb4)
                            .addComponent(cb10)
                            .addComponent(cb13)
                            .addComponent(cb16)
                            .addComponent(cb21)
                            .addComponent(cb23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb20)
                                .addGap(30, 30, 30)
                                .addComponent(cb19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb24)
                                .addGap(30, 30, 30)
                                .addComponent(cb22))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb17)
                                    .addComponent(cb14)
                                    .addComponent(cb11)
                                    .addComponent(cb8)
                                    .addComponent(cb5)
                                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb3)
                                    .addComponent(cb6)
                                    .addComponent(cb9)
                                    .addComponent(cb12)
                                    .addComponent(cb15)
                                    .addComponent(cb18))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1)
                    .addComponent(cb3))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb5)
                    .addComponent(cb4)
                    .addComponent(cb6))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb8)
                    .addComponent(cb7)
                    .addComponent(cb9))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb11)
                    .addComponent(cb10)
                    .addComponent(cb12))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb14)
                    .addComponent(cb13)
                    .addComponent(cb15))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb17)
                    .addComponent(cb16)
                    .addComponent(cb18))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb20)
                    .addComponent(cb21)
                    .addComponent(cb19))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb24)
                    .addComponent(cb23)
                    .addComponent(cb22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        l.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        l.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SELECTED SYMPTOMS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(l);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 43)); // NOI18N
        jButton1.setText("NEXT");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(605, 605, 605))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(418, 418, 418))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        d.addElement(cb1.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        d.addElement(cb2.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
         d.addElement(cb3.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb4.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb5.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb6.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb7.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb8.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb9.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb9ActionPerformed

    private void cb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb10ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb10.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb10ActionPerformed

    private void cb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb11ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb11.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb11ActionPerformed

    private void cb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb12ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb12.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb12ActionPerformed

    private void cb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb13ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb13.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb13ActionPerformed

    private void cb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb14ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb14.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb14ActionPerformed

    private void cb15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb15ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb15.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb15ActionPerformed

    private void cb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb16ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb16.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb16ActionPerformed

    private void cb17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb17ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb17.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb17ActionPerformed

    private void cb18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb18ActionPerformed
        // TODO add your handling code here:
         d.addElement(cb18.getText());
        l.setModel(d);
    }//GEN-LAST:event_cb18ActionPerformed

    private void cb19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb19ActionPerformed

    private void cb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb20ActionPerformed

    private void cb21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb21ActionPerformed

    private void cb22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb22ActionPerformed

    private void cb23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb23ActionPerformed

    private void cb24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb24ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        introduction a=new introduction();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(symptom_checker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(symptom_checker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(symptom_checker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(symptom_checker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new symptom_checker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb11;
    private javax.swing.JCheckBox cb12;
    private javax.swing.JCheckBox cb13;
    private javax.swing.JCheckBox cb14;
    private javax.swing.JCheckBox cb15;
    private javax.swing.JCheckBox cb16;
    private javax.swing.JCheckBox cb17;
    private javax.swing.JCheckBox cb18;
    private javax.swing.JCheckBox cb19;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb20;
    private javax.swing.JCheckBox cb21;
    private javax.swing.JCheckBox cb22;
    private javax.swing.JCheckBox cb23;
    private javax.swing.JCheckBox cb24;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> l;
    // End of variables declaration//GEN-END:variables
}
