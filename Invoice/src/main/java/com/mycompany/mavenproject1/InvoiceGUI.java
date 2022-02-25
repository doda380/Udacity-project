/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class InvoiceGUI extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceGUI
     */
    public InvoiceGUI() {
        initComponents();

        JOptionPane.showMessageDialog(rootPane, " Please Upload the Two main files");

    }
    private String savepath = "";
    private String path = "";
    ArrayList<Invoice> invs = new ArrayList<>();
    ArrayList<Items> itms = new ArrayList<>();
    private SimpleDateFormat d = new SimpleDateFormat("dd-mm-yyyy");
    Invoice in = new Invoice();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create New Invoice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Invoice No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Invoice Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Customer Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Invoice Total ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Invoice Items");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Invoice Table");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1)
                        .addGap(130, 130, 130)
                        .addComponent(jButton2)
                        .addGap(239, 239, 239)
                        .addComponent(jButton3)
                        .addGap(150, 150, 150)
                        .addComponent(jButton4)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(52, 52, 52))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Load File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ArrayList<Items> items = null;
        invs.clear();
        JFileChooser filechooser = new JFileChooser();

        int response = filechooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            path = filechooser.getSelectedFile().getAbsolutePath();
        }

        File f = new File(path);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel m2 = (DefaultTableModel) jTable2.getModel();

            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {

                String[] segmnts = lines[i].toString().split(",");
                String invNoStr = segmnts[0];
                String invDateStr = segmnts[1];
                String invCustNameStr = segmnts[2];

                int invNo = Integer.parseInt(invNoStr);
                Invoice invh = new Invoice(invNo, invDateStr, invCustNameStr);
                invs.add(invh);

            }
            br.close();
            fr.close();

            JOptionPane.showMessageDialog(rootPane, "Please Open The Items Invoice file");
            int responsse = filechooser.showOpenDialog(null);
            if (responsse == JFileChooser.APPROVE_OPTION) {
                this.savepath = filechooser.getSelectedFile().getAbsolutePath();
            }
            f = new File(savepath);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            Object[] liness = br.lines().toArray();
            for (int i = 0; i < liness.length; i++) {
                String[] lSegmnts = liness[i].toString().split(",");
                String invNoStr = lSegmnts[0];
                String itmNameStr = lSegmnts[1];
                String itmPriceStr = lSegmnts[2];
                String ietmCountStr = lSegmnts[3];
                int invNum = Integer.parseInt(invNoStr);
                double itemPrice = Double.parseDouble(itmPriceStr);
                int itemCount = Integer.parseInt(ietmCountStr);
                Invoice inv = findNum(invNum);

                Items itm = new Items(itmNameStr, itemPrice, itemCount, inv);

                inv.addItem(itm);
                double x = itm.getItemTotal();

//                m2.insertRow(m2.getRowCount(), new Object[]{invNum, itmNameStr, itemPrice, itemCount, x});
            }

            br.close();
            fr.close();

            for (int b = 0; b < invs.size(); b++) {
                m.insertRow(b, new Object[]{String.valueOf(invs.get(b).getInvoiceNo()), String.valueOf(invs.get(b).getDate()),
                    String.valueOf(invs.get(b).getCustomerName()), String.valueOf(invs.get(b).getInvoiceTotal())});

            }

            JOptionPane.showMessageDialog(rootPane, "You can Select any Invoice you Want");
            JOptionPane.showMessageDialog(rootPane, "You can edit inside the invoice table !");

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private Invoice findNum(int num) {

        for (Invoice inv : invs) {
            if (inv.getInvoiceNo() == num) {
                return inv;
            }
        }

        return null;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel m2 = (DefaultTableModel) jTable2.getModel();

        while (m2.getRowCount() > 0) {
            m2.removeRow(0);
        }


        String no = JOptionPane.showInputDialog("Enter the Invoice No.");
        String nDate = JOptionPane.showInputDialog("Enter the Date");
        String nName = JOptionPane.showInputDialog("Enter the customer name");
        String itName = JOptionPane.showInputDialog("Enter the item name");
        String itPrice = JOptionPane.showInputDialog("Enter the item Price");
        String itCount = JOptionPane.showInputDialog("Enter the item Count");
        try {
            int itmNo = Integer.parseInt(no);
            Invoice newInvh = new Invoice(itmNo, nDate, nName);
            invs.add(newInvh);

            double itmPrice = Double.parseDouble(itPrice);

            int itmCount = Integer.parseInt(itCount);
            Invoice inv = findNum(itmNo);
            Items itm = new Items(itName, itmPrice, itmCount, inv);
            invs.get(invs.indexOf(newInvh)).items.add(itm);
invs.get(invs.indexOf(newInvh)).calculateInoviceTotal();
            Component ParentComponent=null;

int answer = JOptionPane.showConfirmDialog(ParentComponent, 
		"Do You want to add Another Item", "", 
                 JOptionPane.YES_NO_OPTION);
double invoicetotal=0;
            double total = itm.getItemTotal();
            m2.insertRow(m2.getRowCount(), new Object[]{no, itName, itPrice, itCount, total});
invs.get(invs.indexOf(newInvh)).calculateInoviceTotal();
while(answer==0)
{
        itName = JOptionPane.showInputDialog("Enter the item name");
        itPrice = JOptionPane.showInputDialog("Enter the item Price");
        itCount = JOptionPane.showInputDialog("Enter the item Count");
            itmPrice = Double.parseDouble(itPrice);

            itmCount = Integer.parseInt(itCount);
            itm = new Items(itName, itmPrice, itmCount, inv);
            invs.get(invs.indexOf(newInvh)).items.add(itm);
invs.get(invs.indexOf(newInvh)).calculateInoviceTotal();
invoicetotal=invs.get(invs.indexOf(newInvh)).getInvoiceTotal();
            total = itm.getItemTotal();
            m2.insertRow(m2.getRowCount(), new Object[]{no, itName, itPrice, itCount, total});

answer = JOptionPane.showConfirmDialog(ParentComponent, 
		"Do You want to add Another Item", "", 
                 JOptionPane.YES_NO_OPTION);

}


            m.insertRow(m.getRowCount(), new Object[]{no,nDate, nName,invoicetotal });

            JOptionPane.showMessageDialog(rootPane, "New Item Added do not forget to Save!");
            Component PrentComponent = null;
            

if (answer == JOptionPane.NO_OPTION) {
	// do something
} else if(answer == JOptionPane.YES_OPTION) {
  	// do something else
}



        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String value = jTextField1.getText();
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel m2 = (DefaultTableModel) jTable2.getModel();
        int rowIndex = jTable1.getSelectedRow();
        rowIndex++;

//        for (int b = 0; b < invs.size(); b++) {
//            for (int c = 0; c < invs.get(b).items.size(); c++) {
//                if (rowIndex == invs.get(b).items.get(c).inv.invoiceNo) {
//                    invs.get(b).items.get(c).inv.Remove(rowIndex);
//                    m.removeRow(jTable1.getSelectedRow());
//                }
//            }
//        }
        int rowValue = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        for (int b = 0; b < invs.size(); b++) {
            if (invs.get(b).getInvoiceNo() == rowValue) {
                invs.remove(invs.get(b));
                m.removeRow(jTable1.getSelectedRow());

            }

        }

        ArrayList<Integer> itemstoremove = new ArrayList<Integer>();
        int temp = m2.getRowCount();
        for (int i = 0; i < temp; i++) {

            if (Integer.parseInt(jTable2.getValueAt(i, 0).toString()) == rowValue) {
                itemstoremove.add(i);
            }
        }

        for (int i = --temp; i > -1; i--) {
            m2.removeRow(itemstoremove.get(i));
        }

//        int x = 0;
//        if (jTable1.getSelectedRow() != -1) {
//
//            while (x < m2.getRowCount()) {
//                if (m2.getValueAt(x, 0).toString().equals(value)) {
//                    m2.removeRow(x);
//                }
//            }
//            m.removeRow(jTable1.getSelectedRow());
//
//        }
        JOptionPane.showMessageDialog(rootPane, "Row deleted do not forget to save the file !");
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser filechooser = new JFileChooser();

        int response = filechooser.showSaveDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            path = filechooser.getSelectedFile().getAbsolutePath();
        }

        try {
            File f = new File(path);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                for (int j = 0; j < jTable1.getColumnCount(); j++) {
if(j==1)
{
                    bw.write(d.parse(jTable1.getValueAt(i, j).toString()) + ",");
}
else
{
                    bw.write(jTable1.getValueAt(i, j).toString() + ",");

}
                }
                bw.newLine();
            }

            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(rootPane, "File Saved !");
        } catch (IOException ex) {
        } catch (ParseException ex) {
            Logger.getLogger(InvoiceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            File f = new File(savepath);
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            DefaultTableModel m = (DefaultTableModel) jTable2.getModel();

            for (int i = 0; i < jTable2.getRowCount(); i++) {//rows
                for (int j = 0; j < jTable2.getColumnCount(); j++) {//columns
                    bw.write(jTable2.getValueAt(i, j).toString() + ",");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(rootPane, "Changes is saved !");
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        int rowIndex = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());;
        
        DefaultTableModel m2 = (DefaultTableModel) jTable2.getModel();
        while (m2.getRowCount() > 0) {
            m2.removeRow(0);
        }

        for (int b = 0; b < invs.size(); b++) {
            if (rowIndex == invs.get(b).invoiceNo) {
                for (int c = 0; c < invs.get(b).items.size(); c++) {

                    m2.insertRow(c, new Object[]{String.valueOf(invs.get(b).invoiceNo), String.valueOf(invs.get(b).items.get(c).getItName()),
                        String.valueOf(invs.get(b).items.get(c).getItPrice()), String.valueOf(invs.get(b).items.get(c).getItCount()),
                        String.valueOf(invs.get(b).items.get(c).getItemTotal())});

                    jTextField1.setText(String.valueOf(invs.get(b).getInvoiceNo()));
                    jTextField2.setText(String.valueOf(invs.get(b).getDate()));
                    jTextField3.setText(String.valueOf(invs.get(b).getCustomerName()));
                    jTextField4.setText(String.valueOf(invs.get(b).getInvoiceTotal()));

                }
            }

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int invoicenum = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
int invoicerow=jTable2.getSelectedRow();
String itemname=jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();

        DefaultTableModel m2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();


        for (int b = 0; b < invs.size(); b++) 
{
            if (invs.get(b).getInvoiceNo() == invoicenum) {
                m2.removeRow(jTable2.getSelectedRow());
            }
for(int i=0; i<invs.get(b).items.size();i++)
{
if(invs.get(b).items.get(i).itName.equals(itemname))
{
invs.get(b).items.remove(invs.get(b).items.get(i));
invs.get(b).calculateInoviceTotal();
jTextField4.setText(String.valueOf(invs.get(b).getInvoiceTotal()));
}
}
}

        JOptionPane.showMessageDialog(rootPane, "Row deleted do not forget to save the file !");

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceGUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
