package Estabelecimento;
import impressora.Impressora;
import copiadora.Copiadora;
import digitalizadora.Digitalizadora;
import interligação.EquipamentoMutilFuncional;

public class Loja {
    public static void main (String [] args){
        EquipamentoMutilFuncional Em = new EquipamentoMutilFuncional();
        Impressora impressora = Em;
        Digitalizadora digitalizadora = Em;
        Copiadora Copiadora = Em;
              
        impressora.Imprimir();
        digitalizadora.Digitalizar();
        Copiadora.Copiar();
        
        
    }
}
    