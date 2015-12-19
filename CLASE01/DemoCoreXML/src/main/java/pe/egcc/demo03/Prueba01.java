package pe.egcc.demo03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Acceso al contexto
    String contexto = "/pe/egcc/demo03/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(contexto);
    
    // Acceso al bean
    AppFacade appFacade;
    appFacade = beanFactory.getBean("appFacade",AppFacade.class);
    
    AppFacade appFacade2;
    appFacade2 = beanFactory.getBean("appFacade2",AppFacade.class);
    
    // Prueba del bean
    System.out.println("Suma: " + appFacade.sumar(16, 14));
    System.out.println("Suma: " + appFacade2.sumar(16, 14));
    
  }
  
}
