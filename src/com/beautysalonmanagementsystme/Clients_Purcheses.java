/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beautysalonmanagementsystme;

/**
 *
 * @author User
 */
public class Clients_Purcheses extends javax.swing.JFrame {

    /**
     * Creates new form AA
     */
    public Clients_Purcheses() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        home_b = new javax.swing.JButton();
        par_b = new javax.swing.JButton();
        app_b = new javax.swing.JButton();
        client_b = new javax.swing.JButton();
        emp_b = new javax.swing.JButton();
        ser_b = new javax.swing.JButton();
        pro_b = new javax.swing.JButton();
        sale_b = new javax.swing.JButton();
        log_b = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        c_details = new javax.swing.JButton();
        c_purchases = new javax.swing.JButton();
        c_appoinment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 123, 137));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/rsz_womenlogo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDEN'S BEAUTY CARE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(228, 123, 137));
        jPanel2.setPreferredSize(new java.awt.Dimension(196, 618));

        home_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        home_b.setForeground(new java.awt.Color(0, 0, 255));
        home_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/home.png"))); // NOI18N
        home_b.setText("Home");
        home_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home_b.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_bActionPerformed(evt);
            }
        });

        par_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        par_b.setForeground(new java.awt.Color(0, 0, 255));
        par_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/notebook.png"))); // NOI18N
        par_b.setText("Parlour Details");
        par_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        par_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                par_bActionPerformed(evt);
            }
        });

        app_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        app_b.setForeground(new java.awt.Color(0, 0, 255));
        app_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/comment-pen.png"))); // NOI18N
        app_b.setText("Appoiment");
        app_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        app_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_bActionPerformed(evt);
            }
        });

        client_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        client_b.setForeground(new java.awt.Color(0, 0, 255));
        client_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/user-add.png"))); // NOI18N
        client_b.setText("Client");
        client_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        client_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_bActionPerformed(evt);
            }
        });

        emp_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emp_b.setForeground(new java.awt.Color(0, 0, 255));
        emp_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/gingerbread-man.png"))); // NOI18N
        emp_b.setText("Employee ");
        emp_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emp_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_bActionPerformed(evt);
            }
        });

        ser_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ser_b.setForeground(new java.awt.Color(0, 0, 255));
        ser_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/time-twenty-four.png"))); // NOI18N
        ser_b.setText("Services");
        ser_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ser_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_bActionPerformed(evt);
            }
        });

        pro_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        pro_b.setForeground(new java.awt.Color(0, 0, 255));
        pro_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/boxes.png"))); // NOI18N
        pro_b.setText("Products");
        pro_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pro_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_bActionPerformed(evt);
            }
        });

        sale_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        sale_b.setForeground(new java.awt.Color(0, 0, 255));
        sale_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/ticket.png"))); // NOI18N
        sale_b.setText("Point Of Sale");
        sale_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sale_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sale_bActionPerformed(evt);
            }
        });

        log_b.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        log_b.setForeground(new java.awt.Color(0, 0, 255));
        log_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IconAndPicture/sign-out-alt.png"))); // NOI18N
        log_b.setText("LogOut");
        log_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        log_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(par_b, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(app_b, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(client_b, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(ser_b, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(pro_b, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(sale_b, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(log_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(emp_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(home_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(par_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(client_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emp_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ser_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pro_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sale_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Client Name", "First_In", "Email"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton15.setText("Delete Client Information");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton14.setText("Edit Client Information");

        jButton13.setText("Add New Client");

        jButton16.setText("Save INformation");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("View INformation");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        c_details.setBackground(new java.awt.Color(255, 255, 255));
        c_details.setText(" Client Details:");
        c_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_detailsActionPerformed(evt);
            }
        });

        c_purchases.setBackground(new java.awt.Color(255, 255, 255));
        c_purchases.setText(" Purchases Details:");
        c_purchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_purchasesActionPerformed(evt);
            }
        });

        c_appoinment.setBackground(new java.awt.Color(255, 255, 255));
        c_appoinment.setText("Appoinment Details");
        c_appoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_appoinmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(c_details, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_appoinment, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(c_details, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(c_purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(c_appoinment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product/Service Name", "Date", "Time", "Quantity", "Price", "Product/Service Code"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_bActionPerformed
        // TODO add your handling code here:
        
        Menue_Frame mf=new Menue_Frame();
        this.dispose();
        mf.setVisible(true);
    }//GEN-LAST:event_home_bActionPerformed

    private void client_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_bActionPerformed
        // TODO add your handling code here:
        Clients_Details cdf=new Clients_Details();
         this.dispose();
        cdf.setVisible(true);
    }//GEN-LAST:event_client_bActionPerformed

    private void emp_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_bActionPerformed
        // TODO add your handling code here:
         Employee_Details ef=new Employee_Details();
         this.dispose();
        ef.setVisible(true);
    }//GEN-LAST:event_emp_bActionPerformed

    private void ser_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_bActionPerformed
        // TODO add your handling code here:
        Service_details sd=new Service_details();
         this.dispose();
        sd.setVisible(true);
    }//GEN-LAST:event_ser_bActionPerformed

    private void pro_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_bActionPerformed
        // TODO add your handling code here:
        Product_details pd=new Product_details();
         this.dispose();
        pd.setVisible(true);
    }//GEN-LAST:event_pro_bActionPerformed

    private void sale_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sale_bActionPerformed
        // TODO add your handling code here:
        Point_Sale ps=new Point_Sale();
         this.dispose();
        ps.setVisible(true);
    }//GEN-LAST:event_sale_bActionPerformed

    private void log_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_bActionPerformed
        // TODO add your handling code here:
        Log lf=new Log();
        this.dispose();
        lf.setVisible(true);

        
    }//GEN-LAST:event_log_bActionPerformed

    private void app_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_bActionPerformed
        // TODO add your handling code here:
        Appoinment_booking ab=new Appoinment_booking();
        this.dispose();
        ab.setVisible(true);
    }//GEN-LAST:event_app_bActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void c_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_detailsActionPerformed
        // TODO add your handling code here:
         Clients_Details cdf=new Clients_Details();
         this.dispose();
        cdf.setVisible(true);
    }//GEN-LAST:event_c_detailsActionPerformed

    private void c_purchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_purchasesActionPerformed
        // TODO add your handling code here:
        Clients_Purcheses cpur=new Clients_Purcheses();
        this.dispose();
        cpur.setVisible(true);
    }//GEN-LAST:event_c_purchasesActionPerformed

    private void c_appoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_appoinmentActionPerformed
        // TODO add your handling code here:
         Clients_Appoinment cappoinment=new Clients_Appoinment();
        this.dispose();
        cappoinment.setVisible(true);
    }//GEN-LAST:event_c_appoinmentActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void par_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_par_bActionPerformed
        // TODO add your handling code here:
         CatagoryService_Product bcd=new CatagoryService_Product();
        this.dispose();
        bcd.setVisible(true);
    }//GEN-LAST:event_par_bActionPerformed

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
            java.util.logging.Logger.getLogger(Clients_Purcheses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients_Purcheses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients_Purcheses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients_Purcheses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients_Purcheses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton app_b;
    private javax.swing.JButton c_appoinment;
    private javax.swing.JButton c_details;
    private javax.swing.JButton c_purchases;
    private javax.swing.JButton client_b;
    private javax.swing.JButton emp_b;
    private javax.swing.JButton home_b;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton log_b;
    private javax.swing.JButton par_b;
    private javax.swing.JButton pro_b;
    private javax.swing.JButton sale_b;
    private javax.swing.JButton ser_b;
    // End of variables declaration//GEN-END:variables
}
