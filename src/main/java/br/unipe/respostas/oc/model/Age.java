package br.unipe.respostas.oc.model;

import lombok.Data;

@Data
public class Age {
    int value;

    public boolean isAdult(){
        return this.value >= 18;
    }
}
