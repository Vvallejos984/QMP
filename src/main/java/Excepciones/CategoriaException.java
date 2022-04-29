package Excepciones;

public class CategoriaException extends Exception{
  public CategoriaException(String nombre,String esperado){
    super(nombre+" no es un(a) "+esperado+" valido/a");
  }
}
