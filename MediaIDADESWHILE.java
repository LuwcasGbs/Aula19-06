package Aula1206;

import java.util.Scanner;

public class MediaIDADESWHILE {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade, media=0,soma=0,i=1;
		
		while(i<21) {
			System.out.print("Insira a "+i+"ª idade: ");
			idade = ler.nextInt();
			i++;
			soma=idade+soma;
		}
		media=soma/20;
		System.out.println("A média das idades é: "+media);
		ler.close();

	}

}
