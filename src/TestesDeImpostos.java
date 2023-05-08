import imposto.CalculadoraDeImposto;
import imposto.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDeImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
    }
}
