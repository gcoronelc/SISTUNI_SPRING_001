package pe.egcc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 */
@Controller
public class AppController{

  @RequestMapping(value = "index.htm")
  public String index(){
    return "index";
  }

  @RequestMapping(value = "promedio.htm", method = RequestMethod.POST)
  public ModelAndView operaciones(
     @RequestParam("nota1") int nota1,
     @RequestParam("nota2") int nota2,
     @RequestParam("nota3") int nota3 ){
    ModelAndView view = new ModelAndView("promedio");
    try {
      // Proceso
      int prom = (nota1 + nota2 + nota3) / 3;
      // Reporte
      view.addObject("nota1",nota1);
      view.addObject("nota2",nota2);
      view.addObject("nota3",nota3);
      view.addObject("prom",prom);
    } catch (Exception e) {
      view.addObject("error", e.getMessage());
    }
    return view;
  }
}
