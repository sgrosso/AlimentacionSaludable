package alimentacionsaludable;

import dominio.Sistema;
import interfaz.Login;
import interfaz.PanelCambioDeUsuario;
import interfaz.PanelPrincipal;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ale
 */
public class AlimentacionSaludable {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws Exception {
    Sistema sistema = new Sistema();

    boolean errorCargarDatos = false;
    sistema.cargarSistema();

    PanelPrincipal pantallaPrincipal = new PanelPrincipal(sistema);

    if (errorCargarDatos) {
      JOptionPane.showMessageDialog(pantallaPrincipal,
          "Ocurrió un error cargando los datos del sistema.");
    }

    //PanelCambioDeUsuario comienzo = new PanelCambioDeUsuario(
      //  pantallaPrincipal, pantallaPrincipal.getSistema());
    
    Login login = new Login(pantallaPrincipal, sistema);

    pantallaPrincipal.add(login);
    pantallaPrincipal.pack();
    pantallaPrincipal.setLocationRelativeTo(null);
    pantallaPrincipal.setVisible(true);
  }
}
