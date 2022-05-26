//Lucas Benitez - Programacion II USAL Pilar TN - 25 de mayo de 2022
import java.util.*;
import java.lang.*;

@SuppressWarnings("unused")
public class Frases {
	public static void main(String[] args) {
		String [] frases = new String [4];
		frases = devolverFrases(frases); //cargo el arreglo con 4 frases
		verificarFrases (frases); //Verifico cada frase y devuelvo lo solicitado por el enunciado
		

	
	

}
	public static void verificarFrases (String [] fr) {
		for (String f:fr) {
			//f.replace("a", "x");
			System.out.println("Frase original: " +f);
			
			if (f.startsWith("a") ||f.startsWith("e") ||f.startsWith("i") ||f.startsWith("o") ||f.startsWith("u")) 
			{
			f = f.replace("a", "x"); f = f.replace("e", "x"); f = f.replace("i", "x"); f = f.replace("o", "x"); f = f.replace("u", "x"); 
			System.out.println("La frase empieza en VOCAL\nFrase resultante: "+f);; 
			}
			
			else if
			 ( f.startsWith("q") || f.startsWith("w") || f.startsWith("r") || f.startsWith("t") || f.startsWith("y") || f.startsWith("p") || f.startsWith("s") 
		     || f.startsWith("d") || f.startsWith("f") || f.startsWith("g") || f.startsWith("h") || f.startsWith("j") || f.startsWith("k") || f.startsWith("l") 
		     || f.startsWith("ñ") || f.startsWith("z") || f.startsWith("x") || f.startsWith("c") ||  f.startsWith("v") || f.startsWith("b") || f.startsWith("n") 
		     || f.startsWith("m")) 
			{
			
			f = f.replace("q", ""); f = f.replace("w", "");f = f.replace("r", "");f = f.replace("t", "");f = f.replace("y", "");f = f.replace("p", "");
			f = f.replace("s", "");f = f.replace("d", "");f = f.replace("f", "");f = f.replace("g", "");f = f.replace("h", "");f = f.replace("j", "");
			f = f.replace("k", "");f = f.replace("l", "");f = f.replace("ñ", "");f = f.replace("z", "");f = f.replace("x", "");f = f.replace("c", "");
			f = f.replace("v", "");f =f.replace("b", "");f = f.replace("n", "");f = f.replace("m", "");
			System.out.println("La frase empieza en CONSONANTE\nFrase resultante: "+f);
			}
			else System.out.println("La frase empieza en OTRO CARACTER\nFrase resultante: "+f);
		
				
		}
		
	}
	
	public static String[] devolverFrases (String [] fr) {
		for (int i=0; i<fr.length; i++) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner (System.in);
			System.out.println("Ingrese la frase a procesar:");
			fr[i]=sc.nextLine();
			fr[i] = fr[i].toLowerCase();
		}
		return fr;
		
	}
	
}
