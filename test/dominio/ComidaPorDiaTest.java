package dominio;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {

    public ComidaPorDiaTest() {
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
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        ComidaPorDia instance = new ComidaPorDia();
        List<Alimento> expResult = new ArrayList<Alimento>();
        List<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        ComidaPorDia comida10deAgosto = new ComidaPorDia();
        comida10deAgosto.setFecha("10/08");
        assertEquals("Comidas ingeridas el: 10/08", comida10deAgosto.toString());
    }

}
