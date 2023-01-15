package br.montreal.model;

import lombok.*;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridicaModel extends PessoaModel {
    @NonNull
    @CNPJ
    private String cnpj;
    private List<BemImovelModel> bens;
    private EstruturaSocietariaModel estruturaSocietaria;
}
