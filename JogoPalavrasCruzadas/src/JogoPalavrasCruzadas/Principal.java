package JogoPalavrasCruzadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Instanciando objetos necessários
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        Embaralhador embaralhador = FabricaEmbaralhadores.criarEmbaralhador();

        // Exibir as palavras embaralhadas
        System.out.println("Palavras embaralhadas:");
        List<String> palavrasEmbaralhadas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String palavraEmbaralhada = embaralhador.embaralhar(bancoDePalavras.getPalavraAleatoria());
            palavrasEmbaralhadas.add(palavraEmbaralhada);
            System.out.println(palavraEmbaralhada);
        }

        Scanner scanner = new Scanner(System.in);
        MecanicaSimples mecanica = new MecanicaSimples(bancoDePalavras, embaralhador);

        // Loop do jogo
        while (mecanica.podeContinuar()) {
            System.out.print("Digite sua resposta: ");
            String resposta = scanner.nextLine();

            // Verificar se a resposta está correta para a palavra embaralhada atual
            boolean respostaCorreta = mecanica.verificarResposta(resposta);

            if (respostaCorreta) {
                System.out.println("Resposta correta! Pontuação atual: " + mecanica.getPontuacao());
            } else {
                System.out.println("Resposta incorreta! Tente novamente.");
            }
        }

        // Fim do jogo
        System.out.println("Fim do jogo! Sua pontuação final é: " + mecanica.pontuacaoFinal());

        scanner.close(); // Fechar o scanner após o uso
    }
}
