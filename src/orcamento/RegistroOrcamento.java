package orcamento;

import http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http){
        this.http = http;
    }
    public void registrar(Orcamento orcamento){
        if (!orcamento.isFinalizado()){
            throw new DomainException("Orcamento não finalizado");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
            "valor", orcamento.getValor(),
            "quantidadeItens", orcamento.getQuantidadeItens()
        );
        http.post(url, dados
        );
    }

}
