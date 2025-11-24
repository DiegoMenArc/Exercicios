package exercicioslp.Ninja;

public class Adivinha {
    private Integer tentativas, limite = 10, erro, escolha;
    private Integer alvo; 

    public void adivinha() {

        this.alvo = (int) (Math.random() * 10) + 1000;
        for (this.tentativas = 0; this.tentativas <= this.limite; this.tentativas++) {
            while (this.escolha != this.alvo) {
                if (this.tentativas == 0) {
                    this.escolha = Ninja.t.inputInt("Adivinhe o número aleatório de 0 a 1000");
                } else if (this.tentativas > 0) {
                    String var = (escolha > alvo ? " menor que o escolhido." : " maior que o escolhido");
                    Ninja.t.msg("Escolha errada, o número aleatório é"+var);
                    this.erro++;
                    this.tentativas++;
                }
            }
            if (escolha == alvo) {
                Ninja.t.msg("Parabéns, você acertou o núemro " + this.alvo + " em" + this.tentativas + " tentativas, cometendo " + this.erro+ " erros.");
            }
            if (tentativas == limite && escolha != this.alvo) {
                Ninja.t.msg("Infelizmente você não conseguiu acertar durante as 10 tentativas, o jogo acabou. O número era: "+ alvo);
            }
        }
    }


}
