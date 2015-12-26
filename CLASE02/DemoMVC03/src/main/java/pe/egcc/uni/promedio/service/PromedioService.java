package pe.egcc.uni.promedio.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import pe.egcc.uni.promedio.model.PromedioModel;

@Service
public class PromedioService {
  
  private static int UMBRAL = 14;

  public void procesar(PromedioModel model){
    // Variables
    int menor, prom;
    String cond;
    // Proceso
    menor = obtenerMenor(model.getNota1(), model.getNota2(), model.getNota3(), model.getNota4());
    prom = obtenerPromedio(model.getNota1(), model.getNota2(), model.getNota3(), model.getNota4());
    cond = "Desaprobado";
    if(prom >= UMBRAL){
      cond = "Aprobado";
    }
    // Salida
    model.setMenor(menor);
    model.setProm(prom);
    model.setCond(cond);
  }

  private int obtenerPromedio(int ...notas) {
    int menor = obtenerMenor(notas);
    int suma = Arrays.stream(notas).sum();
    int prom = (suma - menor) / 3;
    return prom;
  }

  private int obtenerMenor(int ... notas) {
    Arrays.sort(notas);
    int menor = notas[0];
    return menor;
  }
  
}
