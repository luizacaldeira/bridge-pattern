package org.example;

public class VendaRenovacao extends TipoVenda {

    public VendaRenovacao(float valorBase) {
        super(valorBase);
    }

    public float calcularComissao() {
        return this.valorBase * (1 + this.segmento.percentualBonus());
    }
}