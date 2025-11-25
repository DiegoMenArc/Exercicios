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
        for(int i = 0; i<this.dias.length; i++){
            if(d == i+1){
                Condicao.t.msg("dia da semana: "+d);
            }else{

            }
        }
    }
}
