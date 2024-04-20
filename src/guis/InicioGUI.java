package guis;
import Constantes.Constantes;
import java.awt.Font;
import javax.swing.*;;

public class InicioGUI extends BaseFrame {

    public InicioGUI(String titulo) {
        super("Inicio Carga");
       
    }

    @Override
    protected void addguicomponent() {



        // Boton Crear desde 0

        JButton Boton= new JButton("Crear Galeria desde cero");

        Boton.setBackground(Constantes.TPColor);
        Boton.setForeground(Constantes.ColorTexto);
        Boton.setBounds(20,170,getWidth()-60,30);
        Boton.
        add(Boton);
        // Cargar nombre del archivo  LABEL CARGAR ARCHIVO

            // ESPACIO PARA COLOCAR EL NOMBRE DEL ARCHIVO 


       
    }

}
