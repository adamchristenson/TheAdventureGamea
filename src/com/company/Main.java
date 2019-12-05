package com.company;

import javax.swing.*;
import java.awt.Font;

import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;


public class Main {
    JFrame window;
    Container con;
    JPanel titleNamepanel, startButtonPanel;
    JLabel titelNamelabel;
    Font titleFont = new Font("Times new Roman", Font.PLAIN, 72);
    Font normalFont = new Font("Times new Roman", Font.PLAIN, 30);
    JButton startButton;

    public static void main(String[] args) {
	// write your code here

        JFrame frame = new JFrame("AdventureGame");

     new Main();

    }

    public Main(){

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();


        titleNamepanel = new JPanel();
        titleNamepanel.setBounds(100, 100, 600, 100);
        titleNamepanel.setBackground(Color.black);
        titelNamelabel = new JLabel("TheAdventureGame");
        titelNamelabel.setForeground(Color.white);
        titelNamelabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(200, 300, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);



        titleNamepanel.add(titelNamelabel);
        startButtonPanel.add(startButton);
        con.add(titleNamepanel);
        con.add(startButtonPanel);
        window.setVisible(true);
    }

}
