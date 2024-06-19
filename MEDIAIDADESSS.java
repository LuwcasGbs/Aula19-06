package Aula1206;

import java.util.Scanner;

public class MEDIAIDADESSS {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade,soma=0,media=0;
		
		for(int i=1; i<21; i++) {
			System.out.print("Insira a "+i+"ª idade: ");
			idade = ler.nextInt();
			soma= idade+soma;
		}
		media=soma/20;
		System.out.println("A média das idades é: "+media);
		ler.close();

	}

}
