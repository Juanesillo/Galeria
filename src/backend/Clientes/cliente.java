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
    private double Dinero;

  // listas implementadas en cliente

    private HashMap<String, ArrayList<Object>> Historial= new HashMap<String,ArrayList<Object>>();
    private HashMap<String, ArrayList<Object>> Compras = new HashMap<String,ArrayList<Object>>();


    private boolean validar;// si el cliente esta validado por el administrador 
    
    

    public Cliente(String contacto, String idCliente, Cajero cajero,double Dinero) {
        this.contacto= contacto;
        this.idCliente=idCliente;
        this.cajero= cajero;
        this.Dinero=Dinero;


    }

    // implementacion de getter
    

    public String getContacto() {
        return contacto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    

    public void setValidar(boolean validar) {
        this.validar = validar;
    }

    

    public boolean getValidar() {
        return validar;
    }





    // actualizar el mapa de historial de piezas que ha dado el cliente a la Galeria 
    public void actualizarHistorial(String Titulo, ArrayList<Object> atributos)  {
        Historial.put(Titulo, atributos);
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
    

 


