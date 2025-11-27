package exercicioslp.Ninja;

public class Adivinha {
    private Integer tentativas, limite = 10, escolha;
    private Integer alvo;

    public void jogar() {
        this.alvo = (int) (Math.random() * 1001);

        for (this.tentativas = 1; this.tentativas <= this.limite; this.tentativas++) {
            this.escolha = Ninja.t.inputInt("Adivinhe o número aleatório de 0 a 1000");

            if (this.escolha == this.alvo) {
                Ninja.t.msg("Parabéns! Você acertou, o número secreto era " + this.alvo +
                        "\nVocê acertou em " + this.tentativas + " tentativas.");
                break;
            } else {
                if (this.escolha > this.alvo) {
                    Ninja.t.msg("O número aleatório é menor");
                } else {
                    Ninja.t.msg("O número aleatório é maior");
                }
            }

            if (this.tentativas == this.limite) {
                Ninja.t.msg("Infelizmente você não conseguiu acertar durante as " + this.limite +
                        " tentativas, o jogo acabou. O número era: " + this.alvo);
            }
        }
    }

}
