public class ExemploForArray {
    public static void main(String[] args) {
        String Alunos[] = {"Leonardo", "Ricardo"};
        int x =0 ;
        /* VAMOS AUTOMATIZAR ESSE FOR COM ARRAY
        for(x = 0; x < Alunos.length ;x++){
            System.out.println("O aluno no indice x=" + x + " é " + Alunos[x]);
        
        } */






        // EXEMPLO DE FOR AUTOMATIZADO
        /*
        for(String Aluno : Alunos){
            System.out.println("O aluno no indice x=" + Aluno);
        }
         */




         // EXEMPLO DE WHILE
         /*
         while( x < 10 ){
            System.out.println("HELLOUUUUU");
            x = x + x;
         }
         System.out.println("HELLOUUUUU de fora");
 */




 // EXEMPLO DO WHILE

         do{
            System.out.println("Discando");
            x++;
         } while(x<10);
         


    }
    
}
