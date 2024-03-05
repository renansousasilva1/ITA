package ITALOJA;
import java.util.Objects;

public class ProdutoComTamanho {
    private String nome;
    private String tamanho;
    private double preco;

    // Construtor que recebe nome, tamanho e preço
    public ProdutoComTamanho(String nome, String tamanho, double preco) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
