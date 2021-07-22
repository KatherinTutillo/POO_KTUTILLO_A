/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Celular;
import ec.edu.intsuperior.modelo.Lapiz;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.modelo.Teclado;
/**
 *
 * @author Personal
 */
public class Aplicacion {
    public static void main(String[] args){
         
        Celular.metodoSalida();
        System.out.println(Celular.metodoRetorno());
        Celular obj=new Celular();
        obj.retorno();
        obj.salida();
   
        Lapiz.metodoSalida();
        System.out.println(Lapiz.metodoRetorno());
        Lapiz ob=new Lapiz();
        ob.retorno();
        ob.salida();
    }
}
