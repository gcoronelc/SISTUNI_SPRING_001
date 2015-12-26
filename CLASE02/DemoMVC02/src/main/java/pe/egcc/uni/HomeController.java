package pe.egcc.uni;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	
	@RequestMapping(value="promedio.htm", method=RequestMethod.POST)
	public ModelAndView procesar(
	    @RequestParam("n1") int n1,
	    @RequestParam("n2") int n2,
	    @RequestParam("n3") int n3,
	    @RequestParam("n4") int n4){
	  
	  // Proceso
	  int pr;
	  pr = (n1 + n2 + n3 + n4) / 4;
	  // Salida
	  ModelAndView view = new ModelAndView("resultado");
	  view.addObject("n1", n1);
	  view.addObject("n2", n2);
	  view.addObject("n3", n3);
	  view.addObject("n4", n4);
	  view.addObject("pr", pr);
	  return view;
	}
	
	
}
