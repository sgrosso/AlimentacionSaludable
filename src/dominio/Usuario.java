package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Usuario extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 1L;
    private Pais nacionalidad;
    private double pesoKg;
    private double alturaCm;
    private Preferencias preferenciasAlimentarias;
    private Restricciones restricciones;
    private boolean[] listaRestricciones;
    private PlanDeAlimentacion plan;
    private boolean necesitoPlan;
    private Profesional profesionalAsignado;
    private String sexo;
    private List<ComidaPorDia> historialComidas;
    private ComidaPorDia historialDelDia;
    private List<Mensaje> casillaDeEntrada;
    private String fechaUltimaAdicion;

    //Costructor
    public Usuario(Pais nacionalidad, double pesoKg, double alturaCm,
            Preferencias preferenciasAlimentarias, Restricciones restricciones,
            PlanDeAlimentacion plan, String sexo, String nombre,
            String apellidos, String nombreUsuario, String fechaNacimiento,
            ImageIcon fotoPerfil) {
        super(nombre, apellidos, nombreUsuario, fechaNacimiento, fotoPerfil);
        this.nacionalidad = nacionalidad;
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
        this.preferenciasAlimentarias = preferenciasAlimentarias;
        this.restricciones = restricciones;
        this.listaRestricciones = new boolean[5];
        this.plan = plan;
        this.necesitoPlan = false;
        this.profesionalAsignado = new Profesional();
        this.sexo = sexo;
        this.historialComidas = new ArrayList<>();
        this.historialDelDia = new ComidaPorDia();
        this.casillaDeEntrada = new ArrayList<>();
        this.fechaUltimaAdicion = "no se ingreso";
    }

    public Usuario() {
        super("no ingreso nombre", "no ingreso apellido", "no ingreso usuario", "no ingreso fecha nacimiento", null);
        this.setFotoPerfil(new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg")));
        this.nacionalidad = Pais.URUGUAY;
        this.pesoKg = 0;
        this.alturaCm = 0;
        this.preferenciasAlimentarias = Preferencias.NINGUNA;
        this.restricciones = Restricciones.NINGUNA;
        this.listaRestricciones = new boolean[5];
        this.necesitoPlan = false;
        this.profesionalAsignado = new Profesional();
        this.plan = new PlanDeAlimentacion(this);
        this.sexo = "no se ingreso";
        this.historialComidas = new ArrayList<>();
        this.historialDelDia = new ComidaPorDia();
        this.casillaDeEntrada = new ArrayList<>();
        this.fechaUltimaAdicion = "no se ingreso";
    }

    // Metodos de la clase usuario
    public String getFechaUltimaAdicion() {
        return fechaUltimaAdicion;
    }

    public void setFechaUltimaAdicion(String fechaUltimaAdicion) {
        this.fechaUltimaAdicion = fechaUltimaAdicion;
    }

    public ComidaPorDia getHistorialDelDia() {
        return historialDelDia;
    }

    public void setHistorialDelDia(ComidaPorDia historialDelDia) {
        this.historialDelDia = historialDelDia;
    }

    public Profesional getProfesionalAsignado() {
        return profesionalAsignado;
    }

    public void setProfesionalAsignado(Profesional profesionalAsignado) {
        this.profesionalAsignado = profesionalAsignado;
    }

    public List<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(List<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg > 0 && pesoKg < 501) {
            this.pesoKg = pesoKg;
        }   
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        if (alturaCm > 0 && alturaCm < 266) {
            this.alturaCm = alturaCm;
        }
    }

    public Preferencias getPreferenciasAlimentarias() {
        return preferenciasAlimentarias;
    }

    public void setPreferenciasAlimentarias(Preferencias
                                            preferenciasAlimentarias) {
        this.preferenciasAlimentarias = preferenciasAlimentarias;
    }

    public Restricciones getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(Restricciones restricciones) {
        this.restricciones = restricciones;
    }

    public PlanDeAlimentacion getPlan() {
        return plan;
    }

    public void setPlan(PlanDeAlimentacion plan) {
        this.plan = plan;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if ("Masculino".equals(sexo) || "Femenino".equals(sexo)) {
            this.sexo = sexo;
        }
    }

    public boolean[] getListaRestricciones() {
        return listaRestricciones;
    }

    public void setListaRestricciones(boolean[] listaRestricciones) {
        this.listaRestricciones = listaRestricciones;
    }

    public boolean isNecesitoPlan() {
        return necesitoPlan;
    }

    public void setNecesitoPlan(boolean necesitoPlan) {
        this.necesitoPlan = necesitoPlan;
    }

    public List<ComidaPorDia> getHistorialComidas() {
        return historialComidas;
    }

    public void setHistorialComidas(List<ComidaPorDia> historialComidas) {
        this.historialComidas = historialComidas;
    }

    public enum Preferencias {
        VEGANO {
            @Override
            public String toString() {
                return "Vegano";
            }
        },
        VEGETARIANO {
            @Override
            public String toString() {
                return "Vegetariano";
            }
        },
        MACROBIOTICO {
            @Override
            public String toString() {
                return "Macrobiótico";
            }
        },
        ORGANICO {
            @Override
            public String toString() {
                return "Orgánico";
            }
        },
        NINGUNA {
            @Override
            public String toString() {
                return "Ninguna";
            }
        }
    }

    public enum Restricciones {
        CELIACO {
            @Override
            public String toString() {
                return "Celíaco";
            }
        },
        INTOLERANTE_A_LA_LACTOSA {
            @Override
            public String toString() {
                return "Intolerante a la lactosa";
            }
        },
        DIABETICO {
            @Override
            public String toString() {
                return "Diabético";
            }
        },
        HIPERTENSION {
            @Override
            public String toString() {
                return "Hipertensión";
            }
        },
        NINGUNA {
            @Override
            public String toString() {
                return "Ninguna";
            }
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + this.getNombreUsuario();
    }
}
