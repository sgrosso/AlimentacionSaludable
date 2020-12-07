package dominio;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Sistema implements Serializable {

  //Atributos
  private static final long serialVersionUID = 1L;
  private List<Alimento> listaAlimentos;
  private List<Usuario> listaUsuarios;
  private List<Profesional> listaProfesionales;
  private TipoUsuario usuarioActivo;
  private Persona usuarioLogueado;

  //Constructor
  public Sistema(List<Alimento> listaAlimentos,
      List<Usuario> listaUsuarios,
      List<Profesional> listaProfesionales,
      TipoUsuario usuarioActivo) {
    this.listaAlimentos = listaAlimentos;
    this.listaUsuarios = listaUsuarios;
    this.listaProfesionales = listaProfesionales;
    this.usuarioActivo = usuarioActivo;
  }

  public Sistema() {
    this.listaAlimentos = new ArrayList<>();
    this.listaUsuarios = new ArrayList<>();
    this.listaProfesionales = new ArrayList<>();
    this.usuarioActivo = TipoUsuario.NO_SELECCIONADO;
  }

  //Metodos de la clase sistema
  public List<Alimento> getListaAlimentos() {
    return listaAlimentos;
  }

  public void setListaAlimentos(List<Alimento> listaAlimentos) {
    this.listaAlimentos = listaAlimentos;
  }

  public List<Usuario> getListaUsuarios() {
    return listaUsuarios;
  }

  public void setListaUsuarios(List<Usuario> listaUsuarios) {
    this.listaUsuarios = listaUsuarios;
  }

  public List<Profesional> getListaProfesionales() {
    return listaProfesionales;
  }

  public void setListaProfesionales(List<Profesional> listaProfesionales) {
    this.listaProfesionales = listaProfesionales;
  }

  public TipoUsuario getUsuarioActivo() {
    return usuarioActivo;
  }

  public void setUsuarioActivo(TipoUsuario usuarioActivo) {
    this.usuarioActivo = usuarioActivo;
  }

  public Persona getUsuarioLogueado() {
    return this.usuarioLogueado;
  }

  public void setUsuarioLogueado(Persona unUsuarioLogueado) {
    this.usuarioLogueado = unUsuarioLogueado;
  }
  
  //CARGAR Y GUARDAR SISTEMA
  public void cargarSistema() throws IOException, ClassNotFoundException {
    try (ObjectInputStream datosSerializados = new ObjectInputStream(
        Files.newInputStream(Path.of("sis.ser")))) {
      listaAlimentos = (List<Alimento>) datosSerializados.readObject();
      listaUsuarios = (List<Usuario>) datosSerializados.readObject();
      listaProfesionales = (List<Profesional>) datosSerializados.readObject();
    }
  }

  public void guardarSistema() throws IOException {
    try (ObjectOutputStream datosSerializados = new ObjectOutputStream(
        Files.newOutputStream(Path.of("sis.ser")))) {
      datosSerializados.writeObject(listaAlimentos);
      datosSerializados.writeObject(listaUsuarios);
      datosSerializados.writeObject(listaProfesionales);
      datosSerializados.flush();
    }
  }
  
  //Metodo para validarque el dato sea numericoF
  public boolean pidoDatoNumerico(int dato, int min, int max) {
    return dato >= min && dato <= max;
  }

  //Metodo que adapta el tamaño de la imagen al deseado
  public ImageIcon resizeImageIcon(ImageIcon imageIcon, Integer width, Integer height) {
    BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
    Graphics2D graphics2D = bufferedImage.createGraphics();
    graphics2D.drawImage(imageIcon.getImage(), 0, 0, width, height, null);
    graphics2D.dispose();
    return new ImageIcon(bufferedImage, imageIcon.getDescription());
  }
  
  public void registroAlimento(String nombreAlim, TipoAlimento unTipo,
      boolean[] unaListaNutrientes) {
    Alimento alimento = new Alimento();
    alimento.setNombre(nombreAlim);
    alimento.setTipo(TipoAlimento.values()[unTipo.ordinal()]);
    alimento.setListaNutrientesSeleccionados(unaListaNutrientes);
    if (!this.getListaAlimentos().contains(alimento)) {
      this.getListaAlimentos().add(alimento);
    }
  }

  public Persona obtenerUsuario(String nombreUsuario, String password) {
    List<Usuario> usuarios = this.getListaUsuarios();
    List<Profesional> profesionales = this.getListaProfesionales();
    
    Persona unaPersona;

    unaPersona = usuarios.stream()
        .filter(usuario -> usuario.tieneCredenciales(nombreUsuario, password))
        .findFirst()
        .orElse(null);

    if (unaPersona == null) {
      unaPersona = profesionales
          .stream()
          .filter(profesional -> profesional.tieneCredenciales(nombreUsuario, password))
          .findFirst()
          .orElse(null);
    }
    return unaPersona;
  }

}
