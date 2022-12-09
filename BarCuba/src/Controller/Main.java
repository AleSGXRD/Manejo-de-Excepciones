package Controller;
import Exceptions.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------Bienvenido al BarCuba-----------");
		
		int mony = 320;
		int op = 0;
		
		while(true) {
			while(op==0) {
				try { 
					PrintOptions(mony);
					String test = scan.next();
					op = ControlVentas.VerificarOpcion(test);
				}
				catch(NumberFormatException ex)
				{
					System.out.println("Introduzca un numero por favor");
					System.out.println("--------------------------------------");
				}
				catch(ErrorPedidoException ex)
				{
					System.out.println(ex.getMessage());
					System.out.println("--------------------------------------");
				}
			}

			try {
				switch(op) {
				case 1:
					mony = ControlVentas.ComprarCafe(mony);
					break;
				case 2:
					mony = ControlVentas.ComprarBebidas(mony);
				case 3:
					mony = ControlVentas.ComprarHamburgesa(mony);
					break;
				case 4:
					mony = ControlVentas.ComprarPizza(mony);
					break;
				}	
			}
			catch(ErrorConsumiblesException ex) {
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------------");
			}
			catch(ErrorComestiblesException ex) {
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------------");
			}
			catch(ErrorPedidoException ex) {
				System.out.println(ex.getMessage());
				System.out.println("--------------------------------------");
			}
			op =0;
		}
	}
	
	public static void PrintOptions(int mony) {
		System.out.println("Por favor seleccione opcion que desea:");
		System.out.println("1-Comprar cafe 50$");
		System.out.println("2-Comprar bebida 180$");
		System.out.println("3-Comprar Hamburgesa 190$");
		System.out.println("4-Comprar Pizza 300$");
		System.out.println("--------Dinero: "+mony+"$");
		
		
	}
}
