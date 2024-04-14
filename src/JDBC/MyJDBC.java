package JDBC;
// Interactuar con la base MySQL Actualizar base de DATOS // Retornar valores

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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


}
