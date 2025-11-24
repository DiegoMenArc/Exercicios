package exercicioslp.Ninja;

import java.util.ArrayList;

public class Mercado {
    private ArrayList<Produto> produtos = new ArrayList<>();
    Double total;

    public void menuMercado(){
        Integer e = Ninja.t.inputInt("""
                MENU: 
                1. Adicionar produto 
                2. Exibir Subtotal; 
                3. Finalizar Compra; 
                
                0. Sair 
                """);
        switch (e) {
            case 1: this.addProd(); menuMercado(); break;
            case 2: this.subTotal(); menuMercado(); break;
            case 3: this.finalizar(); menuMercado(); break;
            case 0: return;
            default: menuMercado(); break;
        }
    }

    private void addProd(){
        String n = Ninja.t.inputString("Informe o nome do produto");
        Double p = Ninja.t.inputDouble("Informe o valor da unidade de "+n);
        Integer i = Ninja.t.inputInt("Informe a quantidade desejada do produto");
        
        this.produtos.add(new Produto(n, p, i));
    }

    private void subTotal(){
        double subtotal = 0;
        for(Produto p : this.produtos){
            subtotal += p.getPreco() * p.getQtd();
        }

        Ninja.t.prt(null);
        Ninja.t.prt("Subtotal: "+subtotal);

        for(Produto p : this.produtos){
            Double total = p.getPreco() * p.getQtd();
            Ninja.t.prt("SubTotal: "+total);
            Ninja.t.prt("Produto: "+p.getNome()+"| Valor:  "+p.getPreco()+" | Quantidade: "+p.getQtd());
        }
    }

    private void finalizar(){
        for(Produto p : this.produtos){
            this.total += p.getPreco() * p.getQtd();
        }

        Ninja.t.msg("Compra no valor de: R$"+this.total+" finalizada");
        this.produtos.removeAll(produtos);
        this.total = 0.0;
    }
}

class Produto{
    private String nome;
    private Double preco;
    private Integer qtd;

    public Produto(String n, Double p, Integer q){
        this.nome = n;
        this.preco = p;
        this.qtd = q;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getPreco(){
        return this.preco;
    }

    public Integer getQtd(){
        return this.qtd;
    }
}
