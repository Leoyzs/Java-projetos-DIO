import java.text.NumberFormat;
import java.text.ParseException;

public class sla2 {

public static void main(String []args){

  //  AULA DE COMO REALIZAR EXCESSOES

   
    Number valor;
    try {
        valor = NumberFormat.getInstance().parse("a1.75");
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}}