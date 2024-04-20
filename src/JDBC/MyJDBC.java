package JDBC;
// Interactuar con la base MySQL Actualizar base de DATOS // Retornar valores

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class MyJDBC {
    //Configuracion SQL

    private static final String url= "jdbc:mysql://127.0.0.1:3306/galeryapp";
    private static final String user= "root";
    private static final String Password= "MonkMode.01*";


    // generar la conexion con la Base de datos 
    public static User validateLogin(String username, String password){
        try{
            Connection connection= DriverManager.getConnection(url, user, Password);

            // crear Query o Consulta

            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");// Hacer la consulta en la base de datos para validar Usuario Y contraseña


            //remplazar los ? por valores 
            //los parameterIndex asignan el primer y segundo valor de la consulta realizada
            preparedStatement.setString(1,username);
            preparedStatement.setString(2, password);

            // Ejecutar la consulta 

            ResultSet resultSet= preparedStatement.executeQuery();

            //next asigna un valor True or False si la consulta arroja algun valor 
            if(resultSet.next()){

                //obtener el id 

                int UserId= resultSet.getInt("id");

                // si se implementa para balance obtener balance de sql

                return new User(UserId,username,password);
            }




        }catch(SQLException e){

            e.printStackTrace();
        }

        //Usuario no valido
        return null;
        


    }
    // Registrar nuyevo usuario en la base de datos 

    // if true== Registro exitoso 

    // if false== Registro fallido 

    public static boolean register(String Username,String password){

        try{
            // validar que el usuario ya fue elegido o aun no 

            if(!checkUser(Username)){
                Connection connection= DriverManager.getConnection(url, user, Password);
                PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO users(username,password)"+"VALUES(?,?)");

                preparedStatement.setString(1, Username);
                preparedStatement.setString(2, password);

                preparedStatement.executeUpdate();
                return true;



            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;


    }
    // validar que el usuario exista, 
    // true => El usuario existe 
    // false => El usuario no existe 
    private static boolean checkUser(String username){
        // intentar bucar y en caso de no encontrar retornar el error
        try{

            Connection connection= DriverManager.getConnection(url, user, Password);


            PreparedStatement preparedStatement= connection.prepareStatement("SELECT * FROM users WHERE username =?");

            preparedStatement.setString(1,username );

            ResultSet resultSet= preparedStatement.executeQuery();

            if(!resultSet.next()){
                return false;
            }
           

    
        }catch(SQLException e){
            e.printStackTrace();
        }
        return true;


    }

}




