package mx.edu.itch.isc.infocoming.interfacesgraficas;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JDialog;

public class PantallaModal extends JDialog{

    public PantallaModal(String titulo, LayoutManager layoutManager) {
        this.setTitle(titulo);
        this.setLayout(layoutManager);
        this.setModal(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#f5f6fa"));
        
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    
    

}
