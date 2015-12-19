package pe.egcc.demo01;

public class MateService {
  
  private String nombre;
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int sumar(int n1, int n2){
    System.out.println("Hola: " + nombre);
    return (n1+n2);
  }
  
}
