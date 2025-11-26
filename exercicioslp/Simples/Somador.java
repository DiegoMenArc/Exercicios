package exercicioslp.Simples;

public class Somador {
    private Integer[] nums;

    public void setter(){
        Integer qtd;
        qtd = Simples.t.inputInt("Informe a quantidade de números que quer somar");
        this.nums = new Integer[qtd];
        for(int i = 0; i< this.nums.length; i++){
            this.nums[i] = Simples.t.inputInt("informe o "+(i+1)+" número");
        }
    }

    public void somar() {
        Integer soma = 0;
        for(Integer n : this.nums){
            soma += n;
        }
        Simples.t.msg("Soma: "+soma);
    }
}
