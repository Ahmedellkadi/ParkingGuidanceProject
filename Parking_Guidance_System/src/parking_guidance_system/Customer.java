package parking_guidance_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Customer extends JFrame implements ActionListener{
    JPanel background;
    JButton enter, exit, back;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    
    public Customer() {
        enter = new JButton();
        enter.setBounds(450, 335, 280, 60);
        enter.addActionListener(this);
        enter.setText("Enter Parking");
        enter.setFocusable(false);
        enter.setFont(new Font("Tahoma", Font.BOLD, 25));
        enter.setForeground(Color.white);
        enter.setBackground(new Color(192, 0, 48));
        enter.setBorder(BorderFactory.createEtchedBorder());
        enter.setBorderPainted(false);
        
        exit = new JButton();
        exit.setBounds(450, 420, 280, 60);
        exit.addActionListener(this);
        exit.setText("Exit Parking");
        exit.setFocusable(false);
        exit.setFont(new Font("Tahoma", Font.BOLD, 25));
        exit.setForeground(Color.white);
        exit.setBackground(new Color(192, 0, 48));
        exit.setBorder(BorderFactory.createEtchedBorder());
        exit.setBorderPainted(false);
        
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
        background.add(enter); background.add(exit); background.add(back);
        
        /* Frame */
        this.setTitle("Customer Login");
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
        if(e.getSource() == exit) {
            this.dispose();
            CustomerExit ce = new CustomerExit();
        }
        
        if(e.getSource() == enter) {
            this.dispose();
            FreeSpots ce = new FreeSpots();
        }
        
        if(e.getSource() == back) {
            this.dispose();
            HomePage h = new HomePage();
        }
    }
}
