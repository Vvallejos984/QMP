import Excepciones.CategoriaException;

import java.util.List;

public class Atuendo {
  private List<Prenda> superior;
  private List<Prenda> inferior;
  private Prenda calzado;
  private List<Prenda> accesorio;

  Atuendo(List<Prenda> superior, List<Prenda> inferior, Prenda calzado, List<Prenda> accesorio) throws CategoriaException {

    for(Prenda prenda :superior){
      if(prenda.categoria()!=Categoria.SUPERIOR)
        throw new CategoriaException(prenda.getNombre(),"prenda superior");
    }
    this.superior=superior;

    for(Prenda prenda :inferior){
      if(prenda.categoria()!=Categoria.INFERIOR)
        throw new CategoriaException(prenda.getNombre(),"prenda inferior");
    }
    this.inferior=inferior;

    if(calzado.categoria()!=Categoria.CALZADO)
      throw new CategoriaException(calzado.getNombre(),"calzado");
    else
      this.calzado=calzado;

    for(Prenda prenda :accesorio){
      if(prenda.categoria()!=Categoria.ACCESORIO)
        throw new CategoriaException(prenda.getNombre(),"accesorio");
    }
      this.accesorio=accesorio;
  }
}
