package backend.GestionCompras;

import backend.Clientes.Cliente;
import backend.gestionPiezaInventario.Inventario;

public class Oferta extends Ventas {

    public Oferta(Cliente cliente, String idVenta, Inventario inventario) {
        super(cliente, idVenta, inventario);
        //TODO Auto-generated constructor stub
    }

   

    @Override
    public boolean EstaDisponible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isDisponible'");
    }

    @Override
    public void venderPieza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'venderPieza'");
    }

}
