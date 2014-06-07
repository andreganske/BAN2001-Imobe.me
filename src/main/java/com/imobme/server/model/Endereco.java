package com.imobme.server.model;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Endereco implements Serializable {

    private static final long serialVersionUID = 6372824787013197051L;

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "endereco")
    private Pessoa pessoa;

    @NotNull
    @Size(min = 1, max = 250)
    private String logradouro;

    @NotNull
    @Digits(fraction = 0, integer = 12)
    private Integer numero;

    @Size(min = 1, max = 45)
    private String complemento;

    @NotNull
    @Size(min = 1, max = 45)
    private String bairro;

    @NotNull
    @Digits(fraction = 0, integer = 8)
    private Integer CEP;

    @NotNull
    @Size(min = 1, max = 45)
    private String cidade;

    @NotNull
    private Integer estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer cEP) {
        CEP = cEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
