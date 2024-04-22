package guis;
import Constantes.Constantes;
import backend.Galeria;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;;

public class InicioGUI extends BaseFrame {

    public InicioGUI() {
        // titulo propuesto para la interfaz
        super("Inicio Carga");
       
    }

    // Crear Galeria Total para almacenar la información

    // atributos generales 
    
    public static Galeria galeria= new Galeria();
   
    


    @Override
    protected void addguicomponent() {



        // Boton Crear desde 0

        JButton Boton= new JButton("Crear Galeria desde cero");

        Boton.setBackground(Constantes.TPColor);
        Boton.setForeground(Constantes.ColorTexto);
        Boton.setBounds(20,125,getWidth()-60,30);
        Boton.setFont(new Font("Dialog",Font.BOLD,23));
        

        // asignar Action para el boton cargar Galeria desde cero 

        Boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

               

                // crear el inventario desde cero 
                // crear metodo para persistir el inventario de manera  paralela

                // Abrir el login => Conecta con el resto de la Galeria 

                InicioGUI.this.dispose();
                LoginGui loginGui= new LoginGui();
                loginGui.setVisible(true);
                JOptionPane.showMessageDialog(loginGui, "Galeria creada");


                // genrar mensaje de galeria creada con exito


                
            }
            
        });





        add(Boton);






        // Cargar nombre del archivo  LABEL CARGAR ARCHIVO


        // campo de registro de la galeria para cargar 
        JLabel Titulo= new JLabel("Cargar galeria");
        Titulo.setForeground(Constantes.ColorTexto);
        Titulo.setBounds(20,190,getWidth()-60,28);
        Titulo.setFont(new Font("Dialog",Font.BOLD,25));
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);



        // aca se implementa la craeción de una galeria cargada 
            // ingresa el nombre y con el nombre se carga el archivo con una serie de setter que van a cambiar dependiendo de la estructura de datos 
            


        add(Titulo);
        

            // ESPACIO PARA COLOCAR EL NOMBRE DEL ARCHIVO
        JTextField NombreArchivo= new JTextField();

        NombreArchivo.setBackground(Constantes.SPColor);
        NombreArchivo.setForeground(Constantes.ColorTexto);
        NombreArchivo.setBounds(20,240,getWidth()-60,26);
        NombreArchivo.setFont(new Font("Dialog",Font.PLAIN,28));
        NombreArchivo.setFont(new Font("Dialog",Font.BOLD,24));
        add(NombreArchivo);

            // De acuerdo al nombre del archivo extraerlo y realizar un la debida carga de datos del archivo txt




            
         


       
    }

}
