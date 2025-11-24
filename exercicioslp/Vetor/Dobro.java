package exercicioslp.Vetor;

public class Dobro {
    private Integer qtd; 
    private Integer[] nums = new Integer[qtd];
    private Double[] dobros = new Double[qtd];

    public void setters(){
        this.qtd = Vetor.t.inputInt("Informe a quantidade de números");

        for(int i=0; i<=qtd; i++){
            Integer num = Vetor.t.inputInt("Informe o "+i+1+"º número");
            this.nums[i] = num;
            double dobro = num*2;
            this.dobros[i] = dobro;
        }
    }

    public void getter(){
        for(int i=0; i<this.qtd; i++){
            Vetor.t.prt("O dobro de "+this.nums[i]+" é "+this.dobros[i]);
        }
    }
}
