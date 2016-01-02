package pe.egcc.eurekaapp.dao.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import pe.egcc.eurekaapp.dao.espec.CrudClienteEspec;
import pe.egcc.eurekaapp.domain.ClienteBean;

/**
 * 
 * @author Eric Gustavo Coronel Castillo
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 * @date   27/12/2015
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@Repository
public class CrudClienteImpl extends AbstractDao implements CrudClienteEspec{

  @Override
  public ClienteBean traerPorCodigo(String codigo) {
    ClienteBean bean = null;
    String sql = "select "
        + "chr_cliecodigo     codigo, "
        + "vch_cliepaterno    paterno, "
        + "vch_cliematerno    materno, "
        + "vch_clienombre     nombre, "
        + "chr_cliedni        dni, "
        + "vch_clieciudad     ciudad, "
        + "vch_cliedireccion  direccion, "
        + "vch_clietelefono   telefono, "
        + "vch_clieemail      email "
        + "from cliente "
        + "where chr_cliecodigo = ? ";
    Object[] args = {codigo};
    try{
      bean = jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper(ClienteBean.class));
    } catch(EmptyResultDataAccessException e){
      bean = null;
    }
    return bean;
  }

  
  @Override
  public List<ClienteBean> traerPorNombre(ClienteBean bean) {
    List<ClienteBean> lista = null;
    String sql = "select "
        + "chr_cliecodigo     codigo, "
        + "vch_cliepaterno    paterno, "
        + "vch_cliematerno    materno, "
        + "vch_clienombre     nombre, "
        + "chr_cliedni        dni, "
        + "vch_clieciudad     ciudad, "
        + "vch_cliedireccion  direccion, "
        + "vch_clietelefono   telefono, "
        + "vch_clieemail      email "
        + "from cliente "
        + "where vch_cliepaterno like ? "
        + "or vch_cliematerno like ? "
        + "or vch_clienombre like ?";
    Object[] args = {bean.getPaterno(), bean.getMaterno(), bean.getNombre()};
    lista = jdbcTemplate.query(sql, args, new BeanPropertyRowMapper(ClienteBean.class));
    return lista;
  }

  @Override
  public void insertar(ClienteBean bean) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void actualizar(ClienteBean bean) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void eliminar(String codigo) {
    // TODO Auto-generated method stub
    
  }

}


