package exercicioslp.Vetor;

public class Ordenador {

    private Integer[] nums;

    public void setter(){
        Integer qtd;
        qtd = Vetor.t.inputInt("Informe a quantidade de números");
        this.nums = new Integer[qtd];
        for(int i = 0; i< this.nums.length-1; i++){
            this.nums[i] = Vetor.t.inputInt("Informe o "+(i+1)+"º número");
        }
    }


    public void verificaOrdem() {
        boolean cres = true, decr = true;
        
        for (int p = 0; p < this.nums.length; p++) {
            if (this.nums[p] < nums[p + 1]) {
                decr = false;
            } else if (this.nums[p] > this.nums[p + 1]) {
                cres = false;
            }
        }
        
        Vetor.t.msg("Organização dos elementos:");
        if (cres){
            Vetor.t.msg("Ordem crescente");
        } else if (decr){
            Vetor.t.msg("Ordem decrescente");
        } else{
            Vetor.t.msg("Desordenados");
        }
    }
}
