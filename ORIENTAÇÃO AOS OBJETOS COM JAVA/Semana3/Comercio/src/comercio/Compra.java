package comercio;

public class Compra {
    int valorTotal;
    int numeroParcelas;
    
    // À vista
    public Compra(int valor) {
        this.valorTotal = valor;
        this.numeroParcelas = 1;    
    }
    
    // Parcelado
    public Compra(int qtdParcelas, int valorParcela) {
        this.numeroParcelas = qtdParcelas;
        this.valorTotal = valorParcela * qtdParcelas;
    }
    
    public int getValorTotal() {
        return this.valorTotal;
    }
    
    public int getValorParcela() {
        return this.valorTotal / this.numeroParcelas;
    }
}
