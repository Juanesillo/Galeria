package backend.Trabajadores;

import java.util.*;

import backend.gestionPiezaInventario.Pieza;

public class Operador {

// solo se encarga de la subasta 
    private Pieza pieza;
    private static HashMap<String,Integer> Registro = new HashMap<String,Integer>();
  
    public Operador(Pieza pieza){
        this.pieza= pieza;

    }

    public static HashMap<String, Integer> getRegistro() {
        return Registro;
    }

    public static void RegistrarPuja(String nombre, Integer valor){
        // Puja nombre del cliente que puja - Valor con el cual Puja 
        Registro.put(nombre, valor);
    }

    public static boolean consultarEstado(Pieza pieza){
        return pieza.isDisponible();        

    }

    public static void IniciarSubasta(){}




    









}
