import com.sun.xml.internal.txw2.Document;

import java.util.Date;

public class Index {
    boolean hash;
    Integer tamanio;
    Date fecha;
    Document documento;

    public Index(boolean hash, Integer tamanio, Date fecha, Document documento) {
        this.hash = hash;
        this.tamanio = tamanio;
        this.fecha = fecha;
        this.documento = documento;
    }
}
