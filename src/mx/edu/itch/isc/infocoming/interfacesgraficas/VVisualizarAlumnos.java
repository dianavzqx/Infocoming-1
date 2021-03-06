package mx.edu.itch.isc.infocoming.interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import mx.edu.itch.isc.infocoming.utilidades.TextPrompt;
import net.miginfocom.swing.MigLayout;

public class VVisualizarAlumnos extends Pantalla{
    
    public JTextField tfBuscar;
    public JTable tabla;
    public JLabel lblMatricula,lblNombre,lblCurso,lblHorario, lblDomicilio, lblTelefono;
    
    public VVisualizarAlumnos() {
        super("Alumnos inscritos",new MigLayout("wrap 3","10[][][]10","10[]15[]10[150]20[]15[]10[]10[]10[]10[]10[]10"));
        
        //Objetos que no cambian
        JLabel lblTitulo = new JLabel("Alumnos inscritos");
        JLabel lblTitulo1 = new JLabel("Datos del alumno");
        
        //Configuraciones de los objetos que no cambian
        lblTitulo.setFont(new Font("Arial",1,16));
        lblTitulo.setForeground(Color.decode("#37718e"));
        lblTitulo1.setFont(new Font("Arial",1,15));
        lblTitulo1.setForeground(Color.decode("#7c98b3"));
        
        //Objetos que cambian
        tfBuscar = new JTextField(12);
        tabla = new JTable();
        lblMatricula = new JLabel();
        lblNombre = new JLabel();
        lblDomicilio = new JLabel();
        lblTelefono = new JLabel();
        lblCurso = new JLabel();
        lblHorario = new JLabel();
        
        //Configuraciones de los objetos que cambian
        tabla.setModel(new DefaultTableModel(new Object[]{"Matrícula","Nombre, Apellido Paterno, Apellido Materno"},4 ));
        TextPrompt ph = new TextPrompt("Apellido o matrícula", tfBuscar);
        ph.changeAlpha(0.75f);
        ph.changeStyle(Font.ITALIC);
        
        //Añadiendo objetos a la ventana
        this.add(lblTitulo,"span 3");
        this.add(tfBuscar,"span 3,right");
        this.add(new JScrollPane(tabla),"span 3");//<-- Objetos anónimo
        this.add(lblTitulo1,"span 3");
        this.add(new JLabel("Matrícula"));//<-- Objetos anónimo
        this.add(lblMatricula,"wrap");
        this.add(new JLabel("Nombre"));//<-- Objetos anónimo
        this.add(lblNombre,"wrap");
        this.add(new JLabel("Domicilio:"));
        this.add(lblDomicilio,"wrap");
        this.add(new JLabel("Teléfono:"));
        this.add(lblTelefono,"wrap");
        this.add(new JLabel("Curso"));//<-- Objetos anónimo
        this.add(lblCurso,"wrap");
        this.add(new JLabel("Horario"));//<-- Objetos anónimo
        this.add(lblHorario,"wrap");
        
        this.pack();//<-- Para que el layout "empaquete" los elementos
        this.setLocationRelativeTo(null);//<-- Para que la pantalla aparezca en el centro
    }
}
