package JogoPalavrasCruzadas;

public class EmbaralhadorInversao implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        StringBuilder inversao = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversao.append(palavra.charAt(i));
        }
        return inversao.toString();
    }
}
