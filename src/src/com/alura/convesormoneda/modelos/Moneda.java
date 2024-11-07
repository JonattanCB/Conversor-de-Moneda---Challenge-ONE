package com.alura.convesormoneda.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {

    @SerializedName("base_code")
    private String codigoOrigen;

    @SerializedName("target_code")
    private String codigoDestino;

    @SerializedName("conversion_rate")
    private double tasaConversion;

    @SerializedName("conversion_result")
    private double montoConversion;

    public Moneda() {
    }

    public Moneda(String codigoOrigen, String codigoDestino, double tasaConversion, double montoConversion) {
        this.codigoOrigen = codigoOrigen;
        this.codigoDestino = codigoDestino;
        this.tasaConversion = tasaConversion;
        this.montoConversion = montoConversion;
    }

    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    public void setCodigoOrigen(String codigoOrigen) {
        this.codigoOrigen = codigoOrigen;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }

    public void setTasaConversion(double tasaConversion) {
        this.tasaConversion = tasaConversion;
    }

    public double getMontoConversion() {
        return montoConversion;
    }

    public void setMontoConversion(double montoConversion) {
        this.montoConversion = montoConversion;
    }
}
