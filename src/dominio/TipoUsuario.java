package dominio;

/**
 *
 * @author seba
 */
public enum TipoUsuario {
  PROFESIONAL {
    @Override
    public String toString() {
      return "Profesional";
    }
  },
  USUARIO {
    @Override
    public String toString() {
      return "Usuario";
    }
  },
  NO_SELECCIONADO {
    @Override
    public String toString() {
      return "No Seleccionado";
    }
  }
}
