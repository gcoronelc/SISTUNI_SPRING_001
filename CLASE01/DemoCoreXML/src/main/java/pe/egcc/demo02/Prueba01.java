package pe.egcc.demo02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Acceso al contexto
    String contexto = "/pe/egcc/demo02/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(contexto);
    
    // Acceso al bean
    AppFacade appFacade;
    appFacade = beanFactory.getBean(AppFacade.class);
    
    // Prueba del bean
    System.out.println("Suma: " + appFacade.sumar(16, 14));
    
  }
  
}
