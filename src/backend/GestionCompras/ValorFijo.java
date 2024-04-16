package backend.GestionCompras;

import backend.Clientes.Cliente;
import backend.gestionPiezaInventario.Inventario;

public class ValorFijo extends Ventas{

    public ValorFijo(Cliente cliente, String idVenta, Inventario inventario) {
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
