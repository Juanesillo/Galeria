package backend.Trabajadores;

import backend.Clientes.Cliente;
import backend.GestionCompras.Ventas;
import backend.gestionPiezaInventario.Inventario;

public class Cajero extends Ventas{




    

    public Cajero(Cliente cliente, String idVenta, Inventario inventario) {
        super(cliente, idVenta, inventario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Integer generarID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarID'");
    }

    @Override
    public boolean isDisponible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isDisponible'");
    }

    @Override
    public void venderPieza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'venderPieza'");
    }

}
