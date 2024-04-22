package backend.Clientes;

import java.util.ArrayList;
import java.util.HashMap;
import backend.Trabajadores.Cajero;


public class Cliente  {
    // atributos de cliente
    private String contacto;
    private String idCliente;
    private double Dinero;

  // listas implementadas en cliente

    private HashMap<String, ArrayList<Object>> Historial= new HashMap<String,ArrayList<Object>>();// historial de propiedades 
    private HashMap<String, ArrayList<Object>> Compras = new HashMap<String,ArrayList<Object>>();// historial de compras


    private boolean validar;// si el cliente esta validado por el administrador 
    
    

    public Cliente(String contacto, String idCliente,double Dinero) {
        this.contacto= contacto;
        this.idCliente=idCliente;
        this.Dinero=Dinero;


    }

    // implementacion de getter
    

    public String getContacto() {
        return contacto;
    }

    public HashMap<String, ArrayList<Object>> getHistorial() {
        return Historial;
    }

    public HashMap<String, ArrayList<Object>> getCompras() {
        return Compras;
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

    public double getDinero(){
        return Dinero;
    }

    

    public void setDinero(double dinero) {
        Dinero = dinero;
    }


    // actualizar el mapa de historial de piezas que ha dado el cliente a la Galeria 
    public void actualizarHistorial(String Titulo, ArrayList<Object> atributos)  {
        Historial.put(Titulo, atributos);
    }

    // metodos por cliente

    public void actualizarHistorialCompras(String Titulo, ArrayList<Object> atributos)  {
        Compras.put(Titulo, atributos);
    }    

   
    
    // funciones solicitud compra y venta
         // se hace solicitud de compra al cajero 
   public void solicitudCompra(Cliente cliente, String nombre ){
    Cajero.llenarSolicitud(cliente,nombre);

   }
    
}
    

 


