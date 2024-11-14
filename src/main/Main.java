package main;

import main.GamePanel;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {
        JFrame window = new JFrame ("Simple Chess");
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        window.setResizable (false);

        GamePanel gp = new GamePanel ();
        window.add(gp);
        window.pack();

        System.out.println ("Created GamePanel successfully");
        window.setLocationRelativeTo (null);
        window.setVisible (true);

        gp.launchGame();


    }
}