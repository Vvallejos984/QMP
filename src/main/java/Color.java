public class Color {
  private int red;
  private int green;
  private int blue;

  Color(int red, int green, int blue){
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
  }
  int getRed(){return red;}
  int getGreen(){return green;}
  int getBlue(){return blue;}


  public void setRed(int red) {
    this.red = red;
  }

  public void setGreen(int green) {
    this.green = green;
  }

  public void setBlue(int blue) {
    this.blue = blue;
  }
}
