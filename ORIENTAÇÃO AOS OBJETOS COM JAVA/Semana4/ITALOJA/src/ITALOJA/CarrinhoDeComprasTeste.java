package ITALOJA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CarrinhoDeComprasTeste {

	@Test
	public void testAdicionarItem() {
	    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	    Produto produto = new Produto("Camiseta", 25.0);
	    carrinho.adicionarItem(produto, 2);
	    assertEquals(2, carrinho.getQuantidadeDeItens()); // Alterado para 2
	}


	@Test
	public void testRemoverItem() {
	    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	    Produto produto = new Produto("Camiseta", 25.0);
	    carrinho.adicionarItem(produto, 2);
	    
	    System.out.println("Itens antes da remoção: " + carrinho.getQuantidadeDeItens());
	    
	    carrinho.removerItem(produto);
	    
	    System.out.println("Itens após a remoção: " + carrinho.getQuantidadeDeItens());
	    
	    assertEquals(0, carrinho.getQuantidadeDeItens());
	}


    @Test
    public void testCalcularTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto1 = new Produto("Camiseta", 25.0);
        Produto produto2 = new Produto("Calça", 50.0);
        carrinho.adicionarItem(produto1, 2);
        carrinho.adicionarItem(produto2, 1);
        assertEquals(100.0, carrinho.calcularTotal(), 0.001);
    }
}
