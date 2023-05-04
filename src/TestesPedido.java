import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedido {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/* dependências */);
        handler.execute(gerador);
    }
}
