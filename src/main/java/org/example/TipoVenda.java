package org.example;

public abstract class TipoVenda {

    protected Segmento segmento;

    protected float valorBase;

    public TipoVenda(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularComissao();
}