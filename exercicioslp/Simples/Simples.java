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
        Integer e = t.inputInt("""
                MENU:
                1. Somador;
                2. Dobro;
                3. Media;
                4. Total;

                0. Sair
                """);
        switch (e) {
            case 1:
                s.setter();
                s.somar();
                menu();
                break;
            case 2:
                d.dobro();
                menu();
                break;
            case 3:
                m.setter();
                m.media();
                menu();
                ;
                break;
            case 4:
                to.calcTotal();
                menu();
                ;
                break;
            default:
                return;
        }
    }
}
