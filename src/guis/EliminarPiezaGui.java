package guis;



import javax.swing.*;
import java.awt.Font;
import Constantes.Constantes;

public class EliminarPiezaGui extends BaseFrame{

    public EliminarPiezaGui() {
        super("Eliminar Pieza");
        
    }

    @Override
    protected void addguicomponent() {

        JLabel Titulo = new JLabel("Elimnar Pieza");
          
        // Ajustar Color 
        Titulo.setForeground(Constantes.ColorTexto);
        
        // ajustar la ubicacion y el tamaño del gui component

        Titulo.setBounds(0,20,super.getWidth()-60,27);
        //Ajustar fonts 

        Titulo.setFont(new Font("Dialog",Font.BOLD,28));
        
        // Centrar el texto del Laber 
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);


        // agregar a la GUI 
        add(Titulo);
        
        JLabel nombre = new JLabel("Nombre de la pieza");
          
        // Ajustar Color 
        nombre.setForeground(Constantes.ColorTexto);
        
        // ajustar la ubicacion y el tamaño del gui component

        nombre.setBounds(0,50,super.getWidth()-60,27);
        //Ajustar fonts 

        nombre.setFont(new Font("Dialog",Font.BOLD,28));
        
        // Centrar el texto del Laber 
        nombre.setHorizontalAlignment(SwingConstants.CENTER);


        // agregar a la GUI 
        add(nombre);





        











        
    }

}
