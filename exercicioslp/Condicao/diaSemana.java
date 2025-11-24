package exercicioslp.Condicao;

public class diaSemana {
    String[] dias = {
        "Domingo",
        "Segunda-feira",
        "Terça-feira",
        "Quarta-feira",
        "Quinta-feira",
        "Sexta-feira",
        "Sábado"
    };
       
    public void diaDaSemana() {
        Integer d = Condicao.t.inputInt("Informe o número do dia da semana");
        while (d < 1 || d > 7) {
            diaDaSemana();
        }
        for(String dia : this.dias){
            if(d.equals(dia)){
                Condicao.t.msg("dia da semana: "+d);
            }
        }
    }
}
