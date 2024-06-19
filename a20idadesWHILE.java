package Aula1206;

import java.util.Scanner;

public class a20idadesWHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade,som=0,i=1;
		
		while(i<21) {
			System.out.print("Insira a "+i+"ª idade: ");
			idade = ler.nextInt();
			i++;
			som=idade+som;
		}
		System.out.println("A soma das idades é: "+som);
		ler.close();

	}

}
