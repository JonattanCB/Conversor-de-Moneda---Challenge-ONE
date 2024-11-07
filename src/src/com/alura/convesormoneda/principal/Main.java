package com.alura.convesormoneda.principal;

import com.alura.convesormoneda.controladores.Conversion;
import com.alura.convesormoneda.modelos.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversion conversion = new Conversion();
        int opcion = 0;
        String salir = "N";
        while (opcion !=8 && !salir.equalsIgnoreCase("S")) {
            System.out.println("*".repeat(120));
            System.out.println("CONVERSOR DE MONEDA");
            System.out.println("*".repeat(120));
            System.out.println("Ingrese la divisa que quiere convertir");
            System.out.println("""
                    1.- Dolar a Peso Argentino
                    2.- Peso Argentino a Dolar
                    3.- Dolar a Real Brazileño
                    4.- Real Brazileño a Dolar
                    5.- Dolar a  Peso Colombiano
                    6.- Peso Colombiano a Dolar
                    7.- Convesion a otra Divisa
                    8.- Salir
                    Escriba una de estas opciones:
                    """);
            opcion = sc.nextInt();

            if (opcion > 8){
                Moneda moneda = new Moneda();
                switch (opcion) {
                    case 1:
                        moneda.setCodigoOrigen("USD");
                        moneda.setCodigoDestino("ARS");
                        break;
                    case 2:
                        moneda.setCodigoOrigen("ARS");
                        moneda.setCodigoDestino("USD");
                        break;
                    case 3:
                        moneda.setCodigoOrigen("USD");
                        moneda.setCodigoDestino("BRL");
                        break;
                    case 4:
                        moneda.setCodigoOrigen("BRL");
                        moneda.setCodigoDestino("USD");
                        break;
                    case 5:
                        moneda.setCodigoOrigen("USD");
                        moneda.setCodigoDestino("COP");
                        break;
                    case 6:
                        moneda.setCodigoOrigen("COP");
                        moneda.setCodigoDestino("USD");
                        break;
                    case 7:
                        System.out.println("Codigo Moneda: ");
                        moneda.setCodigoOrigen(sc.next());
                        System.out.println("Codigo Moneda de Cambio: ");
                        moneda.setCodigoDestino(sc.next());
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                System.out.print("Cantidad: ");
                moneda.setMontoConversion(sc.nextDouble());
                System.out.println("*".repeat(120));
                conversion.conversionMoneda(moneda);
                System.out.println("*".repeat(120));
                System.out.println("Deseas Salir? (S/N) ");
                salir = sc.next();
            }
        }

    }
}