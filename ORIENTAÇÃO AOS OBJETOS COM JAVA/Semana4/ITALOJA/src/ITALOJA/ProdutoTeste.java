package ITALOJA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProdutoTeste {

    @Test
    public void testConstrutor() {
        Produto produto = new Produto("Camiseta", 25.0);
        assertNotNull(produto);
        assertEquals("Camiseta", produto.getNome());
        assertEquals(25.0, produto.getPreco(), 0.001);
    }

    @Test
    public void testSetNome() {
        Produto produto = new Produto("Camiseta", 25.0);
        produto.setNome("Calça");
        assertEquals("Calça", produto.getNome());
    }

    @Test
    public void testSetPreco() {
        Produto produto = new Produto("Camiseta", 25.0);
        produto.setPreco(30.0);
        assertEquals(30.0, produto.getPreco(), 0.001);
    }
}


