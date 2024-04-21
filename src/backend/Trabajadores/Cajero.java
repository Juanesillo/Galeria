package backend.Trabajadores;

import java.util.ArrayList;
import java.util.HashMap;

import backend.Clientes.Cliente;
import backend.GestionCompras.Ventas;
import backend.gestionPiezaInventario.Inventario;

public class Cajero extends Ventas{
    private Inventario inventario;
    private HashMap<String, Integer> RegistroPagos = new HashMap<>();

    private static HashMap<Cliente, String>solicitud = new HashMap<>();





    

    public Cajero(Inventario inventario) {
        super(inventario);
        //TODO Auto-generated constructor stub
    }

    public void registrar(String nombre, Integer valor){
        RegistroPagos.put(nombre,valor);
    }

    

    @Override
    public boolean EstaDisponible(String nombre) {
        boolean validar= false;
        boolean retorno= false;


        HashMap<String, ArrayList<Object>>mapaDisponible= inventario.getListadoDisponible();
        if (mapaDisponible.containsKey(nombre)){
            validar=true;
        }

        if (validar){
            ArrayList<Object> atributos= mapaDisponible.get(nombre);
            if (atributos.contains(true)){
                retorno= true;
            }

        }
        return retorno;
    }





    public static void llenarSolicitud(Cliente cliente, String nombre){
        solicitud.put(cliente, nombre);


    }
   

    public void venderPieza( String nombre, String metododepago, Cliente cliente)throws Exception{

        // Cajero validar si es posible Compra
        //validar de manera automatica con la calse cajero
        try{
            boolean disponible= EstaDisponible(nombre); 
            if (disponible){
                Inventario inventario= getInventario();
                HashMap<String,ArrayList<Object>> inv=inventario.getListadoDisponible();
                ArrayList<Object> array= inv.get(nombre);
                Integer costoPieza= (Integer) array.get(6);
                Integer valores= (int) (cliente.getDinero() - costoPieza);
                if(valores <0){
                    throw new Exception("Saldo insuficiente");
                }
                else{
                    cliente.setDinero(valores);
                    registrar(nombre, costoPieza);
                    
                }
    
                //validar que el pago es posible 
                // ajustar cantidad de dinero establecida
    
            }

        }catch (Exception e){
            System.out.println("No cuentas con saldo suficiente en tu cuenta ");
        }        
        // validar si la obra de arte esta disponible para ser comprada 
    }



}
