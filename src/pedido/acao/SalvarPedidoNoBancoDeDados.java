package pedido.acao;

import pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no banco de dados");

    }
}
