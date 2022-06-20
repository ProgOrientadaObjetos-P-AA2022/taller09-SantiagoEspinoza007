/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEdu;
    private double valorCa;
    private double valorMen;
    
    public PrestamoEducativo(Persona b, int tP, String c,
            String nE, InstitucionEducativa cE, double vC){
        super(b, tP);
        establecerCiudadPrestamo(c);
        nivelEstudio = nE;
        centroEdu = cE;
        valorCa = vC;
    }
    
    @Override
    public void establecerCiudadPrestamo(String c){
        ciudadP = c.toUpperCase();
    }
    
    public void establecerNivelEstudio(String nE) {
        nivelEstudio = nE;
    }

    public void establecerCentroEducativo(InstitucionEducativa cE) {
        centroEdu = cE;
    }

    public void establecerValorCarrera(double vC) {
        valorCa = vC;
    }

    public void calcularValorMensual() {
        double operacion = (valorCa / tiempoP);
        valorMen = operacion - (operacion * 0.10);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEdu;
    }

    public double obtenerValorCarrera() {
        return valorCa;
    }

    public double obtenerValorMensual() {
        return valorMen;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: \n%s\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor Mesual de pago préstamo del valor de la Carrera: %.2f\n",
                cadenaFinal, obtenerNivelEstudio(), obtenerCentroEducativo(), 
                obtenerValorCarrera(), obtenerValorMensual());
        return cadenaFinal;
    }
}
