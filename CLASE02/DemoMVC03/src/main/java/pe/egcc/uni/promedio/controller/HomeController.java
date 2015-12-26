package pe.egcc.uni.promedio.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.uni.promedio.model.PromedioModel;
import pe.egcc.uni.promedio.service.PromedioService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PromedioService promedioService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {	
		return "home";
	}
	
	
	@RequestMapping(value="promedio.htm", method=RequestMethod.POST)
	public ModelAndView procesar(@ModelAttribute PromedioModel promedioModel){
	  promedioService.procesar(promedioModel);
	  ModelAndView view = new ModelAndView("resultado");
	  view.addObject("promedioModel", promedioModel);
	  return view;
	}
	
}
