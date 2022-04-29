import Excepciones.CategoriaException;
import Excepciones.UniformeException;

import java.util.List;

public class Uniforme extends Atuendo{
  Uniforme(List<Prenda> superior, List<Prenda> inferior, Prenda calzado, List<Prenda> accesorio) throws CategoriaException, UniformeException {
      super(superior,inferior,calzado,accesorio);
  }
}
