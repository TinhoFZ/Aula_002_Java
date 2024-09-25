package br.com.Aula_002_Java;

import java.util.Scanner;

public class ATV5 {

	public static void main(String[] args) {

		int numero1, numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Escreva o primeiro número");
		numero1 = teclado.nextInt();
		
		System.out.println("Escreva o segundo número");
		numero2 = teclado.nextInt();
		
		
		boolean igual = numero1 == numero2;
		boolean diferente = numero1 != numero2;
		boolean maior = numero1 > numero2;
		boolean menor = numero1 < numero2;
		boolean maior_igual = numero1 >= numero2;
		boolean menor_igual = numero1 <= numero2;
		
		System.out.println("O primeiro número é igual ao que o segundo? " + igual);
		System.out.println("O primeiro número é diferente do segundo? " + diferente);
		System.out.println("O primeiro número é maior do que o segundo? " + maior);
		System.out.println("O primeiro número é menor do que o segundo? " + menor);
		System.out.println("O primeiro número é maior ou igual ao segundo? " + maior_igual);
		System.out.println("O primeiro número é menor ou igual ao segundo? " + menor_igual);
		
	}

}
