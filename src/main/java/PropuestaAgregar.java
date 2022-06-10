public class PropuestaAgregar extends Propuesta {

  public PropuestaAgregar(Prenda prenda){
    this.prenda = prenda;
  }

  public void realizarAceptacionEn(Guardarropa guardarropas){
    guardarropas.agregarPrenda(prenda);
  }

  public void realizarDeshacerEn(Guardarropa guardarropas){
    guardarropas.quitarPrenda(prenda);
  }

}
