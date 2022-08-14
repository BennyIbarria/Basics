package com.mycompany.principiosbasicos1;

public class Funciones {
    
    public static void main(String[] args) {
       mostrarMensaje(); 
       saludar("Benito");
       System.out.println(sumar(100,50));
       int sumarFuncion = sumar(50,10);
        System.out.println(sumarFuncion);
    }
    
    public static void mostrarMensaje(){
        System.out.println("Esta es una funcion");       
    }
    
    public static void saludar(String nombre){
        
        System.out.println("Hola " + nombre); 
    }
    
    public static int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        
        return suma;
    }
}
