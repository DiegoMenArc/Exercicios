package exercicioslp.Vetor;

public class Ordenador {
    private Integer qtd;
    private Integer[] nums = new Integer[qtd];

    public void setter(){
        this.qtd = Vetor.t.inputInt("Informe a quantidade de números");
        for(int i = 0; i<= qtd; i++){
            this.nums[i] = Vetor.t.inputInt("Informe o"+(i+1)+"número");
        }
    }


    public void verificaOrdem() {
        boolean cres = true, decr = true;
        
        for (int p = 0; p < qtd-1 ; p++) {
            if (nums[p] < nums[p + 1]) {
                decr = false;
            } else if (nums[p] > nums[p + 1]) {
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
