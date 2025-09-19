/*
 * El código sirve para obtener "cifras afortunadas", 
 * los digitos afortunados son 3, 7, 8 y 9 y si la cifra introducida tiene más 
 * números afortunados que no afortunados, el programa lo clasificará como 
 * un número afortunado
 *
 */
import java.util.Scanner; //faltaba
public class Codigo5 {
	
	public static void main (String [] args) { //faltaba ésta línea
		
	    Scanner s = new Scanner(System.in);//no estaba bien declarado
	    System.out.print("Introduzca un número: ");//se corrige sintaxis de comillas
	    String ni = s.nextLine();
	    
	    int c = Integer.parseInt(ni);  //conversión de String a número entero 
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {
		  int digito = c % 10;//ultimo digito
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
		  c /= 10; //eliminar último dígito
	    }

	    if (afo > noAfo) {
	      System.out.prinln("El " + ni + " es un número afortunado.");
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");
	    }
	    
	  }
	  
	}