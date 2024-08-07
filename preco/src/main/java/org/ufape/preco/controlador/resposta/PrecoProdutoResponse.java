package org.ufape.preco.controlador.resposta;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.ufape.catalogo.config.SpringApplicationContext;
import org.ufape.preco.basica.PrecoProduto;

@Getter @Setter
public class PrecoProdutoResponse {

    private Long id;
    private Double valor;
    private Long produtoId;
    private String dataInicio;
    private String dataFim;

    public PrecoProdutoResponse(PrecoProduto precoProduto) {
        ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
        modelMapper.map(precoProduto, this);
    }
}
