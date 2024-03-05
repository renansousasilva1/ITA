package pizza;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Pizza> pizzas;

    public Carrinho() {
        pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        if (pizza.getIngredientes().length == 0) {
            System.out.println("Não é possível adicionar uma pizza sem ingredientes.");
        } else {
            pizzas.add(pizza);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}
