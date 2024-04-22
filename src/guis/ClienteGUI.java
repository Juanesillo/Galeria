package guis;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Constantes.Constantes;

public class ClienteGUI extends BaseFrame {
    public ClienteGUI(){
        super("Acciones");
    }

    public void addguicomponent(){
        setSize(500,600);

        JLabel Titulo= new JLabel("Acciones");
        Titulo.setForeground(Constantes.ColorTexto);
        Titulo.setBounds(0,25,super.getWidth(),25);
        Titulo.setFont(new Font("Dialog",Font.BOLD,32));
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(Titulo);


        JButton comprar= new JButton("COMPRAR");
        comprar.setForeground(Constantes.ColorTexto);
        comprar.setBackground(Constantes.SPColor);
        comprar.setBounds(0,120,super.getWidth(),50);
        comprar.setFont(new Font("Dialog",Font.BOLD,20));


        // acciones implementadas por consola ya que no se como mostrarlas por gui 

        comprar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                // conocer disponibles 

                // conectar con cajero

                    // comprar 
                // registrar en historial de compras del cliente

            }
            
        });




        add(comprar);


        JButton vender= new JButton("VENDER");
        vender.setForeground(Constantes.ColorTexto);
        vender.setBackground(Constantes.SPColor);
        vender.setBounds(0,240,super.getWidth(),50);
        vender.setFont(new Font("Dialog",Font.BOLD,20));

        add(vender);



        JButton HistorialP= new JButton("Consultar Historial Propiedad");
        HistorialP.setBackground(Constantes.SPColor);
        HistorialP.setForeground(Constantes.ColorTexto);
        HistorialP.setBounds(0, 360, super.getWidth(),50 );
        HistorialP.setFont(new Font("Dialog",Font.BOLD,20));

        add(HistorialP);


        JButton HitorialCompras= new JButton("Consultar Historial Compras");
        HitorialCompras.setBackground(Constantes.SPColor);
        HitorialCompras.setForeground(Constantes.ColorTexto);
        HitorialCompras.setBounds(0, 480, super.getWidth(),50 );
        HitorialCompras.setFont(new Font("Dialog",Font.BOLD,20));

        add(HitorialCompras);
        
    }

}
