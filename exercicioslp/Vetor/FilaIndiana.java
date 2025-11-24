package exercicioslp.Vetor;

import java.util.ArrayList;
import java.util.Collections;

class FilaIndiana {
    ArrayList<Double> alturas;

    public void setFila() {
        int p = Vetor.t.inputInt("Informe o número de pessoas na fila.");

        for (int a = 0; a < p; a++) {
            alturas.add(Vetor.t.inputDouble("Informe o número de pessoas na fila."));
            while (alturas.get(a) <= 0.6 || alturas.get(a) > 2.9) {
                Vetor.t.msg("ALTURA INVÁLIDA. \n Informe a altura da " + (a + 1) + "º pessoa na fila.");
                alturas.set(a, Vetor.t.inputDouble("Informe uma altura válida"));
            }
        }
        Collections.sort(this.alturas);
    }

    public void getFila() {
        for (Double altura : alturas) {
            Vetor.t.prt("Altura : "+altura);
        }
    }
}