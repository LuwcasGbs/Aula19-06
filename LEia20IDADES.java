package Aula1206;

import java.util.Scanner;

public class LEia20IDADES {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade,som=0;
		
		for(int i=1; i<19; i++) {
			System.out.print("Insira a "+i+"ª idade: ");
			idade = ler.nextInt();
			som = idade+som;
		}
		System.out.println("A soma das idades é: "+som);
ler.close();
	}

}
