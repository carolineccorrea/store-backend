package com.store.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName= "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    private String tipoUnidade;

    private String nome;

    private Boolean ativo;

    @Column(columnDefinition = "text")
    private String descricao;

    private Double peso;

    private Double largura;

    private Double altura;

    private Double profundidade;

    private BigDecimal valorVenda;

    private Integer quantidadeEstoque;

    private Integer quantidadeAlertaEstoque;

    //notificacao de estoque por email
    private Boolean notificacaoEstoque = Boolean.FALSE;

    private String linkVideo;

    private String quantidadeClicks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQuantidadeAlertaEstoque() {
        return quantidadeAlertaEstoque;
    }

    public void setQuantidadeAlertaEstoque(Integer quantidadeAlertaEstoque) {
        this.quantidadeAlertaEstoque = quantidadeAlertaEstoque;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Boolean getNotificacaoEstoque() {
        return notificacaoEstoque;
    }

    public void setNotificacaoEstoque(Boolean notificacaoEstoque) {
        this.notificacaoEstoque = notificacaoEstoque;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String getQuantidadeClicks() {
        return quantidadeClicks;
    }

    public void setQuantidadeClicks(String quantidadeClicks) {
        this.quantidadeClicks = quantidadeClicks;
    }
}
