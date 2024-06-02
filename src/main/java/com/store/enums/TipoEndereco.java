package com.store.enums;

public enum TipoEndereco {

    COBRANCA("Cobrança"),
    ENTREGA("ENTREGA");

    TipoEndereco(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "tipoEndereco{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}