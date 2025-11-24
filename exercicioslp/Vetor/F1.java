package exercicioslp.Vetor;

public class F1 {
    private Integer mantem, avanco, retro, qtd;
    int[ ] largada = new int[this.qtd], chegada = new int[this.qtd];

    public void f1() {
        qtd = Vetor.t.inputInt("Digite a quantidade de pilotos na corrida");
        
        for(int k = 0; k<this.largada.length; k++){
            largada[k] = Vetor.t.inputInt("Digite a poição de largada do piloto número "+(k+1));
        }
        for(int n = 0; n<this.chegada.length; n++){
            chegada[n] = Vetor.t.inputInt("Digite a poição de chegada do piloto número "+(n+1));
        }

        for(int j=0; j<qtd; j++){
            if(largada[j] == chegada[j]){
                Vetor.t.msg("O piloto"+(j+1)+" terminou em "+chegada[j]+"º lugar. Mantendo sua posição.");
                this.mantem++;
            }else if(chegada[j]>largada[j]){
                Vetor.t.msg("O piloto "+(j+1)+" terminou em "+chegada[j]+"º lugar. Avançando "+(chegada[j]-largada[j])+" posições.");
                this.avanco++;
            }else if(largada[j]>chegada[j]){
                Vetor.t.msg("O piloto "+(j+1)+" terminou em "+chegada[j]+"º lugar. Retrocedendo "+(largada[j]-chegada[j])+" posições.");
                this.retro++;
            }
        }
    }
 
}
