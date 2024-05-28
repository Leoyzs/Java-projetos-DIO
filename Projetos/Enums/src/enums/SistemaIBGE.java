package enums;


public class SistemaIBGE {
    public static void main (String [] args){
        for(ClassEnum e: ClassEnum.values()){
            
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        
        ClassEnum eb = ClassEnum.PIAUI;
        System.out.println(eb.getNome());
        
    }
    
    
}
