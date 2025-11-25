package exercicioslp.Vetor;

public class F1 {
    private Integer mantem, avanco, retro;
    int[ ] largada, chegada;

    public void f1() {
        Integer qtd;
        qtd = Vetor.t.inputInt("Digite a quantidade de pilotos na corrida");
        this.largada = new int[qtd];
        this.chegada = new int[qtd];

        for(int k = 0; k<this.largada.length; k++){
            this.largada[k] = Vetor.t.inputInt("Digite a poição de largada do piloto número "+(k+1));
        }
        for(int n = 0; n<this.chegada.length; n++){
            this.chegada[n] = Vetor.t.inputInt("Digite a poição de chegada do piloto número "+(n+1));
        }

        for(int j=0; j<qtd; j++){
            if(this.largada[j] == this.chegada[j]){
                Vetor.t.msg("O piloto"+(j+1)+" terminou em "+chegada[j]+"º lugar. Mantendo sua posição.");
                this.mantem++;
            }else if(this.chegada[j]>this.largada[j]){
                Vetor.t.msg("O piloto "+(j+1)+" terminou em "+this.chegada[j]+"º lugar. Avançando "+(this.chegada[j]-this.largada[j])+" posições.");
                this.avanco++;
            }else if(this.largada[j]>this.chegada[j]){
                Vetor.t.msg("O piloto "+(j+1)+" terminou em "+this.chegada[j]+"º lugar. Retrocedendo "+(this.largada[j]-this.chegada[j])+" posições.");
                this.retro++;
            }
        }
    }
 
}
