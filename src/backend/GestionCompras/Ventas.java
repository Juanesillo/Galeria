package backend.GestionCompras;

import backend.Clientes.Cliente;
import backend.gestionPiezaInventario.Inventario;

public abstract class Ventas{

    protected Cliente cliente;
    protected String idVenta;
    protected Inventario inventario;

    public Ventas(Cliente cliente, String idVenta, Inventario inventario){

        this.cliente=cliente;
        this.idVenta=idVenta;
        this.inventario=inventario;
    }


    // getters

    public Cliente getCliente() {
        return cliente;
    }


    public String getIdVenta() {
        return idVenta;
    }


    public Inventario getInventario() {
        return inventario;
    }



    
    //metodos 

    public abstract Integer generarID();//modificar tanto en subasta como en valor Fijo 

   


    // Consideración si el valor booleano de la pieza es false => Esta disponible solo para subasta
    public abstract boolean isDisponible();

    public abstract void venderPieza();
    



    }



