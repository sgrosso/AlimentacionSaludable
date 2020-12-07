package dominio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
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
    public void testGetFechaUltimaAdicion() {
        System.out.println("getFechaUltimaAdicion");
        Usuario instance = new Usuario();
        String expResult = "no se ingreso";
        String result = instance.getFechaUltimaAdicion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFechaUltimaAdicion() {
        System.out.println("setFechaUltimaAdicion");
        String fechaUltimaAdicion = "10/12/16";
        Usuario instance = new Usuario();
        instance.setFechaUltimaAdicion(fechaUltimaAdicion);
    }

    @Test
    public void testGetHistorialDelDia() {
        System.out.println("getHistorialDelDia");
        Usuario instance = new Usuario();
        ComidaPorDia expResult = new ComidaPorDia();
        ComidaPorDia result = instance.getHistorialDelDia();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetHistorialDelDia() {
        System.out.println("setHistorialDelDia");
        ComidaPorDia historialDelDia = new ComidaPorDia();
        Usuario instance = new Usuario();
        instance.setHistorialDelDia(historialDelDia);
        assertEquals(historialDelDia, instance.getHistorialDelDia());
    }


    @Test
    public void testGetNacionalidadEgipcia() {
        System.out.println("getNacionalidadEgipcia");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.EGIPTO);
        Pais expResult = Pais.EGIPTO;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadEgipcia() {
        System.out.println("setNacionalidadEgipcia");
        Pais nacionalidad = Pais.EGIPTO;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadEspañola() {
        System.out.println("getNacionalidadEspañola");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.ESPANIA);
        Pais expResult = Pais.ESPANIA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadEspañola() {
        System.out.println("setNacionalidadEspañola");
        Pais nacionalidad = Pais.ESPANIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadEstadoUnidense() {
        System.out.println("getNacionalidadEstadoUnidense");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.ESTADOS_UNIDOS);
        Pais expResult = Pais.ESTADOS_UNIDOS;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadEstadoUnidense() {
        System.out.println("setNacionalidadEstadoUnidense");
        Pais nacionalidad = Pais.ESTADOS_UNIDOS;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadFrancesa() {
        System.out.println("getNacionalidadFrancesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.FRANCIA);
        Pais expResult = Pais.FRANCIA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadFrancesa() {
        System.out.println("setNacionalidadFrancesa");
        Pais nacionalidad = Pais.FRANCIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadGriega() {
        System.out.println("getNacionalidadGriega");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.GRECIA);
        Pais expResult = Pais.GRECIA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadGriega() {
        System.out.println("setNacionalidadGriega");
        Pais nacionalidad = Pais.GRECIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadHolandesa() {
        System.out.println("getNacionalidadHolandesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.HOLANDA);
        Pais expResult = Pais.HOLANDA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadHolandesa() {
        System.out.println("setNacionalidadHolandesa");
        Pais nacionalidad = Pais.GRECIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadIndia() {
        System.out.println("getNacionalidadIndia");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.INDIA);
        Pais expResult = Pais.INDIA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadIndia() {
        System.out.println("setNacionalidadIndia");
        Pais nacionalidad = Pais.INDIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadInglesa() {
        System.out.println("getNacionalidadInglesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.INGLATERRA);
        Pais expResult = Pais.INGLATERRA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadInglesa() {
        System.out.println("setNacionalidadInglesa");
        Pais nacionalidad = Pais.INGLATERRA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadIsraeli() {
        System.out.println("getNacionalidadIsraeli");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.ISRAEL);
        Pais expResult = Pais.ISRAEL;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadIsraeli() {
        System.out.println("setNacionalidadIsraeli");
        Pais nacionalidad = Pais.ISRAEL;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadItaliana() {
        System.out.println("getNacionalidadItaliana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.ITALIA);
        Pais expResult = Pais.ITALIA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadItaliana() {
        System.out.println("setNacionalidadItaliana");
        Pais nacionalidad = Pais.ITALIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadJaponesa() {
        System.out.println("getNacionalidadJaponesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.JAPON);
        Pais expResult = Pais.JAPON;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadJaponesa() {
        System.out.println("setNacionalidadJaponesa");
        Pais nacionalidad = Pais.JAPON;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadMéxicana() {
        System.out.println("getNacionalidadMéxicana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.MEXICO);
        Pais expResult = Pais.MEXICO;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadMéxicana() {
        System.out.println("setNacionalidadMéxicana");
        Pais nacionalidad = Pais.MEXICO;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadParaguaya() {
        System.out.println("getNacionalidadParaguaya");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.PARAGUAY);
        Pais expResult = Pais.PARAGUAY;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadParaguaya() {
        System.out.println("setNacionalidadParaguaya");
        Pais nacionalidad = Pais.PARAGUAY;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadPeruana() {
        System.out.println("getNacionalidadPeruana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.PERU);
        Pais expResult = Pais.PERU;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadPeruana() {
        System.out.println("setNacionalidadPeruana");
        Pais nacionalidad = Pais.PERU;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadPortuguesa() {
        System.out.println("getNacionalidadPortuguesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.PORTUGAL);
        Pais expResult = Pais.PORTUGAL;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadPortuguesa() {
        System.out.println("setNacionalidadPortuguesa");
        Pais nacionalidad = Pais.PORTUGAL;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadRusa() {
        System.out.println("getNacionalidadRusa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.RUSIA);
        Pais expResult = Pais.RUSIA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadRusa() {
        System.out.println("setNacionalidadRusa");
        Pais nacionalidad = Pais.RUSIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadSudáfricana() {
        System.out.println("getNacionalidadSudáfricana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.SUDAFRICA);
        Pais expResult = Pais.SUDAFRICA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadSudáfricana() {
        System.out.println("setNacionalidadSudáfricana");
        Pais nacionalidad = Pais.SUDAFRICA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadSurcoreana() {
        System.out.println("getNacionalidadSurcoreana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.COREA_DEL_SUR);
        Pais expResult = Pais.COREA_DEL_SUR;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadSurcoreana() {
        System.out.println("setNacionalidadSurcoreana");
        Pais nacionalidad = Pais.COREA_DEL_SUR;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadUruguaya() {
        System.out.println("getNacionalidadUruguaya");
        Usuario instance = new Usuario();
        Pais expResult = Pais.URUGUAY;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadUruguaya() {
        System.out.println("setNacionalidadUruguaya");
        Pais nacionalidad = Pais.URUGUAY;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadVenezolana() {
        System.out.println("getNacionalidadVenezolana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Pais.VENEZUELA);
        Pais expResult = Pais.VENEZUELA;
        Pais result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadVenezolana() {
        System.out.println("setNacionalidadVenezolana");
        Pais nacionalidad = Pais.VENEZUELA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetPesoKg() {
        System.out.println("getPesoKg");
        Usuario instance = new Usuario();
        double expResult = 0;
        double result = instance.getPesoKg();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetPesoKg() {
        System.out.println("setPesoKg");
        Usuario instance = new Usuario();
        double pesoKg = 0;
        instance.setPesoKg(pesoKg);
        assertEquals(instance.getPesoKg(), pesoKg, 0.0);
    }
    
    @Test
    public void testSetPesoKgInvalido() {
        System.out.println("setPesoKgInvalido");
        Usuario instance = new Usuario();
        double pesoKg = -1;
        instance.setPesoKg(pesoKg);
        assertFalse(instance.getPesoKg()==pesoKg);
    }
    
    
    @Test
    public void testSetSexoF() {
        System.out.println("setSexoM");
        String sexo = "Femenino";
        Usuario instance = new Usuario();
        instance.setSexo(sexo);
        assertEquals(sexo, instance.getSexo());
    }

    @Test
    public void testGetListaRestricciones() {
        System.out.println("getListaRestricciones");
        Usuario instance = new Usuario();
        boolean[] expResult = new boolean[5];
        boolean[] result = instance.getListaRestricciones();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetListaRestricciones() {
        System.out.println("setListaRestricciones");
        Usuario instance = new Usuario();
        boolean[] listaRestricciones = new boolean[5];
        instance.setListaRestricciones(listaRestricciones);
        assertArrayEquals(listaRestricciones,instance.getListaRestricciones());
    }

    @Test
    public void testIsNecesitoPlan() {
        System.out.println("isNecesitoPlan");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isNecesitoPlan();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNecesitoPlan() {
        System.out.println("setNecesitoPlan");
        boolean necesitoPlan = false;
        Usuario instance = new Usuario();
        instance.setNecesitoPlan(necesitoPlan);
        assertEquals(necesitoPlan,instance.isNecesitoPlan());
    }

    @Test
    public void testGetHistorialComidas() {
        System.out.println("getHistorialComidas");
        Usuario instance = new Usuario();
        List<ComidaPorDia> expResult = new ArrayList<ComidaPorDia>();
        List<ComidaPorDia> result = instance.getHistorialComidas();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetHistorialComidas() {
        System.out.println("setHistorialComidas");
        List<ComidaPorDia> historialComidas = new ArrayList<ComidaPorDia>();
        Usuario instance = new Usuario();
        instance.setHistorialComidas(historialComidas);
        assertEquals(instance.getHistorialComidas(),historialComidas);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "Usuario: "+ instance.getNombreUsuario();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsFalse() {
        System.out.println("equalsFalse");
        Object obj = new Usuario();
        Usuario instance = new Usuario();
        instance.setNombreUsuario("prueba");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsTrue() {
        System.out.println("equalsTrue");
        Usuario obj = new Usuario();
        Usuario instance = new Usuario();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }  
    
     @Test (expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Usuario obj =  null;
        Usuario instance = new Usuario();
        assert(obj.equals(instance));
    } 
    
    @Test
    public void pruebaConstructorConParametros() {
        String nombre = "nombre";
        String apellido = "apellido";
        String usuario = "usuario";
        String fNacimiento = "19/12/2012";
        Usuario c = new Usuario();
        Pais nacionalidad = Pais.URUGUAY;
        double peso = 19.0;
        double altura = 19.0;
        Usuario.Preferencias preferencias = Usuario.Preferencias.MACROBIOTICO;
        Usuario.Restricciones restricciones = Usuario.Restricciones.CELIACO;
        PlanDeAlimentacion plan = new PlanDeAlimentacion(c);
        String sexo = "Masculino";
        ImageIcon fotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Usuario nuevo = new Usuario(nacionalidad,peso,altura,preferencias,restricciones,plan,sexo,nombre,apellido,usuario,fNacimiento,fotoPerfil);
       
    }
    
    @Test
    public void pruebaValues(){
        Pais[] listaNac = Pais.values();
    }
    
    @Test
    public void pruebaValues2(){
        Usuario.Restricciones[] listaNac = Usuario.Restricciones.values();
    }
    
    @Test
    public void pruebaValues3(){
        Usuario.Preferencias[] listaNac = Usuario.Preferencias.values();
    }
    
    @Test
    public void testTipoUsuario() {
      Usuario usuario = new Usuario();
      assertEquals(TipoUsuario.USUARIO, usuario.getTipo());
    }
    
}
