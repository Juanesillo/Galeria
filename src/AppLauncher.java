import guis.LoginGui;
import guis.RegisterGui;
import guis.TipoClienteGUI;

import javax.swing.*;
public class AppLauncher {
    public static void main(String[] args) {
        // se va a emplear el comando InvokeLater para que las actualizaciones de la app se realicen de forma segura 
        // para mas información consultar la documentacion Java.swing

        SwingUtilities.invokeLater(new Runnable(){
            // Esta linea de codigo ejecuta LoginGui para que aparezca en pantalla
            @Override
            public void run(){
              new LoginGui().setVisible(true);
              new RegisterGui().setVisible(true);
              new TipoClienteGUI().setVisible(true);
            
        }
    });

            

    }
}

