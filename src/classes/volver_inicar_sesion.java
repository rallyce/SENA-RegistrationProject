
package classes;

import windows.Administrador;
import windows.Asistente;
import windows.Gestion_de_Clientes;
import windows.Gestion_de_Usuarios;
import windows.Gestion_de_equipos;
import windows.Info_Clientes;
import windows.Informacion_Usuario;
import windows.Informacion_equipos_Tecnico;
import windows.Informacion_equipos;
import windows.Registro_de_Clientes;
import windows.Registro_de_Producto;
import windows.Registro_de_Usuario;
import windows.Reiniciar_Password;
import windows.tecnico;
import windows.Grafica_de_estatus;
import windows.Login;

public class volver_inicar_sesion {
    
    public void close_windows(){
        
        new Administrador().setVisible(false);
        new Asistente().setVisible(false);
        new Gestion_de_Clientes().setVisible(false);
        new Gestion_de_Usuarios().setVisible(false);
        new Gestion_de_equipos().setVisible(false);
        new Info_Clientes().setVisible(false);
        new Informacion_Usuario().setVisible(false);
        new Informacion_equipos_Tecnico().setVisible(false);
        new Informacion_equipos().setVisible(false);
        new tecnico().setVisible(false);
        new Reiniciar_Password().setVisible(false);
        new Grafica_de_estatus().setVisible(false);
        new Registro_de_Clientes().setVisible(false);
        new Registro_de_Usuario().setVisible(false);
        new Registro_de_Producto().setVisible(false);
        new Login().setVisible(true);
        
       
    }
    
}
