package pe.egcc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 */
@Controller
public class AppController {

  @RequestMapping(value = "index.htm")
  public String index(Model model) {
    model.addAttribute("nombre", "Gustavo Coronel");
    return "index";
  }

}
