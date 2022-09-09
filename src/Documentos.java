public class Documentos {
    String titulo;
    String url;
    String tema;
    Index index;
    Documentos documentos;

    public Documentos(String titulo, String url, String tema, Index index, Documentos documentos) {
        this.titulo = titulo;
        this.url = url;
        this.tema = tema;
        this.index = index;
        this.documentos = documentos;
    }
}
