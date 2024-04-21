package backend;

import backend.Trabajadores.Operador;
import backend.GestionCompras.Subasta;
import backend.Trabajadores.Cajero;
import backend.gestionPiezaInventario.Inventario;


public class Galeria {

    // atributos 

    private Inventario inventario = new Inventario();
    private Cajero cajero= new Cajero(inventario);
    // operador y subasta se deben crear una vez sea creado el cliente // validar operador y Subasta

    
    

    public Galeria(){
        
    }

}
