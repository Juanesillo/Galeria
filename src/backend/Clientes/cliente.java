package backend.Clientes;

import java.util.HashMap;

import backend.Inventario;

public class Cliente extends Clientes {

    private String contacto;
    private String idCliente;
    private Inventario inventario;
    private HashMap<String,Integer> ListaHistorial=new HashMap<String,Integer>();
    

    public Cliente(String contacto, String idCliente, Inventario inventario) {
        super(contacto, idCliente, inventario);
    }

    @Override
    public void actualizarHistorial(String Titulo, Integer valor) {
        ListaHistorial.put(Titulo, valor);
       
    }

}
