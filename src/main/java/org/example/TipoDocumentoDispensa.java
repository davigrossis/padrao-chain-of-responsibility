package org.example;

public class TipoDocumentoDispensa implements TipoDocumento {

    private static TipoDocumentoDispensa tipoDocumentoDispensa = new TipoDocumentoDispensa();

    private TipoDocumentoDispensa() {};

    public static TipoDocumentoDispensa getTipoDocumentoDispensa() {
        return tipoDocumentoDispensa;
    }
}
