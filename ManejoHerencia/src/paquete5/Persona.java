/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author EdgarEspinoza
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String userName;

    public Persona(String n, String a, String uN) {
        nombre = n;
        apellido = a;
        userName = uN;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUserName(String uN) {
        userName = uN;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUserName() {
        return userName;
    }
    @Override
    public String toString(){
        String reporte = String.format(" Nombre: %s\n Apellido: %s\n UserName: %s\n",
                obtenerNombre(), obtenerApellido(), obtenerUserName());
        return reporte;
    }
}
