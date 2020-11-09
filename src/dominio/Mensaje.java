package dominio;

import java.io.Serializable;


public class Mensaje implements Serializable {
    
    //Atributos
    private static final long serialVersionUID = 1L;
    private Persona origen;
    private Persona destino;
    private String asunto;
    private String texto;
    
    //Constructor
    public Mensaje() {
        Persona persona = (Persona) new Usuario();
        this.origen = persona;
        this.destino = persona;
        this.asunto = "no tiene texto";
        this.texto = "no tiene texto";
    }
    
    //Metodos de la clase Mensaje

    public Persona getOrigen() {
        return origen;
    }

    public void setOrigen(Persona origen) {
        this.origen = origen;
    }

    public Persona getDestino() {
        return destino;
    }

    public void setDestino(Persona destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String mensaje) {
        this.texto = mensaje;
    }
    
    //Redefino toString

    @Override
    public String toString() {
        return "Mensaje de: "+ origen.getNombreUsuario() 
               + " con Asunto: " + asunto;
    }
    
}
