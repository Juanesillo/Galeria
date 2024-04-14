package backend;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;


import backend.Clientes.Cliente;

public class Pieza {
    private String autor;
    private Integer id;
    private Integer anio;
    private String lugarCreacion;
    private String tipo;// QUe tipo de obra es (Cuadro, Escultura, ETC )
    private String titulo;// nombre de la pieza
    private static String estadoInventario;
    private static boolean disponible;// disponible solo para subasta (false);

    
    // constructor


public Pieza(String autor, Integer id, Integer anio, String lugarCreacion, String tipo,
            String titulo, String estadoInventario, boolean disponible) {
        this.autor = autor;
        this.id = id;
        this.anio = anio;
        this.lugarCreacion = lugarCreacion;
        this.tipo = tipo;
        this.titulo = titulo;
        Pieza.estadoInventario = estadoInventario;
        Pieza.disponible = disponible;
    }



//setters
public static void setEstadoInventario(String estadoInventario) {
    Pieza.estadoInventario = estadoInventario;
}

public static void setDisponible(boolean disponible) {
    Pieza.disponible = disponible;
}




    //getters
    public Integer getId() {
        return id;
    }
   

    public static String getEstadoInventario() {
        return estadoInventario;
    }
    public static boolean isDisponible() {
        return disponible;
    }
    
    public String getAutor() {
        return autor;
    }


    public Integer getAnio() {
        return anio;
    }


    public String getLugarCreacion() {
        return lugarCreacion;
    }




    public String getTipo() {
        return tipo;
    }


    public String getTitulo() {
        return titulo;
    }


    //metodos


    public ArrayList<Object> atributos(String autor, Integer id, Date anio, String lugarCreacion,Cliente propietario,String tipo, String Titulo){
        ArrayList<Object> Atributos= new ArrayList<Object>();

        Atributos.add(this.autor);
        Atributos.add(this.id);
        Atributos.add(this.anio);
        Atributos.add(this.lugarCreacion);
        Atributos.add(this.tipo);
        Atributos.add(this.titulo);

        return Atributos;
        
    }           
    // metodo auxiliar 
    public static ArrayList<Object>  AgregarEstado(String estado, ArrayList<Object> atributos){
            // Agrega o Actualiza el Estado dentro del Array 
            Integer comparador= 0;
            Iterator <Object> it= atributos.iterator();

            //recorrer la lista con iterator 

            while (it.hasNext()) {
                Object item = it.next();
                if(item.equals(estado)){
                    comparador=1;
                }
                }
            if (comparador==0){
                atributos.add(estado);
            }
        


            return atributos;
            }
    public static ArrayList<Object> AgregarPropietario(Cliente cliente, ArrayList<Object> atributos){
        atributos.add(cliente);
        return atributos;
    
    }
    

    }




