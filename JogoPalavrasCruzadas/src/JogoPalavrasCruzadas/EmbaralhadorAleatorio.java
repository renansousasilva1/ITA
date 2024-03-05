package JogoPalavrasCruzadas;

import java.util.Random;

public class EmbaralhadorAleatorio implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        char[] letras = palavra.toCharArray();
        Random random = new Random();

        for (int i = letras.length - 1; i > 0; i--) {
            int indice = random.nextInt(i + 1);
            char temp = letras[indice];
            letras[indice] = letras[i];
            letras[i] = temp;
        }

        return new String(letras);
    }
}
