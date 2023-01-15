package br.montreal.model;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisicaModel extends PessoaModel {
    @NonNull
    @CPF
    private String cpf;
}
