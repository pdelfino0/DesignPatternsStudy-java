package orcamento.situacao;

import orcamento.Orcamento;
import orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
