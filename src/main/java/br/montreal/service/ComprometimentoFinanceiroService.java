package br.montreal.service;

import br.montreal.model.PessoaJuridicaModel;

import java.math.BigDecimal;

public class ComprometimentoFinanceiroService {

    public BigDecimal calculoComprometimentoFinanceiro(final PessoaJuridicaModel empresa){
        return this.calculoTotalBensEmpresa(empresa).add(this.calculoTotalBensSocios(empresa));
    }
    private BigDecimal calculoTotalBensEmpresa(final PessoaJuridicaModel empresa){
        BigDecimal resultado = new BigDecimal(0);
        empresa.getBens().forEach(bem->{
            resultado.add(bem.getValorBem());
        });

        return resultado;
    }
    private BigDecimal calculoTotalBensSocios(final PessoaJuridicaModel empresa){
        BigDecimal resultado = new BigDecimal(0);
        empresa.getBens().forEach(bem->{
            resultado.add(bem.getValorBem());
        });

        return resultado;
    }
}
