/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import helpers.*;

public class Pizza_Frame extends javax.swing.JFrame {

    private final PizzaOrder aOrder;
    public Pizza_Frame() {
        initComponents();
        aOrder = new PizzaOrder();  
        aOrder.setPizzaSize(PizzaOrder.Size.Large);
        radLarge.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSize = new javax.swing.ButtonGroup();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        radSmall = new javax.swing.JRadioButton();
        radMedium = new javax.swing.JRadioButton();
        radLarge = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        chkExtraCheese = new javax.swing.JCheckBox();
        chkSausage = new javax.swing.JCheckBox();
        chkHam = new javax.swing.JCheckBox();
        btnTotalOrder = new javax.swing.JButton();
        btnClearItems = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrderSummary = new javax.swing.JTextArea();
        btnSubmitOrder = new javax.swing.JButton();
        bntClearOrder = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mnuAddToOrder = new javax.swing.JMenuItem();
        mnuClearItems = new javax.swing.JMenuItem();
        mnuClearOrder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Best Pizza Order");

        lblWelcome.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 255));
        lblWelcome.setText("Welcome to Best Pizza!");
        lblWelcome.setName("lblWelcome"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Please enter your name and select your ordering options:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setText("First Name:");

        txtFirstName.setToolTipText("Enter your first name");
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusLost(evt);
            }
        });

        jLabel3.setText("Last Name:");

        txtLastName.setToolTipText("Enter your last name");
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pizza Size (please select one)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        grpSize.add(radSmall);
        radSmall.setText("Small: $6.99 ");
        radSmall.setToolTipText("Select for small pizza at $6.99");
        radSmall.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radSmallItemStateChanged(evt);
            }
        });

        grpSize.add(radMedium);
        radMedium.setText("Medium: $9.99  ");
        radMedium.setToolTipText("Select for medium pizza at $9.99");
        radMedium.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radMediumItemStateChanged(evt);
            }
        });

        grpSize.add(radLarge);
        radLarge.setText(" Large:  $12.99");
        radLarge.setToolTipText("Select for large pizza at $12.99");
        radLarge.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radLargeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radLarge)
                    .addComponent(radMedium)
                    .addComponent(radSmall))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(radSmall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radMedium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radLarge)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Toppings (Select as many as you like)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        chkExtraCheese.setText("Extra Cheese: $1.50 ");
        chkExtraCheese.setToolTipText("Select to add extra cheese for $1.50");
        chkExtraCheese.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkExtraCheeseItemStateChanged(evt);
            }
        });

        chkSausage.setText("Sausage: $2.25");
        chkSausage.setToolTipText("Check to add Sausage for $2.25");
        chkSausage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSausageActionPerformed(evt);
            }
        });

        chkHam.setText("Ham: $2.50");
        chkHam.setToolTipText("Check to add Ham for $2.50");
        chkHam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkHamItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkExtraCheese)
                    .addComponent(chkSausage)
                    .addComponent(chkHam))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkExtraCheese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSausage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHam))
        );

        btnTotalOrder.setText("Total Order");
        btnTotalOrder.setToolTipText("Click to show the order total and order summary");
        btnTotalOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalOrderActionPerformed(evt);
            }
        });

        btnClearItems.setText("Clear Items");
        btnClearItems.setToolTipText("Click to clear all the order items, the order total, and order summary");
        btnClearItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearItemsActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Order Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        txtOrderSummary.setColumns(20);
        txtOrderSummary.setRows(5);
        jScrollPane1.setViewportView(txtOrderSummary);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );

        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.setToolTipText("Click to submit the order for payment and delivery");
        btnSubmitOrder.setAutoscrolls(true);
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        bntClearOrder.setText("Clear Order");
        bntClearOrder.setToolTipText("Click to clear the order and start a new order");
        bntClearOrder.setAutoscrolls(true);
        bntClearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClearOrderActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setToolTipText("Click to exit the the Best Pizza order application");
        btnExit.setAutoscrolls(true);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        mnuFile.setText("File");

        mnuExit.setMnemonic('x');
        mnuExit.setText("Exit");
        mnuExit.setToolTipText("Click to exit the application");
        mnuExit.setName("mnuExit"); // NOI18N
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuExit);

        jMenuBar1.add(mnuFile);

        mnuOrder.setText("Order");

        mnuAddToOrder.setMnemonic('a');
        mnuAddToOrder.setText("Add to Order");
        mnuAddToOrder.setToolTipText("Click to add items to order");
        mnuOrder.add(mnuAddToOrder);

        mnuClearItems.setText("Clear Items");
        mnuClearItems.setToolTipText("Click to clear ordered items");
        mnuClearItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClearItemsActionPerformed(evt);
            }
        });
        mnuOrder.add(mnuClearItems);

        mnuClearOrder.setText("Clear Order");
        mnuClearOrder.setToolTipText("Click to clear items and order totals");
        mnuClearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClearOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mnuClearOrder);

        jMenuBar1.add(mnuOrder);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(lblWelcome)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntClearOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnTotalOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClearItems, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTotalOrder)
                    .addComponent(btnClearItems))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitOrder)
                    .addComponent(bntClearOrder)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        lblWelcome.getAccessibleContext().setAccessibleName("lblWelcome");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        ApplicationHelpers.terminateGUIApplication("Best Pizza Online Ordering");
    }//GEN-LAST:event_mnuExitActionPerformed

    private void radSmallItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radSmallItemStateChanged
        if (radSmall.isSelected())
        {
            aOrder.setPizzaSize(PizzaOrder.Size.Small);
        }
    }//GEN-LAST:event_radSmallItemStateChanged

    private void radMediumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radMediumItemStateChanged
        if (radMedium.isSelected())
        {
            aOrder.setPizzaSize(PizzaOrder.Size.Medium);
        }
    }//GEN-LAST:event_radMediumItemStateChanged

    private void radLargeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radLargeItemStateChanged
        if (radLarge.isSelected())
        {
            aOrder.setPizzaSize(PizzaOrder.Size.Large);
        }
    }//GEN-LAST:event_radLargeItemStateChanged

    private void btnTotalOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalOrderActionPerformed
        txtOrderSummary.setText(aOrder.toString());
    }//GEN-LAST:event_btnTotalOrderActionPerformed

    private void chkExtraCheeseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkExtraCheeseItemStateChanged
       if (chkExtraCheese.isSelected()){
           aOrder.setCheese(true);
       }
       else {
           aOrder.setCheese(false);
       }
    }//GEN-LAST:event_chkExtraCheeseItemStateChanged

    private void chkSausageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSausageActionPerformed
        if (chkSausage.isSelected()) {
            aOrder.setSausage(true);
        }
        else {
             aOrder.setSausage(false);
        }
    }//GEN-LAST:event_chkSausageActionPerformed

    private void chkHamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkHamItemStateChanged
       if (chkHam.isSelected()) {
           aOrder.setHam(true);
       }
       else {
           aOrder.setHam(false);
       }
    }//GEN-LAST:event_chkHamItemStateChanged

    private void txtFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusLost
        aOrder.setFirstName(txtFirstName.getText());
    }//GEN-LAST:event_txtFirstNameFocusLost

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        aOrder.setLastName(txtLastName.getText());
    }//GEN-LAST:event_txtLastNameFocusLost

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ApplicationHelpers.terminateGUIApplication("Best Pizza Online Ordering");
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearItemsActionPerformed
        clearItems();
    }//GEN-LAST:event_btnClearItemsActionPerformed

    private void mnuClearItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClearItemsActionPerformed
        clearItems();
    }//GEN-LAST:event_mnuClearItemsActionPerformed

    private void mnuClearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClearOrderActionPerformed
        clearOrder();
    }//GEN-LAST:event_mnuClearOrderActionPerformed

    private void bntClearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClearOrderActionPerformed
        clearOrder();
    }//GEN-LAST:event_bntClearOrderActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        submitOrder();
    }//GEN-LAST:event_btnSubmitOrderActionPerformed
    private void clearItems() {
        txtFirstName.setText("");
        txtLastName.setText("");
        radLarge.setSelected(true);
        chkExtraCheese.setSelected(false);
        chkSausage.setSelected(false);
        chkHam.setSelected(false);
        aOrder.clearOrder();
   
    }
    private void clearOrder() {
        clearItems();
        txtOrderSummary.setText("");
    }
    private void submitOrder() {
        StringBuilder str = new StringBuilder();
        
        str.append("Order submitted\n");
        str.append (aOrder.toString());
        clearOrder();
        OutputHelpers.showStandardDialog(str.toString(), "Pizza Order Submitted");
    }
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
            java.util.logging.Logger.getLogger(Pizza_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntClearOrder;
    private javax.swing.JButton btnClearItems;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JButton btnTotalOrder;
    private javax.swing.JCheckBox chkExtraCheese;
    private javax.swing.JCheckBox chkHam;
    private javax.swing.JCheckBox chkSausage;
    private javax.swing.ButtonGroup grpSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JMenuItem mnuAddToOrder;
    private javax.swing.JMenuItem mnuClearItems;
    private javax.swing.JMenuItem mnuClearOrder;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JRadioButton radLarge;
    private javax.swing.JRadioButton radMedium;
    private javax.swing.JRadioButton radSmall;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtOrderSummary;
    // End of variables declaration//GEN-END:variables
}