package pe.egcc.uni.promedio.model;

public class PromedioModel {

  private int nota1;
  private int nota2;
  private int nota3;
  private int nota4;
  private int menor;
  private int prom;
  private String cond; // Aprobado | Desaprobado

  public PromedioModel() {
  }

  public int getNota1() {
    return nota1;
  }

  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }

  public int getNota2() {
    return nota2;
  }

  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }

  public int getNota3() {
    return nota3;
  }

  public void setNota3(int nota3) {
    this.nota3 = nota3;
  }

  public int getNota4() {
    return nota4;
  }

  public void setNota4(int nota4) {
    this.nota4 = nota4;
  }

  public int getMenor() {
    return menor;
  }

  public void setMenor(int menor) {
    this.menor = menor;
  }

  public int getProm() {
    return prom;
  }

  public void setProm(int prom) {
    this.prom = prom;
  }

  public String getCond() {
    return cond;
  }

  public void setCond(String cond) {
    this.cond = cond;
  }

}
