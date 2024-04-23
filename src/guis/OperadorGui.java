package guis;

import javax.swing.*;

import backend.Galeria;

public class OperadorGui extends BaseFrame {

    public OperadorGui() {
        super("Operador");
      
    }

    @Override
    protected void addguicomponent() {
       // Iniciar Subasta 

       // registrar Puja
        // conexión con una Gui que registre el nombre del cliente, el valor por el cual el cliente está haciendo la puja 

        
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
