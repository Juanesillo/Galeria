import guis.LoginGui;
import guis.RegisterGui;
import guis.AddPiezaGUi;
import guis.ClienteGUI;
import guis.EliminarPiezaGui;
import guis.InicioGUI;

import javax.swing.*;
public class AppLauncher {
    public static void main(String[] args) {
        // se va a emplear el comando InvokeLater para que las actualizaciones de la app se realicen de forma segura 
        // para mas información consultar la documentacion Java.swing

        SwingUtilities.invokeLater(new Runnable(){
            // Esta linea de codigo ejecuta LoginGui para que aparezca en pantalla
            @Override
            public void run(){
             new InicioGUI().setVisible(true);
                //new EliminarPiezaGui().setVisible(true);
              //new ClienteGUI().setVisible(true);
              //new LoginGui().setVisible(true);
            //new RegisterGui().setVisible(true);
            
            //new AddPiezaGUi().setVisible(true);
        }
    });

            

    }
}

