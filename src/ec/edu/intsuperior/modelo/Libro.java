/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Personal
 */
public class Libro {
    public static void metodoSalida(){
        System.out.println("Que libro te gusta");
    }
    public static String metodoRetorno(){
        String c="Cien años de Soledad";
        return c;
    }
    public void salida(){
        System.out.println("Excelente");
    }
    public boolean retorno(){
        return 4==5;
    }
}
