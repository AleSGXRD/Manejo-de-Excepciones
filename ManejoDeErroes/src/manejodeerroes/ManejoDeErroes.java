/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeerroes;

import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AleXRD
 */
public class ManejoDeErroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        //Primero los diferentes tipos de excepciones
        int k=0;
        try{
        k = div(40,0);//Comprobar division entre cero
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
        
        try{
            isNegative(-10);//Comprobar q el numero sea negativo
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
        
        try{
            MostrarArray();//Mostrar una posicion mas alla del array
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("\nHa intentado acceder mas alla del arreglo");
        }
           
        System.out.println();
        try{
            MyBusiness c= new MyBusiness(-1,10,5);//tener cantidad de articulos negativos
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println();
        
        try{
            MyBusiness z= new MyBusiness(13,10,5);
            z.Comprar(2);//El cliente pagar el articulo con menos del precio
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println();
        
        try{
            MyBusiness b= new MyBusiness(16,0,5);
            b.Comprar(7);//El cliente pagar el articulo con menos del precio
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static int div(int a, int b) throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("Division entre zero");
            }
            else{
            return a/b;
            }
    }
    
     public static void isNegative(int x) throws IOException{
            if(x<0)
            throw new IOException("Numero negativo");
      }
     public static void MostrarArray(){
         int[] array = {9,3,2};
         for(int i =0;i<=3;i++){
             System.out.print(array[i]+ " ");
         }
     }
    
}
