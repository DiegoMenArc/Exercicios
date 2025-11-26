package exercicioslp.Condicao;

import exercicioslp.Terminal.Terminal;

public class Condicao {
    static Terminal t = new Terminal();

    private diaSemana d; 
    private MisturaCor m; 
    private SituacaoCandidato s; 
    private TotalIngresso i;  

    public void menu(){
        this.d = new diaSemana();
        this.m = new MisturaCor();
        this.s = new SituacaoCandidato();
        this.i =new TotalIngresso();

        Integer e = t.inputInt("MENU:\n1. Dia da Semana\n2. Mistuar Cor\n3. Situação de Candidato (Média)\n4. Calculo de Ingresso\n\n0. Sair");
        switch (e) {
            case 1: this.d.diaDaSemana(); menu(); break;
            case 2: this.m.misturaCor(); menu(); break;
            case 3: this.s.setter(); this.s.verificaSituacao(); menu(); break;
            case 4: this.i.totalIng(); menu(); break;
            case 0: return;
            default: menu(); break;
        }
    }
}
