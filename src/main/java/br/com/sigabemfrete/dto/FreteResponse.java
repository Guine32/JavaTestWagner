package br.com.sigabemfrete.dto;

import java.time.LocalDateTime;

public class FreteResponse {

    private double vlTotalFrete;
    private LocalDateTime dataPrevistaEntrega;
    private String cepOrigem;
    private String cepDestino;

    // Construtor;

    public FreteResponse(double vlTotalFrete, LocalDateTime dataPrevistaEntrega, String cepOrigem, String cepDestino) {
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
    }

    // Getters e Setter;

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
}
