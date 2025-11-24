package exercicioslp.Repeticao;

public class Contador {

    private Integer inicio, fim;

    public void contador() {
        this.inicio = Repeticao.t.inputInt("Digite um número para começar a contagem");
        this. fim = Repeticao.t.inputInt("Digite um número para terminar a contagem");


        if (this.fim > this.inicio) {
            for (int k = this.inicio; k <= this.fim; k++) {
                System.out.println(k);
            }
        } else if (this.fim < this.inicio) {
            for (int j = this.fim; j > this.inicio; j--) {
                System.out.println(j);
            }
        }
    }
}
