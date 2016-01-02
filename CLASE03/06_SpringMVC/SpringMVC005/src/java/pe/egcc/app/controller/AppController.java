package pe.egcc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.egcc.app.model.ProductoModel;

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

  @RequestMapping(value = "producto.htm", method = RequestMethod.POST)
  public ModelAndView producto(@ModelAttribute("productoModel") ProductoModel productoModel){
    ModelAndView view = new ModelAndView("producto");
    view.addObject("productoModel", productoModel);
    return view;
  }
}
