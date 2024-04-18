package backend.Clientes;

import java.util.ArrayList;
import java.util.HashMap;

import Persistencia.persistenciaClientes;
import backend.gestionPiezaInventario.Inventario;

public class Cliente  {
    // atributos de cliente
    private String contacto;
    private String idCliente;
    private Inventario inventario;
  // listas implementadas en cliente

    private HashMap<String, ArrayList<Object>> Historial= new HashMap<String,ArrayList<Object>>();
    private HashMap<String, ArrayList<Object>> Compras = new HashMap<String,ArrayList<Object>>();


    private static boolean validar;// si el cliente esta validado por el administrador 
  
    

    public Cliente(String contacto, String idCliente, Inventario inventario) {
        this.contacto= contacto;
        this.idCliente=idCliente;
        this.inventario= inventario;

    }

    // actualizar el mapa de historial de piezas que ha dado el cliente a la Galeria 
    public void actualizarHistorial(String Titulo, ArrayList<Object> atributos)  {
        Historial.put(Titulo, atributos);
    }
    
    public void actualizarHistorialCompras(String Titulo, ArrayList<Object> atributos)  {
        Compras.put(Titulo, atributos);
    }


    

    public static void setValidar(boolean validar) {
        Cliente.validar = validar;
    }

    public static boolean getValidar(){
        return Cliente.validar;
    }

    public boolean VerificarDisponibilidad(Inventario inventario, String nombre ){
        boolean validar= false;
        HashMap<String, ArrayList<Object>>mapaDisponible= inventario.getListadoDisponible();
        if (mapaDisponible.containsKey(nombre)){
            validar=true;
        }
        return validar;

    
    }
    

 

}
