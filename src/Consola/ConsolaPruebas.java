package Consola;

import java.util.ArrayList;

import backend.Inventario;
import backend.Pieza;

import backend.Clientes.Cliente;
import backend.Trabajadores.Operador;

public class ConsolaPruebas {
    public static void main(String[] args) {
        // Crear un operador
        Operador operador = new Operador();

        // Crear una pieza
        Integer x = 123;
        Integer y = 20220122; // Se debe usar el formato numérico entero para la fecha (AAAAMMDD)
    
        Pieza pieza = new Pieza("juan", x, y, "Bogota", "video", "ayer", "Bueno", true);

        // Crear un inventario con el operador y la pieza
        Inventario inventario = new Inventario(operador, pieza);

        // crear Cliente

        Cliente cliente= new Cliente("123", "123", inventario);

        // Mostrar información de la pieza
       ArrayList<Object>atributos= pieza.atributos("Juan", x, y, "Bogota", "video", "ayer");
        inventario.AgregarPieza("ayer", atributos, operador);
        
        

        System.out.println(inventario.getListadoDisponible());




       
    }
}