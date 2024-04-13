package backend;

import java.util.*;

import backend.Pieza;
import backend.Trabajadores.Administrador;
import backend.Trabajadores.Empleado;

public class Inventario {
    // atributos    
    private HashMap<Integer,ArrayList<Object>>listadoDisponible=new HashMap<Integer,ArrayList<Object>>();


    private HashMap<Integer,ArrayList<Object>> listadoexhibidas = new HashMap<Integer,ArrayList<Object>>();
    private Empleado empleado;
    private Administrador administrador;


    // Constructor 
    public Inventario(Empleado empleado){
        
        this.empleado=empleado;
        //se deja el constructor vacio ya que se requiere que todos los atributos estesn inicializados en su valor general
    }

    public HashMap<Integer,ArrayList<Object>> getListadoDisponible() {
        return listadoDisponible;
    }


    public HashMap<Integer,ArrayList<Object>>  getListadoexhibidas() {
        return listadoexhibidas;
    }

    public void AgregarPieza(Integer id, ArrayList<Object> atributos){
        listadoDisponible.put(id, atributos);
        if (Pieza.getEstadoInventario() =="exhibida"){
            listadoexhibidas.put(id,atributos);

        }
    }

    public void EliminarPieza(Integer id, ArrayList<Object> atributos){
        if (this.administrador.getUser() =="Administrador"){
            listadoDisponible.remove(id, atributos);
            listadoexhibidas.remove(id, atributos);
        }
    }

    public ArrayList<Object> cambiarEstadoPieza(String estado, ArrayList<Object> atributos){
        return Pieza.AgregarEstado(estado,atributos);  

        
    }





}
