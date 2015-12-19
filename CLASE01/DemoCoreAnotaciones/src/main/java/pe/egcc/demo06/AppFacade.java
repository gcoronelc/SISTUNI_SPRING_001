package pe.egcc.demo06;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AppFacade {
  
  @Inject
  private MateService mateService;
  
  
  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
