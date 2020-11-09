package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Profesional extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 1L;
    private String nombreTituloProf;
    private String fechaGraduacion;
    private Pais paisObtuvoTitulo;
    private List<Mensaje> casillaDeEntrada;

    //Constructor

    public Profesional() {
        super("no ingreso nombre", "no ingreso apellido", "no ingreso usuario", "no ingreso fecha nacimiento", null);
        this.setFotoPerfil(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaProfesional.png")));
        this.nombreTituloProf = "no ingreso titulo prof";
        this.fechaGraduacion = "no ingreso fecha graduacion";
        this.paisObtuvoTitulo = Pais.URUGUAY;
        this.casillaDeEntrada = new ArrayList<>();
    }

    // Metodos de la clase profesional
    public List<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(List<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public String getNombreTituloProf() {
        return nombreTituloProf;
    }

    public void setNombreTituloProf(String nombreTituloProf) {
        if(!nombreTituloProf.trim().isEmpty()){
            this.nombreTituloProf = nombreTituloProf;
        }
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        if(!fechaGraduacion.trim().isEmpty()){
            this.fechaGraduacion = fechaGraduacion;
        }
    }

    public Pais getPaisObtuvoTitulo() {
        return paisObtuvoTitulo;
    }

    public void setPaisObtuvoTitulo(Pais paisObtuvoTitulo) {
        this.paisObtuvoTitulo = paisObtuvoTitulo;
    }
    
    //redefino toString
    @Override
    public String toString() {
        return "Usuario: " + this.getNombreUsuario();
    }
    
}
