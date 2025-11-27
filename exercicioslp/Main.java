package exercicioslp;

import exercicioslp.Condicao.Condicao;
import exercicioslp.Ninja.Ninja;
import exercicioslp.Repeticao.Repeticao;
import exercicioslp.Simples.Simples;
import exercicioslp.Terminal.Terminal;
import exercicioslp.Vetor.Vetor;

public class Main {
    static Terminal t;
    static Simples s;
    static Repeticao r;
    static Condicao c;
    static Vetor v;
    static Ninja n;
    
    public static void main(String[] args) {
        t = new Terminal();
        s = new Simples();
        r = new Repeticao();
        c = new Condicao();
        v = new Vetor();
        n = new Ninja();

        menu();
    }

    public static void menu() {
        Integer e = t.inputInt(" MENU: \n1. Simples;\n2. Condição\n3. Repetição;\n4. Vetor\n5. Ninja\n\n0. Sair\n");
        switch (e) {
            case 1: s.menu(); menu(); break;
            case 2: c.menu(); menu(); break;
            case 3: r.menu(); menu(); break;
            case 4: v.menu(); menu(); break;
            case 5: n.menu(); menu(); break;
            case 0: System.exit(0);
            default: menu(); break;
        }
    }
}
