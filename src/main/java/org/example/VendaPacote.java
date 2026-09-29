package org.example;

public class VendaPacote extends TipoVenda {

    private int qtdPlanos;

    public VendaPacote(float valorBase) {
        super(valorBase);
    }

    public void setQtdPlanos(int qtdPlanos) {
        this.qtdPlanos = qtdPlanos;
    }

    public float calcularComissao() {
        return this.valorBase * this.qtdPlanos * (1 + this.segmento.percentualBonus());
    }
}