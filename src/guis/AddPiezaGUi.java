package guis;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Constantes.Constantes;
import backend.Galeria;
import backend.gestionPiezaInventario.Pieza;
public class AddPiezaGUi extends BaseFrame{

    public AddPiezaGUi() {
        super("agregarPieza");
        
    }

    @Override
    protected void addguicomponent() {
        setSize(800,700 );


        JLabel Titulo=new JLabel("AgregarPieza");
        
        // Ajustar Color 
        Titulo.setForeground(Constantes.ColorTexto);
        
        // ajustar la ubicacion y el tamaño del gui component

        Titulo.setBounds(0,20,super.getWidth()-60,27);
        //Ajustar fonts 

        Titulo.setFont(new Font("Dialog",Font.BOLD,28));
        
        // Centrar el texto del Laber 
        Titulo.setHorizontalAlignment(SwingConstants.CENTER);


        // agregar a la GUI 
        add(Titulo);

        // Campos de autor,id, anio, lugarcreacion,titulo,precio,estadoInventario,disponible


        JLabel autor= new JLabel("autor");
        autor.setForeground(Constantes.ColorTexto);
        autor.setBounds(20,60,super.getWidth()-60,27);
        autor.setFont(new Font("Dialog",Font.BOLD,28));
        autor.setHorizontalAlignment(SwingConstants.CENTER);
        add(autor);
        //autorField

        JTextField autorField = new JTextField();
        autorField.setBackground(Constantes.SPColor);
        autorField.setForeground(Constantes.ColorTexto);
        autorField.setBounds(20,95,getWidth()-60,24);
        autorField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(autorField);



        JLabel id= new JLabel("ID");
        id.setForeground(Constantes.ColorTexto);
        id.setBounds(20,125,getWidth()-60,27);
        id.setHorizontalAlignment(SwingConstants.CENTER);
        id.setFont(new Font("Dialog",Font.BOLD,20));
        add(id);

        // idField
        JTextField IdField= new JTextField();
        IdField.setBackground(Constantes.SPColor);
        IdField.setForeground(Constantes.ColorTexto);
        IdField.setBounds(20,165,getWidth()-60,24);
        IdField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(IdField);


        JLabel anio= new JLabel("año");
        anio.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        anio.setBounds(20,195,getWidth()-60,27);
        
        anio.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        anio.setFont(new Font("Dialog",Font.BOLD,20));
        add(anio);
        //AnioField
        JTextField AnioField= new JTextField();
        AnioField.setBackground(Constantes.SPColor);
        AnioField.setForeground(Constantes.ColorTexto);
        AnioField.setBounds(20,225,getWidth()-60,24);
        AnioField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(AnioField);



        JLabel lugarCreacion= new JLabel("LugarCreacion");
        lugarCreacion.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        lugarCreacion.setBounds(20,265,getWidth()-60,27);
        
        lugarCreacion.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        lugarCreacion.setFont(new Font("Dialog",Font.BOLD,20));
        add(lugarCreacion);

        //CreacionField

        JTextField CreacionField= new JTextField();

        CreacionField.setBackground(Constantes.SPColor);
        CreacionField.setForeground(Constantes.ColorTexto);
        CreacionField.setBounds(20,305,getWidth()-60,24);
        CreacionField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(CreacionField);



        JLabel Precio= new JLabel("Precio");
        Precio.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        Precio.setBounds(20,335,getWidth()-60,27);
        
        Precio.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        Precio.setFont(new Font("Dialog",Font.BOLD,20));
        add(Precio);

        //label de precio
        JTextField  precioField= new JTextField();

        precioField.setBackground(Constantes.SPColor);
        precioField.setForeground(Constantes.ColorTexto);
        precioField.setBounds(20,365,getWidth()-60,24);
        precioField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(precioField); 




        JLabel estadoInventario= new JLabel("Estado Inventario");
        estadoInventario.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        estadoInventario.setBounds(20,395,getWidth()-60,27);
        
        estadoInventario.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        estadoInventario.setFont(new Font("Dialog",Font.BOLD,20));
        add(estadoInventario);
        //label de EstadoInventario 
        JTextField  EstadoField= new JTextField();

        EstadoField.setBackground(Constantes.SPColor);
        EstadoField.setForeground(Constantes.ColorTexto);
        EstadoField.setBounds(20,425,getWidth()-60,24);
        EstadoField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(EstadoField); 







        JLabel disponible= new JLabel("Compra/Subasta true /false");
        disponible.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        disponible.setBounds(20,445,getWidth()-60,27);
        
        disponible.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        disponible.setFont(new Font("Dialog",Font.BOLD,20));
        add(disponible);

        //label disponible
        JTextField  DisponibleField= new JTextField();

        DisponibleField.setBackground(Constantes.SPColor);
        DisponibleField.setForeground(Constantes.ColorTexto);
        DisponibleField.setBounds(20,475,getWidth()-60,24);
        DisponibleField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(DisponibleField); 


        JLabel tipo = new JLabel("tipo");
        tipo.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        tipo.setBounds(20,505,getWidth()-60,27);
        
        tipo.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        tipo.setFont(new Font("Dialog",Font.BOLD,20));
        add(tipo);
        JTextField  TipoField= new JTextField();

        TipoField.setBackground(Constantes.SPColor);
        TipoField.setForeground(Constantes.ColorTexto);
        TipoField.setBounds(20,530,getWidth()-60,24);
        TipoField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(TipoField); 

        JLabel TituloPieza = new JLabel("Titulo");
        TituloPieza.setForeground(Constantes.ColorTexto);

        // getwidth retorna el tamaño total del frame que es 420 por defecto 
        TituloPieza.setBounds(20,565,getWidth()-60,27);
        
        TituloPieza.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajustar Font 
        TituloPieza.setFont(new Font("Dialog",Font.BOLD,20));
        add(TituloPieza);

        JTextField  TituloField= new JTextField();

        TituloField.setBackground(Constantes.SPColor);
        TituloField.setForeground(Constantes.ColorTexto);
        TituloField.setBounds(20,595,getWidth()-60,24);
        TituloField.setFont(new Font("Dialog",Font.PLAIN,28));
        add(TituloField); 


        






        JButton AgregarPieza= new JButton("Agregar Pieza");
        AgregarPieza.setBackground(Constantes.TPColor);
        AgregarPieza.setForeground(Constantes.ColorTexto);
        AgregarPieza.setBounds(20,625,getWidth()-60,27);
        AgregarPieza.setFont(new Font("Dialog",Font.BOLD,20));

        AgregarPieza.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                // obtener variables para obtener la lista de atrbutos de pieza

                String autor= autorField.getText();
                Integer id= Integer.parseInt(IdField.getText());
                Integer anio= Integer.parseInt(AnioField.getText());
                String lugar= CreacionField.getText();
                String tipop= TipoField.getText();
                Integer preciop=Integer.parseInt(precioField.getText()); 
                String title= TipoField.getText();
                boolean dispo= Boolean.parseBoolean(DisponibleField.getText()); 
               

                Pieza pieza= new Pieza(autor, id, anio, lugar, tipop, title, title,dispo, preciop);
                // autor, id, anio,lugarCreacion,tipo, Titulo, precio
                ArrayList<Object> atributos= Pieza.atributos(autor,id, anio, lugar, tipop, title, preciop);
                
                Galeria.agregarInventario(title, atributos, pieza);

                // dispose gui actual 

                AddPiezaGUi.this.dispose();

                // regresar a gui administrador 

                AdministradorGUI administradorGUI= new AdministradorGUI();
                administradorGUI.setVisible(true);

                
                // Crear la pieza



            }
            
        });



        add(AgregarPieza);






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
