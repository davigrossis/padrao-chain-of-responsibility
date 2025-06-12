package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    Marechal marechal;
    Coronel coronel;
    Capitao capitao;
    Sargento sargento;

    @BeforeEach
    void setUp() {
        marechal = new Marechal(null);
        coronel = new Coronel(marechal);
        capitao = new Capitao(coronel);
        sargento = new Sargento(capitao);
    }

    @Test
    void deveRetornarSargentoParaAssinaturaRelatorio() {
        assertEquals("Sargento", sargento.assinarDocumento(new Documento(TipoDocumentoRelatorio.getTipoDocumentoRelatorio())));
    }

    @Test
    void deveRetornarCapitaoParaAssinaturaPlano() {
        assertEquals("Capitão", sargento.assinarDocumento(new Documento(TipoDocumentoPlano.getTipoDocumentoPlano())));
    }

    @Test
    void deveRetornarCoronelParaAssinaturaAutorizacao() {
        assertEquals("Coronel", sargento.assinarDocumento(new Documento(TipoDocumentoAutorizacao.getTipoDocumentoAutorizacao())));
    }

    @Test
    void deveRetornarMarechalParaAssinaturaDeclaracaoGuerra() {
        assertEquals("Marechal", sargento.assinarDocumento(new Documento(TipoDocumentoDeclaracaoGuerra.getTipoDocumentoDeclaracaoGuerra())));
    }

    @Test
    void deveRetornarSemAssinaturaParaDocumentoInexistente() {
        // documento não reconhecido
        assertEquals("Sem assinatura", sargento.assinarDocumento(new Documento(TipoDocumentoDispensa.getTipoDocumentoDispensa())));
    }
}
