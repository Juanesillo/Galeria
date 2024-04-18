package backend.Clientes;

import java.util.ArrayList;
import java.util.HashMap;

import backend.Trabajadores.Cajero;
import backend.gestionPiezaInventario.Inventario;

public class Cliente  {
    // atributos de cliente
    private String contacto;
    private String idCliente;
    private Cajero cajero;

  // listas implementadas en cliente

    private HashMap<String, ArrayList<Object>> Historial= new HashMap<String,ArrayList<Object>>();
    private HashMap<String, ArrayList<Object>> Compras = new HashMap<String,ArrayList<Object>>();


    private static boolean validar;// si el cliente esta validado por el administrador 
    
    

    public Cliente(String contacto, String idCliente, Cajero cajero) {
        this.contacto= contacto;
        this.idCliente=idCliente;
        this.cajero= cajero;


    }

    // implementacion de getter

    







    // actualizar el mapa de historial de piezas que ha dado el cliente a la Galeria 
    public void actualizarHistorial(String Titulo, ArrayList<Object> atributos)  {
        Historial.put(Titulo, atributos);
    }

    public String getContacto() {
        return contacto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public static void setValidar(boolean validar) {
        Cliente.validar = validar;
    }

    public static boolean getValidar(){
        return Cliente.validar;
    }


    // metodos por cliente

    public void actualizarHistorialCompras(String Titulo, ArrayList<Object> atributos)  {
        Compras.put(Titulo, atributos);
    }    

   
    
    public String Comprar(Cajero Cajero, String nombre, String metododepago){
        return metododepago;

            // Cajero validar si es posible Compra


        
        // validar si la obra de arte esta disponible para ser comprada 
       
        

        }



        
    
}
    

 


