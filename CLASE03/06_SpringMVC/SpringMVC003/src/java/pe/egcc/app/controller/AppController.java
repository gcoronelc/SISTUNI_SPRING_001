package pe.egcc.app.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

  @RequestMapping(value = "operaciones.htm", method = RequestMethod.POST)
  public ModelAndView operaciones(HttpServletRequest request){
    ModelAndView view = new ModelAndView("operaciones");
    try {
      // Datos
      int n1 = Integer.parseInt(request.getParameter("num1"));
      int n2 = Integer.parseInt(request.getParameter("num2"));
      // Proceso
      int suma = n1 + n2;
      int prod = n1 * n2;
      // Reporte
      view.addObject("n1",n1);
      view.addObject("n2",n2);
      view.addObject("suma",suma);
      view.addObject("prod",prod);
    } catch (Exception e) {
      view.addObject("error", e.getMessage());
    }
    return view;
  }
}
