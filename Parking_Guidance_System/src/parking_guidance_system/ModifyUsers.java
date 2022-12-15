package parking_guidance_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class ModifyUsers extends JFrame implements ActionListener{
    JTextField id, name, plateNo, carColor, TimeIn;
    JButton add, update, delete, importt;
    JPanel background;
    JTable table;
    DefaultTableModel model;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    
    
    
    public ModifyUsers() {
        
        /* Textfields */
        id = new JTextField();
        id.setBounds(280, 25, 170, 30);
        id.setFont(new Font("Tahome", Font.PLAIN, 16));
        id.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        id.setText("Id");
        
        name = new JTextField();
        name.setBounds(280, 55, 170, 30);
        name.setFont(new Font("Tahome", Font.PLAIN, 16));
        name.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        name.setText("Name");
        
        plateNo = new JTextField();
        plateNo.setBounds(280, 85, 170, 30);
        plateNo.setFont(new Font("Tahome", Font.PLAIN, 16));
        plateNo.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        plateNo.setText("PlateNo");
        
        carColor = new JTextField();
        carColor.setBounds(280, 115, 170, 30);
        carColor.setFont(new Font("Tahome", Font.PLAIN, 16));
        carColor.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        carColor.setText("Car Color");
        
        TimeIn = new JTextField();
        TimeIn.setBounds(280, 145, 170, 30);
        TimeIn.setFont(new Font("Tahome", Font.PLAIN, 16));
        TimeIn.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        TimeIn.setText("TimeIn");
        
        /* Buttons */
        add = new JButton();
        add.setBounds(550, 13, 150, 50);
        add.addActionListener(this);
        add.setText("Add");
        add.setFocusable(false);
        add.setFont(new Font("Tahoma", Font.BOLD, 20));
        add.setForeground(Color.white);
        add.setBackground(new Color(192, 0, 48));
        add.setBorder(BorderFactory.createEtchedBorder());
        add.setBorderPainted(false);
        
        update = new JButton();
        update.setBounds(550, 80, 150, 50);
        update.addActionListener(this);
        update.setText("Update");
        update.setFocusable(false);
        update.setFont(new Font("Tahoma", Font.BOLD, 20));
        update.setForeground(Color.white);
        update.setBackground(new Color(192, 0, 48));
        update.setBorder(BorderFactory.createEtchedBorder());
        update.setBorderPainted(false);
        
        delete = new JButton();
        delete.setBounds(550, 145, 150, 50);
        delete.addActionListener(this);
        delete.setText("Delete");
        delete.setFocusable(false);
        delete.setFont(new Font("Tahoma", Font.BOLD, 20));
        delete.setForeground(Color.white);
        delete.setBackground(new Color(192, 0, 48));
        delete.setBorder(BorderFactory.createEtchedBorder());
        delete.setBorderPainted(false);
        
        importt = new JButton();
        importt.setBounds(25, 80, 150, 50);
        importt.addActionListener(this);
        importt.setText("Import Data");
        importt.setFocusable(false);
        importt.setFont(new Font("Tahoma", Font.BOLD, 20));
        importt.setForeground(Color.white);
        importt.setBackground(new Color(192, 0, 48));
        importt.setBorder(BorderFactory.createEtchedBorder());
        importt.setBorderPainted(false);
       
        /* Table */
        String[][] names = {{"64", "Ahmed Elkady", "2022 abc", "red", "14:02"},
                            {"48", "Ahmed saed", "2021 def", "black", "16:30"}};
        String[] header = {"Id", "Name", "PlateNo", "Car color", "TimeIn"};
        model = new DefaultTableModel(names, header);
        table = new JTable(model);
        table.setBounds(0, 0, 200, 300);
        JScrollPane s = new JScrollPane(table);

        /* Panel */
        background = new JPanel();
        background.setLayout(null);
        background.setBackground(new Color(40, 43, 48));
        background.setBounds(0, 0, 750, 600);
        background.add(add); background.add(update); background.add(delete); 
        background.add(id); background.add(name); background.add(plateNo);
        background.add(carColor); background.add(TimeIn);
        
        /* Frame */
        this.setTitle("Modify Users");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(550, 200);
        this.setLayout(new GridLayout(2, 1));
        this.setSize(750, 450);
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.add(s); 
        this.add(background);
        this.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            String idd = id.getText();
            String namee = name.getText();
            String plateno = plateNo.getText();
            String color = carColor.getText();
            String timeIn = TimeIn.getText();
            
            Object[] newRow = {idd, namee, plateno, color, timeIn};
            model.addRow(newRow);
        }
        
        if(e.getSource() == update) {
            String idd = id.getText();
            String namee = name.getText();
            String plateno = plateNo.getText();
            String color = carColor.getText();
            String timeIn = TimeIn.getText();
            
            int rowIndex = table.getSelectedRow();
            model.setValueAt(idd, rowIndex, 0);
            model.setValueAt(namee, rowIndex, 1);
            model.setValueAt(plateno, rowIndex, 2);
            model.setValueAt(color, rowIndex, 3);
            model.setValueAt(timeIn, rowIndex, 4);
        }
        
        if(e.getSource() == delete) {
            model.removeRow(table.getSelectedRow());
        }
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowIndex = table.getSelectedRow();
            
                String idd = (String) model.getValueAt(rowIndex, 0);
                String namee = (String) model.getValueAt(rowIndex, 1);
                String plateno = (String) model.getValueAt(rowIndex, 2);
                String color = (String) model.getValueAt(rowIndex, 3);
                String timeIn = (String) model.getValueAt(rowIndex, 4);

                id.setText(idd);
                name.setText(namee);
                plateNo.setText(plateno);
                carColor.setText(color);
                TimeIn.setText(timeIn);

                model.setValueAt(idd, rowIndex, 0);
                model.setValueAt(namee, rowIndex, 1);
                model.setValueAt(plateno, rowIndex, 2);
                model.setValueAt(color, rowIndex, 3);
                model.setValueAt(timeIn, rowIndex, 4);
  
            }
        });
        
//        if(e.getSource() == importt) {
//            File file = new File("D:\\table");
//            BufferedReader br = null;
//            try {
//                br = new BufferedReader(new FileReader(file));
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            String firstLine = null;
//            try {
//                firstLine = br.readLine().trim();
//            } catch (IOException ex) {
//                Logger.getLogger(ModifyUsers.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            String[] columnName = firstLine.split(",");
//            DefaultTableModel model = (DefaultTableModel)table.getModel();
//            model.setColumnIdentifiers(columnName);
//
//            Object[] tableLines = br.lines().toArray();
//
//            for(int i = 0; i < tableLines.length; i++) {
//                String line = tableLines[i].toString().trim();
//                String[] dataRow = line.split("/");
//                model.addRow(dataRow);
//            }
//        }
        
    }
}
