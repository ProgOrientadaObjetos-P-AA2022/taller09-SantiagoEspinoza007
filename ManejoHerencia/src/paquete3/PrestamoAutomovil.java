/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoA;
    private String marcaA;
    private Persona garante1;
    private double valorA;
    private double valorMensualP;
    
    public PrestamoAutomovil(Persona b, int tP, String c,
            String tA, String mA, Persona g1, double vA){
        super(b, tP);
        establecerCiudadPrestamo(c);
        tipoA = tA;
        marcaA = mA;
        garante1 = g1;
        valorA = vA;
    }
    @Override
    public void establecerCiudadPrestamo(String c){
        ciudadP = c.toLowerCase();
    }
    public void establecerTipoAuto(String tp) {
        tipoA = tp;
    }

    public void establecerMarcaAuto(String m) {
        marcaA = m;
    }

    public void establecerGarante1(Persona g) {
        garante1 = g;
    }

    public void establecerValorA(double v) {
        valorA = v;
    }

    public void calcularValorMensualPrestamo() {
        valorMensualP = valorA / obtenerTiempoPrestamo();
    }

    public String obtenerTipoAuto() {
        return tipoA;
    }

    public String obtenerMarcaAuto() {
        return marcaA;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorA() {
        return valorA;
    }

    public double obtenerValorMensualPrestamo() {
        return valorMensualP;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de Automóvil: %s\n"
                + "Marca del Automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor del Automóvil: %.2f\n"
                + "Valor Mesual de pago préstamo Automovil: %.2f\n",
                cadenaFinal, obtenerTipoAuto(), obtenerMarcaAuto(), 
                obtenerGarante1(), obtenerValorA(), obtenerValorMensualPrestamo());
        return cadenaFinal;
    }
}
