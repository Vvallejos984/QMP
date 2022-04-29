public class AbstPrenda {
  String nombre;
  Tipo tipo;
  String material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  AbstPrenda(Tipo tipo, String nombre, String material, Color colorPrincipal, Color colorSecundario, Trama trama){
    this.nombre=nombre;
    this.tipo=tipo;
    this.material=material;
    this.colorPrincipal=colorPrincipal;
    this.colorSecundario=colorSecundario;
    if(trama==null)
      this.trama=Trama.LISA;
    else
      this.trama=trama;
  }


}
