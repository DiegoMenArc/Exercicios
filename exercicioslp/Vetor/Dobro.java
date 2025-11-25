package exercicioslp.Vetor;

public class Dobro {
    private Integer[] nums;
    private Double[] dobros;

    public void setters(){
        Integer qtd;
        qtd = Vetor.t.inputInt("Informe a quantidade de números");
        this.nums = new Integer[qtd];
        this.dobros = new Double[qtd];
        for(int i=0; i<=qtd; i++){
            Integer num = Vetor.t.inputInt("Informe o "+i+1+"º número");
            this.nums[i] = num;
            double dobro = num*2;
            this.dobros[i] = dobro;
        }
    }

    public void getter(){
        for(int i=0; i<this.nums.length; i++){
            Vetor.t.prt("O dobro de "+this.nums[i]+" é "+this.dobros[i]);
        }
    }
}
