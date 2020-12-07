package alimentacionsaludable;

import dominio.Sistema;
import interfaz.Login;
import interfaz.PanelPrincipal;

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
    
    sistema.cargarSistema();
    PanelPrincipal pantallaPrincipal = new PanelPrincipal(sistema);
    Login login = new Login(pantallaPrincipal, sistema);

    pantallaPrincipal.add(login);
    pantallaPrincipal.pack();
    pantallaPrincipal.setLocationRelativeTo(null);
    pantallaPrincipal.setVisible(true);
  }
}
