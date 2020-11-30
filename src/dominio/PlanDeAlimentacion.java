package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PlanDeAlimentacion implements Serializable {

  //Atributos
  private static final long serialVersionUID = 1L;
  private Usuario usuario;
  private List<Alimento> listaLunes;
  private List<Alimento> listaMartes;
  private List<Alimento> listaMiercoles;
  private List<Alimento> listaJueves;
  private List<Alimento> listaViernes;
  private List<Alimento> listaSabado;
  private List<Alimento> listaDomingo;

  //Constructor
  public PlanDeAlimentacion(Usuario usuario) {
    this.usuario = usuario;
    listaLunes = new ArrayList<>();
    listaMartes = new ArrayList<>();
    listaMiercoles = new ArrayList<>();
    listaJueves = new ArrayList<>();
    listaViernes = new ArrayList<>();
    listaSabado = new ArrayList<>();
    listaDomingo = new ArrayList<>();
  }

  //Metodos de la clase PlanDeAliemntacion
  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public List<Alimento> getListaLunes() {
    return listaLunes;
  }

  public void setListaLunes(List<Alimento> listaLunes) {
    this.listaLunes = listaLunes;
  }

  public List<Alimento> getListaMartes() {
    return listaMartes;
  }

  public void setListaMartes(List<Alimento> listaMartes) {
    this.listaMartes = listaMartes;
  }

  public List<Alimento> getListaMiercoles() {
    return listaMiercoles;
  }

  public void setListaMiercoles(List<Alimento> listaMiercoles) {
    this.listaMiercoles = listaMiercoles;
  }

  public List<Alimento> getListaJueves() {
    return listaJueves;
  }

  public void setListaJueves(List<Alimento> listaJueves) {
    this.listaJueves = listaJueves;
  }

  public List<Alimento> getListaViernes() {
    return listaViernes;
  }

  public void setListaViernes(List<Alimento> listaViernes) {
    this.listaViernes = listaViernes;
  }

  public List<Alimento> getListaSabado() {
    return listaSabado;
  }

  public void setListaSabado(List<Alimento> listaSabado) {
    this.listaSabado = listaSabado;
  }

  public List<Alimento> getListaDomingo() {
    return listaDomingo;
  }

  public void setListaDomingo(List<Alimento> listaDomingo) {
    this.listaDomingo = listaDomingo;
  }
}
