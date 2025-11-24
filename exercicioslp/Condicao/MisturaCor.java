package exercicioslp.Condicao;

public class MisturaCor {

    public void misturaCor(){
        String cor1 = Condicao.t.inputString("Informe a primeira cor");
        String cor2 = Condicao.t.inputString("Informe a primeira cor");
        misturaCor(cor1, cor2);
    }

    private void misturaCor(String cor1, String cor2) {

        if (cor1.equals(cor2)) {
            Condicao.t.msg("A cor resultante é: " + cor1);
        } else if (cor1.equals("Vermelho") && cor2.equals("Azul")) {
            Condicao.t.msg("A cor resultante é: Roxo");
        } else if (cor1.equals("Vermelho") && cor2.equals("Amarelo")) {
            Condicao.t.msg("A cor resultante é: Laranja");
        } else if (cor1.equals("Azul") && cor2.equals("Amarelo")) {
            Condicao.t.msg("A cor resultante é: Verde");
        }
    }    
}
