import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {

  List<Prenda> prendas;
  List<Propuesta> propuestas;

  public void agregarPropuesta(Propuesta propuesta){
    propuestas.add(propuesta);
  }

  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    prendas.remove(prenda);
  }

  public List<Propuesta> propuestasPendientes(){
    return propuestas
        .stream()
        .filter(propuesta -> propuesta.getEstado() == EstadoPropuesta.PENDIENTE)
        .collect(Collectors.toList());
  }

}
