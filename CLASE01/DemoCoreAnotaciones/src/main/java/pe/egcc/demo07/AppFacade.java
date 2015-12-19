package pe.egcc.demo07;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AppFacade {
  
  @Inject
  @Resource(name="mateServiceImpl1")
  private MateServiceEspec mateService;
  
  
  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
