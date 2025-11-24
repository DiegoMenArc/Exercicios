package exercicioslp.Repeticao;

public class Soma {
    
    public void somaG(){
        Integer num1 = Repeticao.t.inputInt("Digite um número para começar");
        Integer num2 = Repeticao.t.inputInt("Digite um número para começar");
        int soma=0;
        for(int p = num1; p <= num2; p++){
           System.out.print((p == num2) ? (soma+= p)+"." : (soma+= p)+", ");
        }
    }
   
}