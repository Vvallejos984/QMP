import java.util.List;

public class Usuario {

  List<Guardarropa> listaGuardarropas;

  public void agregarGuardarropa(Guardarropa guardarropa){
    listaGuardarropas.add(guardarropa);
  }

  public void quitarGuardarropa(Guardarropa guardarropa){
    listaGuardarropas.remove(guardarropa);
  }

}
