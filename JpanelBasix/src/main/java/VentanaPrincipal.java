
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas07
 */
public class VentanaPrincipal extends  JFrame implements ActionListener{
    
    Panel1  miPanel1;
    Panel2 miPanel2;
    JLabel lblTitulo;
    JButton btnPanel1, btnPanel2;
    JScrollPane scrollPaneles;
    

 
    public VentanaPrincipal(){
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(387, 365);
            setTitle("EJEMPLO PANEL BASICO");
            setLayout(null);
            
            setLocationRelativeTo(null);
            iniciarComponentes();
            
            
            
            
        
    }
    private void iniciarComponentes(){
        miPanel1 = new Panel1();
        miPanel2 = new Panel2();
        
        scrollPaneles = new JScrollPane();
        scrollPaneles.setBounds(5, 112, 360, 200);
        
        lblTitulo = new  JLabel ("EJEMPLO PANEL");
        lblTitulo.setFont(new Font("Yu Gothic UI Semilinght", Font.PLAIN, 30));
        lblTitulo.setBounds(10, 14, 221, 51);
        
        btnPanel1 = new JButton("Panel 1");
        btnPanel1.setBounds(10, 76, 89, 23);
        btnPanel1.addActionListener(this);
        
        btnPanel2 = new JButton("Panel 2");
        btnPanel2.setBounds(10, 76, 89, 23);
        btnPanel2.addActionListener(this);
        
        add(btnPanel1);
        add(btnPanel2);
        add(lblTitulo);
        add(scrollPaneles);
        
    }
            
       @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== btnPanel1){
            definirPanel(miPanel1);
        }
        if (e.getSource()== btnPanel2){
            definirPanel(miPanel2);
        }

    }
    
    private void definirPanel(Panel1 miPanel1){
        scrollPaneles.setViewportView(miPanel1);
        
    }
    
    private void definirPanel(Panel2 miPanel2){
        scrollPaneles.setViewportView(miPanel2);
        
    }
    
}
