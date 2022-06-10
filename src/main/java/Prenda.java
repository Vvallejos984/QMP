public class Prenda {

  private Tipo tipo;
  private String material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(Tipo tipo, String material, Color colorPrincipal, Color colorSecundario, Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Categoria categoria() {
    return getTipo().getCategoria();
  }

  public Tipo getTipo() {
    return tipo;
  }

  public String getMaterial() {
    return material;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Trama getTrama() {
    return trama;
  }
}
