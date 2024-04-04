package guis;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Constantes.Constantes;

public class TipoClienteGUI extends BaseFrame {
    public TipoClienteGUI(){
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


        JButton comprar= new JButton("Comprar");
        comprar.setForeground(Constantes.ColorTexto);
        comprar.setBackground(Constantes.SPColor);
        comprar.setBounds(0,120,super.getWidth(),50);
        comprar.setFont(new Font("Dialog",Font.BOLD,20));
        add(comprar);


        JButton vender= new JButton("Vender");
        vender.setForeground(Constantes.ColorTexto);
        vender.setBackground(Constantes.SPColor);
        vender.setBounds(0,200,super.getWidth(),50);
        vender.setFont(new Font("Dialog",Font.BOLD,20));

        add(vender);


        
    }

}
