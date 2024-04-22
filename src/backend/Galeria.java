package backend;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import backend.Clientes.Cliente;
import backend.Trabajadores.Cajero;
import backend.Trabajadores.Operador;
import backend.gestionPiezaInventario.Inventario;
import backend.gestionPiezaInventario.Pieza;

// esta clase va hacer un llamado de los metodos de otras calses 
public class Galeria {

    // atributos 

    private static Inventario inventario = new Inventario();
    private static Cajero cajero= new Cajero(inventario);
    private static Operador operador = new Operador(inventario);

    // Ajustes de Persis
    private static ArrayList<Cliente> listaClientes= new ArrayList<Cliente>();

    // operador y subasta se deben crear una vez sea creado el cliente // validar operador y Subasta
    // listas empleadas 


    // Inventario 
    private static HashMap<String,ArrayList<Object>>listadoDisponible= inventario.getListadoDisponible();
    // Lista piezas disponibles para Subasta 
    private static HashMap<String,ArrayList<Object>>listadoSubasta= inventario.getListadoSubasta();

    // piezas exhibidas
    private HashMap<String,ArrayList<Object>> listadoexhibidas = inventario.getListadoexhibidas();
  
    // Operador
    
    

    private static HashMap<Cliente,Integer> Registro = operador.getRegistro();// puede emplear subasta 
    // Cajero

    private static HashMap<String, Integer> RegistroPagos = cajero.getResgistroPagos();
    
    // cajero estructura de datos
    


    // Operador necesita Inventario para hacer la consulta de listado de SubastaDisponible 

    

    public Galeria(){
        
    }


    // getters

    // setters

    public static void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    // metodos de cada Clase puts dentro de la clase 
    //put en el inventario 

    public static void agregarInventario(String nombre,ArrayList<Object> atributos, Pieza pieza){

        inventario.AgregarPieza(nombre, atributos, pieza);
    }
    

    public static  ArrayList<Cliente> getlistaClientes(){

        return listaClientes;
    }

    public static void removePieza(String nombre){
        inventario.EliminarPieza(nombre);
    }


    public static HashMap<String,ArrayList<Object>> getListadoDisponible(){

        return listadoDisponible;
    }


    public static void realizarCompra(String nombre, Cliente cliente) throws Exception{
        try{

            Cajero.venderPieza(nombre, cliente);
        }catch(Exception e){

            System.err.println("Error al realizar la compra: " + e.getMessage());
            throw e; 

        }       


    }

    public static void AgregarhistorialCliente(Cliente cliente, String nombre, ArrayList<Object> atributos){

        cliente.actualizarHistorial(nombre, atributos);
    }






    public static void guardarDatosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Guardar lista de clientes
            writer.write("=== Lista de Clientes ===\n");
            for (Cliente cliente : listaClientes) {
                writer.write(cliente.getContacto() + ";" + cliente.getIdCliente() +";"+cliente.getDinero()+";");
                writer.write("Historial");
                HashMap<String, ArrayList<Object>> mapa= cliente.getHistorial();
                for (Entry<String, ArrayList<Object>> entry : mapa.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<Object> lista = entry.getValue();
                    writer.write(clave + ": ");
                    for (Object obj : lista) {
                        writer.write(obj.toString() + " ");
                    }
                    writer.write("\n");
                
                }
                writer.write("Compras");
                HashMap<String, ArrayList<Object>> mapacom= cliente.getCompras();
                for (Entry<String, ArrayList<Object>> entry : mapacom.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<Object> lista = entry.getValue();
                    writer.write(clave + ": ");
                    for (Object obj : lista) {
                        writer.write(obj.toString() + " ");
                    }
                    writer.write("\n");
                
                }
                writer.write("=== listadoDisponible ===\n");
                HashMap<String,ArrayList<Object>>listadoD= inventario.getListadoDisponible();
                for (Entry<String, ArrayList<Object>> entry : listadoD.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<Object> lista = entry.getValue();
                    writer.write(clave + ": ");
                    for (Object obj : lista) {
                        writer.write(obj.toString() + " ");
                    }
                    writer.write("\n");
                
                }
                writer.write("=== listadoSubasta ===\n");
                HashMap<String,ArrayList<Object>>listadoS= inventario.getListadoSubasta();
                for (Entry<String, ArrayList<Object>> entry : listadoS.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<Object> lista = entry.getValue();
                    writer.write(clave + ": ");
                    for (Object obj : lista) {
                        writer.write(obj.toString() + " ");
                    }
                    writer.write("\n");
                
                }
                writer.write("=== listadoexhibidas ===\n");
                HashMap<String,ArrayList<Object>>listadoE= inventario.getListadoexhibidas();
                for (Entry<String, ArrayList<Object>> entry : listadoE.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<Object> lista = entry.getValue();
                    writer.write(clave + ": ");
                    for (Object obj : lista) {
                        writer.write(obj.toString() + " ");
                    }
                    writer.write("\n");
                
                }
                writer.write("=== registro ===\n");
                HashMap<Cliente,Integer> Registro1 = operador.getRegistro();
                for (Entry<Cliente, Integer> entry : Registro1.entrySet()) {
                    Cliente clave = entry.getKey();
                    Integer entero = entry.getValue();
                    writer.write(clave + ": "+entero);
                    
                    writer.write("\n");
                
                }

                writer.write("=== registroPagos ===\n");
                HashMap<String, Integer> RegistroPagos = cajero.getResgistroPagos();
                for (Entry<Cliente, Integer> entry : Registro1.entrySet()) {
                    Cliente clave = entry.getKey();
                    Integer entero = entry.getValue();
                    writer.write(clave + ": "+entero);
                    
                    writer.write("\n");
                
                }


                 
                
            
                







            
            

        }
    } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
