package backend.Trabajadores;

import java.time.LocalDate;
import java.util.*;

import backend.gestionPiezaInventario.Inventario;
import backend.gestionPiezaInventario.Pieza;

public class Operador{

// solo se encarga de la subasta 
    private static HashMap<String, ArrayList<Object>>  subasta = Inventario.getListadoSubasta();
    private static HashMap<String,Integer> Registro = new HashMap<String,Integer>();
  
    public Operador(){
       

    }

    public static HashMap<String, ArrayList<Object>> getSubasta(){
        return subasta;

    }
    public static HashMap<String, Integer> getRegistro() {
        return Registro;
    }

    public static void RegistrarPuja(String nombre, Integer valor){
        // Puja nombre del cliente que puja - Valor con el cual Puja 
        Registro.put(nombre, valor);
    }

    public static boolean consultarEstado(Pieza pieza){
        return pieza.isDisponible();        

    }

    

    public static void IniciarSubasta(){

        try{
            // obtener listado de piezas para subastar 

        subasta=getSubasta();


        ArrayList<String> nombre = (ArrayList<String>) subasta.keySet();
        

        String valorSubasta = nombre.get(0);
        ArrayList<Object> atributos= subasta.get(valorSubasta);

        // las subastas solo se realizan los días pares por lo tanto debemos validar si es un día par 
        // validar dia del mes
        // obtener fecha actual
        LocalDate fechaActual= LocalDate.now();


        // obtener el dia del mes especifigo 
        int dia =fechaActual.getDayOfMonth();
    
        if ( dia %2 ==0){
                // si es dia par se puede realizar la subasta 

                // validar cual es el mayor valor en Hashmap


            
            
        }
        else{throw new Exception("Dia no valido para la subasta");}


        }catch(Exception e){
            System.out.println("No es posible iniciar la subasta");
        }
       
        


    }




    









}
