package targetTeste;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		
		sc.close();
		
	 char[] arrayPalavra = new char[palavra.length()];
		String invertido ="";
		
		  for (int letra = palavra.length() - 1; letra >= 0; letra--) {
	            arrayPalavra[palavra.length() - 1 - letra] = palavra.charAt(letra);
	        }
		  
		  for (int i = 0; i < arrayPalavra.length; i++) {
	            invertido += arrayPalavra[i];
	        }
		  
		System.out.println("Palavra escolhida: " + palavra);
		System.out.println("Palavra invertida: " + invertido );
	}
}
