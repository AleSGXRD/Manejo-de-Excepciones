/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeerroes;
import java.io.*;

/**
 *
 * @author AleXRD
 */
public class MyBusiness{//Un negocio en q vendemos multiples de un tipo de articulo unicamente
    protected int DineroDepositado;
    protected int cantidadArticuloEnVenta;
    protected int precioArticulo;
    
    public MyBusiness(int a, int b, int c)throws IOException{
        if(a<0||b<0||c<0){
            throw new  IOException("no menor");
        }
        DineroDepositado=a;
        cantidadArticuloEnVenta=b;
        precioArticulo=c;
    }
    
    public void Comprar(int DineroCliente)throws Exception{
        if(cantidadArticuloEnVenta==0){
            throw new Exception("No hay suficientes articulos para vender");
        }
        else if(DineroCliente<precioArticulo){
            throw new Exception("El cliente no tiene dinero, no se puede hacer la compra");
        }
        else{
         cantidadArticuloEnVenta--;
         DineroDepositado+=DineroCliente;
        }
    }
    
}
