import java.util.List;

public class Tema {
    List<Documentos> documentos;
    List<Tema> subtema;

    public Tema(List<Documentos> documentos, List<Tema> subtema) {
        this.documentos = documentos;
        this.subtema = subtema;
    }
}
