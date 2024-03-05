package ITALOJA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProdutoComTamanhoTeste {

    @Test
    public void testConstrutor() {
        ProdutoComTamanho produto = new ProdutoComTamanho("Camiseta", "M", 25.0);
        assertNotNull(produto);
        assertEquals("Camiseta", produto.getNome());
        assertEquals("M", produto.getTamanho());
        assertEquals(25.0, produto.getPreco(), 0.001);
    }

    @Test
    public void testSetNome() {
        ProdutoComTamanho produto = new ProdutoComTamanho("Camiseta", "M", 25.0);
        produto.setNome("Calça");
        assertEquals("Calça", produto.getNome());
    }

    @Test
    public void testSetTamanho() {
        ProdutoComTamanho produto = new ProdutoComTamanho("Camiseta", "M", 25.0);
        produto.setTamanho("G");
        assertEquals("G", produto.getTamanho());
    }

    @Test
    public void testSetPreco() {
        ProdutoComTamanho produto = new ProdutoComTamanho("Camiseta", "M", 25.0);
        produto.setPreco(30.0);
        assertEquals(30.0, produto.getPreco(), 0.001);
    }
}






