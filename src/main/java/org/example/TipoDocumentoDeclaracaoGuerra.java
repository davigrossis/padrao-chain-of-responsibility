package org.example;

public class TipoDocumentoDeclaracaoGuerra implements TipoDocumento {

    private static TipoDocumentoDeclaracaoGuerra tipoDocumentoDeclaracaoGuerra = new TipoDocumentoDeclaracaoGuerra();

    private TipoDocumentoDeclaracaoGuerra() {}

    public static TipoDocumentoDeclaracaoGuerra getTipoDocumentoDeclaracaoGuerra() {
        return tipoDocumentoDeclaracaoGuerra;
    }
}
