package exercicioslp.Condicao;

public class SituacaoCandidato {
    private Double[] notas;
    private Double nC, nM;

    public void setter(){
        Integer qtd;
        qtd = Condicao.t.inputInt("Informe a quantidade de notas");
        this.notas = new Double[qtd];
        this.nC = Condicao.t.inputDouble("Informe a nota de corte");
        while(nC < 0 || nC > 10){
            this.nC = Condicao.t.inputDouble("");
        }

        this.nM = Condicao.t.inputDouble("Informe a nota minima para aprovação imediata");

        for(int i = 0; i < qtd; i++){
            Double n = Condicao.t.inputDouble("Informe a "+(i+1)+"º nota ");
            this.notas[i]=n;
        }
    }

    public void verificaSituacao(){
        double soma = 0, media;
        for(Double nota:this.notas){
            soma +=nota;
        }
        media = soma/this.notas.length;

        if(media < nC){Condicao.t.msg("Candidato não passou"); }
        else if(media > nC && media < nM) { Condicao.t.msg("Camdidato na lista de espera"); }
        else if(media >= nM) { Condicao.t.msg("Camdidato Aprovado"); }
    }
}
