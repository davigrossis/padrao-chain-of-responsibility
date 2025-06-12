package org.example;

public class Capitao extends Oficial {

    public Capitao(Oficial superior) {
        listaDocumentos.add(TipoDocumentoPlano.getTipoDocumentoPlano());
        setOficialSuperior(superior);
    }

    @Override
    public String getDescricaoPosto() {
        return "Capitão";
    }
}
