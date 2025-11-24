package exercicioslp.Simples;

public class Somador {
    private Integer qtd = 0;
    private Integer[] nums = new Integer[qtd];
    private Integer soma;

    public void setter(){
        this.qtd = Simples.t.inputInt("Informe a quantidade de números que quer somar");
        for(int i = 0; i<= qtd; i++){
            this.nums[i] = Simples.t.inputInt("informe o "+(i+1)+" número");
        }
    }

    public void somar() {
        for(Integer n : this.nums){
            this.soma+= n;
        }
        Simples.t.prt("Soma: "+this.soma);
    }
}
