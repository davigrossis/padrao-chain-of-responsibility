package org.example;

public class Sargento extends Oficial {

    public Sargento(Oficial superior) {
        listaDocumentos.add(TipoDocumentoRelatorio.getTipoDocumentoRelatorio());
        setOficialSuperior(superior);
    }

    @Override
    public String getDescricaoPosto() {
        return "Sargento";
    }
}
