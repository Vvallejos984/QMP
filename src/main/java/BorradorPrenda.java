import Excepciones.AtributoPrendaException;

public class BorradorPrenda {

  private Tipo tipo;
  private String material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public BorradorPrenda(Tipo tipo) {
    this.tipo = tipo;
  }

  public void setTipo(Tipo tipo) {
    if (tipo != null) {
      this.tipo = tipo;
    } else {
      throw new AtributoPrendaException("El tipo de prenda no puede ser nulo");
    }
  }

  public void setMaterial(String material) {
    if (material != null) {
      this.material = material;
    } else {
      throw new AtributoPrendaException("El material de la prenda no puede ser nulo");
    }
  }

  public void setColorPrincipal(Color colorPrincipal) {
    if (colorPrincipal != null) {
      this.colorPrincipal = colorPrincipal;
    } else {
      throw new AtributoPrendaException("El color principal de la prenda no puede ser nulo");
    }
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {
    if (trama == null) {
      this.trama = Trama.LISA;
    } else {
      this.trama = trama;
    }
  }

  public Prenda crearPrenda() {
    if (tipo != null && material != null && colorPrincipal != null && trama != null){
      return new Prenda(tipo, material, colorPrincipal, colorSecundario, trama);
    }
    else{
      throw new AtributoPrendaException("El borrador tiene atributos obligatorios faltantes");
    }
  }

  private Tipo getTipo() {
    return tipo;
  }

  private String getMaterial() {
    return material;
  }

  private Color getColorPrincipal() {
    return colorPrincipal;
  }

  private Color getColorSecundario() {
    return colorSecundario;
  }

  private Trama getTrama() {
    return trama;
  }
}
