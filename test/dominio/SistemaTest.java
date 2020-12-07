package dominio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {
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
    public void testPidoDatoNumericoInvalido() {
        System.out.println("pidoDatoNumericoInvalido");
        int dato = -1;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.pidoDatoNumerico(dato, min, max);
        assertFalse(result);
    }

    @Test
    public void testPidoDatoNumericoInvalido2() {
        System.out.println("pidoDatoNumericoInvalido2");
        int dato = 3;
        int min = 0;
        int max = 2;
        Sistema instance = new Sistema();
        boolean result = instance.pidoDatoNumerico(dato, min, max);
        assertFalse(result);
    }

    @Test
    public void testResizeImageIconTrue() {
        System.out.println("resizeImageIcon");
        Sistema instance = new Sistema();
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Integer width = 100;
        Integer height = 100;
        ImageIcon result = instance.resizeImageIcon(imageIcon, width, height);
        boolean heightCorrectas = result.getIconHeight() == height;
        boolean widthCorrectas = result.getIconWidth() == width;
        assertTrue(heightCorrectas && widthCorrectas);
    }

    @Test
    public void testResizeImageIconFalse() {
        System.out.println("resizeImageIcon");
        Sistema instance = new Sistema();
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        Integer width = 100;
        Integer height = 100;
        Integer heightMal = 50;
        ImageIcon result = instance.resizeImageIcon(imageIcon, width, height);
        boolean heightCorrectas = result.getIconHeight() == heightMal;
        boolean widthCorrectas = result.getIconWidth() == width;
        assertFalse(heightCorrectas && widthCorrectas);
    }

    @Test
    public void testRegistroUsuario() {
        System.out.println("registroUsuario");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unUsuario = "usuario";
        String unSexo = "Masculino";
        String unaFechaNacimiento = "19/11/2004";
        double unaAltura = 1.0;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        double unPeso = 1.0;
        Pais unaNacionalidad = Pais.URUGUAY;
        Sistema instance = new Sistema();
        instance.registroUsuario(unNombre, unApellido, unUsuario, unSexo, unaFechaNacimiento, unaAltura, unaFotoPerfil, unPeso, unaNacionalidad);
        assertTrue(instance.getListaUsuarios().size() > 0);
    }

    @Test
    public void testRegistroUsuarioInvalido() {
        System.out.println("registroUsuario");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unUsuario = "usuario";
        String unSexo = "Masculino";
        String unaFechaNacimiento = "19/11/2004";
        double unaAltura = 1.0;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        double unPeso = 1.0;
        Pais unaNacionalidad = Pais.URUGUAY;
        Sistema instance = new Sistema();
        instance.registroUsuario(unNombre, unApellido, unUsuario, unSexo, unaFechaNacimiento, unaAltura, unaFotoPerfil, unPeso, unaNacionalidad);
        instance.registroUsuario(unNombre, unApellido, unUsuario, unSexo, unaFechaNacimiento, unaAltura, unaFotoPerfil, unPeso, unaNacionalidad);
        assertFalse(instance.getListaUsuarios().size() > 1);
    }

    @Test
    public void testRegistroProfesionalInvalido() {
        System.out.println("registroProfesionalInvalido");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unNombreUsuario = "usuario";
        String unNombreTitulo = "titulo";
        Pais unPais = Pais.URUGUAY;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"));
        String unaFechaNacimiento = "19/11/2004";
        String unaFechaGraduacion = "19/11/2004";
        Pais unPaisTitulo = Pais.URUGUAY;
        Sistema instance = new Sistema();
        instance.registroProfesional(unNombre, unApellido, unNombreUsuario, unNombreTitulo, unPais, unaFotoPerfil, unaFechaNacimiento, unaFechaGraduacion, unPaisTitulo);
        instance.registroProfesional(unNombre, unApellido, unNombreUsuario, unNombreTitulo, unPais, unaFotoPerfil, unaFechaNacimiento, unaFechaGraduacion, unPaisTitulo);
        assertFalse(instance.getListaProfesionales().size() > 1);
    }

    @Test
    public void testRegistroProfesional() {
        System.out.println("registroProfesional");
        String unNombre = "nombre";
        String unApellido = "apellido";
        String unNombreUsuario = "usuario";
        String unNombreTitulo = "titulo";
        Pais unPais = Pais.URUGUAY;
        ImageIcon unaFotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png"));
        String unaFechaNacimiento = "19/11/2004";
        String unaFechaGraduacion = "19/11/2004";
        Pais unPaisTitulo = Pais.URUGUAY;
        Sistema instance = new Sistema();
        instance.registroProfesional(unNombre, unApellido, unNombreUsuario, unNombreTitulo, unPais, unaFotoPerfil, unaFechaNacimiento, unaFechaGraduacion, unPaisTitulo);
        assertTrue(instance.getListaProfesionales().size() > 0);
    }

    @Test
    public void testRegistroAlimento() {
        System.out.println("registroAlimento");
        String nombreAlim = "";
        TipoAlimento unTipo = TipoAlimento.OTRO;
        Alimento a = new Alimento();
        boolean[] unaListaNutrientes = new boolean[a.getListaNutrientesSeleccionados().length];
        Sistema instance = new Sistema();
        instance.registroAlimento(nombreAlim, unTipo, unaListaNutrientes);
        assertTrue(instance.getListaAlimentos().size() > 0);
    }

    @Test
    public void testRegistroAlimentoInvalido() {
        System.out.println("registroAlimentoInvalido");
        String nombreAlim = "";
        TipoAlimento unTipo = TipoAlimento.OTRO;
        Alimento a = new Alimento();
        boolean[] unaListaNutrientes = new boolean[a.getListaNutrientesSeleccionados().length];
        Sistema instance = new Sistema();
        instance.registroAlimento(nombreAlim, unTipo, unaListaNutrientes);
        instance.registroAlimento(nombreAlim, unTipo, unaListaNutrientes);
        assertFalse(instance.getListaAlimentos().size() > 1);
    }

    @Test
    public void testValuesTipoUsuario() {
        TipoUsuario[] listaNac = TipoUsuario.values();
    }

    @Test
    public void testSistemaPorParametro() {
        ArrayList<Usuario> listaU = new ArrayList<Usuario>();
        ArrayList<Profesional> listaP = new ArrayList<Profesional>();
        ArrayList<Alimento> listaA = new ArrayList<Alimento>();
        TipoUsuario usuarioActivo = TipoUsuario.NO_SELECCIONADO;
        Sistema s = new Sistema(listaA, listaU, listaP, usuarioActivo);
    }

    @Test
    public void testCargarSistema() throws IOException, Exception {
        Sistema unSistema = new Sistema();
        unSistema.cargarSistema();
        assertTrue(unSistema.getListaAlimentos() != null);
    }

    @Test
    public void testGuardarSistema() throws Exception {
        Sistema unSistema = new Sistema();
        Alimento unAlimento = new Alimento();
        unAlimento.setNombre("Yogurt");
        unSistema.getListaAlimentos().add(unAlimento);
        unSistema.guardarSistema();
        ObjectInputStream in;
        ArrayList<Alimento> listAlimentos = null;
       
        try {
            in = new ObjectInputStream(new FileInputStream("sis.ser"));
            listAlimentos = (ArrayList<Alimento>) in.readObject();
        } catch (Exception ex) {
            
        }
        
        assertTrue(listAlimentos != null);
        unSistema.getListaAlimentos().remove(unAlimento);
        unSistema.guardarSistema();
    }
    
    @Test
    public void testObtenerUsuarioRegistrado() {
      Sistema unSistema = new Sistema();
      
      Usuario usuario = new Usuario();
      usuario.setNombre( "Sebastián");
      usuario.setApellidos("Grosso");
      usuario.setNombreUsuario("seba");
      usuario.setPassword("123456");
      
      unSistema.getListaUsuarios().add(usuario);
      Usuario usuarioRegistrado = (Usuario) unSistema.obtenerUsuario("seba", "123456");
      assertEquals(usuario, usuarioRegistrado);
    }
    
    @Test
    public void testObtenerUsuarioNoRegistrado() {
      Sistema unSistema = new Sistema();
      Persona persona = unSistema.obtenerUsuario("seba", "123456");
      assertNull(persona);
    }
    
}
