package enums;

public enum ClassEnum {
 SAO_PAULO ("SP", "SAO PAULO"),
 RIO_JANEIRO ("RJ", "RIO DE JANEIRO"),
 PIAUI ("PI", "PIAUÍ"),
 MARANHAO ("MA", "MARANHAO"),
 CEARA ("CE", "CEARA");
 
 private String nome;
 private String sigla;
 
 private ClassEnum(String sigla, String nome){
     this.sigla = sigla;
     this.nome = nome;
 } 
 
 public String getSigla(){
     return sigla;
 }
 public String getNome(){
     return nome;
 }
 public String getNomeMaisculo(){
     return nome.toUpperCase();
 }
}
