package guis;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Constantes.Constantes;
import JDBC.MyJDBC;
import JDBC.User;

import javax.swing.*;

import com.mysql.cj.xdevapi.Client;

// objetivo de la clase, permitir que el usuario de la Galeria realice su login y ejecute la gui
public class LoginGui extends BaseFrame {
    // crear el constructor para el inicio de sesion Log- in
    public LoginGui() {
        // definir un titulo estandar en la variable del BaseFrame de la Galeria 
        super("Inicio de sesion Galeria");
        
    }
    @Override
    protected void addguicomponent() {

        // Crear Label de Galeria 
        // Titulo que aparece en la pantalla de la galeria 

        JLabel Titulo=new JLabel("Aplicacion Galeria");
        
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

        // Laber de Username 

        JLabel Username= new JLabel("Username");
        Username.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Username.setBounds(20,90,getWidth()-30,24);
        
        Username.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Username.setFont(new Font("Dialog",Font.PLAIN,20));
        add(Username);


        // Crear campo para rellenar USERNAME
        JTextField UsernameField= new JTextField();
        UsernameField.setBackground(Constantes.SPColor);
        UsernameField.setForeground(Constantes.ColorTexto);
        UsernameField.setBounds(20,125,getWidth()-60,30);
        UsernameField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(UsernameField);


        // Crear Password Label

        // Label de Password

        JLabel Password= new JLabel("Password");


        Password.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Password.setBounds(20,175,getWidth()-60,24);
        
        Password.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Password.setFont(new Font("Dialog",Font.PLAIN,20));
        add(Password);

        // Crear Pasword Field

        JPasswordField passwordField= new JPasswordField();

        passwordField.setBackground(Constantes.SPColor);
        passwordField.setForeground(Constantes.ColorTexto);
        passwordField.setBounds(20,210,getWidth()-60,30);
        passwordField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(passwordField);

    // Crear el boton de Login 

        JButton boton= new JButton("LOGIN");
        boton.setBackground(Constantes.TPColor);
        boton.setForeground(Constantes.ColorTexto);
        boton.setBounds(20,270,getWidth()-60,30);
        boton.setFont(new Font("Dialog",Font.BOLD,20));


        //asignar Actions
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //obtener ususario
                String Username=UsernameField.getText();
                //obtener contraseña

                String password= String.valueOf(passwordField.getPassword());

                //validar el login 

                User user= MyJDBC.validateLogin(Username, password);

                
            if (user != null){
                // eliminar esta gui
                LoginGui.this.dispose();

                //Hacer validacion Respectiva para Clientes

                if (user.getUsername()=="ADMINISTRADOR"){
                    AdministradorGUI administradorGUI= new AdministradorGUI();
                    administradorGUI.setVisible(true);
                    JOptionPane.showMessageDialog(administradorGUI, "LogIn Exitoso");
                }
                if (user.getUsername()=="OPERADOR"){}
                if (user.getUsername()=="CAJERO"){}

                else{// clase Cliente 
                    // Hacer visible clase cliente         
                    ClienteGUI clienteGUI= new ClienteGUI();
                    clienteGUI.setVisible(true);
                    JOptionPane.showMessageDialog(clienteGUI, "LogIn Exitoso");
                }
                

                // Conectar con la GUI específica

            }else{JOptionPane.showMessageDialog(LoginGui.this, "Error");}

            }
            
            // si ususario es null significa que no se encontro un valor almacenado 

        });



        add(boton);





    // Boton de registro 

    JLabel Registro= new JLabel("<html><a href=\"#\"> Registrate en la Galeria</a></html>");
    Registro.setBounds(20,310,getWidth()-60,30);
    Registro.setForeground(Constantes.ColorTexto);
    Registro.setBackground(Constantes.ColorTexto);
    Registro.setFont(new Font("Dialog",Font.BOLD,11));
    Registro.setHorizontalAlignment(SwingConstants.CENTER);
    add(Registro);

    }

}
