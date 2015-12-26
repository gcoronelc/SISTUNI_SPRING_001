package pe.egcc.uni.app.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.uni.app.model.VentaModel;
import pe.egcc.uni.app.service.VentaService;

@Controller
@Scope("session")
public class HomeController {

  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
  
  @Autowired
  private VentaService ventaService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(Locale locale, Model model) {
    logger.info("Welcome home! The client locale is {}.", locale);

    return "home";
  }

  @RequestMapping(value = "inicio.htm", method = RequestMethod.POST)
  public String name(@RequestParam("nombre") String nombre, HttpSession session) {
    session.setAttribute("nombre", nombre);
    return "control";
  }

  @RequestMapping(value = "registrarVenta.htm", method = RequestMethod.GET)
  public String registrarVenta() {
    return "registrarVenta";
  }

  @RequestMapping(value = "registrarVenta.htm", method = RequestMethod.POST)
  public ModelAndView registrarVenta(@ModelAttribute VentaModel ventaModel, HttpSession session) {
    ventaService.agregarVenta(ventaModel);
    ModelAndView view = new ModelAndView("registrarVenta");
    view.addObject("mensaje", "Proceso ok.");
    return view;
  }

  @RequestMapping(value = "pagarVenta.htm", method = RequestMethod.GET)
  public ModelAndView pagarVenta(HttpSession session) {
    ModelAndView view = new ModelAndView("listado");
    view.addObject("listado", ventaService.getLista());
    return view;
  }

}
