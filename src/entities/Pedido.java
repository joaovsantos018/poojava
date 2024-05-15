package entities;

public class Pedido {
    private static final double precoKit = 15.0;
    private Estoque estoque;
    private int quantidade;

    public Pedido(Estoque estoque, int quantidade) {
        this.estoque = estoque;
        this.quantidade = quantidade;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return precoKit;
    }

    public double getSubtotal() {
        return precoKit * quantidade;
    }
}
