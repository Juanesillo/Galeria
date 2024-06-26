package backend.gestionPiezaInventario;

import java.util.*;





// comprabar posible adaptacion a lista de piezas
public class Inventario {
    // atributos    
    //lista piezas disponibles para compra
    private HashMap<String,ArrayList<Object>>listadoDisponible=new HashMap<String,ArrayList<Object>>();
    // Lista piezas disponibles para Subasta 
    private  HashMap<String,ArrayList<Object>>listadoSubasta=new HashMap<String,ArrayList<Object>>();

    // piezas exhibidas
    private HashMap<String,ArrayList<Object>> listadoexhibidas = new HashMap<String,ArrayList<Object>>();
    private HashMap<String,ArrayList<Object>> Historial = new HashMap<String,ArrayList<Object>>();
  
    
    private Pieza pieza;


    // Constructor 
    public Inventario( ){// mas de una Pieza
        
       

        //se deja el constructor vacio ya que se requiere que todos los atributos estesn inicializados en su valor general
    }

    

    public HashMap<String,ArrayList<Object>> getListadoDisponible() {
        return listadoDisponible;
    }


    public HashMap<String,ArrayList<Object>>  getListadoexhibidas() {
        return listadoexhibidas;
    }
 
 
    public  HashMap<String, ArrayList<Object>> getListadoSubasta() {
        return listadoSubasta;
    }

    public  HashMap<String, ArrayList<Object>> getHistorial(){
        return Historial;
    }

    // Atributos del Administrador 
    //llenar los hashes 
    public void AgregarPieza(String nombre, ArrayList<Object> atributos, Pieza pieza){
        listadoDisponible.put(nombre, atributos);
        if (pieza.getEstadoInventario() =="exhibida"){
            listadoexhibidas.put(nombre,atributos);

        }
    }
    //agregar Piezas a subasta // validar con Subasta ==> para simular la subasta 
    public void AgregarSubasta(Pieza pieza, ArrayList<Object> atributos){
        if(pieza.isDisponible()==false){
            listadoSubasta.put(pieza.getTitulo(), atributos);
        }
    }

    public void EliminarPieza(String nombre){
            ArrayList<Object> atributos= listadoDisponible.get(nombre);
            listadoDisponible.remove(nombre, atributos);// puede faltar una validacion 
            listadoexhibidas.remove(nombre, atributos);
            

        
    }    

    public ArrayList<Object> cambiarEstadoPieza(Pieza pieza,String estado, ArrayList<Object> atributos){
        return pieza.AgregarEstado(estado,atributos);  
     
    }







}
