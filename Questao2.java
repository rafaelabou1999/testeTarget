package targetTeste;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número da sequência: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número da sequência: ");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		   for(int i = 0; i < 8; i++){
	            numero1 = numero1 + numero2;
	            numero2 = numero1 - numero2;
	            System.out.println(numero1);
	        }
	}
}
