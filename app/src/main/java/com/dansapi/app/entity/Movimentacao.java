package com.dansapi.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_movimentacao", schema = "public")
public class Movimentacao extends AbstractEntity{
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "produto_id") // Substitua "produto_id" pelo nome da coluna real
    private Produto produtos;


    @Getter @Setter
    @Column(name = "entrada")
    private int entrada;

    @Getter @Setter
    @Column(name = "saida")
    private int saida;

    @Getter @Setter
    @Column(name = "totalProduto")
    private int totalProduto;

    @Getter @Setter
    @Column(name = "valorCompra", nullable = false)
    private BigDecimal valorCompra;

    @Getter @Setter
    @Column(name = "valorVenda", nullable = false)
    private BigDecimal valorVenda;

    @Getter @Setter
    @Column(name = "valorTotal", nullable = false)
    private BigDecimal valorTotal;

    public Produto getProdutos() {
        return produtos;
    }

    public int getEntrada() {
        return entrada;
    }

    public int getSaida() {
        return saida;
    }

    public int getTotalProduto() {
        return totalProduto;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public void setTotalProduto(int totalProduto) {
        this.totalProduto = totalProduto;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
