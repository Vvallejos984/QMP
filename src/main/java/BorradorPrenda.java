public class BorradorPrenda extends AbstPrenda {

  BorradorPrenda(Tipo tipo, String nombre, String material, Color colorPrincipal, Color colorSecundario, Trama trama){
    super(tipo,nombre,material,colorPrincipal,colorSecundario,trama);
  }

  public void setNombre(String nombre) {this.nombre = nombre;}

  public void setTipo(Tipo tipo) {this.tipo = tipo;}

  public void setMaterial(String material) {this.material = material;}

  public void setColorPrincipal(Color colorPrincipal) {this.colorPrincipal = colorPrincipal;}

  public void setColorSecundario(Color colorSecundario) {this.colorSecundario = colorSecundario;}

  public void setTrama(Trama trama) {this.trama = trama;}

  public Prenda finalizar(){
    return new Prenda(tipo,nombre,material,colorPrincipal,colorSecundario,trama);
  }
}
