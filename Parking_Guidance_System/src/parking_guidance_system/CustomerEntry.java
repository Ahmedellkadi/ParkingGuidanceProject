package parking_guidance_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomerEntry extends JFrame implements ActionListener{
    int i = (int)(Math.random() * 100);
    JPanel background;
    JLabel name, plateNo, carColor, entryId, time;
    JTextField n, p, c, en, t;
    JButton enter, back;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    
    public CustomerEntry() {
        
        /* Labels */
        name = new JLabel();
        name.setText("Name: ");
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        name.setBounds(390, 190, 200, 90);
        
        entryId = new JLabel();
        entryId.setText("Entry Id: ");
        entryId.setForeground(Color.white);
        entryId.setFont(new Font("Tahoma", Font.BOLD, 20));
        entryId.setBounds(390, 355, 200, 90);
        
        plateNo = new JLabel();
        plateNo.setText("Plate Number: ");
        plateNo.setForeground(Color.white);
        plateNo.setFont(new Font("Tahoma", Font.BOLD, 20));
        plateNo.setBounds(390, 245, 200, 90);
        
        carColor = new JLabel();
        carColor.setText("Car Color: ");
        carColor.setForeground(Color.white);
        carColor.setFont(new Font("Tahoma", Font.BOLD, 20));
        carColor.setBounds(390, 300, 200, 90);
        
        time = new JLabel();
        time.setText("Time: ");
        time.setForeground(Color.white);
        time.setFont(new Font("Tahoma", Font.BOLD, 20));
        time.setBounds(390, 410, 200, 90);
        
        /* Time */
        Date thisDate = new Date();
        String currenttime = new SimpleDateFormat("hh:mm").format(thisDate);
        
        /* Text Fields */
        n = new JTextField();
        c = new JTextField();
        en = new JTextField(Integer.toString(i));
        p = new JTextField();
        t = new JTextField(currenttime);
        n.setBounds(570, 222, 220, 30);
        n.setFont(new Font("Tahome", Font.PLAIN, 16));
        n.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        p.setBounds(570, 277, 220, 30);
        p.setFont(new Font("Tahome", Font.PLAIN, 16));
        p.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        c.setBounds(570, 332, 220, 30);
        c.setFont(new Font("Tahome", Font.PLAIN, 16));
        c.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        en.setBounds(570, 387, 220, 30);
        en.setFont(new Font("Tahome", Font.PLAIN, 16));
        en.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        en.setEditable(false);
        
        t.setBounds(570, 442, 220, 30);
        t.setFont(new Font("Tahome", Font.PLAIN, 16));
        t.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        t.setEditable(false);
        
        /* Buttons */
        enter = new JButton();
        enter.setBounds(465, 530, 250, 50);
        enter.addActionListener(this);
        enter.setText("Give Ticket ID");
        enter.setFocusable(false);
        enter.setFont(new Font("Tahoma", Font.BOLD, 20));
        enter.setForeground(Color.white);
        enter.setBackground(new Color(192, 0, 48));
        enter.setBorder(BorderFactory.createEtchedBorder());
        enter.setBorderPainted(false);
        
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
        background.setBackground(new Color(40, 43, 48));
        background.setBounds(0, 0, 1200, 800);
        background.add(entryId); background.add(plateNo); background.add(time);
        background.add(name); background.add(carColor);
        background.add(n); background.add(p);background.add(c); background.add(en); background.add(t);
        background.add(enter); background.add(back);
        
        /* Frame */
        this.setTitle("Customer Entry");
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
        if(e.getSource() == back) {
            this.dispose();
            Customer h = new Customer();
        }
        
        if(e.getSource() == enter) {
            String name = n.getText();
            String plate = p.getText();
            String color = c.getText();
            String id = en.getText();
            Date date = new Date();
            long timeIn = date.getTime();
            
            int x = 0;
            for (int i = 0; i < 60; i++) {
                File fileThere = new File("D:\\busySpots"+ i);
                if (fileThere.exists())
                x++;    
            }
            
            File busySpots = new File("D:\\busySpots"+x);
            BufferedReader input;
            String last = "", line;
            try {
                input = new BufferedReader(new FileReader(busySpots));
                
                while((line = input.readLine()) != null)
                last = line;
                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CustomerEntry.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CustomerEntry.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            CustomerClass c = new CustomerClass(name, plate, color, id, timeIn, last);
            
            File file = new File("D:\\" + i);
            
            PrintWriter output;
            try {
                output = new PrintWriter(file);
                output.println(c.id);
                output.println(c.name);
                output.println(c.plateNumber);
                output.println(c.carColor);
                output.println(c.Spot);
                output.println(c.timeIn);
//                output.println(c.Spot);
                output.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CustomerEntry.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            File file2 = new File("D:\\ParkedCars");
            FileWriter fw2;
            Date thisDate = new Date();
            String currenttime = new SimpleDateFormat("hh:mm").format(thisDate);
            try {
                fw2 = new FileWriter(file2.getAbsoluteFile(), true);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                bw2.write(c.plateNumber + " / " + currenttime + " / ");
                bw2.close();
            } catch (IOException ex) {
                Logger.getLogger(CustomerEntry.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            String s = Integer.toString(i);
            JOptionPane.showMessageDialog(null, "Yout Ticket Id is " + s, "Ticket Id", JOptionPane.INFORMATION_MESSAGE); 
            this.dispose();
        }
    }
}