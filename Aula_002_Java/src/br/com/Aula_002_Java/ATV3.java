package br.com.Aula_002_Java;

import java.util.Scanner;

public class ATV3 {

	public static void main(String[] args) {
		
		int valor;
		double valor_reajuste;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o valor do saldo");
		valor = teclado.nextInt();
		valor_reajuste = valor * 1.01;
		
		
		System.out.println("Com um reajuste de 1% o valor final é: " + valor_reajuste);
		
		
	}

}
