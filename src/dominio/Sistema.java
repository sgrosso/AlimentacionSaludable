package dominio;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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

  //CARGAR Y GUARDAR SISTEMA
    //CARGAR Y GUARDAR SISTEMA
    public void cargarSistema() {
        try {
            ObjectInputStream in = new ObjectInputStream
                                   (new FileInputStream("sis.ser"));
            ArrayList<Alimento> listAlimentos = (ArrayList<Alimento>)
                                                in.readObject();
            listaAlimentos = listAlimentos;
            ArrayList<Usuario> listUsuarios = (ArrayList<Usuario>)
                                              in.readObject();
            listaUsuarios = listUsuarios;
            ArrayList<Profesional> listProfesionales = (ArrayList<Profesional>)
                                                        in.readObject();
            listaProfesionales = listProfesionales;
            in.close();
        } catch (Exception ex) {
            listaAlimentos = new ArrayList<Alimento>();
            listaUsuarios = new ArrayList<Usuario>();
            listaProfesionales = new ArrayList<Profesional>();
        }
    }

    public void guardarSistema() {
        try {
            ObjectOutputStream out = new ObjectOutputStream
                                         (new FileOutputStream("sis.ser"));
            out.writeObject(listaAlimentos);
            out.writeObject(listaUsuarios);
            out.writeObject(listaProfesionales);
            out.flush();
            out.close();
        } catch (IOException ex) {
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

  public void registroUsuario(String unNombre, String unApellido, String unUsuario,
      String unSexo, String unaFechaNacimiento, double unaAltura, ImageIcon unaFotoPerfil,
      double unPeso, Pais unaNacionalidad) {
    Usuario usuario = new Usuario();
    usuario.setNombre(unNombre);
    usuario.setApellidos(unApellido);
    usuario.setNombreUsuario(unUsuario);
    usuario.setNacionalidad(Pais.values()[unaNacionalidad.ordinal()]);
    usuario.setFechaNacimiento(unaFechaNacimiento);
    usuario.setSexo(unSexo);
    usuario.setAlturaCm(unaAltura);
    usuario.setPesoKg(unPeso);
    usuario.setFotoPerfil(unaFotoPerfil);
    if (!this.getListaUsuarios().contains(usuario)) {
      this.getListaUsuarios().add(usuario);
    }
  }

  public void registroProfesional(String unNombre, String unApellido,
      String unNombreUsuario,
      String unNombreTitulo,
      Pais unPais,
      ImageIcon unaFotoPerfil,
      String unaFechaNacimiento,
      String unaFechaGraduacion,
      Pais unPaisTitulo) {
    Profesional profesional = new Profesional();
    profesional.setNombre(unNombre);
    profesional.setApellidos(unApellido);
    profesional.setNombreUsuario(unNombreUsuario);
    profesional.setFechaNacimiento(unaFechaNacimiento);
    profesional.setNombreTituloProf(unNombreTitulo);
    profesional.setFechaGraduacion(unaFechaGraduacion);
    profesional.setPaisObtuvoTitulo(unPaisTitulo);
    profesional.setFotoPerfil(unaFotoPerfil);
    if (!this.getListaProfesionales().contains(profesional)) {
      this.getListaProfesionales().add(profesional);
    }
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

}
