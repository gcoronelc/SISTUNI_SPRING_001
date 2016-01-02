package pe.egcc.uni.demo.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.uni.demo.bean.UsuarioBean;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);	
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setUsuario("Gustavo");
		ModelAndView view = new ModelAndView("home", "usuarioBean", usuarioBean);
		return view;
	}
	
	@RequestMapping(value="ingreso.htm", method=RequestMethod.POST)
	public String ingreso(UsuarioBean usuarioBean,Model model){
	  String destino;
	  if(usuarioBean.getUsuario().equals("Gustavo") && usuarioBean.getClave().equals("profesor")){
	    destino = "mainPage";
	  } else {
	    model.addAttribute("error", "Datos incorrectos.");
	    destino = "home";
	  }
	  model.addAttribute("usuarioBean", usuarioBean);
	  return destino;
	}
	
}
