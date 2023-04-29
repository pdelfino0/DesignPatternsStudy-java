import imposto.CalculadoraDeImposto;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDeImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
