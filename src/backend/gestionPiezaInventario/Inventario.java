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
    private Operador empleado;
    private Administrador administrador;
    private Pieza pieza;


    // Constructor 
    public Inventario(Operador  empleado, Pieza pieza){
        
        this.empleado=empleado;
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
    public void AgregarPieza(String nombre, ArrayList<Object> atributos, Operador  empleado){
        listadoDisponible.put(nombre, atributos);
        if (Pieza.getEstadoInventario() =="exhibida"){
            listadoexhibidas.put(nombre,atributos);

        }
    }
    //agregar Piezas a subasta // validar con Subasta ==> para simular la subasta 
    public void AgregarSubasta(String nombre, ArrayList<Object> atributos,Operador  empleado){
        if(Pieza.isDisponible()==false){
            listadoSubasta.put(nombre, atributos);
        }
    }

    public void EliminarPieza(String nombre, ArrayList<Object> atributos, Operador  empleado){
        if (this.administrador.getUser() =="Administrador"){
            listadoDisponible.remove(nombre, atributos);
            listadoexhibidas.remove(nombre, atributos);
        }
    }    

    public ArrayList<Object> cambiarEstadoPieza(String estado, ArrayList<Object> atributos, Operador empleado){
        return Pieza.AgregarEstado(estado,atributos);  
     
    }







}
