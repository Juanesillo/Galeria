package backend.Clientes;

import java.util.ArrayList;
import java.util.HashMap;

import backend.Trabajadores.Cajero;
import backend.gestionPiezaInventario.Inventario;

public class Cliente  {
    // atributos de cliente
    private String contacto;
    private String idCliente;
    
    private double Dinero;

  // listas implementadas en cliente

    private HashMap<String, ArrayList<Object>> Historial= new HashMap<String,ArrayList<Object>>();
    private HashMap<String, ArrayList<Object>> Compras = new HashMap<String,ArrayList<Object>>();


    private boolean validar;// si el cliente esta validado por el administrador 
    
    

    public Cliente(String contacto, String idCliente,double Dinero) {
        this.contacto= contacto;
        this.idCliente=idCliente;
        this.Dinero=Dinero;


    }

    // implementacion de getter
    

    public String getContacto() {
        return contacto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    

    public void setValidar(boolean validar) {
        this.validar = validar;
    }

    

    public boolean getValidar() {
        return validar;
    }





    // actualizar el mapa de historial de piezas que ha dado el cliente a la Galeria 
    public void actualizarHistorial(String Titulo, ArrayList<Object> atributos)  {
        Historial.put(Titulo, atributos);
    }

    // metodos por cliente

    public void actualizarHistorialCompras(String Titulo, ArrayList<Object> atributos)  {
        Compras.put(Titulo, atributos);
    }    

   
    
    public void Comprar(Cajero Cajero, String nombre, String metododepago)throws Exception{

        // Cajero validar si es posible Compra
        //validar de manera automatica con la calse cajero
        try{
            boolean disponible= Cajero.EstaDisponible(nombre); 
            if (disponible){
                Inventario inventario= Cajero.getInventario();
                HashMap<String,ArrayList<Object>> inv=inventario.getListadoDisponible();
                ArrayList<Object> array= inv.get(nombre);
                Integer costoPieza= (Integer) array.get(6);
                Integer valores= (int) (this.Dinero - costoPieza);
                if(valores <0){
                    throw new Exception("Saldo insuficiente");
                }
                else{
                    this.Dinero= valores;
                    Cajero.registrar(nombre, costoPieza);
                    
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
    

 


