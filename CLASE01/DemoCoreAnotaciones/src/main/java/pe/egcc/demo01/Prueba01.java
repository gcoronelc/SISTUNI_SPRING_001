package pe.egcc.demo01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Acceso al contexto
    String contexto = "/pe/egcc/demo01/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(contexto);
    
    // Acceso al bean
    MateService mateService;
    mateService = (MateService) beanFactory.getBean("panchito");
    mateService.setNombre("Gustavo Coronel");
    
    // Otra tecnica de acceso al bean
    MateService mateService2;
    mateService2 = beanFactory.getBean("panchito",MateService.class);
    
    // Otra tecnica de acceso al bean
    MateService mateService3;
    mateService3 = beanFactory.getBean(MateService.class);
    
    // Prueba del bean
    System.out.println("Suma: " + mateService.sumar(16, 14));
    System.out.println("Suma2: " + mateService2.sumar(15, 10));
    System.out.println("Suma3: " + mateService3.sumar(8, 7));
    
  }
  
}
