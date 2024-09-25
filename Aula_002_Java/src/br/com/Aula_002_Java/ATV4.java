package br.com.Aula_002_Java;

import java.util.Scanner;

public class ATV4 {

	public static void main(String[] args) {

		int salario;
		double salario_desconto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o valor do salário");
		salario = teclado.nextInt();
		
		salario_desconto = salario * 0.95;
		
		System.out.println("O seu salário com um desconto de 5% é igual a: " + salario_desconto);
		
		

	}

}
