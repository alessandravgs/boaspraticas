package br.unipe.respostas.oc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerInfo {
    private Name name;
    private Age age;
}
