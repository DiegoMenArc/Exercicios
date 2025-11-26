package exercicioslp.Simples;

import exercicioslp.Terminal.Terminal;

public class Simples {
    static Terminal t = new Terminal();

    private Somador s;
    private Dobro d;
    private Media m;
    private Total to;

    public void menu() {
        this.s = new Somador();
        this.d = new Dobro();
        this.m = new Media();
        this.to = new Total();
        Integer e = t.inputInt("MENU:\n\n1. Somador;\n2. Dobro;\n3. Media;\n4. Total;\n\n0. Sair");
        switch (e) {
            case 1: s.setter(); s.somar(); menu(); break;
            case 2: d.dobro(); menu(); break;
            case 3: m.setter(); m.media(); menu(); break;
            case 4: to.setter(); to.calcTotal(); menu(); break;
            default: return;
        }
    }
}
