package dominio;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesionalTest {
    
    public ProfesionalTest() {
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
    public void testGetCasillaDeEntrada() {
        System.out.println("getCasillaDeEntrada");
        Profesional instance = new Profesional();
        List<Mensaje> expResult = new ArrayList<>();
        List<Mensaje> result = instance.getCasillaDeEntrada();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCasillaDeEntrada() {
        System.out.println("setCasillaDeEntrada");
        List<Mensaje> casillaDeEntrada = new ArrayList<>();
        Profesional instance = new Profesional();
        instance.setCasillaDeEntrada(casillaDeEntrada);
        assertEquals(instance.getCasillaDeEntrada(),casillaDeEntrada);
    }

    @Test
    public void testGetNombreTituloProf() {
        System.out.println("getNombreTituloProf");
        Profesional instance = new Profesional();
        String expResult = "no ingreso titulo prof";
        String result = instance.getNombreTituloProf();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombreTituloProf() {
        System.out.println("setNombreTituloProf");
        String nombreTituloProf = "no ingreso titulo prof";
        Profesional instance = new Profesional();
        instance.setNombreTituloProf(nombreTituloProf);
        assertEquals(nombreTituloProf,instance.getNombreTituloProf());
    }
    
    
    @Test
    public void testGetPaisObtuvoTituloIndia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.INDIA);
        Pais expResult = Pais.INDIA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.INGLATERRA);
        Pais expResult = Pais.INGLATERRA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloInglaterra() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.INGLATERRA);
        Pais expResult = Pais.INGLATERRA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.ISRAEL);
        Pais expResult = Pais.ISRAEL;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloIsrael() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.ISRAEL);
        Pais expResult = Pais.ISRAEL;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.ITALIA);
        Pais expResult = Pais.ITALIA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloItalia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.ITALIA);
        Pais expResult = Pais.ITALIA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.JAPON);
        Pais expResult = Pais.JAPON;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloJapon() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.JAPON);
        Pais expResult = Pais.JAPON;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.MEXICO);
        Pais expResult = Pais.MEXICO;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloMexico() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.MEXICO);
        Pais expResult = Pais.MEXICO;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.PARAGUAY);
        Pais expResult = Pais.PARAGUAY;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloParaguay() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.PARAGUAY);
        Pais expResult = Pais.PARAGUAY;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.PERU);
        Pais expResult = Pais.PERU;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPeru() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.PERU);
        Pais expResult = Pais.PERU;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.PORTUGAL);
        Pais expResult = Pais.PORTUGAL;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloPortugal() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.PORTUGAL);
        Pais expResult = Pais.PORTUGAL;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.RUSIA);
        Pais expResult = Pais.RUSIA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloRusia() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.RUSIA);
        Pais expResult = Pais.RUSIA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.SUDAFRICA);
        Pais expResult = Pais.SUDAFRICA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloSudafrica() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.RUSIA);
        Pais expResult = Pais.RUSIA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.VENEZUELA);
        Pais expResult = Pais.VENEZUELA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPaisObtuvoTituloVenezuela() {
        System.out.println("getPaisObtuvoTitulo");
        Profesional instance = new Profesional();
        instance.setPaisObtuvoTitulo(Pais.VENEZUELA);
        Pais expResult = Pais.VENEZUELA;
        Pais result = instance.getPaisObtuvoTitulo();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Profesional instance = new Profesional();
        String expResult = "Usuario: " + instance.getNombreUsuario();;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsFalse() {
        System.out.println("equals");
        Profesional obj = new Profesional();
        obj.setNombreUsuario("prueba");
        Profesional instance = new Profesional();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertFalse(obj.equals(instance));
    }
    
    @Test
    public void testEqualsTrue() {
        System.out.println("equals");
        Profesional obj = new Profesional();
        Profesional instance = new Profesional();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    } 
    
    @Test(expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Profesional obj = new Profesional();
        Profesional instance = null;
        assert(instance.equals(obj));
    }
    
    @Test
    public void testEqualsDistintoTipo() {
        System.out.println("equalsDistintoTipo");
        Profesional obj = new Profesional();
        obj.setNombreUsuario("nombre");
        boolean test = obj.equals("soy string");
        assertFalse(test);
    } 
}
