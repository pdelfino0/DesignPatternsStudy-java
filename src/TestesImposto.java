import imposto.CalculadoraDeImposto;
import imposto.ICMS;
import imposto.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
    }
}
