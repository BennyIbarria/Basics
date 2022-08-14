package com.mycompany.principiosbasicos1;

public class EstructuraIf {
    
    public static void main(String[] args) {
        
    if (5>4){
        System.out.println("5 es mayor que cuatro");
    } if(5<4){
        System.out.println("5 es menor que cuatro");
    }
    int edad=20;
    
    if(edad<18 && edad >=0){
        System.out.println("Eres menor de edad");
    }
    else if (edad>=18){
        System.out.println("Eres mayor de edad");
    }
    else
    {
        System.out.println("Esa no es una edad valida");
    }
    }
    
}
