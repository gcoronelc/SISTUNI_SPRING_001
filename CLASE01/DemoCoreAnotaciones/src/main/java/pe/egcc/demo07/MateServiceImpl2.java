package pe.egcc.demo07;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class MateServiceImpl2 implements MateServiceEspec{

  public int sumar(int n1, int n2) {
    return (n1 + n2) * (n1 - n2);
  }

}
