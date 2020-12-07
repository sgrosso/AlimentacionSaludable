package dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {

  //Atributos
  private static final long serialVersionUID = 1L;
  private String nombre;
  private String apellidos;
  private String nombreUsuario;
  private String password;
  private String fechaNacimiento;
  private ImageIcon fotoPerfil;
  

  //Cosntructor
  public Persona(String nombre, String apellidos, String nombreUsuario,
      String fechaNacimiento, ImageIcon fotoPerfil) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.nombreUsuario = nombreUsuario;
    this.fechaNacimiento = fechaNacimiento;
    this.fotoPerfil = fotoPerfil;
  }

  //Metodos de la clase persona
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public ImageIcon getFotoPerfil() {
    return fotoPerfil;
  }

  public void setFotoPerfil(ImageIcon fotoPerfil) {
    this.fotoPerfil = fotoPerfil;
  }
  
  public boolean tieneCredenciales(String nombreUsuario, String password) {
    return this.nombreUsuario.equals(nombreUsuario) && this.password.equals(password);
  }
  
  public abstract TipoUsuario getTipo();
  
  @Override
  public int hashCode() {
    return 47 * 7 + Objects.hashCode(this.nombreUsuario);
  }

  //Redefino el equals
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    final Persona other = (Persona) obj;
    return Objects.equals(this.nombreUsuario, other.nombreUsuario);
  }

}
