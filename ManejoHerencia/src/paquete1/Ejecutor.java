/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete5.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String ban = "no";
        String listaPAuto = "";
        String listaPEdu = "";
        Persona persona = new Persona("", "", "");
        while (ban != "si") {
            int opc = menuUno();
            if (opc == 1 || opc == 2) {
                System.out.println("¿Cuál es el nombre del beneficiario?");
                String nombre = leer.nextLine();
                System.out.println("¿Cuál es el apellido del benefeciario?");
                String apellido = leer.nextLine();
                System.out.println("¿Cuál es el nombre de usuario del beneficiario?");
                String userName = leer.nextLine();
                persona = new Persona(nombre, apellido, userName);
            }
            switch (opc) {
                case 1:
                    listaPAuto = String.format("%s\n%s",
                            listaPAuto, menuDos(persona));
                    break;
                case 2:
                    listaPEdu = String.format("%s\n%s",
                            listaPEdu, menuTres(persona));
                    break;
                case 3:
                    menuCuatro(listaPAuto, listaPEdu);
                    break;
                case 4:
                    System.out.println("Programa cancelado por el usuario");
                    ban = "si";
                    break;
            }
        }
    }

    public static int menuUno() {
        Scanner leer = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Seleccione una opcion del siguiente menú:\n"
                + "(1) Ingresar datos para un prestamo de tipo Automovil\n"
                + "(2) Ingresar datos para un prestamo de tipo Educativo\n"
                + "(3) Mostrar listas\n"
                + "(4) Finalizar programa");
        System.out.println("------------------------------------------------------------------------");
        int opc = leer.nextInt();
        leer.nextLine();
        while ((opc < 1) || (opc > 4)) {
            System.out.print("El numero ingresado no corresponde a ningun item.\nIntente de nuevo");
            opc = leer.nextInt();
        }
        return opc;
    }

    public static String menuDos(Persona p) {
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        System.out.println("\n------------------------------------------------------------------------");
        //Crear un objeto de tipo persona para el garante
        System.out.println("¿Cuál es el nombre del garante?");
        String nom = leer.nextLine();
        System.out.println("¿Cuál es el apellido del garante?");
        String ape = leer.nextLine();
        System.out.println("¿Cuál es el nombre de usuario del garante?");
        String userName = leer.nextLine();
        Persona garante = new Persona(nom, ape, userName);

        System.out.println("¿Para cuántos meses va a diferir su prestamo?");
        int n = leer.nextInt();
        leer.nextLine();
        System.out.println("¿En qué ciudad se va a realizar el prestamo?");
        String ciudad = leer.nextLine();

        System.out.println("¿De qué tipo es el automóvil?");
        String tipoAuto = leer.nextLine();
        System.out.println("¿De qué marca es el automóvil?");
        String marcaAuto = leer.nextLine();
        System.out.println("¿En cuánto está valorado el automóvil?");
        double valorAuto = leer.nextDouble();

        PrestamoAutomovil pAuto = new PrestamoAutomovil(p, n, ciudad,
                tipoAuto, marcaAuto, garante, valorAuto);
        pAuto.calcularValorMensualPrestamo();

        cadena = String.format("%s"
                + "------------------------------------------------------------------------\n%s"
                + "------------------------------------------------------------------------", cadena, pAuto);
        System.out.println("------------------------------------------------------------------------");
        return cadena;

    }

    public static String menuTres(Persona p) {
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        System.out.println("\n------------------------------------------------------------------------");
        //Crear un objeto de tipo InstituciónEducativa
        System.out.println("¿Cuál es el nombre de la institución?");
        String nomIns = leer.nextLine();
        System.out.println("¿Cuáles son las siglas de la institución?");
        String siglasIns = leer.nextLine();

        InstitucionEducativa insEdu = new InstitucionEducativa(nomIns, siglasIns);

        //Crear un objeto de tipo PrestamoEducativo
        System.out.println("¿Para cuántos meses va a diferir su prestamo?");
        int n = leer.nextInt();
        leer.nextLine();
        System.out.println("¿En qué ciudad se va a realizar el prestamo?");
        String ciudad = leer.nextLine();

        System.out.println("¿Cuál es el nivel de estudio?");
        String nivelEdu = leer.nextLine();
        System.out.println("¿Cuál es el valor de la carrera?");
        double valorC = leer.nextDouble();
        leer.nextLine();

        PrestamoEducativo preEdu = new PrestamoEducativo(p, n, ciudad,
                nivelEdu, insEdu, valorC);
        preEdu.calcularValorMensual();

        cadena = String.format("%s"
                + "------------------------------------------------------------------------\n%s"
                + "------------------------------------------------------------------------", cadena, preEdu);
        System.out.println("------------------------------------------------------------------------");
        return cadena;
    }

    public static void menuCuatro(String lAutos, String lEdu) {
        Scanner leer = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("(1) Mostrar lista de prestamos de Automóviles: ");
        System.out.println("(2) Mostrar lista de prestamos Educativos: ");
        System.out.println("(3) Regresar al menú anterior");
        System.out.println("------------------------------------------------------------------------");
        int opc = leer.nextInt();
        leer.nextLine();
        while ((opc < 1) || (opc > 3)) {
            System.out.print("El numero ingresado no corresponde a ningun item.\nIntente de nuevo");
            opc = leer.nextInt();
        }
        switch (opc) {
            case 1:
                if (lAutos == "") {
                    System.out.println("Aún no se han ingresado datos en la lista");
                } else {
                    System.out.println(lAutos);
                }
                menuCuatro(lAutos, lEdu);
                break;

            case 2:
                if (lEdu == "") {
                    System.out.println("Aún no se han ingresado datos en la lista");
                } else {
                    System.out.println(lEdu);
                }
                menuCuatro(lAutos, lEdu);
                break;
                
            case 3:
                menuUno();
                break;
        }
        if (opc == 1) {
            if (lAutos == "") {
                System.out.println("Aún no se han ingresado datos en la lista");
            } else {
                System.out.println(lAutos);
            }

        } else {
            if (lEdu == "") {
                System.out.println("Aún no se han ingresado datos en la lista");
            } else {
                System.out.println(lEdu);
            }
        }
    }
}
