package Aula1206;

import java.util.Scanner;

public class MAIORIDADESSWHILEEE {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, maior=0,idade;
		
		while(i<20) {
			System.out.println("Insira a "+i+"ª idade: ");
			idade = ler.nextInt();
			i++;
			if (idade>=18) {
				maior++;
			}
			
		}
		System.out.println(maior+" pessoas tem mais de 18 anos");
		ler.close();
	}

}
