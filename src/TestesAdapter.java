import http.JavaHttpCliente;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamento.aprovar();
        orcamento.finalizar();
        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpCliente());
        registro.registrar(orcamento);
    }
}
