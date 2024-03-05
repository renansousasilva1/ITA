package JogoPalavrasCruzadas;
import java.util.Random;

public class FabricaEmbaralhadores {
    public static Embaralhador criarEmbaralhador() {
        Random random = new Random();
        int escolha = random.nextInt(2); // 2 � o n�mero de implementa��es de Embaralhador
        if (escolha == 0) {
            return new EmbaralhadorAleatorio();
        } else {
            return new EmbaralhadorInversao();
        }
    }
}
