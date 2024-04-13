package backend;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

import backend.Clientes.Propietario;

public class Pieza {
    private String autor;
    private Integer id;
    private Date anio;
    private String lugarCreacion;
    private Propietario propietario;
    private String tipo;// QUe tipo de obra es (Cuadro, Escultura, ETC )
    private String titulo;// nombre de la pieza
    private static String estadoInventario;
    private static boolean disponible;// disponible solo para subasta (false);

    
    // constructor


public Pieza(String autor, Integer id, Date anio, String lugarCreacion, Propietario propietario, String tipo,
            String titulo, String estadoInventario, boolean disponible) {
        this.autor = autor;
        this.id = id;
        this.anio = anio;
        this.lugarCreacion = lugarCreacion;
        this.propietario = propietario;
        this.tipo = tipo;
        this.titulo = titulo;
        Pieza.estadoInventario = estadoInventario;
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


    public Date getAnio() {
        return anio;
    }


    public String getLugarCreacion() {
        return lugarCreacion;
    }


    public Propietario getPropietario() {
        return propietario;
    }


    public String getTipo() {
        return tipo;
    }


    public String getTitulo() {
        return titulo;
    }


    //metodos


    public ArrayList<Object> atributos(String autor, Integer id, Date anio, String lugarCreacion,Propietario propietario,String tipo, String Titulo){
        ArrayList<Object> Atributos= new ArrayList<Object>();

        Atributos.add(this.autor);
        Atributos.add(this.id);
        Atributos.add(this.anio);
        Atributos.add(this.lugarCreacion);
        Atributos.add(this.propietario);
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
    

    }




