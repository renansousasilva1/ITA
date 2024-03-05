package pizza;

public class Principal {
    public static void main(String[] args) {
        // Cria��o das pizzas
        Pizza.limparIngredientesUtilizados(); // Limpa o registro de ingredientes utilizados
        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Presunto", "Tomate"});
        Pizza pizza2 = new Pizza(new String[]{"Queijo", "Pepperoni", "Cebola"});
        Pizza pizza3 = new Pizza(new String[]{"Queijo", "Cogumelos", "Tomate", "Bacon"});

        // Adi��o das pizzas ao carrinho de compras
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        // Impress�o do total do carrinho de compras
        System.out.println("Total do Carrinho: " + carrinho.calcularTotal() + " reais");

        // Impress�o da quantidade utilizada de cada ingrediente
        System.out.println("\nQuantidade de cada ingrediente utilizada:");
        for (String ingrediente : Pizza.getIngredientesUtilizados().keySet()) {
            System.out.println(ingrediente + ": " + Pizza.getIngredientesUtilizados().get(ingrediente));
        }
    }
}
