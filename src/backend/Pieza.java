package backend;

import java.sql.Date;
import java.util.ArrayList;

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
    private boolean disponible;

    
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
        this.disponible = disponible;
    }


    //getters
    public Integer getId() {
        return id;
    }
    public static String getEstadoInventario() {
        return estadoInventario;
    }
    public boolean isDisponible() {
        return disponible;
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



}
