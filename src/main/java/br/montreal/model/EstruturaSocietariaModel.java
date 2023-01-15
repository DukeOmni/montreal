package br.montreal.model;

import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstruturaSocietariaModel{
    @Size(min = 1)
    private List<PessoaFisicaModel> fisicas;
    private List<PessoaJuridicaModel> juridicas;
}
