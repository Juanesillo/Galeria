package backend.gestionPiezaInventario;

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
    private  String estadoInventario;
    private  boolean disponible;// disponible solo para subasta (false);
    private  Integer precio;

    
    // constructor


public Pieza(String autor, Integer id, Integer anio, String lugarCreacion, String tipo,
            String titulo, String estadoInventario, boolean disponible, Integer precio ) {
        this.autor = autor;
        this.id = id;
        this.anio = anio;
        this.lugarCreacion = lugarCreacion;
        this.tipo = tipo;
        this.titulo = titulo;
        this.precio= precio;
        this.estadoInventario = estadoInventario;
        this.disponible = disponible;
    }





    

    

//setters

    public void setEstadoInventario(String estadoInventario) {
        this.estadoInventario = estadoInventario;
    }



    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    
    //getters
    public Integer getId() {
        return id;

    }

    public String getEstadoInventario() {
        return estadoInventario;
    }
    public boolean isDisponible() {
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

    public Integer getPrecio(){
        return precio;
    }
   

    //metodos


    public static ArrayList<Object> atributos(String autor, Integer id, Integer anio, String lugarCreacion,String tipo, String Titulo, Integer precio){
        ArrayList<Object> Atributos= new ArrayList<Object>();

        Atributos.add(autor);
        Atributos.add(id);
        Atributos.add(anio);
        Atributos.add(lugarCreacion);
        Atributos.add(tipo);
        Atributos.add(Titulo);
        Atributos.add(precio);

        return Atributos;
        
    }           
    // metodo auxiliar 

    // Agregar el estado dentro de la pieza validar si esta disponible o no
    public ArrayList<Object>  AgregarEstado(String estado, ArrayList<Object> atributos){//validar en caso de que sea importante agregar la pieza de la cual se esta iterando
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
            // ajustar posible implementacion atributos en el constructor 

            // this.atributos.add(estado);


            // para estos metodos es importante validar primero los atributos de las piezas y lugo agregarlas en inventario

            // se debe validar para mejorar implementación con lista de piezas en inventario 
    public static ArrayList<Object> AgregarPropietario(Cliente cliente, ArrayList<Object> atributos){
        atributos.add(cliente);
        return atributos;
    
    }

    public static ArrayList<Object> AgregarEspecificos(ArrayList<Object> atributos,ArrayList<Object> especificos){

        for (int i=0; i<especificos.size();i++){
            atributos.add(especificos.get(i));
        }
        return atributos;

    }

    // forma de implementarlo atributos = AgregarEspecificos(atributos, especificos);



    // mejorar implementación con Herencia Pieza => TIPO_PIEZA ESPECÏFICA

    }




