package pe.egcc.demo02;

public class AppFacade {
  
  private MateService mateService;
  private String nombre;
  
  public void setMateService(MateService mateService) {
    this.mateService = mateService;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public int sumar(int n1, int n2) {
    mateService.setNombre(nombre);
    return mateService.sumar(n1, n2);
  }

}
