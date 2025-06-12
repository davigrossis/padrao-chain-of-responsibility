package org.example;

public class TipoDocumentoAutorizacao implements TipoDocumento {

    private static TipoDocumentoAutorizacao tipoDocumentoAutorizacao = new TipoDocumentoAutorizacao();

    private TipoDocumentoAutorizacao() {}

    public static TipoDocumentoAutorizacao getTipoDocumentoAutorizacao() {
        return tipoDocumentoAutorizacao;
    }
}
