package backend;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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



// Ajustar de mejor manera la persistencia y carga de datos 


    // inventario => listaSubasta, listaDisponible, listadoExhibidas
    //Galeria=> listaClientes
            // CLiente=> mapas 
                //=> Historial y Compras


    public static void guardarDatosEnArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Guardar lista de clientes
            writer.write("=== Lista de Clientes ===\n");
            for (Cliente cliente : listaClientes) {
                // guardar el Constructor de Cliente
                writer.write(cliente.getContacto() + ";" + cliente.getIdCliente() +";"+cliente.getDinero()+";");

                // guardar el historial de piezas ofrecidas por el cliente
                writer.write("HistorialCliente");
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
                // guardar el historial de compras del cliente
                writer.write("ComprasCliente");
                HashMap<String, ArrayList<Object>> mapacom= cliente.getCompras();
                for (Entry<String, ArrayList<Object>> entry : mapacom.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<Object> lista = entry.getValue();
                    writer.write(clave + ": ");
                    for (Object obj : lista) {
                        writer.write(obj.toString() + " ");
                    }
                    writer.write("\n");
                

                }}

                // Guardar Información Relacionada con el Inventario General de la Galeria 
                    // Constructor de Inventario = (vacio)


                
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


                // guardar Información de Operador
                    // Constructor (Inventario)
                writer.write("=== registro ===\n");
                HashMap<Cliente,Integer> Registro1 = Operador.getRegistro();
                for (Entry<Cliente, Integer> entry : Registro1.entrySet()) {
                    Cliente clave = entry.getKey();
                    Integer entero = entry.getValue();
                    writer.write(clave + ": "+entero);
                    
                    writer.write("\n");
                
                }
                // Guardar Información Registro de Pagos  
                    // cajero contructor Inventario

                writer.write("=== registroPagos ===\n");
                HashMap<String, Integer> RegistroPagos = cajero.getResgistroPagos();
                for (Entry<String, Integer> entry : RegistroPagos.entrySet()) {
                    String clave = entry.getKey();
                    Integer entero = entry.getValue();
                    writer.write(clave + ": "+entero);
                    
                    writer.write("\n");
                
                }     

             
            
        

    } catch (IOException e) {
            e.printStackTrace();
        }
    }


    

    // funcion General para Cargar los datos de Archivo 
    public static void cargarDatosDesdeArchivo(String nombreArchivo) {
// ajustar para los valores originales de CASE
        // intenta leer el nombre del archivo y crear un reader
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            String seccionActual = "";
            while ((linea = reader.readLine()) != null) {
                // Detectar secciones en el archivo 
                if (linea.startsWith("===") && linea.endsWith("===")) {
                    seccionActual = linea.substring(4, linea.length() - 4).trim();
                } else if (!linea.isEmpty()) {
                    // Procesar datos según la sección actual
                    switch (seccionActual) {

                        // evaluar Casos de Registro para Estructuras de Datos ==> Objetos


                        case "ListadeClientes":
                            cargarClienteDesdeLinea(linea);
                            break;

                            // hacer Historial y Compras Cliente

                            
                        case "listadoDisponible":
                            cargarListadoDesdeLinea(linea, listadoDisponible);
                            break;


                        case "listadoSubasta":
                            cargarListadoDesdeLinea(linea, listadoSubasta);
                            break;

                        case "registro":
                            cargarRegistroDesdeLinea(linea);
                            break;

                        case "registroPagos":
                            cargarPagoDesdeLinea(linea);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // funciones carga de datos

    
    private static void cargarClienteDesdeLinea(String linea) {
        // Parsear la línea para obtener datos del cliente
        String[] datosCliente = linea.split(";");
        if (datosCliente.length == 2) {
            String contacto = datosCliente[0].trim();
            String id = datosCliente[1].trim();
            double dinero= Double.parseDouble(datosCliente[2].trim()) ;

            // creación del objeto cliente y Agregandolo a la Lista
            listaClientes.add(new Cliente(contacto, id,dinero));
        }
    }
    // Ajustar para cada parte de la carga de datos 

    private static void cargarListadoDesdeLinea(String linea, HashMap<String, ArrayList<Object>> listado) {
        // Parsear la línea para obtener clave y valores del listado
        String[] partes = linea.split(":");
        if (partes.length == 2) {
            String clave = partes[0].trim();
            String valoresStr = partes[1].trim();
            // Suponiendo que los valores están separados por comas
            String[] valores = valoresStr.split(",");
            ArrayList<Object> listaValores = new ArrayList<>(List.of(valores));
            listado.put(clave, listaValores);
        }
    }

    private static void cargarRegistroDesdeLinea(String linea) {
        // Parsear la línea para obtener datos del registro de operador
        String[] datosRegistro = linea.split("-");
        if (datosRegistro.length == 2) {
            String nombreCompleto = datosRegistro[0].trim();
            int puntos = Integer.parseInt(datosRegistro[1].trim());
            String[] nombreApellido = nombreCompleto.split(" ");
            if (nombreApellido.length == 2) {
                Cliente cliente = new Cliente(nombreApellido[0], nombreApellido[1], puntos);
                Registro.put(cliente, puntos);
            }
        }
    }

    private static void cargarPagoDesdeLinea(String linea) {
        // Parsear la línea para obtener datos del registro de pagos
        String[] datosPago = linea.split(":");
        if (datosPago.length == 2) {
            String descripcion = datosPago[0].trim();
            int monto = Integer.parseInt(datosPago[1].trim());
            RegistroPagos.put(descripcion, monto);
        }
    }

}
