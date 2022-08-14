
package com.mycompany.principiosbasicos1;

public class Operadores {
    
    public static void main(String[] args) {
        
      int suma = 5+4;
      int resta = 5-4;
      int multiplicacion = 5*4;
      int division = 10/2;
      int sobrante = 10%3;
      
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multiplicacion);
        System.out.println("División = " + division);
        
       int numero = 10;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
        
        System.out.println(5 == 4);
        System.out.println(5 == 5);
        System.out.println(5 > 4);
        System.out.println(5<4);
        System.out.println(10<=10);
        System.out.println(10>=5);
        System.out.println( 5>4 && 4<5 );
        System.out.println(10>4 && 10>15);
        System.out.println(10!=5);
        System.out.println(10!=10);
    }
    
}
