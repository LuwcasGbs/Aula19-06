package Aula1206;

import java.util.Scanner;

public class MEnosOITO {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, maior=0;
		for(int i=1; i<=20 ; i++) {
			System.out.println("Insira o " + i + "° número:" );
			n = ler.nextInt();
			if (n >=8) {
				maior++;
			}
		}
		System.out.println(maior + " números são maiores que 8");
	}
}
