package org.example;

public class VendaAvulsa extends TipoVenda {

    public VendaAvulsa(float valorBase) {
        super(valorBase);
    }

    public float calcularComissao() {
        return this.valorBase;
    }
}