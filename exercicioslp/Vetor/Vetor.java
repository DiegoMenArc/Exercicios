package exercicioslp.Vetor;

import exercicioslp.Terminal.Terminal;

public class Vetor {
    static Terminal t = new Terminal();

    private static Dobro d = new Dobro();
    private static Ordenador o = new Ordenador();
    private static FilaIndiana fl = new FilaIndiana();
    private static F1 f1 = new F1();

    public void menu(){
        Integer e = t.inputInt("""
                MENU:
                1. Dobrador
                2. Ordeador
                3. Fórmula 1
                4. Fila indiana

                0. Sair
                """);
        switch (e) {
            case 1: d.setters(); d.getter(); menu(); ;break;
            case 2: o.setter(); o.verificaOrdem(); menu(); break;
            case 3: f1.f1(); menu(); break;
            case 4: fl.setFila(); fl.getFila(); menu(); break;
            case 0: return;
            default: menu();
        }
    }
}
