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

        Integer e = t.inputInt("""
                MENU:
                1. Dia da Semana
                2. Mistuar Cor
                3. Situação de Candidato (Média)
                4. Calculo de Ingresso

                0. Sair
                """);
        switch (e) {
            case 1: this.d.diaDaSemana(); menu(); break;
            case 2: this.m.misturaCor(); menu(); break;
            case 3: this.s.setter(); this.s.verificaSituacao(); menu(); menu(); break;
            case 4: this.i.totalIng(); menu(); break;
            case 0: return;
            default: menu(); break;
        }
    }
}
