package dominio;

/**
 *
 * @author seba
 */
public enum TipoAlimento {
  FRUTA {
    @Override
    public String toString() {
      return "Fruta";
    }
  },
  CEREAL {
    @Override
    public String toString() {
      return "Cereal";
    }
  },
  LEGUMBRE {
    @Override
    public String toString() {
      return "Legumbre";
    }
  },
  CARNES_BLANCAS {
    @Override
    public String toString() {
      return "Carnes Blancas";
    }
  },
  CARNES_ROJAS {
    @Override
    public String toString() {
      return "Carnes Rojas";
    }
  },
  VEGETALES {
    @Override
    public String toString() {
      return "Vegetales";
    }
  },
  EMBUTIDOS {
    @Override
    public String toString() {
      return "Embutidos";
    }
  },
  LACTEOS {
    @Override
    public String toString() {
      return "Lácteos";
    }
  },
  BEBIDAS {
    @Override
    public String toString() {
      return "Bebidas";
    }
  },
  MARISCOS {
    @Override
    public String toString() {
      return "Mariscos";
    }
  },
  POSTRES {
    @Override
    public String toString() {
      return "Postres";
    }
  },
  OTRO {
    @Override
    public String toString() {
      return "Otro";
    }
  },
  PROVENIENTE_DE_ANIMALES {
    @Override
    public String toString() {
      return "Proveniente de animales";
    }
  }
}
