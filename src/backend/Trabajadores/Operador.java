package backend.Trabajadores;

import java.time.LocalDate;
import java.util.*;

import backend.Clientes.Cliente;
import backend.Trabajadores.Cajero;

import backend.gestionPiezaInventario.Inventario;
import backend.gestionPiezaInventario.Pieza;

public class Operador{

// solo se encarga de la subasta 
    private static Inventario inventario;
    private static HashMap<String, ArrayList<Object>>  subasta;
    private static HashMap<Cliente,Integer> Registro = new HashMap<Cliente,Integer>();
  
    public Operador(Inventario inventario){
        Operador.inventario = inventario;
        subasta = inventario.getListadoSubasta();
       

    }

    public static HashMap<String, ArrayList<Object>> getSubasta(){
        return subasta;

    }
    public static HashMap<Cliente, Integer> getRegistro() {
        return Registro;
    }

    public static void RegistrarPuja(Cliente nombre, Integer valor){
        // Puja nombre del cliente que puja - Valor con el cual Puja 
        Registro.put(nombre, valor);
    }

    public static boolean consultarEstado(Pieza pieza){
        return pieza.isDisponible();        

    }

    

    public static void IniciarSubasta(){

        try{
            // obtener listado de piezas para subastar 
        Integer maxValor=0;
        subasta=getSubasta();
        Cliente claveMaxValor = null;

        HashMap<Cliente, Integer>registro= getRegistro();

        ArrayList<String> ListaNombres = (ArrayList<String>) subasta.keySet();
        

        String nombre = ListaNombres.get(0);
        ArrayList<Object> atributos= subasta.get(nombre);

        // las subastas solo se realizan los días pares por lo tanto debemos validar si es un día par 
        // validar dia del mes
        // obtener fecha actual
        LocalDate fechaActual= LocalDate.now();


        // obtener el dia del mes especifigo 
        int dia =fechaActual.getDayOfMonth();
    
        if ( dia %2 ==0){
                // si es dia par se puede realizar la subasta 

                // validar cual es el mayor valor en Hashmap

                for (Map.Entry<Cliente,Integer> entry : registro.entrySet() ) {

                    Cliente clave = entry.getKey();
               
                    Integer valor= entry.getValue();

                    if(valor>maxValor){
                    maxValor=valor;
                    claveMaxValor=clave;}  

                    }
            Cajero.venderPiezaOperador(nombre, maxValor, claveMaxValor);
                
            
            
        }
        else{throw new Exception("Dia no valido para la subasta");}


        }catch(Exception e){
            System.out.println("No es posible iniciar la subasta");
        }
       
        


    }




    









}
