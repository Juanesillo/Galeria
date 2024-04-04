package guis;
import Constantes.Constantes;
import javax.swing.*;
import java.awt.Font;

public class RegisterGui extends BaseFrame {
    
    public  RegisterGui(){
        super("Registro Galeria ");
    }

    @Override
    protected void addguicomponent(){

         // Crear Label de Galeria 
        // Titulo que aparece en la pantalla de la galeria 

        JLabel Titulo=new JLabel("Registro Galeria");
        
        // Ajustar Color 
        Titulo.setForeground(Constantes.ColorTexto);
        
        // ajustar la ubicacion y el tamaño del gui component

        Titulo.setBounds(0,20,super.getWidth()-30,24);
        //Ajustar fonts 

        Titulo.setFont(new Font("Dialog",Font.BOLD,28));
        
        // Centrar el texto del Laber 
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);


        // agregar a la GUI 
        add(Titulo);

        // Laber de Username 

        JLabel Username= new JLabel("Username");
        Username.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Username.setBounds(20,60,getWidth()-60,24);
        
        Username.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Username.setFont(new Font("Dialog",Font.PLAIN,20));
        add(Username);


        // Crear campo para rellenar USERNAME
        JTextField UsernameField= new JTextField();
        UsernameField.setBackground(Constantes.SPColor);
        UsernameField.setForeground(Constantes.ColorTexto);
        UsernameField.setBounds(20,95,getWidth()-60,30);
        UsernameField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(UsernameField);


        // Crear Password Label

        // Label de Password

        JLabel Password= new JLabel("Password");


        Password.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Password.setBounds(20,125,getWidth()-60,24);
        
        Password.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Password.setFont(new Font("Dialog",Font.PLAIN,20));
        add(Password);

        // Crear Pasword Field

        JPasswordField passwordField= new JPasswordField();

        passwordField.setBackground(Constantes.SPColor);
        passwordField.setForeground(Constantes.ColorTexto);
        passwordField.setBounds(20,155,getWidth()-60,30);
        passwordField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(passwordField);

        // Volver a ingresar la contraseña 

        JLabel RePassword= new JLabel("type Password again");


        RePassword.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        RePassword.setBounds(20,185,getWidth()-60,24);
        
        RePassword.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        RePassword.setFont(new Font("Dialog",Font.PLAIN,20));
        add(RePassword);

        // Crear Pasword Field

        JPasswordField RepasswordField= new JPasswordField();

        RepasswordField.setBackground(Constantes.SPColor);
        RepasswordField.setForeground(Constantes.ColorTexto);
        RepasswordField.setBounds(20,220,getWidth()-60,30);
        RepasswordField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(RepasswordField);





    // Crear el boton de Login 

        JButton boton= new JButton("LOGIN");
        boton.setBackground(Constantes.TPColor);
        boton.setForeground(Constantes.ColorTexto);
        boton.setBounds(20,270,getWidth()-60,30);
        boton.setFont(new Font("Dialog",Font.BOLD,20));
        add(boton);


  
    }

}
