package pe.egcc.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFacade {
  
  private MateService mateService;
  
  @Autowired
  public void setMateService(MateService mateService) {
    this.mateService = mateService;
  }
  
  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
