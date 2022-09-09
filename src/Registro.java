import java.util.List;

public class Registro {
    Integer numeroRegistro;
    List<Documentos> documentos;

    public Registro(Integer numeroRegistro, List<Documentos> documentos) {
        this.numeroRegistro = numeroRegistro;
        this.documentos = documentos;
    }
}
