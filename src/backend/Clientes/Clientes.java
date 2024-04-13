package backend.Clientes;

import java.util.ArrayList;
import java.util.HashMap;

import backend.Inventario;

public abstract class Clientes {

    protected String contacto;
    protected String idCliente;
    protected static HashMap<String, Integer> Historial= new HashMap<String, Integer>();
    protected static Inventario inventario;

    // Constructor
    public Clientes(String contacto, String idCliente, Inventario inventario){
        this.contacto=contacto;
        this.idCliente=idCliente;
        Clientes.inventario=inventario;
    }
    
    //Metodos Abstractos 
    public abstract void actualizarHistorial(String Titulo, Integer Valor);
    
    public boolean VerificarDisponibilidad(Inventario inventario, String nombre ){
        boolean validar= false;
        HashMap<String, ArrayList<Object>>mapaDisponible= inventario.getListadoDisponible();
        if (mapaDisponible.containsKey(nombre)){
            validar=true;
        }
        return validar;

    }

  
    
    
} 