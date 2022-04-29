public class Tipo {
  private String nombre;
  private Categoria categoria;

  Tipo(String nombre, Categoria categoria){
    this.nombre=nombre;
    this.categoria=categoria;
  }

  public String getNombre(){return nombre;}
  public Categoria getCategoria(){return categoria;}

}
