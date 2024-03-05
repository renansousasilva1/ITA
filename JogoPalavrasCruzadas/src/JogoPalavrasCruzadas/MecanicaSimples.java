package JogoPalavrasCruzadas;

import java.util.ArrayList;
import java.util.List;

public class MecanicaSimples implements MecanicaDoJogo {
    private static final int NUMERO_MAXIMO_TENTATIVAS = 3;
    private static final int NUMERO_MAXIMO_PALAVRAS = 20;

    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private List<String> palavras;
    private int palavraAtual;
    private int tentativas;
    private int pontuacao;

    public MecanicaSimples(BancoDePalavras bancoDePalavras, Embaralhador embaralhador) {
        this.bancoDePalavras = bancoDePalavras;
        this.embaralhador = embaralhador;
        this.palavras = new ArrayList<>();
        this.palavraAtual = 0;
        this.tentativas = 0;
        this.pontuacao = 0;
        carregarPalavras();
    }

    private void carregarPalavras() {
        for (int i = 0; i < NUMERO_MAXIMO_PALAVRAS; i++) {
            palavras.add(bancoDePalavras.getPalavraAleatoria());
        }
    }

    @Override
    public boolean podeContinuar() {
        return palavraAtual < palavras.size() && tentativas < NUMERO_MAXIMO_TENTATIVAS;
    }

    @Override
    public boolean verificarResposta(String resposta) {
        tentativas++;
        // Verifica se a resposta está correta para alguma palavra no banco de palavras
        for (String palavra : bancoDePalavras.getPalavras()) {
            if (palavra.equalsIgnoreCase(resposta)) {
                pontuacao++;
                palavraAtual++;
                tentativas = 0;
                return true;
            }
        }
        return false;
    }


    @Override
    public String getPalavraEmbaralhada() {
        if (palavraAtual < palavras.size()) {
            return embaralhador.embaralhar(palavras.get(palavraAtual));
        }
        return null;
    }

    @Override
    public int pontuacaoFinal() {
        return pontuacao;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public boolean verificarResposta(String resposta, String palavraEmbaralhada) {
        // Verifica se a resposta está correta para a palavra atual no banco de palavras
        return resposta.equalsIgnoreCase(palavras.get(palavraAtual));
    }
}
