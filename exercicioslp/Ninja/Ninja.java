package exercicioslp.Ninja;

import exercicioslp.Terminal.Terminal;

public class Ninja {
    static Terminal t = new Terminal();

    private Adivinha a;
    private Gerenciador g;
    private Mercado m;

    public void menu(){
        this.a = new Adivinha();
        this.g = new Gerenciador();
        this.m = new Mercado();

        Integer e = t.inputInt("MENU:\n1. Jogo do adivinha\n2. Gerenciador\n3. Mercado\n\n0. Sair");
        switch (e) {
            case 1: this.a.adivinha(); menu(); break;
            case 2: this.g.menu(); menu(); break;
            case 3: this.m.menuMercado(); menu(); break;
            case 0: return;
            default: menu(); break;
        }
    }
}

