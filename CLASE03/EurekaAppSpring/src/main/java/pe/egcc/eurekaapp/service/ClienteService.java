package pe.egcc.eurekaapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.eurekaapp.dao.espec.CrudClienteEspec;
import pe.egcc.eurekaapp.domain.ClienteBean;

/**
 * 
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 * @date 27/12/2015
 *
 */
@Service
public class ClienteService {

  @Autowired
  private CrudClienteEspec crudCliente;
  
  
  public ClienteBean traerCliente(String codigo){
    return crudCliente.traerPorCodigo(codigo);
  }
  
  public List<ClienteBean> traerClientes(String criterio){
    ClienteBean bean = new ClienteBean();
    bean.setPaterno(criterio + "%");
    bean.setMaterno(criterio + "%");
    bean.setNombre(criterio + "%");
    return crudCliente.traerPorNombre(bean);    
  }
  
}
