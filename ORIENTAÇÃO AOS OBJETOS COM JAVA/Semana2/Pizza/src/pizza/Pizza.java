package pizza;

import java.util.HashMap;

public class Pizza {
    private static HashMap<String, Integer> ingredientesUtilizados = new HashMap<>();
    private String[] ingredientes;

    public Pizza(String[] ingredientes) {
        this.ingredientes = ingredientes;
        contabilizaIngrediente();
    }

    public void adicionaIngrediente(String ingrediente) {
        if (ingrediente != null && !ingrediente.isEmpty()) {
            // Acesso corrigido ao campo estático ingredientesUtilizados
            Pizza.ingredientesUtilizados.put(ingrediente, Pizza.ingredientesUtilizados.getOrDefault(ingrediente, 0) + 1);
        }
    }

    private void contabilizaIngrediente() {
        for (String ingrediente : ingredientes) {
            if (ingrediente != null && !ingrediente.isEmpty()) {
                this.ingredientesUtilizados.put(ingrediente, this.ingredientesUtilizados.getOrDefault(ingrediente, 0) + 1);
            }
        }
    }

    public static void limparIngredientesUtilizados() {
        ingredientesUtilizados.clear();
    }

    public static HashMap<String, Integer> getIngredientesUtilizados() {
        return ingredientesUtilizados;
    }

    public double getPreco() {
        int numIngredientes = ingredientes.length;
        if (numIngredientes == 0) {
            return 15; // Definindo o preço como 15 para pizzas sem ingredientes
        } else if (numIngredientes <= 2) {
            return 20;
        } else if (numIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public String[] getIngredientes() {
        return ingredientes;
    }
}
