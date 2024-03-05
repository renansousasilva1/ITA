package ITALOJA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        Produto novoProduto = new Produto(produto.getNome(), produto.getPreco());
        for (int i = 0; i < quantidade; i++) {
            itens.add(novoProduto);
        }
    }


    public void removerItem(Produto produto) {
        Iterator<Produto> iterator = itens.iterator();
        while (iterator.hasNext()) {
            Produto item = iterator.next();
            if (item.getNome().equals(produto.getNome()) && item.getPreco() == produto.getPreco()) {
                iterator.remove();
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }

    public int getQuantidadeDeItens() {
        return itens.size();
    }
}
