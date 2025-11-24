package exercicioslp.Simples;

public class Total {
    private Double acaiP = 13.50, acaiM = 15.00, acaiG = 17.5, valorTotal;
    private Double valorP, valorM, valorG;
    private Integer qtdP, qtdM, qtdG;

    public void setter(){
        this.qtdP =  Simples.t.inputInt("Informe a quantidade de açaís pequenos que deseja comprar ");
        this.qtdM =  Simples.t.inputInt("Informe a quantidade de açaís médios que deseja comprar ");
        this.qtdG =  Simples.t.inputInt("Informe a quantidade de açaís grandes que deseja comprar ");
        
        this.valorP = this.acaiP*qtdP;
        this.valorM = this.acaiM*qtdM;
        this.valorG = this.acaiG*qtdG;
    }

    public void calcTotal() {
        this.valorTotal = this.valorP+this.valorM+this.valorG;
        Simples.t.prt("Valor total: R$"+this.valorTotal);
        if(this.qtdP > 0){
            Simples.t.prt("Valor por açaí pequeno: R$"+valorP);
        }
        if(this.qtdM > 0){
            Simples.t.prt("Valor por açaí médio: R$"+valorM);
        }
        if(this.qtdG > 0){
            Simples.t.prt("Valor por açaí grande: R$"+valorG);
        }
    }

}
