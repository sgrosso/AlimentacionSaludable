package dominio;

import java.io.Serializable;
import java.util.Objects;

public class Alimento implements Serializable {

    //Atrubutos
    private static final long serialVersionUID = 1L;
    private String nombre;
    private TipoAlimento tipo;
    private boolean[] listaNutrientesSeleccionados;

    //Constructor
    public Alimento() {
        this.nombre = "sin nombre";
        this.tipo = TipoAlimento.OTRO;
        this.listaNutrientesSeleccionados = new boolean[Nutrientes.values().length];
    }

    //Metodos de la clase Aliemntos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(!nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public boolean[] getListaNutrientesSeleccionados() {
        boolean[] lista = listaNutrientesSeleccionados;
        return lista;
    }

    public void setListaNutrientesSeleccionados(boolean[] listaNutrientesSeleccionados) {
        this.listaNutrientesSeleccionados = listaNutrientesSeleccionados;
    }

    //redefino toString
    @Override
    public String toString() {
        return nombre;
    }
    
    //Redefino el equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        
        Alimento unAlimento = (Alimento) obj;
        return this.nombre.equalsIgnoreCase(unAlimento.getNombre());
    }

    @Override
    public int hashCode() {
        return 67 * 7 + Objects.hashCode(this.nombre);
    }
}
