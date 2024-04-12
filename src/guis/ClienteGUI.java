package guis;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Constantes.Constantes;

public class ClienteGUI extends BaseFrame {
    public ClienteGUI(){
        super("Acciones");
    }

    public void addguicomponent(){
        setSize(500,400);

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
        add(comprar);


        JButton vender= new JButton("VENDER");
        vender.setForeground(Constantes.ColorTexto);
        vender.setBackground(Constantes.SPColor);
        vender.setBounds(0,200,super.getWidth(),50);
        vender.setFont(new Font("Dialog",Font.BOLD,20));

        add(vender);



        JButton Subastar= new JButton("SUBASTA");
        Subastar.setBackground(Constantes.SPColor);
        Subastar.setForeground(Constantes.ColorTexto);
        Subastar.setBounds(0, 280, super.getWidth(),50 );
        Subastar.setFont(new Font("Dialog",Font.BOLD,20));

        add(Subastar);



        
    }

}
