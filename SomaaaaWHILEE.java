package Aula1206;

import java.util.Scanner;

public class SomaaaaWHILEE {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int som=0, num, i=1;
		
		while(i<11) {
			System.out.print("Insira o "+i+"º número: ");
			num = ler.nextInt();
			i++;
			som=num+som;
	}
		System.out.println("A soma dos números é: "+som);
ler.close();
}
}
