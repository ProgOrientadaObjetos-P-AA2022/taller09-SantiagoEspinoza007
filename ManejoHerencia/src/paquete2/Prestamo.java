/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoP;
    protected String ciudadP;
    
    public Prestamo(Persona b, int t){
        beneficiario = b;
        tiempoP = t;
    }
    
    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerTiempoPrestamo(int tP) {
        tiempoP = tP;
    }

    public void establecerCiudadPrestamo(String c) {
        ciudadP = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoP;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadP;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Beneficiario: \n%s"
                + "Tiempo de Prestamo: %d\n"
                + "Ciudad del Prestamo: %s\n", beneficiario.toString(),
                obtenerTiempoPrestamo(), obtenerCiudadPrestamo());
        
        return cadena;
    }
    
    
}
