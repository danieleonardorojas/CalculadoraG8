package com.mycompany.calculadorabasicag8.ClsCalculadora;

import javax.swing.JOptionPane;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.lang.Math;

/**
 *
 * @author danie
 */
public class ClsOperaciones {

    // Constructor por defecto
    public ClsOperaciones() {
    }

    // Creamos estructura de control o método
    public void IniciarPrograma() {
        String opcion = "";

        String operacion = "";

        String num_1 = "";

        String num_2 = "";

        // int suma = ;
        // int resultado_suma = ;
        // Menú selección inicial tipo ´String'
        String menu = """
                      Seleccione una opción:
                      
                      1. Opción
                      2. Salir
                      
                      """;
        // Menú selección inicial tipo ´String'
        String menu_operaciones = """
                                  Seleccione una operación:
                                  
                                  1. Suma
                                  2. Resta
                                  3. Multiplicación
                                  4. División
                                  5. Potencia
                                  6. Raíz
                                  7. Salir
                      
                      """;
        // Menú selección inicial tipo ´String'
        String menu_num_1 = """
                      Ingrese número 'a':
                      
                      """;
        // Menú selección inicial tipo ´String'
        String menu_num_2 = """
                      Ingrese número 'b':
                      
                      """;

        opcion = JOptionPane.showInputDialog(menu);
        do {

            // Establecemos condicional con flujo de control 'if'
            if (opcion.equals("1")) {
                operacion = JOptionPane.showInputDialog(menu_operaciones);

                // Establecemos flujo de control con 'switch'
                switch (operacion) {
                    case "1":
                        // Bloque código suma
                        num_1 = JOptionPane.showInputDialog(menu_num_1);

                        try {
                            Double.parseDouble(num_1);
                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'a'");
                            break;
                        }

                        num_2 = JOptionPane.showInputDialog(menu_num_2);

                        try {
                            Double.parseDouble(num_2);

                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'b'");
                        }
                        // Hasta aquí OK
                        double num_sum_1 = Double.valueOf(num_1);
                        double num_sum_2 = Double.valueOf(num_2);
                        double suma = (double) (num_sum_1 + num_sum_2);
                        // bien
                        double resultado = suma;
                        BigDecimal bd = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP);
                        double resultado_sum = bd.doubleValue();
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado_sum);
                        break;

                    case "2":
                        // Bloque código resta
                        num_1 = JOptionPane.showInputDialog(menu_num_1);

                        try {
                            Double.parseDouble(num_1);
                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'a'");
                            break;
                        }

                        num_2 = JOptionPane.showInputDialog(menu_num_2);

                        try {
                            Double.parseDouble(num_2);

                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'b'");
                        }
                        // Hasta aquí OK
                        double num_res_1 = Double.valueOf(num_1);
                        double num_res_2 = Double.valueOf(num_2);
                        double resta = (double) (num_res_1 - num_res_2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + resta);
                        break;

                    case "3":
                        // Bloque código multiplicación
                        num_1 = JOptionPane.showInputDialog(menu_num_1);

                        try {
                            Double.parseDouble(num_1);
                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'a'");
                            break;
                        }

                        num_2 = JOptionPane.showInputDialog(menu_num_2);

                        try {
                            Double.parseDouble(num_2);

                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'b'");
                        }
                        // Hasta aquí OK
                        double num_mul_1 = Double.valueOf(num_1);
                        double num_mul_2 = Double.valueOf(num_2);
                        double multiplicacion = (double) (num_mul_1 * num_mul_2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + multiplicacion);
                        break;

                    case "4":
                        // Bloque código división
                        num_1 = JOptionPane.showInputDialog(menu_num_1);

                        try {
                            Double.parseDouble(num_1);
                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'a'");
                            break;
                        }

                        num_2 = JOptionPane.showInputDialog(menu_num_2);

                        try {
                            Double.parseDouble(num_2);

                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'b'");
                        }
                        // Hasta aquí OK
                        if (num_2.equals("0")) {
                            JOptionPane.showMessageDialog(null, "B no puede ser '0'");
                            break;
                        }
                        double num_div_1 = Double.valueOf(num_1);
                        double num_div_2 = Double.valueOf(num_2);
                        double division = (double) (num_div_1 / num_div_2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + division);
                        break;

                    case "5":
                        // Bloque código potencia
                        num_1 = JOptionPane.showInputDialog(menu_num_1);

                        try {
                            Double.parseDouble(num_1);
                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'a'");
                            break;
                        }

                        num_2 = JOptionPane.showInputDialog(menu_num_2);

                        try {
                            Double.parseDouble(num_2);

                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'b'");
                        }
                        // Hasta aquí OK
                        double num_pot_1 = Double.valueOf(num_1);
                        double num_pot_2 = Double.valueOf(num_2);
                        double potencia = (double) Math.pow(num_pot_1, num_pot_2);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + potencia);
                        break;

                    case "6":
                        // Bloque código raiz cuadrada
                        num_1 = JOptionPane.showInputDialog(menu_num_1);

                        try {
                            Double.parseDouble(num_1);
                        } catch (NumberFormatException excepcion) {
                            JOptionPane.showMessageDialog(null, "Incorrecto 'a'");
                            break;
                        }
                        double num_rai_1 = Double.valueOf(num_1);
                        double raiz_cuadrada = (double) Math.sqrt(num_rai_1);
                        JOptionPane.showMessageDialog(null, "El resultado es: " + raiz_cuadrada);
                        break;

                    case "7":
                        // Bloque código  salir
                        if (operacion.equals("7")) {
                            opcion = JOptionPane.showInputDialog(menu);
                        }
                        break;

                }

            }

        } while (!opcion.equals("2"));

    }
// Fin estructura de control

}
