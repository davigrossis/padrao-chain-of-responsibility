package org.example;

import java.util.ArrayList;

public abstract class Oficial {

    protected ArrayList<TipoDocumento> listaDocumentos = new ArrayList<>();
    private Oficial oficialSuperior;

    public Oficial getOficialSuperior() {
        return oficialSuperior;
    }

    public void setOficialSuperior(Oficial oficialSuperior) {
        this.oficialSuperior = oficialSuperior;
    }

    public abstract String getDescricaoPosto();

    public String assinarDocumento(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricaoPosto();
        } else {
            if (oficialSuperior != null) {
                return oficialSuperior.assinarDocumento(documento);
            } else {
                return "Sem assinatura";
            }
        }
    }
}
