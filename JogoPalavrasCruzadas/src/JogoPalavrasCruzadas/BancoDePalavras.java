package JogoPalavrasCruzadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
    private List<String> palavras;

 // Adicione este método na classe BancoDePalavras
    public List<String> getPalavras() {
        return palavras;
    }

    
    public BancoDePalavras() {
        this.palavras = new ArrayList<>();
        // Adicione aqui suas palavras ao banco de palavras
        // Exemplo:
        this.palavras.add("cachorro");
        this.palavras.add("gato");
        this.palavras.add("elefante");
        this.palavras.add("porco");
        this.palavras.add("alce");
        this.palavras.add("avestruz");
        this.palavras.add("veado");
        // Adicione quantas palavras desejar
    }

    public String getPalavraAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(palavras.size());
        return palavras.get(indice);
    }
}
