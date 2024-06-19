package Aula1206;

import java.util.Scanner;

public class Somaaaaw {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, som=0;
		
		for(int i=1; i<11; i++) {
		System.out.print("Insira o "+i+"º número: ");
		num = ler.nextInt();
		som = num+som;
	}
		System.out.println("O resultado da soma é: "+som);
		ler.close();

}
}
