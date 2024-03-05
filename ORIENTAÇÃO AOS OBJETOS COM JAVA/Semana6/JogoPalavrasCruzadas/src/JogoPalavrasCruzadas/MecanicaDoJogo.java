// MecanicaDoJogo.java
package JogoPalavrasCruzadas;

public interface MecanicaDoJogo {
    boolean podeContinuar();
    boolean verificarResposta(String resposta);
    String getPalavraEmbaralhada();
    int pontuacaoFinal();
    int getPontuacao();
    boolean verificarResposta(String resposta, String palavraEmbaralhada); // Novo método
}
