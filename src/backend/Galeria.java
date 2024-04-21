package backend;

import backend.Trabajadores.Operador;

import java.util.ArrayList;

import backend.Clientes.Cliente;
import backend.GestionCompras.Subasta;
import backend.Trabajadores.Cajero;
import backend.gestionPiezaInventario.Inventario;


public class Galeria {

    // atributos 

    private Inventario inventario = new Inventario();
    private Cajero cajero= new Cajero(inventario);
    private static ArrayList<Cliente> listaClientes= new ArrayList<Cliente>();

    // operador y subasta se deben crear una vez sea creado el cliente // validar operador y Subasta

    
    

    public Galeria(){
        
    }

    public static void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    

}
