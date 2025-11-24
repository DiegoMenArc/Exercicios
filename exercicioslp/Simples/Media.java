package exercicioslp.Simples;

public class Media {
    Double valor1, valor2, valor3, valor4, media;

    public void setter(){
        this.valor1 = Simples.t.inputDouble("Informe o 1º valor");
        this.valor2 = Simples.t.inputDouble("Informe o 2º valor");
        this.valor3 = Simples.t.inputDouble("Informe o 3º valor");
        this.valor4 = Simples.t.inputDouble("Informe o 4º valor");
    }

    public void media() {
        this.media = (this.valor1 + this.valor2 + this.valor3 + this.valor4)/4;
        Simples.t.msg("Média: "+media);
    }
}
