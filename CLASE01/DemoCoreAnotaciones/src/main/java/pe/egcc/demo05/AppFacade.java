package pe.egcc.demo05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFacade {
  
  @Autowired
  private MateService mateService;
  
  
  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
