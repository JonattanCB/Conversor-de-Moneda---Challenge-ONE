package com.alura.convesormoneda.controladores;

import com.alura.convesormoneda.modelos.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {

    public void conversionMoneda(Moneda moneda) {
        String code = "a0e7e11508047eea8600b699";
        String url = "https://v6.exchangerate-api.com/v6/"+code+"/pair/"+moneda.getCodigoOrigen()+"/"+moneda.getCodigoDestino()+"/"
                +(String.valueOf(moneda.getMontoConversion()));
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            Moneda monedaConvertida = gson.fromJson(response.body(), Moneda.class);

            String str = "La conversión de "+moneda.getCodigoOrigen()+" a "+ moneda.getCodigoDestino() + " se realizo con una tasa de "
                    + monedaConvertida.getTasaConversion() + ".En donde al convertir "+ moneda.getMontoConversion() + " "
                    + moneda.getCodigoOrigen() + " , el resultado es "+monedaConvertida.getMontoConversion()+ " "+ moneda.getCodigoDestino();
            System.out.println(str);

        }catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }finally {
            client.close();
        }

    }
}
