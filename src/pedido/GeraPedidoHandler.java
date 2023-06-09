package pedido;

import orcamento.Orcamento;
import pedido.acao.AcaoAposGerarPedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido  email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
