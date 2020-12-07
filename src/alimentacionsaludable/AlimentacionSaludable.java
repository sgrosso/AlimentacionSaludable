package alimentacionsaludable;

import dominio.Sistema;
import interfaz.Login;
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
  public static void main(String[] args) {
    Sistema sistema = new Sistema();

    boolean errorCargarDatos = false;
    
    try {
      sistema.cargarSistema();
    } catch (IOException | ClassNotFoundException exception) {
      errorCargarDatos = true;
    }

    PanelPrincipal pantallaPrincipal = new PanelPrincipal(sistema);

    if (errorCargarDatos) {
      JOptionPane.showMessageDialog(pantallaPrincipal,
          "Ocurrió un error cargando los datos del sistema.");
    }
    
    Login login = new Login(pantallaPrincipal, sistema);

    pantallaPrincipal.add(login);
    pantallaPrincipal.pack();
    pantallaPrincipal.setLocationRelativeTo(null);
    pantallaPrincipal.setVisible(true);
  }
}
