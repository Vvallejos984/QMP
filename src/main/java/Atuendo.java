import Excepciones.CategoriaException;

public class Atuendo {
  private Prenda superior;
  private Prenda inferior;
  private Prenda calzado;
  private Prenda accesorio;

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado, Prenda accesorio) throws CategoriaException {

    if(superior.categoria()!="Superior")
      throw new CategoriaException(superior.getNombre(),"prenda superior");
    else
      this.superior=superior;

    if(inferior.categoria()!="Inferior")
      throw new CategoriaException(inferior.getNombre(),"prenda inferior");
    else
      this.inferior=inferior;
    if(calzado.categoria()!="Calzado")
      throw new CategoriaException(calzado.getNombre(),"calzado");
    else
      this.calzado=calzado;
    if(accesorio.categoria()!="Accesorio" && accesorio!=null)
      throw new CategoriaException(accesorio.getNombre(),"accesorio");
    else
      this.accesorio=accesorio;
  }

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado) throws CategoriaException {
    this(superior,inferior,calzado,null);
  }
}
