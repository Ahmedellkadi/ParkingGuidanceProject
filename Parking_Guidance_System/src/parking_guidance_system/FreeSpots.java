package parking_guidance_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FreeSpots extends JFrame implements ActionListener{
    JPanel background, background1, background2;
    JLabel floorA, floorB, floorC;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    ImageIcon rightIcon = new ImageIcon("src/parking_guidance_system/rightIcon.png");
    ImageIcon check = new ImageIcon("src/parking_guidance_system/check.png");
    JCheckBox a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
    JCheckBox b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11;
    ButtonGroup group = new ButtonGroup();
    JButton submit;
    
    public FreeSpots() {
        /* CheckBoxes */
        a1 = new JCheckBox();
        a1.setText("A1");
        a1.setFocusable(false);
        a1.setFont(new Font("Tahome", Font.PLAIN, 18));
        a1.setIcon(check);
        a1.setSelectedIcon(rightIcon);
        
        
        a2 = new JCheckBox();
        a2.setText("A2");
        a2.setFocusable(false);
        a2.setFont(new Font("Tahome", Font.PLAIN, 18));
        a2.setIcon(check);
        a2.setSelectedIcon(rightIcon);
        
        a3 = new JCheckBox();
        a3.setText("A3");
        a3.setFocusable(false);
        a3.setFont(new Font("Tahome", Font.PLAIN, 18));
        a3.setIcon(check);
        a3.setSelectedIcon(rightIcon);
        
        a4 = new JCheckBox();
        a4.setText("A4");
        a4.setFocusable(false);
        a4.setFont(new Font("Tahome", Font.PLAIN, 18));
        a4.setIcon(check);
        a4.setSelectedIcon(rightIcon);
        
        a5 = new JCheckBox();
        a5.setText("A5");
        a5.setFocusable(false);
        a5.setFont(new Font("Tahome", Font.PLAIN, 18));
        a5.setIcon(check);
        a5.setSelectedIcon(rightIcon);
        
        a6 = new JCheckBox();
        a6.setText("A6");
        a6.setFocusable(false);
        a6.setFont(new Font("Tahome", Font.PLAIN, 18));
        a6.setIcon(check);
        a6.setSelectedIcon(rightIcon);
        
        a7 = new JCheckBox();
        a7.setText("A7");
        a7.setFocusable(false);
        a7.setFont(new Font("Tahome", Font.PLAIN, 18));
        a7.setIcon(check);
        a7.setSelectedIcon(rightIcon);
        
        a8 = new JCheckBox();
        a8.setText("A8");
        a8.setFocusable(false);
        a8.setFont(new Font("Tahome", Font.PLAIN, 18));
        a8.setIcon(check);
        a8.setSelectedIcon(rightIcon);
        
        a9 = new JCheckBox();
        a9.setText("A9");
        a9.setFocusable(false);
        a9.setFont(new Font("Tahome", Font.PLAIN, 18));
        a9.setIcon(check);
        a9.setSelectedIcon(rightIcon);
        
        a10 = new JCheckBox();
        a10.setText("A10");
        a10.setFocusable(false);
        a10.setFont(new Font("Tahome", Font.PLAIN, 18));
        a10.setIcon(check);
        a10.setSelectedIcon(rightIcon);
        
        a11 = new JCheckBox();
        a11.setText("A10");
        a11.setFocusable(false);
        a11.setFont(new Font("Tahome", Font.PLAIN, 18));
        a11.setIcon(check);
        a11.setSelectedIcon(rightIcon);
        
        b1 = new JCheckBox();
        b1.setText("B1");
        b1.setFocusable(false);
        b1.setFont(new Font("Tahome", Font.PLAIN, 18));
        b1.setIcon(check);
        b1.setSelectedIcon(rightIcon);
        
        b2 = new JCheckBox();
        b2.setText("B2");
        b2.setFocusable(false);
        b2.setFont(new Font("Tahome", Font.PLAIN, 18));
        b2.setIcon(check);
        b2.setSelectedIcon(rightIcon);
        
        b3 = new JCheckBox();
        b3.setText("B3");
        b3.setFocusable(false);
        b3.setFont(new Font("Tahome", Font.PLAIN, 18));
        b3.setIcon(check);
        b3.setSelectedIcon(rightIcon);
        
        b4 = new JCheckBox();
        b4.setText("B4");
        b4.setFocusable(false);
        b4.setFont(new Font("Tahome", Font.PLAIN, 18));
        b4.setIcon(check);
        b4.setSelectedIcon(rightIcon);
        
        b5 = new JCheckBox();
        b5.setText("B5");
        b5.setFocusable(false);
        b5.setFont(new Font("Tahome", Font.PLAIN, 18));
        b5.setIcon(check);
        b5.setSelectedIcon(rightIcon);
        
        b6 = new JCheckBox();
        b6.setText("B6");
        b6.setFocusable(false);
        b6.setFont(new Font("Tahome", Font.PLAIN, 18));
        b6.setIcon(check);
        b6.setSelectedIcon(rightIcon);
        
        b7 = new JCheckBox();
        b7.setText("B7");
        b7.setFocusable(false);
        b7.setFont(new Font("Tahome", Font.PLAIN, 18));
        b7.setIcon(check);
        b7.setSelectedIcon(rightIcon);
        
        b8 = new JCheckBox();
        b8.setText("B8");
        b8.setFocusable(false);
        b8.setFont(new Font("Tahome", Font.PLAIN, 18));
        b8.setIcon(check);
        b8.setSelectedIcon(rightIcon);
        
        b9 = new JCheckBox();
        b9.setText("B9");
        b9.setFocusable(false);
        b9.setFont(new Font("Tahome", Font.PLAIN, 18));
        b9.setIcon(check);
        b9.setSelectedIcon(rightIcon);
        
        b10 = new JCheckBox();
        b10.setText("B10");
        b10.setFocusable(false);
        b10.setFont(new Font("Tahome", Font.PLAIN, 18));
        b10.setIcon(check);
        b10.setSelectedIcon(rightIcon);
        
        b11 = new JCheckBox();
        b11.setText("B11");
        b11.setFocusable(false);
        b11.setFont(new Font("Tahome", Font.PLAIN, 18));
        b11.setIcon(check);
        b11.setSelectedIcon(rightIcon);
       
        c1 = new JCheckBox();
        c1.setText("C1");
        c1.setFocusable(false);
        c1.setFont(new Font("Tahome", Font.PLAIN, 18));
        c1.setIcon(check);
        c1.setSelectedIcon(rightIcon);
        
        c2 = new JCheckBox();
        c2.setText("C2");
        c2.setFocusable(false);
        c2.setFont(new Font("Tahome", Font.PLAIN, 18));
        c2.setIcon(check);
        c2.setSelectedIcon(rightIcon);
        
        c3 = new JCheckBox();
        c3.setText("C3");
        c3.setFocusable(false);
        c3.setFont(new Font("Tahome", Font.PLAIN, 18));
        c3.setIcon(check);
        c3.setSelectedIcon(rightIcon);
        
        c4 = new JCheckBox();
        c4.setText("C4");
        c4.setFocusable(false);
        c4.setFont(new Font("Tahome", Font.PLAIN, 18));
        c4.setIcon(check);
        c4.setSelectedIcon(rightIcon);
        
        c5 = new JCheckBox();
        c5.setText("C5");
        c5.setFocusable(false);
        c5.setFont(new Font("Tahome", Font.PLAIN, 18));
        c5.setIcon(check);
        c5.setSelectedIcon(rightIcon);
        
        c6 = new JCheckBox();
        c6.setText("C6");
        c6.setFocusable(false);
        c6.setFont(new Font("Tahome", Font.PLAIN, 18));
        c6.setIcon(check);
        c6.setSelectedIcon(rightIcon);
        
        c7 = new JCheckBox();
        c7.setText("C7");
        c7.setFocusable(false);
        c7.setFont(new Font("Tahome", Font.PLAIN, 18));
        c7.setIcon(check);
        c7.setSelectedIcon(rightIcon);
        
        c8 = new JCheckBox();
        c8.setText("C8");
        c8.setFocusable(false);
        c8.setFont(new Font("Tahome", Font.PLAIN, 18));
        c8.setIcon(check);
        c8.setSelectedIcon(rightIcon);
       
        
        c9 = new JCheckBox();
        c9.setText("C9");
        c9.setFocusable(false);
        c9.setFont(new Font("Tahome", Font.PLAIN, 18));
        c9.setIcon(check);
        c9.setSelectedIcon(rightIcon);
        
        
        c10 = new JCheckBox();
        c10.setText("C10");
        c10.setFocusable(false);
        c10.setFont(new Font("Tahome", Font.PLAIN, 18));
        c10.setIcon(check);
        c10.setSelectedIcon(rightIcon);
        
        c11 = new JCheckBox();
        c11.setText("C11");
        c11.setFocusable(false);
        c11.setFont(new Font("Tahome", Font.PLAIN, 18));
        c11.setIcon(check);
        c11.setSelectedIcon(rightIcon);
        
        /* Buttons */
        submit = new JButton();
        submit = new JButton();
        //submit.setBounds(200, 500, 210, 70);
        submit.addActionListener(this);
        submit.setText("Submit");
        submit.setFocusable(false);
        submit.setFont(new Font("Tahoma", Font.BOLD, 20));
        submit.setForeground(Color.white);
        submit.setBackground(new Color(48, 0, 175));
        submit.setBorder(BorderFactory.createEtchedBorder());
        submit.setBorderPainted(false);
        submit.setHorizontalAlignment(JButton.CENTER);
        
        /* ButtonGroup */
        group.add(a1); group.add(a2); group.add(a3); group.add(a4); group.add(a5); 
        group.add(a6); group.add(a7); group.add(a8); group.add(a9); group.add(a10); 
        group.add(b1); group.add(b2); group.add(b3); group.add(b4); group.add(b5); 
        group.add(b6); group.add(b7); group.add(b8); group.add(b9); group.add(b10); 
        group.add(c1); group.add(c2); group.add(c3); group.add(c4); group.add(c5); 
        group.add(c6); group.add(c7); group.add(c8); group.add(c9); group.add(c10); 
        group.add(a11); group.add(b11); group.add(c11);
        
        /* Labels */
        floorA = new JLabel();
        floorA.setText("Floor A");
        floorA.setForeground(new Color(48, 0, 175));
        floorA.setFont(new Font("Tahoma", Font.BOLD, 21));
        
        floorB = new JLabel();
        floorB.setText("Floor B");
        floorB.setForeground(new Color(48, 0, 175));
        floorB.setFont(new Font("Tahoma", Font.BOLD, 21));
        
        floorC = new JLabel();
        floorC.setText("Floor C");
        floorC.setForeground(new Color(48, 0, 175));
        floorC.setFont(new Font("Tahoma", Font.BOLD, 21));

        this.add(floorA);  
        this.add(a1); this.add(a2); this.add(a3); this.add(a4); this.add(a5); 
        this.add(a6); this.add(a7); this.add(a8); this.add(a9); this.add(a10);
        this.add(a11);
        this.add(floorB);
        this.add(b1); this.add(b2); this.add(b3); this.add(b4); this.add(b5); 
        this.add(b6); this.add(b7); this.add(b8); this.add(b9); this.add(b10);
        this.add(b11);
        this.add(floorC); 
        this.add(c1); this.add(c2); this.add(c3); this.add(c4); this.add(c5); 
        this.add(c6); this.add(c7); this.add(c8); this.add(c9); this.add(c10);
        this.add(c11);
        
        /* Frame */
        this.setTitle("Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(450, 250);
        this.setLayout(new GridLayout(7,1));
        this.setSize(1200, 800);
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.add(submit);
        this.pack();
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            File file, file2;
            FileWriter fw, fw2;
            BufferedWriter b = null, bw2 = null;
            int flag = 0, x = 0;
            
            for (int i = 0; i < 60; i++) {
                File fileThere = new File("D:\\busySpots"+ i);
                if (fileThere.exists())
                x++;    
            }
            
            try {
                file = new File("D:\\busySpots"+x);
                fw = new FileWriter(file.getAbsoluteFile(), true);
                b = new BufferedWriter(fw);
                Scanner inputSource = new Scanner(file);
                
                file2 = new File("D:\\ParkedCars");
                fw2 = new FileWriter(file2.getAbsoluteFile(), true);
                bw2 = new BufferedWriter(fw2);
                
                
                if(a1.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A1")) {
                            flag++;
                        }
                    }
                    if(flag == 0) {
                        b.write("A1");
                        b.newLine();
                        bw2.write("A1 / ");
                        
                        this.dispose();
                        CustomerEntry c = new CustomerEntry();
                        
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a2.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A2")) {
                            flag++;
                        }
                    }
                    if(flag == 0) {
                        b.write("A2");
                        b.newLine();
                        bw2.write("A2 / ");
                        this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a3.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A3")) {
                            flag++;
                        } 
                    }
                    if(flag == 0) {
                        b.write("A3");
                    b.newLine();
                    bw2.write("A3 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a4.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A4"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A4");
                    b.newLine();
                    bw2.write("A4 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a5.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A5")) 
                            flag++;
                        
                    }
                    if(flag == 0) {
                        b.write("A5");
                    b.newLine();
                    bw2.write("A5 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a6.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A6"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A6");
                    b.newLine();
                    bw2.write("A6 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a7.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A7"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A7");
                    b.newLine();
                    bw2.write("A7 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a8.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A8"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A8");
                    b.newLine();
                    bw2.write("A8 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a9.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A9"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A9");
                    b.newLine();
                    bw2.write("A9 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a10.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A10"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A10");
                    b.newLine();
                    bw2.write("A10 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b1.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B1")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B1");
                    b.newLine();
                    bw2.write("B1 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b2.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B2"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B2");
                    b.newLine();
                    bw2.write("B2 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b3.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B3")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B3");
                    b.newLine();
                    bw2.write("B3 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b4.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B4")) 
                            flag++;
                         
                    }
                    if(flag == 0) {
                        b.write("B4");
                    b.newLine();
                    bw2.write("B4 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b5.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B5")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B5");
                    b.newLine();
                    bw2.write("B5 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b6.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B6"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B6");
                    b.newLine();
                    bw2.write("B6 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b7.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B7")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B7");
                    b.newLine();
                    bw2.write("B7 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b8.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B8")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B8");
                    b.newLine();
                    bw2.write("B8 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b9.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B9")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B9");
                    b.newLine();
                    bw2.write("B9 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b10.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B10"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B10");
                    b.newLine();
                    bw2.write("B10 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c1.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C1")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C1");
                    b.newLine();
                    bw2.write("C1 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                    
                }
                else if(c2.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C2"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C2");
                    b.newLine();
                    bw2.write("C2 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                    
                }
                else if(c3.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C3"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C3");
                    b.newLine();
                    bw2.write("C3 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                    
                }
                else if(c4.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C4")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C4");
                    b.newLine();
                    bw2.write("C4 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c5.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C5"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C5");
                    b.newLine();
                    bw2.write("C5 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c6.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C6")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C6");
                    b.newLine();
                    bw2.write("C6 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c7.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C7"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C7");
                    b.newLine();
                    bw2.write("C7 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c8.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C8")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C8");
                    b.newLine();
                    bw2.write("C8 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c9.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C9")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C9");
                    b.newLine();
                    bw2.write("C9 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                    
                }
                else if(c10.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C10")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C10");
                    b.newLine();
                    bw2.write("C10 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(a11.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("A11")) 
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("A11");
                    b.newLine();
                    bw2.write("A11 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(b11.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("B11"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("B11");
                    b.newLine();
                    bw2.write("B11 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else if(c11.isSelected()) {
                    while(inputSource.hasNext()) {
                        String s = inputSource.nextLine();
                        if(s.equals("C11"))
                            flag++;
                    }
                    if(flag == 0) {
                        b.write("C11");
                    b.newLine();
                    bw2.write("C11 / ");
                    this.dispose();
                        CustomerEntry c = new CustomerEntry();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "This Spot is busy", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    flag = 0;
                }
                else 
                    JOptionPane.showMessageDialog(null, "Please Enter a spot", "Error", JOptionPane.ERROR_MESSAGE);
                
                
                
            } catch (IOException ex) {
                Logger.getLogger(FreeSpots.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    b.close();
                    bw2.close();
                } catch (IOException ex) {
                    Logger.getLogger(FreeSpots.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}