package br.com.Aula_002_Java;

import java.util.Scanner;

public class ATV1 {

	public static void main(String[] args) {

		String nome;
		String produto;
		int quantidade;
		double preco;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = teclado.nextLine();
		
		
		System.out.println("Qual o produto?");
		produto = teclado.nextLine();
		
		System.out.println("Quantas unidades?");
		quantidade = teclado.nextInt();
		
		System.out.println("Qual o preço do produto?");
		preco = teclado.nextDouble();
		
		System.out.println("O seu nome é: " + nome);
		System.out.println("O produto comprado foi: " + produto);
		System.out.println("A quantidade comparada foi: " + quantidade);
		System.out.println("O preço de uma unidade é: " + preco + "R$");
		
	}

}
