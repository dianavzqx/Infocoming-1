package mx.edu.itch.isc.infocoming.interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import mx.edu.itch.isc.infocoming.utilidades.TextPrompt;
import net.miginfocom.swing.MigLayout;

public class VGestionPagos extends Pantalla{
    
    public JLabel lblNombre, lblFolio,lblCantidad, lblConcepto, lblHorario, lblFecha,lblTitulo,lblTitulo1;
    public JTextField tfBuscar;
    public JTable tabla;

    public VGestionPagos() {
        super("Gestión de pagos", new MigLayout("wrap 3","[]10[200]10[]"
                                  ,"10[]15[]10[150]25[]15[]10[]10[]10[]10[]10[]10[]10"));
        
        lblTitulo = new JLabel("Historial de pago por alumno");
        lblTitulo1 = new JLabel("Datos del alumno");
        lblTitulo.setFont(new Font("Arial",1,16));
        lblTitulo1.setFont(new Font("Arial",1,16));
        
        tfBuscar = new JTextField(12);
        tabla = new JTable();
        lblNombre = new JLabel();
        lblFolio =new JLabel();
        lblFecha= new JLabel();
        lblCantidad = new JLabel();
        lblConcepto= new JLabel();
        lblHorario = new JLabel();         
        tabla.setModel(new DefaultTableModel(new Object[]{"Matrícula","Nombre","Fecha pago","Concepto pago, Folio"}, 5));
        TextPrompt ph = new TextPrompt("Apellido o matrícula", tfBuscar);
        ph.changeAlpha(0.75f);
        ph.changeStyle(Font.ITALIC);
        lblTitulo.setForeground(Color.decode("#37718e"));
        lblTitulo1.setForeground(Color.decode("#7c98b3"));
        this.add(lblTitulo,"span 3");
        this.add(tfBuscar,"span 3,right");
        this.add(new JScrollPane(tabla),"span 3");
        this.add(lblTitulo1,"span 3");
        this.add(new JLabel("Nombre: "));
        this.add(lblNombre,"wrap");
        this.add(new JLabel("Folio: "));
        this.add(lblFolio,"wrap");
        this.add(new JLabel("Fecha: "));
        this.add(lblFecha, "wrap");
        this.add(new JLabel("Cantidad: "));
        this.add(lblCantidad,"wrap");
        this.add(new JLabel("Concepto: "));
        this.add(lblConcepto,"wrap");
        this.add(new JLabel("Horario: "));
        this.add(lblHorario,"wrap");
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
