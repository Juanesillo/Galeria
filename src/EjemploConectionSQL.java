import java.sql.*;


public class EjemploConectionSQL {
    public static void main(String[] args){

        try{
                
        java.sql.Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login_schema","root","MonkMode.01*");

        java.sql.Statement statement= connection.createStatement();
        java.sql.ResultSet resulSet= statement.executeQuery("SELECT * FROM USERS");



        while (resulSet.next()) {
            System.out.println(resulSet.getString("Username"));
            System.out.println(resulSet.getString("Password"));
        }


        }
        catch(SQLException e){
            e.printStackTrace();

        }


    }   
}
