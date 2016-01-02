package pe.egcc.eurekaapp.dao.impl;

import java.util.List;

import pe.egcc.eurekaapp.dao.espec.CrudEmpleadoEspec;
import pe.egcc.eurekaapp.domain.EmpleadoBean;

/**
 * 
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 * @date   27/12/2015
 *
 */

public class CrudEmpleadoImpl extends AbstractDao implements CrudEmpleadoEspec {

  @Override
  public EmpleadoBean traerPorCodigo(String codigo) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<EmpleadoBean> traerPorNombre(EmpleadoBean bean) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void insertar(EmpleadoBean bean) {
    // TODO Auto-generated method stub

  }

  @Override
  public void actualizar(EmpleadoBean bean) {
    // TODO Auto-generated method stub

  }

  @Override
  public void eliminar(String codigo) {
    // TODO Auto-generated method stub

  }

  @Override
  public EmpleadoBean validar(String usuario, String clave) {
    // TODO Auto-generated method stub
    return null;
  }

}


