package pe.egcc.uni.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pe.egcc.uni.app.model.VentaModel;

@Service
@Scope("prototype")
public class VentaService {

  private static final Logger logger = LoggerFactory.getLogger(VentaService.class);

  private List<VentaModel> lista;

  @PostConstruct
  private void initBean() {
    lista = new ArrayList<VentaModel>();
  }

  public void agregarVenta(VentaModel ventaModel) {
    logger.info("EGCC: Inicio de registro.");
    double importe;
    importe = ventaModel.getPrecio() * ventaModel.getCant();
    ventaModel.setImporte(importe);
    lista.add(ventaModel);
    logger.info("EGCC: Registro ok.");
  }

  public List<VentaModel> getLista() {
    return lista;
  }

}
