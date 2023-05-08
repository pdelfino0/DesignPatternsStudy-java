import http.JavaHttpCliente;
import orcamento.Orcamento;
import orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        orcamento.aprovar();
        orcamento.finalizar();
        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpCliente());
        registro.registrar(orcamento);
    }
}
