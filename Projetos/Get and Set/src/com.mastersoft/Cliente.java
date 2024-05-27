
public class Cliente {
public static void main(String[] args) {
    Exame exame = new Exame();
    int i=0;
    exame.SetTiposExames("Odontologico");
    exame.getTiposExames();

    System.out.println("O exame escolhido foi: " + exame.getTiposExames());
  
}    


}
