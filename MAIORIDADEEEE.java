package Aula1206;

import java.util.Scanner;

public class MAIORIDADEEEE {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade,maior=0;

		
		for(int i=0; i<20; i++) {
			System.out.println("Insira a "+i+"ªidade: ");
			idade = ler.nextInt();
			if (idade >=18) {
				maior++;
			}
		}
		System.out.println(+maior+" pessoas tem mais de 18 anos");
		ler.close();

	}

}
