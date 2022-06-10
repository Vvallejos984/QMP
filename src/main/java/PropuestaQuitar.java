public class PropuestaQuitar extends Propuesta {

  public PropuestaQuitar(Prenda prenda){
    this.prenda = prenda;
  }

  public void realizarAceptacionEn(Guardarropa guardarropas){
    guardarropas.quitarPrenda(prenda);
  }

  public void realizarDeshacerEn(Guardarropa guardarropas){
    guardarropas.agregarPrenda(prenda);
  }

}
