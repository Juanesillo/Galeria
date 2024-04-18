package backend.Trabajadores;

import java.util.ArrayList;
import java.util.HashMap;

import backend.Clientes.Cliente;
import backend.GestionCompras.Ventas;
import backend.gestionPiezaInventario.Inventario;

public class Cajero extends Ventas{
    private Inventario inventario;
    private HashMap<String, Integer> RegistroPagos = new HashMap<>();





    

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

    @Override
    public void venderPieza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'venderPieza'");
    }



}
