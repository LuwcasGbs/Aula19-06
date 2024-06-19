package Aula1206;

import java.util.Scanner;

public class NomeREpeteeWhilee {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nom;
		int i=0;
		System.out.print("Informe o nome: ");
		nom = ler.next();
		
		while (i<10) {
			System.out.println(nom);
			i++;
	}
		ler.close();

}
}
