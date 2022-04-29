public class Prenda extends AbstPrenda {

  Prenda(Tipo tipo, String nombre, String material, Color colorPrincipal, Color colorSecundario, Trama trama){
    super(tipo,nombre,material,colorPrincipal,colorSecundario,trama);
  }

  public String getNombre(){return nombre;}
  public Categoria categoria(){
    return tipo.getCategoria();
  }

}
