package guis;
import Constantes.Constantes;
import backend.Trabajadores.Administrador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdministradorGUI extends BaseFrame {
    public AdministradorGUI(){
        super("ADMIN");
    }

    public void addguicomponent(){

    Administrador administrador= new Administrador("ADMINISTRADOR");
        
      // Asignar Titulo 
      JLabel Titulo=new JLabel("Vista Administrador");

      // Ajustar Color 
      Titulo.setForeground(Constantes.ColorTexto);
        
      // ajustar la ubicacion y el tamaño del gui component

      Titulo.setBounds(0,20,super.getWidth(),40);
      //Ajustar fonts 

      Titulo.setFont(new Font("Dialog",Font.BOLD,32));
      
      // Centrar el texto del Laber 
      Titulo.setHorizontalAlignment(SwingConstants.CENTER);


      // agregar a la GUI 
      add(Titulo);


      // Boton AgregarPieza


      JButton AgregarPieza= new JButton("AGREGAR PIEZA");
      AgregarPieza.setBackground(Constantes.TPColor);
      AgregarPieza.setForeground(Constantes.ColorTexto);
      AgregarPieza.setBounds(20,170,getWidth()-60,30);
      AgregarPieza.setFont(new Font("Dialog",Font.BOLD,20));

      AgregarPieza.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            // Conectar con Inventario Generar conexión AGREGAR PIEZA

            
            
        }
        
      });
      add(AgregarPieza);
    
    // Boton Validar Usuario


      JButton ValidarUsuario= new JButton("Validar Usuario");
      ValidarUsuario.setForeground(Constantes.ColorTexto);
      ValidarUsuario.setBounds(20,270,getWidth()-60,30);
      ValidarUsuario.setBackground(Constantes.TPColor);
      ValidarUsuario.setFont(new Font("Dialog",Font.BOLD,20));

      ValidarUsuario.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            // Conectar con liente para validar usuario 


            System.out.println("hola Administrador");
            
        }
        
      });
      add(ValidarUsuario);
      
      

      //Boton Devolucion Pieza

      JButton DevolucionPieza= new JButton("Devolución Pieza");
      DevolucionPieza.setForeground(Constantes.ColorTexto);
      DevolucionPieza.setBounds(20,370,getWidth()-60,30);
      DevolucionPieza.setBackground(Constantes.TPColor);
      DevolucionPieza.setFont(new Font("Dialog",Font.BOLD,20));

      DevolucionPieza.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            // Conectar con liente para validar usuario 


            System.out.println("hola Administrador");
            
        }
        
      });
      add(DevolucionPieza);
      




      //Boton Retirar piezas del Inventario según hashmap

      

        

    }

}
