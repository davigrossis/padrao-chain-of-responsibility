package org.example;

public class Marechal extends Oficial {

    public Marechal(Oficial superior) {
        listaDocumentos.add(TipoDocumentoDeclaracaoGuerra.getTipoDocumentoDeclaracaoGuerra());
        setOficialSuperior(superior);
    }

    @Override
    public String getDescricaoPosto() {
        return "Marechal";
    }
}
