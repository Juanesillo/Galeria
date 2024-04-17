package Consola;

import java.util.ArrayList;

import backend.Clientes.Cliente;
import backend.Trabajadores.Operador;
import backend.gestionPiezaInventario.Inventario;
import backend.gestionPiezaInventario.Pieza;

public class ConsolaPruebas {
    public static void main(String[] args) {
        // Crear un operador


        // Crear una pieza
        Integer x = 123;
        Integer y = 20220122; // Se debe usar el formato numérico entero para la fecha (AAAAMMDD)
    
        Pieza pieza = new Pieza("juan", x, y, "Bogota", "video", "ayer", "Bueno", true);

        // Crear un inventario con el operador y la pieza
        Inventario inventario = new Inventario(pieza);

        // crear Cliente

        Cliente cliente= new Cliente("123", "123", inventario);

        // Mostrar información de la pieza
       ArrayList<Object>atributos= pieza.atributos("Juan", x, y, "Bogota", "video", "ayer");
        inventario.AgregarPieza("ayer", atributos);
        
        

        System.out.println(inventario.getListadoDisponible());




       
    }
}