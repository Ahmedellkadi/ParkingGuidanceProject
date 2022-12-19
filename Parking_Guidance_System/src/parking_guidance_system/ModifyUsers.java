package parking_guidance_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class ModifyUsers extends JFrame implements ActionListener{
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    
    String line = null;
    String lineToRemove = null;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    
    
    
    public ModifyUsers() {
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 42, 48));

        jButton2.setBackground(new java.awt.Color(192, 0, 48));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(192, 0, 48));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Users Informations");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("Car Color");

        jTextField2.setText("Plate Number");

        jTextField3.setText("Name");

        jTextField4.setText("ID");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setBackground(new java.awt.Color(192, 0, 48));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(192, 0, 48));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(192, 0, 48));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.pack();
        this.setVisible(true);
        this.setLocation(615, 265);
        this.setIconImage(icon.getImage());
        this.setTitle("Modify Users");
        
    }
    
    
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Admin a = new Admin();
        this.dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        File file = new File("D:\\Users.txt");
        jButton3.setEnabled(false);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(" , ");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(" / ");
                model.addRow(dataRow);
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{jTextField4.getText(), jTextField3.getText(), jTextField2.getText(), jTextField1.getText()});
        File file = new File("D:\\Users.txt");
        FileWriter fw3 = null;
        try {
            fw3 = new FileWriter(file.getAbsoluteFile(), true);
            
            BufferedWriter bw3 = new BufferedWriter(fw3);
            bw3.write(jTextField4.getText() + " / " + jTextField3.getText() + " / " + jTextField2.getText() + " / " + jTextField1.getText());
            bw3.newLine();
            
            bw3.close();
            fw3.close();
            
            JOptionPane.showMessageDialog(this,"User Added Successfully.","Add User",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (IOException ex) {
            Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        jTextField4.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField3.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField2.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jTextField1.setText(model.getValueAt(selectedRowIndex, 3).toString());
        
        
        lineToRemove = jTextField4.getText() + " / " + jTextField3.getText() + " / " + jTextField2.getText() + " / " + jTextField1.getText();
        
    }                                    

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(i >= 0) {
            model.setValueAt(jTextField4.getText(), i, 0);
            model.setValueAt(jTextField3.getText(), i, 1);
            model.setValueAt(jTextField2.getText(), i, 2);
            model.setValueAt(jTextField1.getText(), i, 3);
            
            model.removeRow(i);
            
            File file = new File("D:\\Users.txt");
            File temp = new File(file.getAbsolutePath() + ".tmp");
            BufferedReader br = null;
            PrintWriter pw = null;
            
            try {
                br = new BufferedReader(new FileReader(file));
                pw = new PrintWriter(new FileWriter(temp));
                
                while((line = br.readLine()) != null) {
                    if(!line.trim().equals(lineToRemove)) {
                        pw.println(line);
                        pw.flush();
                    }
                }
                pw.close();
                br.close();
                
                file.delete();
                
                File file1 = new File("D:\\Users.txt");
                BufferedReader br1 = null;
                PrintWriter pw2 = null;
                br1 = new BufferedReader(new FileReader(temp));
                pw2 = new PrintWriter(new FileWriter(file1));
                    
                while((line = br1.readLine()) != null) {
                    pw2.println(line);
                    pw2.flush(); 
                }
                
                pw2.close();
                br1.close();
                
                temp.delete();
                JOptionPane.showMessageDialog(this,"User Deleted Successfully.","Delete user",JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException ex) {
                Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Row", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(i >= 0) {
            model.setValueAt(jTextField4.getText(), i, 0);
            model.setValueAt(jTextField3.getText(), i, 1);
            model.setValueAt(jTextField2.getText(), i, 2);
            model.setValueAt(jTextField1.getText(), i, 3);
            
            String lineToUpdate = jTextField4.getText() + " / " 
                                + jTextField3.getText() + " / " 
                                + jTextField2.getText() + " / " 
                                + jTextField1.getText();
            
            File file = new File("D:\\Users.txt");
            File temp = new File(file.getAbsolutePath() + ".tmp");
            BufferedReader br = null;
            PrintWriter pw = null;
            
            try {
                br = new BufferedReader(new FileReader(file));
                pw = new PrintWriter(new FileWriter(temp));
                
                
                while((line = br.readLine()) != null) {
                    if(!line.trim().equals(lineToRemove)) {
                        pw.println(line);
                        pw.flush();
                    }
                }
                pw.println(lineToUpdate);
                pw.close();
                br.close();
                
                file.delete();
                
                File file1 = new File("D:\\Users.txt");
                BufferedReader br1 = null;
                PrintWriter pw2 = null;
                br1 = new BufferedReader(new FileReader(temp));
                pw2 = new PrintWriter(new FileWriter(file1));
                    
                while((line = br1.readLine()) != null) {
                    pw2.println(line);
                    pw2.flush(); 
                }
                
                pw2.close();
                br1.close();
                
                temp.delete();
                
                JOptionPane.showMessageDialog(this,"User Updated Successfully.","Update user",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Row", "Error", JOptionPane.WARNING_MESSAGE);
        } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}