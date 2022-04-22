public class Prenda {
  private String nombre;
  private Tipo tipo;
  private String material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(String nombre, Tipo tipo, String material, Color colorPrincipal, Color colorSecundario){
    this.nombre=nombre;
    this.tipo=tipo;
    this.material=material;
    this.colorPrincipal=colorPrincipal;
    this.colorSecundario=colorSecundario;
  }

  public Prenda(String nombre, Tipo tipo, String material, Color colorPrincipal){
    this(nombre,tipo,material,colorPrincipal,null);
  }

  public String getNombre(){return nombre;}
  public String categoria(){
    return tipo.getCategoria();
  }
}
