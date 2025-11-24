package exercicioslp.Condicao;

public class TotalIngresso {
    private Double inteira = 28.50, meia = this.inteira / 2;

    public void totalIng() {
        Integer qtdM = Condicao.t.inputInt("Informe a quantidade de ingressos meia que deseja comprar - (R$"+this.meia+")");
        Integer qtdI = Condicao.t.inputInt("Informe a quantidade de ingressos inteiros que deseja comprar - (R$"+this.inteira+")");
        Double tM = this.meia+qtdM;
        Double tI = this.inteira+qtdI;

        Double total = tM+tI;
        Condicao.t.msg("Total: R$"+total);
    }
}
