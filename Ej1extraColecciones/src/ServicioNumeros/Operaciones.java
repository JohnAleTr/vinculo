/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioNumeros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chiara
 */
public class Operaciones {
    
    Scanner leer = new Scanner(System.in);
    
    ArrayList <Integer> listaNumeros = new ArrayList();
    
    public void leerNumero() {
        
        int num = 0;
        
        
        do  {
            System.out.println("Ingrese los numeros, la lectura se interrumpe cuando se ingresa -99");
            num = leer.nextInt();
            if (num != -99) {
                listaNumeros.add(num);
            }
            System.out.println(listaNumeros.toString());
        } while (num != -99);
    }
    
    public void contarNumeros() {
    
        System.out.println("Hay " + listaNumeros.size() + " numeros");
    }
    
    public int sumar() {
        
        int resultado = 0;
        
        for (Integer i : listaNumeros) {
            resultado += i;  
        }
        
        return resultado;
    }
    
    public void promediar() {
        
        int resultadoSuma = sumar();
        
        double promedio = (resultadoSuma*1.0)/listaNumeros.size();
        
        System.out.println("El promedio de los valores es: " + promedio);
    }
}
