package exercicioslp;

import exercicioslp.Condicao.Condicao;
import exercicioslp.Repeticao.Repeticao;
import exercicioslp.Simples.Simples;
import exercicioslp.Terminal.Terminal;
import exercicioslp.Vetor.Vetor;

public class Main {
    static Terminal t = new Terminal();
    static Simples s = new Simples();
    static Repeticao r = new Repeticao();
    static Condicao c = new Condicao();
    static Vetor v = new Vetor();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
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
            case 1: s.menu(); menu(); ;break;
            case 2: c.menu(); break;
            case 3: r.menu(); break;
            case 4: v.menu(); break;
            case 0: System.exit(0);
            default: menu(); break;
        }
    }
}
