package guis;
import Constantes.Constantes;
import JDBC.MyJDBC;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGui extends BaseFrame  {
    
    public  RegisterGui(){
        super("Registro Galeria ");
    }

    @Override
    protected void addguicomponent(){
        setSize(800,600 );

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

// String contacto, String idCliente, Cajero cajero,double Dinero

        // Contacto 

        JLabel tituloContacto= new JLabel("Ingrese su correo ");
        tituloContacto.setForeground(Constantes.ColorTexto);
        tituloContacto.setBounds(20,60,getWidth()-60,24);
        tituloContacto.setHorizontalAlignment(SwingConstants.CENTER);
        tituloContacto.setFont(new Font("Dialog",Font.BOLD,20));
        add(tituloContacto);
        // ingresar Contacto

        JTextField contactoField= new JTextField();
        contactoField.setBackground(Constantes.SPColor);
        contactoField.setForeground(Constantes.ColorTexto);
        contactoField.setBounds(20,95,getWidth()-60,30);
        contactoField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(contactoField);

        // Cantidad de dinero 
        JLabel CantidadDinero= new JLabel("Ingrese su correo ");
        CantidadDinero.setForeground(Constantes.ColorTexto);
        CantidadDinero.setBounds(20,120,getWidth()-60,24);
        CantidadDinero.setHorizontalAlignment(SwingConstants.CENTER);
        CantidadDinero.setFont(new Font("Dialog",Font.BOLD,20));
        add(CantidadDinero);



        // Ingresar Monto de dinero 

        JTextField DineroField= new JTextField();
        DineroField.setBackground(Constantes.SPColor);
        DineroField.setForeground(Constantes.ColorTexto);
        DineroField.setBounds(20,130,getWidth()-60,30);
        DineroField.setFont(new Font("Dialog",Font.BOLD,28));
        add(DineroField);




        // Laber de Username 



        JLabel Username= new JLabel("Usuario");
        Username.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Username.setBounds(20,160,getWidth()-60,24);
        
        Username.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Username.setFont(new Font("Dialog",Font.BOLD,20));
        add(Username);





        // Crear campo para rellenar USERNAME
        JTextField UsernameField= new JTextField();
        UsernameField.setBackground(Constantes.SPColor);
        UsernameField.setForeground(Constantes.ColorTexto);
        UsernameField.setBounds(20,195,getWidth()-60,30);
        UsernameField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(UsernameField);


        // Crear Password Label




        // Label de Password // TITULO

        JLabel Password= new JLabel("Password");


        Password.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Password.setBounds(20,225,getWidth()-60,24);
        
        Password.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Password.setFont(new Font("Dialog",Font.PLAIN,20));
        add(Password);






        // Crear Pasword Field

        JPasswordField passwordField= new JPasswordField();

        passwordField.setBackground(Constantes.SPColor);
        passwordField.setForeground(Constantes.ColorTexto);
        passwordField.setBounds(20,255,getWidth()-60,30);
        passwordField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(passwordField);

        // Volver a ingresar la contraseña 

        JLabel RePassword= new JLabel("type Password again");


        RePassword.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        RePassword.setBounds(20,285,getWidth()-60,24);
        
        RePassword.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        RePassword.setFont(new Font("Dialog",Font.PLAIN,20));
        add(RePassword);

        // Crear Pasword Field

        JPasswordField RepasswordField= new JPasswordField();

        RepasswordField.setBackground(Constantes.SPColor);
        RepasswordField.setForeground(Constantes.ColorTexto);
        RepasswordField.setBounds(20,320,getWidth()-60,30);
        RepasswordField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(RepasswordField);





    // Crear el boton de Login 

        JButton boton= new JButton("REGISTER");
        boton.setBackground(Constantes.TPColor);
        boton.setForeground(Constantes.ColorTexto);
        boton.setBounds(20,370,getWidth()-60,30);
        boton.setFont(new Font("Dialog",Font.BOLD,20));


        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               // obtener el usuario 
               String Username=UsernameField.getText();



               // obtener el valor de la contraseña 


               String Password= String.valueOf(passwordField.getPassword());

               // Obtener la contraseña confirmada 
               String Password2= String.valueOf(RepasswordField.getPassword());


               // validar los inputs propuestos 
               if(validarInput(Username, Password, Password2)){
                    // intenro registrar en la dataBase
                    if(MyJDBC.register(Username, Password2)){
                        // Registro exitoso 
                        // Dispose de la gui 
                        RegisterGui.this.dispose();

                        // crear el ususario 
                        LoginGui loginGui= new LoginGui();
                        loginGui.setVisible(true);

                        JOptionPane.showMessageDialog(loginGui, "Registro del cliente exitoso");


                        // no es necesario validar algo mas solo cliente por ahora... es mejor hacerlo en el gui de cliente y hacer una lista de objetos de tipo cliente


                    }else{
                        JOptionPane.showMessageDialog(RegisterGui.this, "Usuario existente ");
                    }


               }



            }
            
        });


        add(boton);



        // boton para regresar 

        JLabel Registro= new JLabel("<html><a href=\"#\">Volver al Login </a></html>");
        Registro.setBounds(20,410,getWidth()-60,30);
        Registro.setForeground(Constantes.ColorTexto);
        Registro.setBackground(Constantes.ColorTexto);
        Registro.setFont(new Font("Dialog",Font.BOLD,11));
        Registro.setHorizontalAlignment(SwingConstants.CENTER);
        add(Registro);


  
    }




    private boolean validarInput(String username, String password, String repassword){

        // Empezar validación 

        if (username.length()== 0 || password.length()==0 || repassword.length()== 0){return false;}

        // el usuario tiene que tener al menos 5 caracteres de largo 
        if (username.length()< 5){return false;}


        // las contraseñas tienen que ser las mismas 

        if (!password.equals(repassword)){return false;}

        // las validaciones se cumplieron
        return true;

    }

    private Integer generarID(){
        return null;

    }

}
