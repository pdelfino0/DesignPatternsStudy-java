package orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("O orçamento já está aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("O orçamento já está reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("O orçamento já está finalizado");
    }
}
