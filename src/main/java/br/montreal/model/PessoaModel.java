package br.montreal.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaModel {
    @NonNull
    private String nome;
    private List<BemImovelModel> bens;
}
