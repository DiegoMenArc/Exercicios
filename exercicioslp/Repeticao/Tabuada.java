package exercicioslp.Repeticao;

public class Tabuada {

    public void tabuada() {
        Integer num = Repeticao.t.inputInt("Digite um número para fazer a tabuada");
        for (int i = 0; i <= 10; i++) {
            Repeticao.t.prt(num + "x" + i + " = " + (num * i));
        }
        Repeticao.t.msg("Verifique o terminal");
    }
}
