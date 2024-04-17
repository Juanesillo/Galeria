package backend.GestionCompras;

import backend.Clientes.Cliente;
import backend.gestionPiezaInventario.Inventario;
import backend.gestionPiezaInventario.Pieza;

public class ValorFijo extends Ventas{

    private Cliente cliente;
    private String idVenta;
    private Inventario inventario;
    private Integer valorPieza;
    private Pieza pieza;

    public ValorFijo(Cliente cliente, String idVenta, Inventario inventario, Integer valorPieza, Pieza pieza) {
        super(cliente, idVenta, inventario);
        this.valorPieza=valorPieza;
    }

    @Override
    public Integer generarID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarID'");
    }

    @Override
    public boolean EstaDisponible() {
        return this.pieza.isDisponible();
    }

    @Override
    public void venderPieza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'venderPieza'");
    }

}
