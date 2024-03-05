package Nome;

public class ComTituloFormatador implements FormatadorNome {
    private String titulo;

    public ComTituloFormatador(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}
