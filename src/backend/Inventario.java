package backend;

import java.util.*;

public class Inventario {
    // atributos    
    private HashMap<Integer,ArrayList>listadoDisponible=new HashMap<Integer,ArrayList>();


    private ArrayList<HashMap<Integer,ArrayList>>listadoexhibidas = new ArrayList<>();
    private Empleado empleado;


    // Constructor 
    public Inventario(Empleado empleado){
        this.empleado=empleado;
    }


    public ArrayList<HashMap<Integer, ArrayList>> getListadoDisponible() {
        return listadoDisponible;
    }


    public ArrayList<HashMap<Integer, ArrayList>> getListadoexhibidas() {
        return listadoexhibidas;
    }



}
