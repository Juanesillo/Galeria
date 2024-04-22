package guis;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.*;
import Constantes.Constantes;
import backend.Galeria;
import backend.Clientes.Cliente;

public class ClienteGUI extends BaseFrame {
    public ClienteGUI(){
        super("Acciones");
    }

    public void addguicomponent(){

        imprimirDisponibles();







        setSize(500,600);

        JLabel Titulo= new JLabel("Acciones");
        Titulo.setForeground(Constantes.ColorTexto);
        Titulo.setBounds(0,25,super.getWidth(),25);
        Titulo.setFont(new Font("Dialog",Font.BOLD,32));
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(Titulo);


        JTextField nombre= new JTextField("");
        nombre.setBackground(Constantes.SPColor);
        nombre.setForeground(Constantes.ColorTexto);
        nombre.setBounds(20,60,getWidth()-60,24);
        nombre.setFont(new Font("Dialog",Font.PLAIN,25));
        nombre.setHorizontalAlignment(SwingConstants.CENTER);

        //desaparecer texto 

        nombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nombre.getText().equals("Ingrese su contacto")) {
                    nombre.setText(""); // Borrar el texto al obtener foco
                }
            }
            // arreglar fallos de este efecto 
            @Override
            public void focusLost(FocusEvent e) {
                if (nombre.getText().equals("")) {
                    nombre.setText("Ingrese su contacto"); // Restaurar el texto si está vacío al perder foco
                }
            }
        });

        add(nombre);



        JButton comprar= new JButton("COMPRAR");
        comprar.setForeground(Constantes.ColorTexto);
        comprar.setBackground(Constantes.SPColor);
        comprar.setBounds(0,120,super.getWidth(),50);
        comprar.setFont(new Font("Dialog",Font.BOLD,20));





        // nombre de la pieza a comprar por defecto se va a imprimir el mapa de de disponibles 

        JTextField nombrePieza= new JTextField("");
        nombrePieza.setBackground(Constantes.SPColor);
        nombrePieza.setForeground(Constantes.ColorTexto);
        nombrePieza.setBounds(20,195,getWidth()-60,24);
        nombrePieza.setFont(new Font("Dialog",Font.PLAIN,25));
        nombrePieza.setHorizontalAlignment(SwingConstants.CENTER);

        //desaparecer texto 

        nombrePieza.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nombrePieza.getText().equals("NombrePieza")) {
                    nombrePieza.setText(""); // Borrar el texto al obtener foco
                }
            }
            // arreglar fallos de este efecto 
            @Override
            public void focusLost(FocusEvent e) {
                if (nombrePieza.getText().equals("")) {
                    nombrePieza.setText("NombrePieza"); // Restaurar el texto si está vacío al perder foco
                }
            }
        });

        add(nombrePieza);




        // acciones implementadas por consola ya que no se como mostrarlas por gui 

        comprar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // como saber el cliente ???

                String cliente= nombre.getText();

                Cliente Usuario = obtenerCliente(cliente);
                String nombrep= nombrePieza.getText();
                boolean validar= false;

                try {
                    Galeria.realizarCompra(nombrep, Usuario);
                    validar= true;


                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                if (validar){
                    HashMap<String,ArrayList<Object> >dispo= Galeria.getListadoDisponible();
                    Galeria.AgregarhistorialCliente(Usuario, nombrep,dispo.get(nombrep));                  
                }else{
                    JOptionPane.showConfirmDialog(ClienteGUI.this, "Error al realizar compra");
                }
                



                // conocer disponibles 

                // conectar con cajero

                    // comprar 
                // registrar en historial de compras del cliente

            }
            
        });




        add(comprar);


        JButton vender= new JButton("VENDER");
        vender.setForeground(Constantes.ColorTexto);
        vender.setBackground(Constantes.SPColor);
        vender.setBounds(0,240,super.getWidth(),50);
        vender.setFont(new Font("Dialog",Font.BOLD,20));

        add(vender);



        JButton HistorialP= new JButton("Consultar Historial Propiedad");
        HistorialP.setBackground(Constantes.SPColor);
        HistorialP.setForeground(Constantes.ColorTexto);
        HistorialP.setBounds(0, 360, super.getWidth(),50 );
        HistorialP.setFont(new Font("Dialog",Font.BOLD,20));

        add(HistorialP);


        JButton HitorialCompras= new JButton("Consultar Historial Compras");
        HitorialCompras.setBackground(Constantes.SPColor);
        HitorialCompras.setForeground(Constantes.ColorTexto);
        HitorialCompras.setBounds(0, 420, super.getWidth(),50 );
        HitorialCompras.setFont(new Font("Dialog",Font.BOLD,20));

        add(HitorialCompras);



        JButton salir= new JButton("Salir");
      salir.setBackground(Constantes.TPColor);
      salir.setForeground(Constantes.ColorTexto);
      salir.setBounds(20,480,getWidth()-60,30);
      salir.setFont(new Font("Dialog",Font.BOLD,20));
      salir.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          // dispose 

          ClienteGUI.this.dispose();

          // crear Login 

          LoginGui loginGui = new LoginGui();

          loginGui.setVisible(true);

          
        }
        
      });
      add(salir);
        
    }



    // obtener el cliente con el cual se va a realizar la compra 
    public Cliente obtenerCliente(String contacto){
        ArrayList<Cliente> lcliente=Galeria.getlistaClientes();

        Cliente retorno= null;

        for(Cliente cliente: lcliente){
            if(cliente.getContacto().equals(contacto)){

                retorno= cliente;
            }



        

        }
        return retorno;

    }



    public void imprimirDisponibles(){
        System.out.println("Imprimiento Catalogo...");
        HashMap<String,ArrayList<Object> >dispo= Galeria.getListadoDisponible();

        for (Entry<String, ArrayList<Object>> entry : dispo.entrySet()) {
            String key = entry.getKey();
            ArrayList<Object> value = entry.getValue();
            System.out.println(key + " : " + value);
        }




    }

    @Override
    protected void confirmarCerrar() {
        int respuesta = JOptionPane.showConfirmDialog(this,
                "¿Desea guardar la información antes de cerrar?",
                "Confirmar cierre",
                JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            // Llamar al método de subclase para guardar información
            Galeria.guardarDatosEnArchivo("prueba.txt");
            dispose(); // Cerrar la ventana después de guardar
        } else if (respuesta == JOptionPane.NO_OPTION || respuesta == JOptionPane.CLOSED_OPTION) {
            // Si el usuario elige No o cierra la ventana de confirmación, simplemente cerrar la ventana
            dispose();
        }}

}
