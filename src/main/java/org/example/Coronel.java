package org.example;

public class Coronel extends Oficial {

    public Coronel(Oficial superior) {
        listaDocumentos.add(TipoDocumentoAutorizacao.getTipoDocumentoAutorizacao());
        setOficialSuperior(superior);
    }

    @Override
    public String getDescricaoPosto() {
        return "Coronel";
    }
}