package parking_guidance_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener{

    JPanel left, right;
    JLabel background, title;
    JButton customer, admin;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    ImageIcon backgroundImage = new ImageIcon("src/parking_guidance_system/Background.jpg");
    
    public HomePage() {
        
        /* Left Panel */
        left = new JPanel();
        left.setLayout(null);
        
        background = new JLabel();
        background.setSize(600, 800);
        background.setIcon(backgroundImage);
        
        left.add(background);
        
        
        /* Right Panel */
        right = new JPanel();
        right.setLayout(null);
        right.setBackground(new Color(40, 43, 48));
        
        title = new JLabel();
        title.setText("Parking Guidance System");
        title.setForeground(Color.white);
        title.setFont(new Font("Tahoma", Font.BOLD, 33));
        title.setBounds(90, 80, 430, 70);
        
        customer = new JButton();
        customer.setBounds(200, 500, 210, 70);
        customer.addActionListener(this);
        customer.setText("Customer");
        customer.setFocusable(false);
        customer.setFont(new Font("Tahoma", Font.BOLD, 20));
        customer.setForeground(Color.white);
        customer.setBackground(new Color(192, 0, 48));
        customer.setBorder(BorderFactory.createEtchedBorder());
        customer.setBorderPainted(false);
        customer.setFocusable(false);
        customer.setFocusPainted(false);
        
        admin = new JButton();
        admin.setBounds(200, 590, 210, 70);
        admin.addActionListener(this);
        admin.setText("Admin");
        admin.setFocusable(false);
        admin.setFont(new Font("Tahoma", Font.BOLD, 20));
        admin.setForeground(Color.white);
        admin.setBackground(new Color(192, 0, 48));
        admin.setBorder(BorderFactory.createEtchedBorder());
        admin.setBorderPainted(false);
        
        right.add(customer); right.add(admin); right.add(title);
        
        /* Frame */
        this.setTitle("Parking Guidance System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(350, 100);
        this.setLayout(new GridLayout(1, 2, 0, 0));
        this.setSize(1200, 800);
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.add(left); this.add(right);
        this.setVisible(true);     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == customer) {
            this.dispose();
            Customer c = new Customer();
        }
        
        if(e.getSource() == admin) {
            this.dispose();
            String pass = JOptionPane.showInputDialog("What is your password: ");
            
            if("0000".equals(pass)) {
                Admin a = new Admin(); 
            }
        }
    }
    
}