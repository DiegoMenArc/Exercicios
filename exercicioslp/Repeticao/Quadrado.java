package exercicioslp.Repeticao;

public class Quadrado {
     public void quad(){
        Integer lado = Repeticao.t.inputInt("Digite o tamanho do lado do quadrado");

        for(int i = 0; i<lado; i++){
            for(int j = 0; j< lado; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
