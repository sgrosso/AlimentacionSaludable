package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanDeAlimentacionTest {

    public PlanDeAlimentacionTest() {
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
    public void testCrearPlanDeAlimentacion() {
        Usuario unUsuario = new Usuario();
        PlanDeAlimentacion unPlanDeAlimentacion = new PlanDeAlimentacion(unUsuario);
        assertEquals(unUsuario, unPlanDeAlimentacion.getUsuario());
    }

    @Test
    public void testCrearPlanDeAlimentacionConDatos() {
        Usuario unUsuario = new Usuario();
        PlanDeAlimentacion unPlanDeAlimentacion = new PlanDeAlimentacion(unUsuario);
        ArrayList<Alimento> listaAlimentos = new ArrayList<Alimento>();
        Alimento unAlimento = new Alimento();
        unAlimento.setNombre("Arroz");
        listaAlimentos.add(unAlimento);
        unPlanDeAlimentacion.setListaLunes(listaAlimentos);
        unPlanDeAlimentacion.setListaMartes(listaAlimentos);
        unPlanDeAlimentacion.setListaMiercoles(listaAlimentos);
        unPlanDeAlimentacion.setListaJueves(listaAlimentos);
        unPlanDeAlimentacion.setListaViernes(listaAlimentos);
        unPlanDeAlimentacion.setListaSabado(listaAlimentos);
        unPlanDeAlimentacion.setListaDomingo(listaAlimentos);

        boolean esCorrecto = unPlanDeAlimentacion.getListaLunes().equals(listaAlimentos)
                && unPlanDeAlimentacion.getListaMartes().equals(listaAlimentos)
                && unPlanDeAlimentacion.getListaMiercoles().equals(listaAlimentos)
                && unPlanDeAlimentacion.getListaJueves().equals(listaAlimentos)
                && unPlanDeAlimentacion.getListaViernes().equals(listaAlimentos)
                && unPlanDeAlimentacion.getListaSabado().equals(listaAlimentos)
                && unPlanDeAlimentacion.getListaDomingo().equals(listaAlimentos);
        assertTrue(esCorrecto);
    }
}
