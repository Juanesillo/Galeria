package backend.gestionPiezaInventario;

import java.util.*;

import backend.Trabajadores.Administrador;
import backend.Trabajadores.Operador;


public class Inventario {
    // atributos    
    //lista piezas disponibles para compra
    private HashMap<String,ArrayList<Object>>listadoDisponible=new HashMap<String,ArrayList<Object>>();
    // Lista piezas disponibles para Subasta 
    private HashMap<String,ArrayList<Object>>listadoSubasta=new HashMap<String,ArrayList<Object>>();

    // piezas exhibidas
    private HashMap<String,ArrayList<Object>> listadoexhibidas = new HashMap<String,ArrayList<Object>>();
  
    private Administrador administrador;
    private Pieza pieza;


    // Constructor 
    public Inventario( Pieza pieza){
        
       
        this.pieza=pieza;
        //se deja el constructor vacio ya que se requiere que todos los atributos estesn inicializados en su valor general
    }

    public HashMap<String,ArrayList<Object>> getListadoDisponible() {
        return listadoDisponible;
    }


    public HashMap<String,ArrayList<Object>>  getListadoexhibidas() {
        return listadoexhibidas;
    }
 
 
    public HashMap<String, ArrayList<Object>> getListadoSubasta() {
        return listadoSubasta;
    }

    // Atributos del Administrador 
    //llenar los hashes 
    public void AgregarPieza(String nombre, ArrayList<Object> atributos){
        listadoDisponible.put(nombre, atributos);
        if (Pieza.getEstadoInventario() =="exhibida"){
            listadoexhibidas.put(nombre,atributos);

        }
    }
    //agregar Piezas a subasta // validar con Subasta ==> para simular la subasta 
    public void AgregarSubasta(Pieza pieza, ArrayList<Object> atributos){
        if(pieza.isDisponible()==false){
            listadoSubasta.put(pieza.getTitulo(), atributos);
        }
    }

    public void EliminarPieza(Pieza pieza, ArrayList<Object> atributos){
      
            listadoDisponible.remove(pieza.getTitulo(), atributos);
            listadoexhibidas.remove(pieza.getTitulo(), atributos);
        
    }    

    public ArrayList<Object> cambiarEstadoPieza(String estado, ArrayList<Object> atributos){
        return Pieza.AgregarEstado(estado,atributos);  
     
    }







}