package Aula1206;

import java.util.Scanner;

public class NOMERepeteee {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nom;
		
		System.out.print("Insira um nome: ");
		nom = ler.next();
		
		for(int i=0; i<10; i++) {
			System.out.println(nom);
		}
ler.close();
	}

}
