package pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import org.junit.Before;
import java.util.HashMap;

class PizzaTest {
    @Before
    public void setUp() {
        Pizza.limparIngredientesUtilizados();
    }

    @Test
    public void testPrecoComIngredientes() {
        String[] ingredientes = {"Queijo", "Presunto"}; // Adicionando 2 ingredientes
        Pizza pizza = new Pizza(ingredientes);
        assertEquals(20.0, pizza.getPreco(), 0.001); // Espera-se que o preço seja 20.0 para 2 ingredientes
    }

    @Test
    public void testPrecoSemIngredientes() {
        Pizza pizza = new Pizza(new String[]{});
        assertEquals(15.0, pizza.getPreco(), 0.001); // Espera-se que o preço seja 15.0 para nenhuma ingrediente
    }

    @Test
    public void testIngredientesUtilizados() {
        Pizza.limparIngredientesUtilizados(); // Limpar ingredientes utilizados antes de cada teste
        String[] ingredientes = {"Calabresa", "Mussarela", "Cebola"};
        Pizza pizza = new Pizza(ingredientes);
        HashMap<String, Integer> ingredientesUtilizados = pizza.getIngredientesUtilizados();
        assertEquals(3, ingredientesUtilizados.size()); // Espera-se que a quantidade de ingredientes seja 3
        assertEquals(1, (int) ingredientesUtilizados.get("Calabresa")); // Espera-se que a quantidade de calabresa seja 1
        assertEquals(1, (int) ingredientesUtilizados.get("Mussarela")); // Espera-se que a quantidade de mussarela seja 1
        assertEquals(1, (int) ingredientesUtilizados.get("Cebola")); // Espera-se que a quantidade de cebola seja 1
    }
}
