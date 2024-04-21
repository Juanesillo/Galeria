package backend.GestionCompras;

import backend.gestionPiezaInventario.Inventario;

public abstract class Ventas{

    protected String idVenta;
    protected Inventario inventario;


    public Ventas(Inventario inventario){

        
        this.inventario=inventario;
    }


    // getters


    public String getIdVenta() {
        return idVenta;
    }


    public Inventario getInventario() {
        return inventario;
    }
    // setters
    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Integer IdAleatorio(){
        return (int) (Math.random()*201);
    }
  



    
    //metodos 

    public  Integer generarID(){
        
        return null;

        
    }//modificar tanto en subasta como en valor Fijo 

   


    


    // Consideración si el valor booleano de la pieza es false => Esta disponible solo para subasta
    public abstract boolean EstaDisponible(String nombre);

    



    }



