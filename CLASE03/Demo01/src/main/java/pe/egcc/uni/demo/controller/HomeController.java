package pe.egcc.uni.demo.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);		
		return "home";
	}
	
	@RequestMapping(value="ingreso.htm", method=RequestMethod.POST)
	public String ingreso(
	    @RequestParam("usuario") String usuario,
	    @RequestParam("clave") String clave,
	    Model model){
	  String destino;
	  if(usuario.equals("Gustavo") && clave.equals("profesor")){
	    destino = "mainPage";
	  } else {
	    model.addAttribute("error", "Datos incorrectos.");
	    destino = "home";
	  }
	  model.addAttribute("usuario", usuario);
	  return destino;
	}
	
}
