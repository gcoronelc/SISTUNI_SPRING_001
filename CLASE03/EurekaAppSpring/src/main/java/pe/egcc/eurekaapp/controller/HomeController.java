package pe.egcc.eurekaapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.egcc.eurekaapp.domain.ClienteBean;
import pe.egcc.eurekaapp.service.ClienteService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="traerCliente.htm", method=RequestMethod.GET)
	public String traerCliente(@RequestParam("codigo") String codigo, Model model){
	  ClienteBean clienteBean =clienteService.traerCliente(codigo);
	  model.addAttribute("bean", clienteBean);
	  return "conCliente";
	}
	
	@RequestMapping(value="traerClientes.htm", method=RequestMethod.GET)
  public String traerClientes(@RequestParam("criterio") String criterio, Model model){
    List<ClienteBean> listado =clienteService.traerClientes(criterio);
    model.addAttribute("listado", listado);
    return "conClientes";
  }
	
}
