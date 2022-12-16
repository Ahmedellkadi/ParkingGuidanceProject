package parking_guidance_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends JFrame implements ActionListener{
    JButton add, spots, modify, shifts, cars, back;
    JPanel background;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    
    public Admin() {
        /* Buttons */
        add = new JButton();
        add.setBounds(460, 150, 280, 60);
        add.addActionListener(this);
        add.setText("Add Spots");
        add.setFocusable(false);
        add.setFont(new Font("Tahoma", Font.BOLD, 25));
        add.setForeground(Color.white);
        add.setBackground(new Color(192, 0, 48));
        add.setBorder(BorderFactory.createEtchedBorder());
        add.setBorderPainted(false);
        
        spots = new JButton();
        spots.setBounds(460, 250, 280, 60);
        spots.addActionListener(this);
        spots.setText("View Total Spots");
        spots.setFocusable(false);
        spots.setFont(new Font("Tahoma", Font.BOLD, 25));
        spots.setForeground(Color.white);
        spots.setBackground(new Color(192, 0, 48));
        spots.setBorder(BorderFactory.createEtchedBorder());
        spots.setBorderPainted(false);
        
        modify = new JButton();
        modify.setBounds(460, 350, 280, 60);
        modify.addActionListener(this);
        modify.setText("Modify users");
        modify.setFocusable(false);
        modify.setFont(new Font("Tahoma", Font.BOLD, 25));
        modify.setForeground(Color.white);
        modify.setBackground(new Color(192, 0, 48));
        modify.setBorder(BorderFactory.createEtchedBorder());
        modify.setBorderPainted(false);
        
        shifts = new JButton();
        shifts.setBounds(460, 450, 280, 60);
        shifts.addActionListener(this);
        shifts.setText("Total Shifts");
        shifts.setFocusable(false);
        shifts.setFont(new Font("Tahoma", Font.BOLD, 25));
        shifts.setForeground(Color.white);
        shifts.setBackground(new Color(192, 0, 48));
        shifts.setBorder(BorderFactory.createEtchedBorder());
        shifts.setBorderPainted(false);
        
        cars = new JButton();
        cars.setBounds(460, 550, 280, 60);
        cars.addActionListener(this);
        cars.setText("Cars Report");
        cars.setFocusable(false);
        cars.setFont(new Font("Tahoma", Font.BOLD, 25));
        cars.setForeground(Color.white);
        cars.setBackground(new Color(192, 0, 48));
        cars.setBorder(BorderFactory.createEtchedBorder());
        cars.setBorderPainted(false);
        
        back = new JButton();
        back.setBounds(0, 0, 100, 50);
        back.addActionListener(this);
        back.setText("Back");
        back.setFocusable(false);
        back.setFont(new Font("Tahoma", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setBackground(new Color(192, 0, 48));
        back.setBorder(BorderFactory.createEtchedBorder());
        back.setBorderPainted(false);
        
        /* Panel */
        background = new JPanel();
        background.setLayout(null);
        background.setBounds(0, 0, 1200, 800);
        background.setBackground(new Color(40, 43, 48));
        background.add(add); background.add(spots); background.add(modify); 
        background.add(shifts); background.add(cars); background.add(back);
        
        /* Frame */
        this.setTitle("Admin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(350, 100);
        this.setLayout(null);
        this.setSize(1200, 800);
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.add(background);
        this.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            FileWriter fw = null;
            String addedSpot = null;
            try {
                try {
                addedSpot = JOptionPane.showInputDialog("Enter the Spot: ");
                JOptionPane.showMessageDialog(null, "Spot Entered Successfully", "Add Spot", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Incorrect input","Error",JOptionPane.WARNING_MESSAGE);
                }
                File file = new File("D:\\parkingSpots.txt");
                fw = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter b = new BufferedWriter(fw);
                
                b.newLine();
                b.write(addedSpot);
                b.close();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        if(e.getSource() == spots) {
            FreeSpots f = new FreeSpots();
            
        }
        
        if(e.getSource() == modify) {
            ModifyUsers u = new ModifyUsers();
            this.dispose();
        }
        
        if(e.getSource() == shifts) {
            Tables d = new Tables();
            this.dispose();
        }
        
        if(e.getSource() == cars) {
            Tables d = new Tables();
            this.dispose();
        }
        
        if(e.getSource() == back) {
            this.dispose();
            HomePage h = new HomePage();
        }
           
    }
}