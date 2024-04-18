package backend.Trabajadores;

import java.util.*;
import backend.Clientes.Cliente;


public class Administrador {
    private String User;

    private HashMap<String,Integer >RegistroOperador;
    

    public Administrador(String user){
        this.User=user;
        this.RegistroOperador=Operador.getRegistro();
    }


    // Obtener una doble validación
    public String getUser() {
        return User;
    }

    //metodo validar Cliente 
    public void ValidarCliente(Cliente cliente){
        cliente.setValidar(true);// registrar los clientes en una lista para implementar este metodo 
    }

    
    

  
    
}
