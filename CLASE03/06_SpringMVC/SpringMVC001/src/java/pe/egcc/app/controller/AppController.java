package pe.egcc.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 */
public class AppController extends AbstractController {

  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
    ModelAndView view = new ModelAndView("index");
    view.addObject("nombre", "Gustavo Coronel");
    return view;
  }

}
