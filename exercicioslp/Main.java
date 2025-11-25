package exercicioslp;

import exercicioslp.Condicao.Condicao;
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

    public static void main(String[] args) {
        t = new Terminal();
        s = new Simples();
        r = new Repeticao();
        c = new Condicao();
        v = new Vetor();
        menu();
    }

    public static void menu() {
        Integer e = t.inputInt("""
                MENU:

                1. Simples;
                2. Condição
                3. Repetição;
                4. Vetor
                5. Ninja

                0. Sair
                """);
        switch (e) {
            case 1:
                s.menu();
                menu();
                ;
                break;
            case 2:
                c.menu();
                break;
            case 3:
                r.menu();
                break;
            case 4:
                v.menu();
                break;
            case 0:
                System.exit(0);
            default:
                menu();
                break;
        }
    }
}
