package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MensajeTest {

    public MensajeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCrearMensaje() {
        Mensaje unMensaje = new Mensaje();
        assertEquals("no tiene texto", unMensaje.getMensaje());
    }

    @Test
    public void testCrearMensajeConDatos() {
        Mensaje unMensaje = new Mensaje();
        unMensaje.setAsunto("Gracias");
        unMensaje.setMensaje("Baje 5kg");
        Persona usuario = (Persona) new Usuario();
        Persona profesional = (Persona) new Profesional();
        unMensaje.setOrigen(usuario);
        unMensaje.setDestino(profesional);
        boolean esCorrecto = unMensaje.getAsunto().equals("Gracias")
                && unMensaje.getMensaje().equals("Baje 5kg")
                && unMensaje.getDestino().equals(profesional)
                && unMensaje.getOrigen().equals(usuario);
        assertTrue(esCorrecto);
    }

    @Test
    public void testToString() {
        Mensaje unMensaje = new Mensaje();
        unMensaje.setAsunto("Gracias");
        Persona usuario = (Persona) new Usuario();
        usuario.setNombreUsuario("Juan");
        unMensaje.setOrigen(usuario);
        assertEquals("Mensaje de: Juan con Asunto: Gracias", unMensaje.toString());
    }
}
