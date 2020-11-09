/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentacionsaludable;
import dominio.Sistema;
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
        Sistema s = new Sistema();
        
        boolean errorCargarDatos = false;
        try {
            s.cargarSistema();
        } catch (IOException ioException) {
            errorCargarDatos = true;
        } 
        
        PanelPrincipal pantallaPrincipal = new PanelPrincipal(s);
        
        if (errorCargarDatos) {
            JOptionPane.showMessageDialog(pantallaPrincipal, "Ocurrió un error cargando los datos del sistema.");
        }
        
        PanelCambioDeUsuario comienzo = new PanelCambioDeUsuario(pantallaPrincipal, pantallaPrincipal.getSistema());
        
        pantallaPrincipal.add(comienzo);
        pantallaPrincipal.pack();
        pantallaPrincipal.setLocationRelativeTo(null);
        pantallaPrincipal.setVisible(true);
    }
}
