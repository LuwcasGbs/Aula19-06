package Aula1206;

import java.util.Scanner;

public class MAISNOVO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nom;
		int idade=0, menor=0;
		
		
		for(int i =0; i<2; i++) {
			System.out.print("Digite o nome da "+i+"ª pessoa: ");
			nom = ler.next();
			
			System.out.print("Digite a idade da "+i+"ª pessoa: ");
			idade = ler.nextInt();
			
			menor = idade+menor;
			
			if (idade<menor) {
				System.out.println("Menor idade" +menor);
		}
	}
}
}
