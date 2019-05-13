package mx.edu.itch.isc.infocoming.interfacesgraficas;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JFrame;

public class Pantalla extends JFrame{

    public Pantalla(String titulo,LayoutManager layout) {
        this.setTitle(titulo);
        this.setLayout(layout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        this.getContentPane().setBackground(Color.decode("#f5f6fa"));
    }
    
    

}
