package exercicioslp.Repeticao;

import exercicioslp.Terminal.Terminal;

public class Repeticao {
    static Terminal t = new Terminal();

    private Contador c;
    private Quadrado q;
    private Soma s;
    private Tabuada ta;

    public void menu() {
        this.c = new Contador();
        this.q = new Quadrado();
        this.s = new Soma();
        this.ta = new Tabuada();

        Integer e = t.inputInt("""
                MENU:
                1. Contador;
                2. Quadrado;
                3. Soma
                4. Tabuada

                0. Sair
                """);
        switch (e) {
            case 1: this.c.contador(); menu(); break;
            case 2: this.q.quad(); menu(); break;
            case 3: this.s.somaG(); menu(); ;break;
            case 4: this.ta.tabuada(); menu(); ;break;
            case 0: return; 
            default: menu(); break;
        }
    }
}
