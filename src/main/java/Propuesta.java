public abstract class Propuesta {

  private EstadoPropuesta estado;
  protected Prenda prenda;

  public void realizarAceptacionEn(Guardarropa guardarropas){}

  public void realizarDeshacerEn(Guardarropa guardarropas){}

  public void aceptarEn(Guardarropa guardarropas){
    estado = EstadoPropuesta.ACEPTADA;
    this.realizarAceptacionEn(guardarropas);
  }

  public void rechazar(){
    estado = EstadoPropuesta.RECHAZADA;
  }

  public EstadoPropuesta getEstado() {
    return estado;
  }

  public void deshacerEn(Guardarropa guardarropas){
    estado = EstadoPropuesta.PENDIENTE;
    realizarDeshacerEn(guardarropas);
  }

}
