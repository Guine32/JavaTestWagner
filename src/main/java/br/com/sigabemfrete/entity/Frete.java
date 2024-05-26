package br.com.sigabemfrete.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Frete")
public class Frete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFrete")
    private long idFrete;

    @Column(name = "peso")
    private double peso;

    @Column(name = "cepOrigem")
    private String cepOrigem;

    @Column(name = "cepDestino")
    private String cepDestino;

    @Column(name = "nomeDestinatario")
    private String nomeDestinatario;

    @Column(name = "vlTotalFrete")
    private double vlTotalFrete;

    @Column(name = "dataPrevistaEntrega")
    private LocalDateTime dataPrevistaEntrega;

    @Column(name = "dataConsulta")
    private LocalDateTime dataConsulta;

    // Getters e Setters;

    public long getIdFrete() {
        return idFrete;
    }

    public void setIdFrete(long idFrete) {
        this.idFrete = idFrete;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public double getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(double vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public LocalDateTime getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(LocalDateTime dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

}
