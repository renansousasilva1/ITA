package pizza;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void setUp() {
        carrinho = new Carrinho();
    }

    @Test
    public void testAdicionarPizzaComIngredientes() {
        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Presunto"});
        Pizza pizza2 = new Pizza(new String[]{"Calabresa", "Mussarela", "Cebola"});

        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);

        assertEquals(40.0, carrinho.calcularTotal(), 0.001); // Espera-se que o preço total seja 40.0 para 2 pizzas
    }

    @Test
    public void testAdicionarPizzaSemIngredientes() {
        Pizza pizza = new Pizza(new String[]{});
        carrinho.adicionarPizza(pizza);

        assertEquals(0.0, carrinho.calcularTotal(), 0.001); // Espera-se que o preço total seja 0.0 porque não foi adicionada pizza
    }
}
