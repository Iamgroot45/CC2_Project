package uicalc;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class FrameCalc extends JFrame implements ActionListener{

    public FrameCalc()throws Exception {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                Frame();
                TField();
                Buttons();
            }
        });
    }
    JPanel mP;
    Color sample = new Color(105, 105, 105);
  
    public void Frame(){
        this.setSize(365, 570);
        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        mP = new JPanel();
        mP.setBounds(0, 0, 365, 570);
        mP.setLayout(null);
        mP.setBackground(sample);
        this.add(mP);
    }
    JTextField tf;
    public void TField(){
        tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setBounds(10, 50, 300, 100);
        tf.setFont(new Font("Calibri", Font.PLAIN, 60));
        tf.setForeground(Color.WHITE);
        tf.setBackground(sample);
        tf.setBorder(BorderFactory.createLineBorder(sample));
        //tf.setEditable(false);
        mP.add(tf);
    }
    
    Border bBorder = BorderFactory.createLineBorder(Color.BLACK);
    Border abBorder = BorderFactory.createLineBorder(Color.DARK_GRAY);
    Font nf = new Font("Calibri", Font.BOLD, 30);
    JButton bdot, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bmin, bmul, bdiv, beq, bdel;
    public void Buttons(){
        bdot = new JButton(".");
        bdot.setBounds(10, 435, 85, 85);
        bdot.setFont(nf);
        bdot.setBackground(Color.BLACK);
        bdot.setForeground(Color.WHITE);
        bdot.setBorder(bBorder);
        bdot.addActionListener(this);
        mP.add(bdot);
        
        badd = new JButton("+");
        badd.setBounds(265, 450, 70, 70);
        //badd.setAction(new Action());
        badd.setFont(nf);
        badd.setBackground(Color.DARK_GRAY);
        badd.setForeground(Color.WHITE);
        badd.setBorder(abBorder);
        badd.addActionListener(this);
        mP.add(badd);
        
        b0 = new JButton("0");
        b0.setFocusable(true);
        b0.setBounds(95, 435, 85, 85);
        b0.setFont(nf);
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);
        b0.setBorder(bBorder);
        b0.addActionListener(this);
        mP.add(b0);
        
        bmin = new JButton("-");
        bmin.setBounds(265, 380, 70, 70);
        bmin.setFont(nf);
        bmin.setBackground(Color.DARK_GRAY);
        bmin.setForeground(Color.WHITE);
        bmin.setBorder(abBorder);
        bmin.addActionListener(this);
        mP.add(bmin);
        
        beq = new JButton("=");
        beq.setActionCommand("Enter");
        beq.setBounds(180, 435, 85, 85);
        beq.setFont(nf);
        beq.setBackground(Color.BLACK);
        beq.setForeground(Color.WHITE);
        beq.setBorder(bBorder);
        beq.addActionListener(this);
        mP.add(beq);
        
        b1 = new JButton("1");
        b1.setBounds(10, 350, 85, 85);
        b1.setFont(nf);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorder(bBorder);
        b1.addActionListener(this);
        mP.add(b1);
        
        b2 = new JButton("2");
        b2.setBounds(95, 350, 85, 85);
        b2.setFont(nf);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBorder(bBorder);
        b2.addActionListener(this);
        mP.add(b2);
        
        b3 = new JButton("3");
        b3.setBounds(180, 350, 85, 85);
        b3.setFont(nf);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBorder(bBorder);
        b3.addActionListener(this);
        mP.add(b3);
        
        bmul = new JButton("*");
        bmul.setBounds(265, 310, 70, 70);
        bmul.setFont(nf);
        bmul.setBackground(Color.DARK_GRAY);
        bmul.setForeground(Color.WHITE);
        bmul.setBorder(abBorder);
        bmul.addActionListener(this);
        mP.add(bmul);
        
        b4 = new JButton("4");
        b4.setBounds(10, 265, 85, 85);
        b4.setFont(nf);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBorder(bBorder);
        b4.addActionListener(this);
        mP.add(b4);
        
        b5 = new JButton("5");
        b5.setBounds(95, 265, 85, 85);
        b5.setFont(nf);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBorder(bBorder);
        b5.addActionListener(this);
        mP.add(b5);
        
        b6 = new JButton("6");
        b6.setBounds(180, 265, 85, 85);
        b6.setFont(nf);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBorder(bBorder);
        b6.addActionListener(this);
        mP.add(b6);
        
        bdiv = new JButton("/");
        bdiv.setBounds(265, 240, 70, 70);
        bdiv.setFont(nf);
        bdiv.setBackground(Color.DARK_GRAY);
        bdiv.setForeground(Color.WHITE);
        bdiv.setBorder(abBorder);
        bdiv.addActionListener(this);
        mP.add(bdiv);
        
        b7 = new JButton("7");
        b7.setBounds(10, 180, 85, 85);
        b7.setFont(nf);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBorder(bBorder);
        b7.addActionListener(this);
        mP.add(b7);
        
        b8 = new JButton("8");
        b8.setBounds(95, 180, 85, 85);
        b8.setFont(nf);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBorder(bBorder);
        b8.addActionListener(this);
        mP.add(b8);
        
        b9 = new JButton("9");
        b9.setBounds(180, 180, 85, 85);
        b9.setFont(nf);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBorder(bBorder);
        b9.addActionListener(this);
        mP.add(b9);
        
        bdel = new JButton("Cl");
        bdel.setBounds(265, 180, 70, 60);
        bdel.setFont(nf);
        bdel.setBackground(Color.DARK_GRAY);
        bdel.setForeground(Color.WHITE);
        bdel.setBorder(abBorder);
        bdel.addActionListener(this);
        mP.add(bdel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String ae = e.getActionCommand();
        new BasicCom(ae, tf);
    }  
}
