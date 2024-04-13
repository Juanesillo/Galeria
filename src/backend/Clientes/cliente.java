package backend.Clientes;

import backend.Inventario;

public class cliente extends Clientes {

    private String contacto;
    private String idCliente;
    private Inventario inventario;

    public cliente(String contacto, String idCliente, Inventario inventario) {
        super(contacto, idCliente, inventario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void actualizarHistorial() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarHistorial'");
    }

}
