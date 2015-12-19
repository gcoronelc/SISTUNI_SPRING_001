package pe.egcc.demo03;

public class AppFacade extends Algo {

  private MateService mateService;
  private String nombre;
  private String apellido;

  public AppFacade(MateService mateService, String nombre, String apellido) {
    this.mateService = mateService;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public int sumar(int n1, int n2) {
    mateService.setNombre(nombre + " - " + apellido);
    return mateService.sumar(n1, n2);
  }

}
