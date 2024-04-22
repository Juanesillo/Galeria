package guis;


import java.util.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Constantes.Constantes;
import backend.Galeria;

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

        Titulo.setBounds(0,20,super.getWidth()-20,27);
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

        nombre.setBounds(0,150,super.getWidth()-20,27);
        //Ajustar fonts 

        nombre.setFont(new Font("Dialog",Font.BOLD,28));
        
        // Centrar el texto del Laber 
        nombre.setHorizontalAlignment(SwingConstants.CENTER);


        // agregar a la GUI 
        add(nombre);

        // field 


        JTextField pieza= new JTextField();

        pieza.setBackground(Constantes.SPColor);
        pieza.setForeground(Constantes.ColorTexto);
        pieza.setBounds(20,200,getWidth()-65,24);
        pieza.setFont(new Font("Dialog",Font.PLAIN,28));
        add(pieza);




        //boton 
        JButton boton = new JButton("Eliminar Pieza");
        boton.setBackground(Constantes.TPColor);
        boton.setForeground(Constantes.ColorTexto);
        boton.setBounds(20,350,getWidth()-65,27);
        boton.setFont(new Font("Dialog",Font.BOLD,20));

        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                HashMap<String,ArrayList<Object>> Disponibles= Galeria.getListadoDisponible();
                String nombrePieza= pieza.getText();
                if (Disponibles.containsKey(nombrePieza)){
                    Galeria.removePieza(nombrePieza);

                    // dispose de gui

                    EliminarPiezaGui.this.dispose();
                    AdministradorGUI administradorGUI= new AdministradorGUI();
                    administradorGUI.setVisible(true);


                    JOptionPane.showMessageDialog(administradorGUI,"pieza eliminada con éxito ");


                }else{
                    // dispose gui 
                    EliminarPiezaGui.this.dispose();
                    AdministradorGUI administradorGUI= new AdministradorGUI();
                    administradorGUI.setVisible(true);
                    JOptionPane.showMessageDialog(administradorGUI, "la pieza no existe, no puede ser eliminada");
                }
                    

                    // Mensaje de elminado con exito 


            





                
            }
            
        });

        add(boton);   






        











        
    }

}
