package org.example;

public class TipoDocumentoPlano implements TipoDocumento {

    private static TipoDocumentoPlano tipoDocumentoPlano = new TipoDocumentoPlano();

    private TipoDocumentoPlano() {}

    public static TipoDocumentoPlano getTipoDocumentoPlano() {
        return tipoDocumentoPlano;
    }
}
