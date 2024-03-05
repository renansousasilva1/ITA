package Nome;

public class RespeitosoFormatador implements FormatadorNome {
    private String genero;

    public RespeitosoFormatador(String genero) {
        this.genero = genero;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if (genero.equals("masculino")) {
            return "Sr. " + sobrenome;
        } else if (genero.equals("feminino")) {
            return "Sra. " + sobrenome;
        }
        return "";
    }
}
