package interligação;

import impressora.Impressora;
import copiadora.Copiadora;
import digitalizadora.Digitalizadora;

public class EquipamentoMutilFuncional implements Impressora, Digitalizadora, Copiadora{

    @Override
    public void Imprimir() {
      System.out.println("Imprimindo via mutilfuncional");
    }

    @Override
    public void Digitalizar() {
       System.out.println("Digitalizando via mutilfuncional");
    }

    @Override
    public void Copiar() {
      System.out.println("Copiando via mutilfuncional");   
    }
    
}
